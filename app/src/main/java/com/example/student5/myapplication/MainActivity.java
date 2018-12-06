package com.example.student5.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b=findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double a=Double.parseDouble(((EditText) findViewById(R.id.Aconst)).getText().toString());
                double b=Double.parseDouble(((EditText) findViewById(R.id.Bconst)).getText().toString());
                double c=Double.parseDouble(((EditText) findViewById(R.id.Cconst)).getText().toString());
                double d=b*b-4*a*c;
                TextView resul2=(TextView) findViewById(R.id.textView3);
                if (d>=0) {

                resul2.setText(String.valueOf((-b+Math.sqrt(d))/2*a)+" "+String.valueOf((-b-Math.sqrt(d))/2*a));}
                else{resul2.setText("Корней нет");}




            }
        });
    }
}
