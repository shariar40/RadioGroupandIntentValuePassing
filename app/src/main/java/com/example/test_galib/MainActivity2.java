
//Autor:Shariar Rahman Ridhoy.
package com.example.test_galib;

import static com.example.test_galib.MainActivity.answer;
import static com.example.test_galib.MainActivity.myname;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView nametext;
    TextView marktext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nametext = findViewById(R.id.nametext);
        marktext = findViewById(R.id.marktext);
        Intent getintent = getIntent();


        int result = getintent.getIntExtra(answer, 0);
        String naame = getintent.getStringExtra(MainActivity.myname);

        marktext.setText(answer + " " + result);
        nametext.setText(myname + " " + naame);
//Autor:Shariar Rahman Ridhoy.


    }
}