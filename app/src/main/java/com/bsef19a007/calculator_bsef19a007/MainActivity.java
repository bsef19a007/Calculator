package com.bsef19a007.calculator_bsef19a007;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

   // private TextView previousCalculation;
    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button zeroButton = findViewById(R.id.zeroBtn);
        Button oneButton = findViewById(R.id.oneBtn);
        Button twoButton = findViewById(R.id.twoBtn);
        Button threeButton = findViewById(R.id.threeBtn);
        Button fourButton = findViewById(R.id.fourBtn);
        Button fiveButton = findViewById(R.id.fiveBtn);
        Button sixButton = findViewById(R.id.sixBtn);
        Button sevenButton = findViewById(R.id.sevenBtn);
        Button eightButton = findViewById(R.id.eightBtn);
        Button nineButton = findViewById(R.id.nineBtn);


        //previousCalculation = findViewById(R.id.previousCalculationView);
        display= findViewById(R.id.displayEditText);
        zeroButton.setOnClickListener(this);
        oneButton.setOnClickListener(this);
        twoButton.setOnClickListener(this);
        threeButton.setOnClickListener(this);
        fourButton.setOnClickListener(this);
        fiveButton.setOnClickListener(this);
        sixButton.setOnClickListener(this);
        sevenButton.setOnClickListener(this);
        eightButton.setOnClickListener(this);
        nineButton.setOnClickListener(this);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.zeroBtn:
                updateText("0");
                break;
            case R.id.oneBtn:
                updateText("1");
                break;
            case R.id.twoBtn:
                updateText("2");
                break;
            case R.id.threeBtn:
                updateText("3");
                break;
            case R.id.fourBtn:
                updateText("4");
                break;
            case R.id.fiveBtn:
                updateText("5");
                break;
            case R.id.sixBtn:
                updateText("6");
                break;
            case R.id.sevenBtn:
                updateText("7");
                break;
            case R.id.eightBtn:
                updateText("8");
                break;
            case R.id.nineBtn:
                updateText("9");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }
    }

    private void updateText(String strToAdd){
        display.setText(strToAdd);
    }
}