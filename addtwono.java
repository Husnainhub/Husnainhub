package com.example.layoutpractise1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class addtwono extends AppCompatActivity {

    Button btn_add_number, btn_multiply_number,btn_subtraction_number,btn_modulus_number,clear_button;
    EditText number1, number2;
    TextView result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtwono);

        btn_add_number = findViewById(R.id.btn_add_number);

        btn_add_number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (TextUtils.isEmpty(number1.getText().toString())) {
                    number1.setError("Enter Number one");
                } else if (TextUtils.isEmpty(number2.getText().toString())) {
                    number2.setError("Enter Number two");
                } else {

                    int firstNumber=Integer.valueOf(number1.getText().toString());
                    int secondNumber=Integer.valueOf(number2.getText().toString());

                    result.setText(String.valueOf(AddTwoNumber(firstNumber,secondNumber)));
                }

            }
        });

        btn_multiply_number = findViewById(R.id.btn_multiply_number);

        btn_multiply_number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (TextUtils.isEmpty(number1.getText().toString())) {
                    number1.setError("Enter Number one");
                } else if (TextUtils.isEmpty(number2.getText().toString())) {
                    number2.setError("Enter Number two");
                } else {

                    float firstNumber=Integer.valueOf(number1.getText().toString());
                    float secondNumber=Integer.valueOf(number2.getText().toString());

                    float btn_multiply_number = firstNumber*secondNumber;
                    result.setText(String.valueOf(btn_multiply_number));
                }

            }
        });

        btn_subtraction_number= findViewById(R.id.btn_subtraction_number);

        btn_subtraction_number.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (TextUtils.isEmpty(number1.getText().toString())) {
                    number1.setError("Enter Number one");
                } else if (TextUtils.isEmpty(number2.getText().toString())) {
                    number2.setError("Enter Number two");
                } else {

                    float firstNumber=Integer.valueOf(number1.getText().toString());
                    float secondNumber=Integer.valueOf(number2.getText().toString());

                    float btn_subtraction_number = firstNumber-secondNumber;
                    result.setText(String.valueOf(btn_subtraction_number));
                }
            }
        }));

        btn_modulus_number=findViewById(R.id.btn_modulus_number);

        btn_modulus_number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (TextUtils.isEmpty(number1.getText().toString())) {
                    number1.setError("Enter Number one");
                } else if (TextUtils.isEmpty(number2.getText().toString())) {
                    number2.setError("Enter Number two");
                } else {

                    float firstNumber=Integer.valueOf(number1.getText().toString());
                    float secondNumber=Integer.valueOf(number2.getText().toString());

                    float btn_modulus_number = firstNumber%secondNumber;
                    result.setText(String.valueOf(btn_modulus_number));
                }

            }
        });

        clear_button = findViewById(R.id.clear_button);
        clear_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1.setText("");
                number2.setText("");
                result.setText("");
            }
        });


        result = findViewById(R.id.rzlt);
        number1 = findViewById(R.id.nmber1);
        number2 = findViewById(R.id.nmber2);
    }


    private int AddTwoNumber(int number1, int number2) {
        return number1 + number2;
    }


}