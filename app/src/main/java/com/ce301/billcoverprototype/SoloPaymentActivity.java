package com.ce301.billcoverprototype;

import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class SoloPaymentActivity extends Fragment {
   Button addCard;
   TextInputEditText textInputEditText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= (ViewGroup) inflater.inflate(
                R.layout.activity_solo_payment, container, false);
        addCard=view.findViewById(R.id.cardPayment);
        textInputEditText=view.findViewById(R.id.et_payAmount);

        addCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!textInputEditText.getText().toString().isEmpty()) {
                    startActivity(new Intent(getContext(), PaymentDetails.class).putExtra("amount",textInputEditText.getText().toString()).putExtra("remain",0).putExtra("status","solo"));
                }else{
                    Toast.makeText(getContext(), "Please add Amount", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });
    return view;
    }
}