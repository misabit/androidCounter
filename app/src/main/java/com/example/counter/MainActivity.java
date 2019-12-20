package com.example.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    int number;
    EditText et;
    Button btnp;
    Button btnm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.edit_text1);
        btnp = findViewById(R.id.btn_plus);
        btnm = findViewById(R.id.btn_minus);



        btnp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = number +1;
                et.setText(String.valueOf(number));
            }
        });

        btnm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number = number - 1;
                et.setText(String.valueOf(number));
            }
        });
    }
}
