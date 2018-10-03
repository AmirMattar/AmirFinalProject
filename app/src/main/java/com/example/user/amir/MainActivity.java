package com.example.user.amir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView si;
    Button signin,signup;
    EditText username,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signin=findViewById(R.id.signin);
        signup=findViewById(R.id.signup);
        username=findViewById(R.id.username);
        pass=findViewById(R.id.pass);
        si=findViewById(R.id.si);
    }

    @Override
    public void onClick(View v) {

    }
}



