package com.example.user.testword;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class text3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text3);

        Button abc13 = (Button) findViewById(R.id.abc13);
        Button abc14 = (Button) findViewById(R.id.abc14);
        Button abc15 = (Button) findViewById(R.id.abc15);
        Button abc16 = (Button) findViewById(R.id.abc16);

        abc13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent ();
                i=new Intent(text3.this,text1.class);
                startActivity(i);
            }
        });
        abc14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent ();
                i=new Intent(text3.this,text2.class);
                startActivity(i);
            }
        });
        abc15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent ();
                i=new Intent(text3.this,MainActivity.class);
                startActivity(i);
            }
        });
        abc16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent ();
                i=new Intent(text3.this,text4.class);
                startActivity(i);
            }
        });
    }
}
