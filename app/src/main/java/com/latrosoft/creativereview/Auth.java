package com.latrosoft.creativereview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Auth extends AppCompatActivity {
    private Button loginBv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auth);
        loginBv = (Button) findViewById(R.id.loginBv);
        loginBv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent i = new Intent(Auth.this,DashBoard.class);
                    startActivity(i);
                
            }
        });
    }
}
