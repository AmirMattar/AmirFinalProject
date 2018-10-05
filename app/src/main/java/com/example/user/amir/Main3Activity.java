package com.example.user.amir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
TextView signup2;
Button signupf;
EditText username2,pass2,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        signup2=findViewById(R.id.signup2);
        username2=findViewById(R.id.username2);
        pass2=findViewById(R.id.pass2);
        email=findViewById(R.id.email);
        signupf = findViewById(R.id.signupf);
        signupf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
    }
    public void openActivity2(){
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}




