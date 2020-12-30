package com.kool619.kool619;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class LoginPhone extends AppCompatActivity {

    EditText num;
    Button sendCode,signinemail;
    FirebaseAuth FAuth;
    String numberr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_phone);

        num=(EditText)findViewById(R.id.number);
        sendCode=(Button)findViewById(R.id.code);
        signinemail=(Button)findViewById(R.id.btnEmail);

        FAuth=FirebaseAuth.getInstance();

        sendCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberr=num.getText().toString().trim();
                String phonenumber= "+216" + numberr;
                Intent b=new Intent(LoginPhone.this, sendCode.class);
                b.putExtra("phonenumber",phonenumber);
                startActivity(b);
                finish();

            }
        });

        signinemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent em=new Intent(LoginPhone.this, Login.class);
                startActivity(em);
                finish();
            }
        });

    }
}