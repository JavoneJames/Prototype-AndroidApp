package com.ce301.billcoverprototype;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MainActivity extends AppCompatActivity {
    ServerInteraction serverInteraction;
    EditText et_username;
    EditText et_password;
    FirebaseAuth mAuth;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressDialog=new ProgressDialog(this);
        mAuth = FirebaseAuth.getInstance();
        et_username = findViewById(R.id.login_username);
        et_password = findViewById(R.id.login_password);

        TextView textView = findViewById(R.id.login_register_link);
        textView.setOnClickListener(v->{
            openReg();
        });

        Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(v ->{

            String emailinput = et_username.getText().toString();
            String password = et_password.getText().toString();
            if (TextUtils.isEmpty(emailinput)) {
                et_username.setError("field can't be empty");
                return;
            } else if (!Patterns.EMAIL_ADDRESS.matcher(emailinput).matches()) {
                et_username.setError("Please enter a valid email address");
                return;
            } else if (password.isEmpty()) {
                et_password.setError("field can't be empty");
                return;
            } else {
                progressDialog.show();
                progressDialog.setTitle("Loading...!");
                mAuth.signInWithEmailAndPassword(emailinput, password)
                        .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    progressDialog.dismiss();

//                                    Appdata.UI = mAuth.getCurrentUser().getUid();
                                    Toast.makeText(MainActivity.this, "user successfully login", Toast.LENGTH_SHORT).show();
                                    startActivity(new Intent(MainActivity.this, PaymentActivity.class));
                                    finish();
                                }

                            }
                        }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        progressDialog.dismiss();
                        Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
            }

//            try {
//                serverInteraction = new ServerInteraction(
//                        InetAddress.getByName("144.126.194.91"), 5536);
//                new Thread(serverInteraction).start();
//                JSONObject jsonObject = createJSON(username.getText(), password.getText());
//                serverInteraction.sendJSON(jsonObject);
//                openMain();
//            } catch (UnknownHostException e) {
//                e.printStackTrace();
//            }
        });
    }

    private JSONObject createJSON(Editable usernameText, Editable passwordText) {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("username", usernameText);
            jsonObject.put("password", passwordText);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

    void openMain() {
        Intent intent = new Intent(this, PaymentActivity.class);
        startActivity(intent);
        System.out.println("trying to log into main menu");
    }

    private void openReg() {
        Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(intent);

    }


}