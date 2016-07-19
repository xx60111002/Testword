package com.example.user.testword;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class text1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text1);

        Button abc5 = (Button) findViewById(R.id.abc5);
        Button abc6 = (Button) findViewById(R.id.abc6);
        Button abc7 = (Button) findViewById(R.id.abc7);
        Button abc8 = (Button) findViewById(R.id.abc8);

        abc5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent();
                i = new Intent(text1.this,MainActivity.class);
                startActivity(i);
            }
        });
        abc6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent();
                i =new Intent(text1.this,text2.class);
                startActivity(i);
            }
        });
        abc7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent();
                i = new Intent(text1.this,text3.class);
                startActivity(i);
            }
        });
        abc8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent();
                i = new Intent(text1.this,text4.class);
                startActivity(i);
            }
        });
    }
}
