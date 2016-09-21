package com.example.computer.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.button_1);
        b1.setOnClickListener(this);

        Button b2 = (Button) findViewById(R.id.button_2);
        b2.setOnClickListener(this);

        Button b3 = (Button) findViewById(R.id.button_3);
        b3.setOnClickListener(this);

        Button b4 = (Button) findViewById(R.id.button_4);
        b4.setOnClickListener(this);

        Button b5 = (Button) findViewById(R.id.button_5);
        b5.setOnClickListener(this);

        Button b6 = (Button) findViewById(R.id.button_6);
        b6.setOnClickListener(this);

        Button b7 = (Button) findViewById(R.id.button_7);
        b7.setOnClickListener(this);

        Button b8 = (Button) findViewById(R.id.button_8);
        b8.setOnClickListener(this);

        Button b9 = (Button) findViewById(R.id.button_9);
        b9.setOnClickListener(this);

        Button b0 = (Button) findViewById(R.id.button_0);
        b0.setOnClickListener(this);

        Button bClr = (Button) findViewById(R.id.clear_button);
        bClr.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        TextView tv = (TextView) findViewById(R.id.digit_text_view);
        if(id == R.id.clear_button){
            tv.setText("");
        }
        if(tv.length()>5) return;
        if(id == R.id.button_1){
            tv.setText(tv.getText().toString()+("1"));
        }
        else if(id == R.id.button_2){
            tv.setText(tv.getText().toString()+("2"));
        }
        else if(id == R.id.button_3){
            tv.setText(tv.getText().toString()+("3"));
        }
        else if(id == R.id.button_4){
            tv.setText(tv.getText().toString()+("4"));
        }
        else if(id == R.id.button_5){
            tv.setText(tv.getText().toString()+("5"));
        }
        else if(id == R.id.button_6){
            tv.setText(tv.getText().toString()+("6"));
        }
        else if(id == R.id.button_7){
            tv.setText(tv.getText().toString()+("7"));
        }
        else if(id == R.id.button_8){
            tv.setText(tv.getText().toString()+("8"));
        }
        else if(id == R.id.button_9){
            tv.setText(tv.getText().toString()+("9"));
        }
        else if(id == R.id.button_0){
            tv.setText(tv.getText().toString()+("0"));
        }
    }
}
