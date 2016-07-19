package com.example.user.testword;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button abc2 = (Button) findViewById(R.id.abc2);
        Button abc1 = (Button) findViewById(R.id.abc1);
        Button abc3 = (Button) findViewById(R.id.abc3);
        Button abc4 = (Button) findViewById(R.id.abc4);

        abc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent ();
                i=new Intent(MainActivity.this, text1.class);
                startActivity(i);
            }
        });
        abc2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v){
                Intent i = new Intent();
                i = new Intent(MainActivity.this, text2.class);
                startActivity(i);
            }
        });
        abc3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i = new Intent(MainActivity.this, text3.class);
                startActivity(i);
            }
        });
        abc4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent();
                i = new Intent(MainActivity.this,text4.class);
                startActivity(i);
            }
        });
    }
}
