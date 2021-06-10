package com.example.secimplementation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class testscreen extends AppCompatActivity {
    private Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testscreen);

        b = (Button)findViewById(R.id.nextButton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               newActivity();
            }
        });
    }
    public void newActivity(){
        dbHelper db = new dbHelper(this);
        String ans1 = ((EditText)findViewById(R.id.ans1)).getText().toString();
        String ans2 = ((EditText)findViewById(R.id.ans2)).getText().toString();
        Intent i = getIntent();
        account acc = (account) i.getSerializableExtra("account");
        system.getData(db,ans1,ans1, acc.getName().toString());
        Intent intent = new Intent(testscreen.this, homeScreen.class);
        intent.putExtra("account",acc );
        startActivity(intent);

    }
}