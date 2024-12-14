// JAVA Code
package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class
MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,bcl,bplus,bminus,bmulti,bdiv,beql;
    EditText ET_Result;
    Float v1, v2;
    Boolean add,sub,multi,div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.btn_one);
        b2 = (Button) findViewById(R.id.btn_two);
        b3= (Button)findViewById(R.id.btn_three);
        b4=(Button)findViewById(R.id.btn_four);
        b5=(Button)findViewById(R.id.btn_five);
        b6=(Button) findViewById(R.id.btn_six);
        b7=(Button)findViewById(R.id.btn_seven);
        b8=(Button)findViewById(R.id.btn_eight);
        b9=(Button)findViewById(R.id.btn_nine);
        b0=(Button)findViewById(R.id.btn_zero);
        bdot=(Button)findViewById(R.id.btn_dot);
        bcl=(Button)findViewById(R.id.btn_clear);
        bplus = (Button) findViewById(R.id.btn_plus);
        bminus = (Button) findViewById(R.id.btn_minus);
        bmulti = (Button) findViewById(R.id.btn_multi);
        bdiv = (Button) findViewById(R.id.btn_divide);
        beql = (Button) findViewById(R.id.btn_eql);
        ET_Result = (EditText) findViewById(R.id.ET_Result);
       b1.setOnClickListener(new View.OnClickListener() {
           @SuppressLint("SetTextI18n")
           @Override
           public void onClick(View view) {
               ET_Result.setText(ET_Result.getText()+"1");
           }
       });
       b2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view)
            {
                ET_Result.setText(ET_Result.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                ET_Result.setText(ET_Result.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                ET_Result.setText(ET_Result.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                ET_Result.setText(ET_Result.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                ET_Result.setText(ET_Result.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                ET_Result.setText(ET_Result.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                ET_Result.setText(ET_Result.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                ET_Result.setText(ET_Result.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                ET_Result.setText(ET_Result.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                ET_Result.setText(ET_Result.getText()+".");
            }
        });
        bcl.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                ET_Result.setText(ET_Result.getText()+" ");
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    v1 = Float.parseFloat(ET_Result.getText()+"");
                    add = true;
                    ET_Result.setText(null);

            }
        });
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                v1 = Float.parseFloat(ET_Result.getText()+"");
                sub = true;
                ET_Result.setText(null);

            }
        });
        bmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                v1 = Float.parseFloat(ET_Result.getText()+"");
                multi = true;
                ET_Result.setText(null);

            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                v1 = Float.parseFloat(ET_Result.getText()+"");
                div = true;
                ET_Result.setText(null);

            }
        });
        beql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v2 = Float.parseFloat(String.valueOf(ET_Result.getText()));
                if (add) {
                    ET_Result.setText(v1+v2+"");
                    add = false;
                }
                 if (sub) {
                    ET_Result.setText(v1-v2+"");
                    sub = false;
                }
                if (multi) {
                    ET_Result.setText(v1*v2+"");
                    multi = false;
                }
                if (div) {
                    ET_Result.setText(v1/v2+"");
                    div = false;
                }
            }
        });
    }
}

