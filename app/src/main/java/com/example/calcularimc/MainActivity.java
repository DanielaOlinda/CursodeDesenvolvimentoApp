package com.example.calcularimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView Resultado;
    private EditText editePeso;
    private EditText editeAltura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Recuperando os componentes
        Resultado = findViewById(R.id.Resultado);
        editePeso = findViewById(R.id.editePeso);
        editeAltura = findViewById(R.id.editeAltura);

    }
    public void calcularIMc(View view){
            double peso = Double.parseDouble(editePeso.getText().toString());
            double Altura = Double.parseDouble(editeAltura.getText().toString());
            double resultado = peso / (Altura * Altura);

            if(resultado < 19 ){
                Resultado.setText("Voce esta Abaixo no peso!");
            }else if( resultado <= 19 || resultado < 25 ){
                Resultado.setText("Voce esta no peso normal!");
            }else if( resultado <= 25 || resultado < 30 ) {
                Resultado.setText("Voce esta com sobrepeso!");
            }else if( resultado <= 30 || resultado < 40 ){
                    Resultado.setText("Voce esta com Obesidade tipo 1!");
            }else if( resultado >= 40  ){
                Resultado.setText("Voce esta com Obesidade tipo 2 !");
    }
    }
}