package com.example.secimplementation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button)findViewById(R.id.button);
        dbHelper db = new dbHelper(this);


        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String name = ((EditText)findViewById(R.id.nentry)).getText().toString();
                String age = ((EditText)findViewById(R.id.age)).getText().toString();
                String email = ((EditText)findViewById(R.id.email)).getText().toString();
                String password = ((EditText)findViewById(R.id.password)).getText().toString();
                String gender= "male";
                account account = new account(name);
                account.getData(db,name,age,gender,email,password);
                Intent i = new Intent(MainActivity.this, testscreen.class);
                i.putExtra("account",account);


               startActivity(i);
            }
        });
    }
}