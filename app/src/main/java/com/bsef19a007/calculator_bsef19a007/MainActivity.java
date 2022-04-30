package com.bsef19a007.calculator_bsef19a007;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
//import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
//import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

//    private TextView previousCalculation;
    private EditText display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        previousCalculation = findViewById(R.id.previousCalculationView);
        display = findViewById(R.id.displayEditText);

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
        Button openParenButton = findViewById(R.id.openParenBtn);
        Button closeParenButton = findViewById(R.id.closeParenBtn);
        Button plusButton = findViewById(R.id.plusBtn);
        Button minusButton = findViewById(R.id.minusBtn);
        Button multiplyButton = findViewById(R.id.multiplyBtn);
        Button divideButton = findViewById(R.id.divideBtn);
        Button decimalButton = findViewById(R.id.decimalBtn);
        Button clearButton = findViewById(R.id.clearBtn);
        Button equalButton = findViewById(R.id.equalBtn);
        ImageButton backspaceButton = findViewById(R.id.backspaceBtn);

        display.setShowSoftInputOnFocus(false);

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
        openParenButton.setOnClickListener(this);
        closeParenButton.setOnClickListener(this);
        plusButton.setOnClickListener(this);
        minusButton.setOnClickListener(this);
        multiplyButton.setOnClickListener(this);
        divideButton.setOnClickListener(this);
        decimalButton.setOnClickListener(this);
        clearButton.setOnClickListener(this);
        equalButton.setOnClickListener(this);
        backspaceButton.setOnClickListener(this);
    }

    private void updateText (String strToAdd){
        String oldStr = display.getText().toString();

        int cursorPos = display.getSelectionStart();
        String leftStr = oldStr.substring(0, cursorPos);
        String rightStr = oldStr.substring(cursorPos);

        display.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));
        display.setSelection(cursorPos + strToAdd.length());
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.zeroBtn:
                updateText(getResources().getString(R.string.zeroText));
                break;
            case R.id.oneBtn:
                updateText(getResources().getString(R.string.oneText));
                break;
            case R.id.twoBtn:
                updateText(getResources().getString(R.string.twoText));
                break;
            case R.id.threeBtn:
                updateText(getResources().getString(R.string.threeText));
                break;
            case R.id.fourBtn:
                updateText(getResources().getString(R.string.fourText));
                break;
            case R.id.fiveBtn:
                updateText(getResources().getString(R.string.fiveText));
                break;
            case R.id.sixBtn:
                updateText(getResources().getString(R.string.sixText));
                break;
            case R.id.sevenBtn:
                updateText(getResources().getString(R.string.sevenText));
                break;
            case R.id.eightBtn:
                updateText(getResources().getString(R.string.eightText));
                break;
            case R.id.nineBtn:
                updateText(getResources().getString(R.string.nineText));
                break;
            case R.id.openParenBtn:
                updateText(getResources().getString(R.string.parenthesesOpenText));
                break;
            case R.id.closeParenBtn:
                updateText(getResources().getString(R.string.parenthesesCloseText));
                break;
            case R.id.plusBtn:
                updateText(getResources().getString(R.string.addText));
                break;
            case R.id.minusBtn:
                updateText(getResources().getString(R.string.subtractText));
                break;
            case R.id.multiplyBtn:
                updateText(getResources().getString(R.string.multiplyText));
                break;
            case R.id.divideBtn:
                updateText(getResources().getString(R.string.divideText));
                break;
            case R.id.decimalBtn:
                updateText(getResources().getString(R.string.decimalText));
                break;
            case R.id.clearBtn:
                display.setText("");
                break;
            case R.id.equalBtn:
                break;
            case R.id.backspaceBtn:
                int curPosition = display.getSelectionStart();
                int textLength =display.getText().length();

                if (curPosition != 0 && textLength != 0){
                    SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
                    selection.replace(curPosition-1, curPosition, "");
                    display.setText(selection);
                    display.setSelection(curPosition-1);
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }
    }

    }


