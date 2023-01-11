package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView resultTv,solutionTv;
    ImageButton buttonClear;
    Button buttonSqr,buttonSin,buttonCos,buttonTan;
    Button buttonDivide,buttonMultiply,buttonPlus,buttonMinus,buttonEquals;
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
    Button buttonAC,buttonDot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTv = findViewById(R.id.result_tv);
        solutionTv = findViewById(R.id.solution_tv);
        buttonClear = findViewById(R.id.buttonClear);


        assignId(buttonSqr,R.id.button_root);
        assignId(buttonSin,R.id.button_sin);
        assignId(buttonCos,R.id.button_cos);
        assignId(buttonTan,R.id.button_tan);
        assignId(buttonDivide,R.id.button_divide);
        assignId(buttonMultiply,R.id.button_multiply);
        assignId(buttonPlus,R.id.button_add);
        assignId(buttonMinus,R.id.button_minus);
        assignId(buttonEquals,R.id.button_equals);
        assignId(button0,R.id.button_0);
        assignId(button1,R.id.button_1);
        assignId(button2,R.id.button_2);
        assignId(button3,R.id.button_3);
        assignId(button4,R.id.button_4);
        assignId(button5,R.id.button_5);
        assignId(button6,R.id.button_6);
        assignId(button7,R.id.button_7);
        assignId(button8,R.id.button_8);
        assignId(button9,R.id.button_9);
        assignId(buttonAC,R.id.button_Ac);
        assignId(buttonDot,R.id.button_dot);




    }

    void assignId(Button btn, int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Button button = (Button) v;
        ImageButton btn =(ImageButton) v;
        String buttonText = button.getText().toString();
        solutionTv.setText(buttonText);
        String dataToCalculate = solutionTv.getText().toString();

        if(buttonText.equals("Ac")){
            solutionTv.setText("");
            resultTv.setText("0");
            return;
        }
        if(buttonText.equals("=")){
            solutionTv.setText(resultTv.getText());
            return;
        }
        if (btn.callOnClick()){
            dataToCalculate = dataToCalculate.substring(0,dataToCalculate.length()-1);
        }else {
            dataToCalculate = dataToCalculate+buttonText;
        }
        solutionTv.setText(dataToCalculate);

    }

    String getResult(String data){
        try {
            Context context = Context.enter();
        }
    }
}



