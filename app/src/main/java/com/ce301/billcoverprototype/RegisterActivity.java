package com.ce301.billcoverprototype;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class RegisterActivity extends AppCompatActivity {

    private EditText username = null;
    private EditText email = null;
    private EditText password = null;
    private ServerInteraction serverInteraction;
    private Button logoffButton;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = findViewById(R.id.register_username);
        email = findViewById(R.id.register_email);
        password = findViewById(R.id.register_password);

        TextView textView = findViewById(R.id.register_login_link);
        textView.setOnClickListener(v->{
            openLogin();
        });
        logoffButton = findViewById(R.id.register_button);
        logoffButton.setOnClickListener(v ->{

            if(username.getText().toString().isEmpty()){
                Toast.makeText(this, "Please add Username", Toast.LENGTH_SHORT).show();
                return;
            }
            if(email.getText().toString().isEmpty()){

                Toast.makeText(this, "Please add email", Toast.LENGTH_SHORT).show();

                return;
            }
            if(password.getText().toString().isEmpty()){
                Toast.makeText(this, "Please add password", Toast.LENGTH_SHORT).show();

                return;
            }
            mAuth = FirebaseAuth.getInstance();
            mAuth.createUserWithEmailAndPassword(email.getText().toString(), password.getText().toString()).addOnCompleteListener(RegisterActivity.this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {

                        addUser(email.getText().toString(),password.getText().toString(),username.getText().toString());

                    }
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(RegisterActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
//            try {
//                serverInteraction = new ServerInteraction(
//                        InetAddress.getByName("10.0.2.2"), 5536);
//                new Thread(serverInteraction).start();
//                JSONObject jsonObject = createJSON(username.getText(), email.getText(),
//                        password.getText());
//                serverInteraction.sendJSON(jsonObject);
//            } catch (UnknownHostException e) {
//                e.printStackTrace();
//            }
        });
    }

    private void addUser(String email, String password, String username) {

        User detectorModel = new User(email, password, username);
        FirebaseDatabase.getInstance().getReference().child("Users").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).setValue(detectorModel).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Toast.makeText(RegisterActivity.this, "User Registered", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(RegisterActivity.this, MainActivity.class));
                finish();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(RegisterActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void openLogin() {
        Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
        startActivity(intent);
    }

    private JSONObject createJSON(Editable usernameText, Editable emailText,
                                  Editable passwordText) {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("username", usernameText);
            jsonObject.put("email", emailText);
            jsonObject.put("password", passwordText);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }


}