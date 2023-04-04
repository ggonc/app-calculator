package com.mobile.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button btnSoma, btnSubtracao, btnMultiplicacao, btnDivisao;
    public TextView textResultado;
    public EditText inputValor1, inputValor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSoma = findViewById(R.id.btnSoma);
        btnSubtracao = findViewById(R.id.btnSubtracao);
        btnMultiplicacao = findViewById(R.id.btnMultiplicacao);
        btnDivisao = findViewById(R.id.btnDivisao);
        inputValor1 = findViewById(R.id.inputValor1);
        inputValor2 = findViewById(R.id.inputValor2);
        textResultado = findViewById(R.id.textResultado);
    }

    public void somar(View view){
        double valor1 = Double.parseDouble(inputValor1.getText().toString());
        double valor2 = Double.parseDouble(inputValor2.getText().toString());
        double resultado = valor1 + valor2;
        textResultado.setText(String.valueOf(resultado));
    }

    public void subtrair(View view){
        double valor1 = Double.parseDouble(inputValor1.getText().toString());
        double valor2 = Double.parseDouble(inputValor2.getText().toString());
        double resultado = valor1 - valor2;
        textResultado.setText(String.valueOf(resultado));
    }

    public void multiplicar(View view){
        double valor1 = Double.parseDouble(inputValor1.getText().toString());
        double valor2 = Double.parseDouble(inputValor2.getText().toString());
        double resultado = valor1 * valor2;
        textResultado.setText(String.valueOf(resultado));
    }

    public void dividir(View view){
        double valor1 = Double.parseDouble(inputValor1.getText().toString());
        double valor2 = Double.parseDouble(inputValor2.getText().toString());
        double resultado = valor1 / valor2;
        textResultado.setText(String.valueOf(resultado));
    }
}