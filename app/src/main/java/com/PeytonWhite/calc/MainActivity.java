/*
Peyton White
App: Calculator

Phone -----------------
--  Pixel 2 API 27
--  Height: 1920
--  Width : 1080
Phone -----------------
*/



package com.PeytonWhite.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.PeytonWhite.calc.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //result of numbers
        TextView result = findViewById(R.id.textViewanswer);

        //operation text field
        TextView operationText = findViewById(R.id.textViewoperation);
        //input number 1
        EditText number1 = findViewById(R.id.edittextfirstnumber);

        //input number 2
        EditText number2 = findViewById(R.id.edittextsecondnumber);

        //all the buttons (looks more organized)
        Button add = findViewById(R.id.buttonadd);
        Button subtract = findViewById(R.id.buttonsubtract);
        Button divide = findViewById(R.id.buttondivide);
        Button multiply = findViewById(R.id.buttonmultiply);
        Button squareRoot = findViewById(R.id.buttonsquareroot);
        Button base10 = findViewById(R.id.buttonbase10);
        Button fact = findViewById(R.id.buttonfactorial);
        Button pow = findViewById(R.id.buttonpower);
        Button cosine = findViewById(R.id.buttoncosine);
        Button sine = findViewById(R.id.buttonsine);
        Button tangent = findViewById(R.id.buttontangent);
        Button clear = findViewById(R.id.buttonclear);



        CalcOperations operations;

        add.setOnClickListener(operations =        new CalcOperations(   number1
                                                                        ,number2
                                                                        ,add
                                                                        ,result
                                                                        ,operationText));

        subtract.setOnClickListener(operations =   new CalcOperations(   number1
                                                                        ,number2
                                                                        ,subtract
                                                                        ,result
                                                                        ,operationText));


        divide.setOnClickListener(operations =     new CalcOperations(   number1
                                                                        ,number2
                                                                        ,divide
                                                                        ,result
                                                                        ,operationText));

        multiply.setOnClickListener(operations =   new CalcOperations(   number1
                                                                        ,number2
                                                                        ,multiply
                                                                        ,result
                                                                        ,operationText));


        squareRoot.setOnClickListener(operations = new CalcOperations(   number1
                                                                        ,number2
                                                                        ,squareRoot
                                                                        ,result
                                                                        ,operationText));


        base10.setOnClickListener(operations = new CalcOperations(       number1
                                                                        ,number2
                                                                        ,base10
                                                                        ,result
                                                                        ,operationText));


        fact.setOnClickListener(operations = new CalcOperations(         number1
                                                                        ,number2
                                                                        ,fact
                                                                        ,result
                                                                        ,operationText));

        pow.setOnClickListener(operations = new CalcOperations(          number1
                                                                        ,number2
                                                                        ,pow
                                                                        ,result
                                                                        ,operationText));


        cosine.setOnClickListener(operations = new CalcOperations(       number1
                                                                        ,number2
                                                                        ,cosine
                                                                        ,result
                                                                        ,operationText));


        sine.setOnClickListener(operations = new CalcOperations(         number1
                                                                        ,number2
                                                                        ,sine
                                                                        ,result
                                                                        ,operationText));


        tangent.setOnClickListener(operations = new CalcOperations(      number1
                                                                        ,number2
                                                                        ,tangent
                                                                        ,result
                                                                        ,operationText));

        clear.setOnClickListener(operations = new CalcOperations(        number1
                                                                        ,number2
                                                                        ,clear
                                                                        ,result
                                                                        ,operationText));


    }
}
