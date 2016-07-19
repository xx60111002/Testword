package com.example.user.testword;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class text4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text4);

        Button abc17 = (Button) findViewById(R.id.abc17);
        Button abc18 = (Button) findViewById(R.id.abc16);
        Button abc19 = (Button) findViewById(R.id.abc19);
        Button abc20 = (Button) findViewById(R.id.abc20);

        abc17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent ();
                i=new Intent(text4.this,text1.class);
                startActivity(i);
            }
        });
        abc18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent ();
                i=new Intent(text4.this,text2.class);
                startActivity(i);
            }
        });
        abc19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent ();
                i=new Intent(text4.this,text3.class);
                startActivity(i);
            }
        });
        abc20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent ();
                i=new Intent(text4.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
