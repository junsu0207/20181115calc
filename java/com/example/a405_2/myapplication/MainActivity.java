package com.example.a405_2.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context ctx = MainActivity.this;

        final EditText num = findViewById(R.id.num);
        final TextView result = findViewById(R.id.result);

        // inner class
        class Calc{
            private int num,result; // 인스턴스(의) 변수
            String op;  // 연산기호
          /*
                public void exe(){
                switch (op){
                    case "+" : result = num1 + num2; break;
                    case "-" : result = num1 - num2; break;
                    case "*" : result = num1 * num2; break;
                    case "/" : result = num1 / num2; break;
                }
            }
            */
            public void setNum(int num){this.num=num;}
            public int getNum(){return this.num;}

            public void setOp(String op){this.op =op;}
            public String getOp(){return this.op;}

            public void setResult(int result){this.result=result;}
            public int getResult(){return this.result;}
        }
        final Calc calc = new Calc();

        findViewById(R.id.plusBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int a = Integer.parseInt(num.getText().toString());
                Log.d("입력값1",a+"");
                calc.setNum(a);
                calc.setOp("+");
               // calc.exe();
            }
        });
        findViewById(R.id.minusBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int a = Integer.parseInt(num.getText().toString());
                Log.d("입력값1",a+"");
                calc.setNum(a);
                calc.setOp("-");
               // calc.exe();
                int c = calc.getResult();
                Log.d("결과값",c+"");
                Toast.makeText(ctx, "뺄셈결과", Toast.LENGTH_LONG).show();
            }
        });
        findViewById(R.id.multiBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int a = Integer.parseInt(num.getText().toString());
                Log.d("입력값1",a+"");
                calc.setNum(a);
                calc.setOp("*");
               // calc.exe();
                int c = calc.getResult();
                Log.d("결과값",c+"");
                Toast.makeText(ctx, "곱셈결과", Toast.LENGTH_LONG).show();
            }
        });
        findViewById(R.id.divBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int a = Integer.parseInt(num.getText().toString());
                Log.d("입력값1",a+"");
                calc.setNum(a);
                calc.setOp("/");
               // calc.exe();
                int c = calc.getResult();
                Log.d("결과값",c+"");
                Toast.makeText(ctx, "나누기결과", Toast.LENGTH_LONG).show();
            }
        });
        findViewById(R.id.equalBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx,"덧셈결과"+calc.getResult(),Toast.LENGTH_LONG).show();

            }
        });


    }
}
