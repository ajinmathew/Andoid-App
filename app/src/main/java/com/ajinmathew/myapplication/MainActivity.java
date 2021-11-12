package com.ajinmathew.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //declaring EditText Objects..
EditText ed1,ed2;
//Declaring Button objects
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Linking the ui components(Button,EditText) with java objects(declared before onCreate(),)...
        btn = findViewById(R.id.login);
        ed1 = findViewById(R.id.user);
        ed2 = findViewById(R.id.pass);
        //Button click listener...
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //reading user inputs and store in Strings
                String username = ed1.getText().toString().trim();
                String passwod = ed2.getText().toString().trim();
                //Checking the entered data is correct or not...
                if (username.equals("admin")&&passwod.equals("12345")){
                    //Switching Activity using Intent...
                    Intent intent = new Intent(getApplicationContext(),Home.class);
                    startActivity(intent);
                }else{
                    //Popup Notifications for incorrect user inputs...
                    Toast.makeText(getApplicationContext(),"Invalid input",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}