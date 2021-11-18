package com.example.kalkulator;

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
    public void onButtonClick (View w) {
        EditText numberOne = (EditText)findViewById(R.id.idoneinput);
        EditText numberTwo = (EditText)findViewById(R.id.idtwoinput);
        TextView outputText = (TextView)findViewById(R.id.Resultat);
        int peremennay_one = Integer.parseInt(numberOne.getText().toString());
        int peremennay_two = Integer.parseInt(numberTwo.getText().toString());

        int result_plus = peremennay_one + peremennay_two;

        outputText.setText(Integer.toString(result_plus));

    }
    public void twoButtonClick (View v) {
        EditText numberOne = (EditText)findViewById(R.id.idoneinput);
        EditText numberTwo = (EditText)findViewById(R.id.idtwoinput);
        TextView outputText = (TextView)findViewById(R.id.Resultat);
        int peremennay_one = Integer.parseInt(numberOne.getText().toString());
        int peremennay_two = Integer.parseInt(numberTwo.getText().toString());

        int result_minus = peremennay_one - peremennay_two;

        outputText.setText(Integer.toString(result_minus));

    }
    public void threeButtonClick (View c) {
        EditText numberOne = (EditText)findViewById(R.id.idoneinput);
        EditText numberTwo = (EditText)findViewById(R.id.idtwoinput);
        TextView outputText = (TextView)findViewById(R.id.Resultat);
        int peremennay_one = Integer.parseInt(numberOne.getText().toString());
        int peremennay_two = Integer.parseInt(numberTwo.getText().toString());

        int result_mnozh = peremennay_one * peremennay_two;

        outputText.setText(Integer.toString(result_mnozh));

    }
    public void fooButtonClick (View g) {
        EditText numberOne = (EditText)findViewById(R.id.idoneinput);
        EditText numberTwo = (EditText)findViewById(R.id.idtwoinput);
        TextView outputText = (TextView)findViewById(R.id.Resultat);
        int peremennay_one = Integer.parseInt(numberOne.getText().toString());
        int peremennay_two = Integer.parseInt(numberTwo.getText().toString());

        int result_dell = peremennay_one / peremennay_two;

        outputText.setText(Integer.toString(result_dell));

    }
}