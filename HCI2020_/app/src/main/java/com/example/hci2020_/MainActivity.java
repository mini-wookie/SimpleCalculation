package com.example.hci2020_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //EditText의 입력을 통해서 덧셈결과를 result에 반환
    public void addClick(View v) {
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView result = (TextView) findViewById(R.id.result);
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1 + n2));
    }

    //EditText의 입력을 통해서 뺄셈결과를 result에 반환
    public void subClick(View v) {
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView result = (TextView) findViewById(R.id.result);
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1 - n2));
    }

    //EditText의 입력을 통해서 곱셈결과를 result에 반환
    public void multClick(View v) {
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView result = (TextView) findViewById(R.id.result);
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1 * n2));
    }

    //나눗셈 -> 더블 형태로 입력받아오고 더블형으로 반환 (소수점 표현)
    public void divClick(View v) {
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView result = (TextView) findViewById(R.id.result);
        double n1 = Double.parseDouble(number1.getText().toString());
        double n2 = Double.parseDouble(number2.getText().toString());
        result.setText(Double.toString(n1 / n2));
    }

    //평균값 -> 이 메소드도 동일하게 더블형태로 지정
    public void meanClick(View v) {
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView result = (TextView) findViewById(R.id.result);
        double n1 = Double.parseDouble(number1.getText().toString());
        double n2 = Double.parseDouble(number2.getText().toString());
        result.setText(Double.toString((n1 + n2) / 2));
    }

    //첫번째 숫자와 두번째 숫자의 입력을 통해서 해당 숫자들과 그 사이 숫자들의 합을 계산하는 메소드
    public int fibo(int n1, int n2) {
        int n3=0;

        if ((n1 - n2) < 0) {
            for (int i = n1; i <= n2; i++) {
                n3 += i;
            }
            return n3;
        } else {
            for (int i = n2; i <= n1; i++) {
                n3 += i;
            }
            return n3;
        }
    }

    //자신들을 포함하여 그 사이 값들의 합을 구해주는 메소드
    public void sumClick(View v) {
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView result = (TextView) findViewById(R.id.result);
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());

        result.setText(Integer.toString(fibo(n1, n2)));
    }

    //다시 activity_main을 실행시키도록 하는 리셋기능의 메소드 (additional Button added by Wookie)
    public void clearClick(View v){
        setContentView(R.layout.activity_main);
    }
}
