package com.ce301.billcoverprototype;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class GroupPaymentActivity extends Fragment {
    static String remain = null, total_amount = null;
    TextView addMember, addAmount, tv_total_amount, tv_remain_amount,tv_title_amount;
    Button addCard;
    TextInputEditText et_pay;
    static String groupUid;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(
                R.layout.activity_group_payment, container, false);
        addAmount = view.findViewById(R.id.addAmount);

        tv_total_amount = view.findViewById(R.id.tv_totalAmount);
        tv_title_amount = view.findViewById(R.id.textView9);
        tv_remain_amount = view.findViewById(R.id.tv_remain_amount);
        addMember = view.findViewById(R.id.textView2);
        addCard = view.findViewById(R.id.button);
        et_pay = view.findViewById(R.id.et_payAmount);
        showPayData();
        addMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getContext(), AddMember.class));
            }
        });
        addAmount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Dialog dialog = new Dialog(getContext(), android.R.style.DeviceDefault_ButtonBar_AlertDialog);

                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                /////make map clear
                dialog.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);

                dialog.setContentView(R.layout.dialog_amount);////your custom content

                EditText et_amount = dialog.findViewById(R.id.et_amount);
                Button btnAdd = dialog.findViewById(R.id.btnAdd);
                btnAdd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (et_amount.getText().toString().isEmpty()) {
                            Toast.makeText(getContext(), "add amount", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        int newAmount = Integer.parseInt(et_amount.getText().toString()) + Integer.parseInt(tv_remain_amount.getText().toString());
                        addMoreAmount(String.valueOf(newAmount));
                        dialog.dismiss();

                    }
                });

                if (!dialog.isShowing()) {
                    dialog.show();
                }


            }
        });

        addCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!et_pay.getText().toString().isEmpty()) {
                    int remainAmount = Integer.parseInt(tv_remain_amount.getText().toString()) - Integer.parseInt(et_pay.getText().toString());
                    if (Integer.parseInt(tv_remain_amount.getText().toString()) < Integer.parseInt(et_pay.getText().toString())) {
                        Toast.makeText(getContext(), "Amount is greater then total amount", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    startActivity(new Intent(getContext(), PaymentDetails.class)
                            .putExtra("amount", et_pay.getText().toString())
                            .putExtra("remain", remainAmount)
                            .putExtra("status", "group")
                            .putExtra("groupUid", groupUid)

                    );
                } else {
                    Toast.makeText(getContext(), "Please add Amount", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });

        return view;
    }

    private void addMoreAmount(String amount) {

        FirebaseDatabase.getInstance().getReference().child("Group").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("total").setValue(amount).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Toast.makeText(getContext(), "amount add Successfully", Toast.LENGTH_SHORT).show();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
//                Toast.makeText(AddMember.this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void showPayData() {
        FirebaseDatabase.getInstance().getReference().child("Group").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot snapshot1 : snapshot.getChildren()) {
                    if (snapshot1.getKey().equals(FirebaseAuth.getInstance().getCurrentUser().getUid())) {
                        total_amount = snapshot1.child("total").getValue(String.class);
                        tv_remain_amount.setText(total_amount);
                         tv_title_amount.setText("Total amount");
                        groupUid=snapshot1.getKey();

                    } else {
                        if (snapshot1.child(FirebaseAuth.getInstance().getCurrentUser().getUid()).exists()) {

                            if (snapshot1.child("total").exists()) {
                                tv_title_amount.setText("Total amount");
                                total_amount = snapshot1.child("total").getValue(String.class);
                                tv_remain_amount.setText(total_amount);
                                groupUid=snapshot1.getKey();
                            }
                        }


                    }
                }


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
//                Toast.makeText(AddMember.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}