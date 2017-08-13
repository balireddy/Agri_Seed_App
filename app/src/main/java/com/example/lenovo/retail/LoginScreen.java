package com.example.lenovo.retail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginScreen extends AppCompatActivity implements View.OnClickListener {

    Button signupbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        signupbtn = (Button) findViewById(R.id.signup_btn);
        signupbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent sign = new Intent(this,RegistrationScreen.class);
        startActivity(sign);
    }
}
