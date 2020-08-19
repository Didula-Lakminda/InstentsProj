package com.example.instentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity {

    TextView tv1, tv2;
    String st1, st2;

    private TextView result;
    private Button plus;
    private Button minus;
    private Button multiply;
    private Button divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Context context = getApplicationContext();
        CharSequence message = "You just clicked the OK button";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();

        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);

        st1 = getIntent().getExtras().getString("Value1");
        st2 = getIntent().getExtras().getString("Value2");
        tv1.setText(st1);
        tv2.setText(st2);

        result = findViewById(R.id.result);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(st1.length() == 0){
                    st1 = ("0");
                }
                if(st2.length() == 0){
                    st2 = ("0");
                }
                int num1 = Integer.parseInt(st1);
                int num2 = Integer.parseInt(st2);

                int sum = num1 + num2;

                result.setText((String.valueOf(num1 +"+"+ num2+"="+sum)));
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(st1.length() == 0){
                    st1 = ("0");
                }
                if(st2.length() == 0){
                    st2 = ("0");
                }
                int num1 = Integer.parseInt(st1);
                int num2 = Integer.parseInt(st2);

                int minus = num1 - num2;

                result.setText((String.valueOf(num1 +"-"+ num2+"="+minus)));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(st1.length() == 0){
                    st1 = ("0");
                }
                if(st2.length() == 0){
                    st2 = ("0");
                }
                int num1 = Integer.parseInt(st1);
                int num2 = Integer.parseInt(st2);

                int multiply = num1 * num2;

                result.setText((String.valueOf(num1 +"*"+ num2+"="+multiply)));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(st1.length() == 0){
                    st1 = ("0");
                }
                if(st2.length() == 0){
                    st2 = ("0");
                }
                int num1 = Integer.parseInt(st1);
                int num2 = Integer.parseInt(st2);

                int divide = num1 / num2;

                result.setText((String.valueOf(num1 +"/"+ num2+"="+divide)));
            }
        });

    }
}