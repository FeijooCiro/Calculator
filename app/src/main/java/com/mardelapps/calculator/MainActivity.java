package com.mardelapps.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.mardelapps.calculator.R.id;

public class MainActivity extends AppCompatActivity {

    EditText TNum, TNum2;
    double Num, Num2, Res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TNum = findViewById(R.id.editTextNumberOne);
        TNum2 = findViewById(R.id.editTextNumberTwo);
    }

    private double Sumar(){
        Num = Double.parseDouble(TNum.getText().toString());
        Num2 = Double.parseDouble(TNum2.getText().toString());
        return Num + Num2;
    }

    public void resultSuma(View view){
        String content = TNum.getText().toString();
        String content2 = TNum2.getText().toString();

        if(content.isEmpty() && content2.isEmpty()){
            Toast.makeText(this, "Los campos están vacíos.", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Resultado de la Suma: " + Sumar(), Toast.LENGTH_SHORT).show();
        }
    }

    private double Restar(){
        Num = Double.parseDouble(TNum.getText().toString());
        Num2 = Double.parseDouble(TNum2.getText().toString());
        return Num - Num2;
    }

    public void resultResta(View view){
        String content = TNum.getText().toString();
        String content2 = TNum2.getText().toString();

        if(content.isEmpty() && content2.isEmpty()){
            Toast.makeText(this, "Los campos están vacíos.", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Resultado de la Resta: " + Restar(), Toast.LENGTH_SHORT).show();
        }
    }

    private double Multiplicar(){
        Num = Double.parseDouble(TNum.getText().toString());
        Num2 = Double.parseDouble(TNum2.getText().toString());
        return Num * Num2;
    }

    public void resultMultiplicacion(View view){
        String content = TNum.getText().toString();
        String content2 = TNum2.getText().toString();

        if(content.isEmpty() && content2.isEmpty()){
            Toast.makeText(this, "Los campos están vacíos.", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Resultado de la Multiplicacion: " + Multiplicar(), Toast.LENGTH_SHORT).show();
        }
    }

    private double Dividir(){
        Num = Double.parseDouble(TNum.getText().toString());
        Num2 = Double.parseDouble(TNum2.getText().toString());
        return Num / Num2;
    }

    public void resultDivision(View view){
        String content = TNum.getText().toString();
        String content2 = TNum2.getText().toString();

        if(content.isEmpty() && content2.isEmpty()){
            Toast.makeText(this, "Los campos están vacíos.", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Resultado de la Division: " + Dividir(), Toast.LENGTH_SHORT).show();
        }
    }
}