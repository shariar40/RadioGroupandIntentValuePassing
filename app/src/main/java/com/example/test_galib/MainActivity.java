//Autor:Shariar Rahman Ridhoy.

package com.example.test_galib;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioGroup radioGroup;
    EditText mname;
    TextView textView;
    String sendname;
    int mark;
    String name;
    public Button buttonn;
    static final String answer = "My age is";
    static final String myname = "I'm";

    //Autor:Shariar Rahman Ridhoy.

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.radgroup);
        buttonn = (Button) findViewById(R.id.button);
        buttonn.setOnClickListener(this);
        textView = findViewById(R.id.textView);
        mname = (EditText) findViewById(R.id.mname);


    }

    @Override
    public void onClick(View v) {


        // String fNum =String.parseString(fNumEditText.getText().toString());


        if (radioGroup.getCheckedRadioButtonId() == R.id.radioButton) {
            mark = 17;
        } else if (radioGroup.getCheckedRadioButtonId() == R.id.radioButton2) {
            mark = 11;

        } else {
            mark = 15;
        }

        sendname = mname.getText().toString();

        Intent newintent = new Intent(MainActivity.this, MainActivity2.class);


        newintent.putExtra(answer, mark);
        newintent.putExtra(myname, sendname);

        startActivity(newintent);
        //Autor:Shariar Rahman Ridhoy.
    }
}