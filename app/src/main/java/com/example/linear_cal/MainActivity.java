package com.example.linear_cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button17,button18,button19;
    TextView textView,textView2;
    float value1,value2;
    boolean mAddition,mSubtraction,mMultiplication,mDivision;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        button5=(Button) findViewById(R.id.button5);
        button6=(Button) findViewById(R.id.button6);
        button7=(Button) findViewById(R.id.button7);
        button8=(Button) findViewById(R.id.button8);
        button9=(Button) findViewById(R.id.button9);
        button10=(Button) findViewById(R.id.button10);
        button11=(Button) findViewById(R.id.button11);
        button12=(Button) findViewById(R.id.button12);
        button13=(Button) findViewById(R.id.button13);
        button14=(Button) findViewById(R.id.button14);
        button15=(Button) findViewById(R.id.button15);
        button16=(Button) findViewById(R.id.button16);
        button17=(Button) findViewById(R.id.button17);
        button18=(Button) findViewById(R.id.button18);
        button19=(Button) findViewById(R.id.button19);
        textView=(TextView) findViewById(R.id.textView);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            textView.setText(textView.getText()+"7");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"8");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"9");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"4");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"5");
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"6");
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"1");
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"2");
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"3");
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"0");
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+".");
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView == null){
                    textView.setText("");
                }else {
                    value1 = Float.parseFloat(textView.getText() + "");
                    mAddition = true;
                    textView.setText(null);
                }
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(textView.getText() + "");
                mSubtraction = true ;
                textView.setText(null);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(textView.getText() + "");
                mMultiplication = true ;
                textView.setText(null);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(textView.getText()+"");
                mDivision = true ;
                textView.setText(null);
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value2 = Float.parseFloat(textView.getText() + "");

                if (mAddition == true){

                    textView.setText(value1 + value2 +"");
                    mAddition=false;
                }


                if (mSubtraction == true){
                    textView.setText(value1 - value2 +"");
                    mSubtraction=false;
                }

                if (mMultiplication == true){
                    textView.setText(value1 * value2 + "");
                    mMultiplication=false;
                }

                if (mDivision == true){
                    textView.setText(value1 / value2+"");
                    mDivision=false;
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
            }
        });


    }
}
