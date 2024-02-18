package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText E1,E2,E3;
    Button b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calci);
        E1=(EditText)findViewById(R.id.e1);
        E2=(EditText)findViewById(R.id.e2);
        E3=(EditText)findViewById(R.id.e3);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
    }
    public void add(View v){
        int a=Integer.parseInt(E1.getText().toString());
        int b=Integer.parseInt(E2.getText().toString());
        int c=a+b;
        E3.setText(""+c);
    }
    public void sub(View v){
        int a=Integer.parseInt(E1.getText().toString());
        int b=Integer.parseInt(E2.getText().toString());
        int c=a-b;
        E3.setText(""+c);
    }
    public void mul(View v){
        int a=Integer.parseInt(E1.getText().toString());
        int b=Integer.parseInt(E2.getText().toString());
        int c=a*b;
        E3.setText(""+c);
    }
    public void div(View v){
        int a=Integer.parseInt(E1.getText().toString());
        int b=Integer.parseInt(E2.getText().toString());
        int c=a/b;
        E3.setText(""+c);
    }
    public void clear(View v){
        E3.setText("  ");
        E2.setText(" ");
        E1.setText(" ");
    }
}