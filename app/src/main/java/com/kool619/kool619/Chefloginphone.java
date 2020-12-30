package com.kool619.kool619;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class Chefloginphone extends AppCompatActivity {

    EditText num;
    Button sendotp,signinemail;
    FirebaseAuth FAuth;
    String numberr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chefloginphone);

        num=(EditText)findViewById(R.id.number);
        sendotp=(Button)findViewById(R.id.code);
        signinemail=(Button)findViewById(R.id.btnEmail);


        FAuth=FirebaseAuth.getInstance();

        sendotp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberr=num.getText().toString().trim();
                String phonenumber= "+216" + numberr;
                Intent b=new Intent(Chefloginphone.this, Chefsendcode.class);
                b.putExtra("phonenumber",phonenumber);
                startActivity(b);
                finish();
            }
        });
        signinemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent em=new Intent(Chefloginphone.this, ChefLogin.class);
                startActivity(em);
                finish();
            }
        });

    }
}
