package com.example.isha.myapplication;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Sample_coffee extends AppCompatActivity {

        Button btn;
        TextView obj1,obj2,obj3,obj4;
        EditText obj,objj;
        RadioGroup rg;
        RadioButton btn1,btn2;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_sample_coffee);
            obj1=(TextView) findViewById(R.id.tv1);
            obj2=(TextView) findViewById(R.id.tv2);
            obj3=(TextView) findViewById(R.id.tv3);
            obj4=(TextView) findViewById(R.id.tv4);
            obj= (EditText) findViewById(R.id.editText1);
            objj=(EditText) findViewById(R.id.editText2);
            rg =  (RadioGroup) findViewById(R.id.rg);
            btn1=(RadioButton) findViewById(R.id.radio_button1);
            btn2=(RadioButton) findViewById(R.id.radio_button2);
            btn = (Button) findViewById(R.id.button1);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String name = String.valueOf(obj.getText());
                    int quantity = Integer.parseInt(objj.getText().toString());
                    int Totalprice = 0;
                    if (btn1.isChecked()) {
                        Totalprice = quantity * 10;

                    }
                    else {
                        Totalprice = quantity * 15;
                    }
                    Toast.makeText(getApplicationContext(), "hello" + name + "your order price is:" + Totalprice, Toast.LENGTH_LONG).show();

                }});


                }
            }

















