package com.example.user.testword;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class text2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text2);

        Button abc9 = (Button) findViewById(R.id.abc9);
        Button abc10 = (Button) findViewById(R.id.abc10);
        Button abc11 = (Button) findViewById(R.id.abc11);
        Button abc12 = (Button) findViewById(R.id.abc12);

        abc9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent ();
                i=new Intent(text2.this,text1.class);
                startActivity(i);
            }
        });
        abc10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent ();
                i=new Intent(text2.this, MainActivity.class);
                startActivity(i);
            }
        });
        abc11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent ();
                i=new Intent(text2.this, text3.class);
                startActivity(i);
            }
        });
        abc12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent ();
                i=new Intent(text2.this, text4.class);
                startActivity(i);
            }
        });
    }
}
