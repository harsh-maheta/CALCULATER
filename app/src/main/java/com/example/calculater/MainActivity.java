package com.example.calculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
     Button b1;
     EditText ed1,ed2,ed3;
     TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.b1);
        ed1=(EditText) findViewById(R.id.ed1);
        ed2=(EditText) findViewById(R.id.ed2);
        ed3=(EditText) findViewById(R.id.ed3);
        t1=(TextView) findViewById(R.id.t1);
    }
    public void event(View view){

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1=ed1.getText().toString();
                String n2=ed2.getText().toString();
                String op=ed3.getText().toString();



                float a=Float.parseFloat(n1);
                float b=Float.parseFloat(n2);
                float r1=0;


                switch(op){
                    case "+":
                        r1=a+b;
                        break;

                    case "-":
                        r1=a-b;
                        break;

                    case "*":
                        r1=a*b;
                        break;

                    case "/":
                       r1=a/b;
                    break;

                    default:
                }
                t1.setText(Float.toString(r1));

            }

        });


        }
    }