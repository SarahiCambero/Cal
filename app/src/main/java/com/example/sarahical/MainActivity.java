package com.example.sarahical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sarahical.R;

public class MainActivity extends AppCompatActivity {

    EditText num1 = (EditText) findViewById(R.id.num1);
    EditText num2;
    Button sumar;
    Button dividir;
    Button Restar;
    Button Multiplicar;
    TextView Resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num2 = (EditText) findViewById(R.id.num2);
        Resultado = (TextView) findViewById (R.id.resultado);
        sumar = (Button) findViewById (R.id.sumar);
        dividir = (Button) findViewById(R.id.dividir);
        Restar = (Button) findViewById(R.id.restar);
        Multiplicar = (Button) findViewById(R.id.mutiplicar);




        //funcion CLICK

        Multiplicar .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(num1.getText().toString());
                double numero2 = Double.parseDouble(num2.getText().toString());
                double sumatoria = numero1 + numero2;
                Resultado.setText(Double.toString(sumatoria));

            }