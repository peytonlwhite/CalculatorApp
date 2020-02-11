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

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CalcOperations implements View.OnClickListener {

    //TV for result at bottom of layout
    TextView result;

    //operation text box in between the two inputs
    TextView operationText;

    //which operation the user clicked and is passed through
    Button operation;

    //parsed numbers
    double number1 = 0;
    double number2 = 0;

    //inputs the user does
    EditText firstNumber;
    EditText secondNumber;

    //constructor that takes in the user edit text for both numbers and the textview for result and the text view for operation text box
    public CalcOperations(EditText firstNumber, EditText secondNumber, Button operation, TextView result, TextView operationText) {
        this.operation = operation;
        this.result = result;

        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;

        this.operationText = operationText;

    }

    //onlick for the buttons
    @Override
    public void onClick(View view) {


        //view = the button pressed passed in through the constructor
        view = operation;

        //solution for all the problems
        double solution;

        //resets the text size every time button is clicked (different buttons require different text change)
        operationText.setTextSize(36);

        //two functions at bottom we used during the if else structure (isEditTextEmpty(), and fact())

        if(operation.getId() == R.id.buttonadd)
        {
            if(isEditTextsEmpty())
            {
                result.setText("Must input two numbers above");
            }
            else
            {
                this.number1 = Double.parseDouble(firstNumber.getText().toString());
                this.number2 = Double.parseDouble((secondNumber.getText().toString()));

                solution = number1 + number2;
                result.setText(number1 + " + " + number2 + " = " + String.valueOf(solution));
                operationText.setText("+");
            }
        }
        else if(operation.getId() == R.id.buttonsubtract)
        {
            if(isEditTextsEmpty())
            {
                result.setText("Must input two numbers above");
            }
            else
            {
                this.number1 = Double.parseDouble(firstNumber.getText().toString());
                this.number2 = Double.parseDouble((secondNumber.getText().toString()));

                solution = number1 - number2;
                result.setText(number1 + " - " + number2 + " = " + String.valueOf(solution));
                operationText.setText("-");
            }

        }
        else if(operation.getId() == R.id.buttonmultiply)
        {
            if(isEditTextsEmpty())
            {
                result.setText("Must input two numbers above");
            }
            else
            {
                this.number1 = Double.parseDouble(firstNumber.getText().toString());
                this.number2 = Double.parseDouble((secondNumber.getText().toString()));

                solution = number1 * number2;
                result.setText(number1 + " X " + number2 + " = " + String.valueOf(solution));
                operationText.setText("X");
            }

        }
        else if(operation.getId() == R.id.buttondivide)
        {
            if(isEditTextsEmpty())
            {
                result.setText("Must input two numbers above");
            }
            else
            {
                this.number1 = Double.parseDouble(firstNumber.getText().toString());
                this.number2 = Double.parseDouble((secondNumber.getText().toString()));

                solution = number1 / number2;
                result.setText(number1 + " / " + number2 + " = " + String.valueOf(solution));
                operationText.setText("/");
            }
        }
        else if(operation.getId() == R.id.buttonsquareroot)
        {
            if(firstNumber.getText().toString().isEmpty())
            {
                result.setText("A number must be in the first input box");
            }
            else {
                secondNumber.setText("");
                this.number1 = Double.parseDouble(firstNumber.getText().toString());
                solution = Math.sqrt(number1);
                result.setText("sqrt(" + number1 + ")" + " = " + String.valueOf(solution));
                operationText.setText("Sqrt");
            }
        }
        else if(operation.getId() == R.id.buttonbase10)
        {
            if(firstNumber.getText().toString().isEmpty())
            {
                result.setText("A number must be in the first input box");
            }
            else {
                secondNumber.setText("");
                this.number1 = Double.parseDouble(firstNumber.getText().toString());
                solution = Math.log10(number1);
                result.setText("log10(" + number1 + ")" + " = " + String.valueOf(solution));
                operationText.setTextSize(18);
                operationText.setText("Log10");
            }

        }
        else if(operation.getId() == R.id.buttonfactorial)
        {
            if(firstNumber.getText().toString().isEmpty())
            {
                result.setText("A number must be in the first input box");

            }
            else
            {
                this.number1 = Double.parseDouble(firstNumber.getText().toString());

                if(number1 < 0)
                {
                    result.setText("number can not be negative");
                    firstNumber.setText("");
                }
                else if(number1 % 1 != 0)
                {
                    result.setText("Input value must not be a decimal");
                    firstNumber.setText("");
                }
                else {
                    secondNumber.setText("");

                    solution = factorialCalc();

                    result.setText(number1 + "!" + " = " + String.valueOf(solution));
                    operationText.setText("!");

                }

            }

        }
        else if(operation.getId() == R.id.buttonpower)
        {
            if(isEditTextsEmpty())
            {
                result.setText("A number must be in the first and second input box");
            }
            else {

                this.number1 = Double.parseDouble(firstNumber.getText().toString());
                this.number2 = Double.parseDouble(secondNumber.getText().toString());

                solution = Math.pow(number1,number2);
                result.setText(number1 + "^" + number2 + " = " + String.valueOf(solution));
                operationText.setText("^");
            }

        }
        else if(operation.getId() == R.id.buttoncosine)
        {
            if(firstNumber.getText().toString().isEmpty())
            {
                result.setText("A number must be in the first input box");
            }
            else {
                secondNumber.setText("");

                this.number1 = Double.parseDouble(firstNumber.getText().toString());
                solution = Math.cos(number1);

                result.setText("Cos(" + number1 + ")" + " = " + String.valueOf(solution));
                operationText.setTextSize(18);
                operationText.setText("COS");

            }

        }
        else if(operation.getId() == R.id.buttonsine)
        {
            if(firstNumber.getText().toString().isEmpty())
            {
                result.setText("A number must be in the first input box");
            }
            else {
                secondNumber.setText("");

                this.number1 = Double.parseDouble(firstNumber.getText().toString());
                solution = Math.sin(number1);

                result.setText("Sine(" + number1 + ")" + " = " + String.valueOf(solution));
                operationText.setTextSize(18);
                operationText.setText("SINE");

            }

        }
        else if(operation.getId() == R.id.buttontangent)
        {
            if(firstNumber.getText().toString().isEmpty())
            {
                result.setText("A number must be in the first input box");
            }
            else {
                secondNumber.setText("");

                this.number1 = Double.parseDouble(firstNumber.getText().toString());
                solution = Math.tan(number1);

                result.setText("Tan(" + number1 + ")" + " = " + String.valueOf(solution));
                operationText.setTextSize(18);
                operationText.setText("TAN");

            }

        }
        else if(operation.getId() == R.id.buttonclear)
        {
            firstNumber.setText("");
            secondNumber.setText("");
            operationText.setText("OP");
            result.setTextColor(Color.CYAN);
            result.setText("Lets do some Math");
            result.setTextColor(Color.BLACK);

        }



    }





    //checks if either number is empty if so return true
    public boolean isEditTextsEmpty()
    {
        if(secondNumber.getText().toString().equals("")  || firstNumber.getText().toString().equals(""))
        {
            return true;
        }

        return false;

    }

    //factorial mehtod for fact button
    public int factorialCalc()
    {
        int solution = 1;
        this.number1 = Double.parseDouble(firstNumber.getText().toString());

        for(int i = 1; i <= number1; i++)
        {
            solution = solution * i;
        }
        return solution;

    }




}
