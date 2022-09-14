package com.Darylarz.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText peso, altura;
    private Button calcular, eliminar;
    private TextView imc, descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peso = findViewById(R.id.txtpeso);
        altura = findViewById(R.id.txtaltura);
        
        calcular = findViewById(R.id.btnCalcular);
        eliminar = findViewById(R.id.btnEliminar);

        imc = findViewById(R.id.txtIMC);
        descripcion = findViewById(R.id.txtdescripcion);

    }

    // Inicio de boton Calcular

    public void operar(View view) {
        //descripcion.setText("funciona");



         String p = peso.getText().toString();
         String a = altura.getText().toString();

         if(p.isEmpty()) {
             descripcion.setText("Debes ingresar el peso y la altura");
         }

        if(a.isEmpty()) {
            descripcion.setText("Debes ingresar el peso y la altura");
        }

         Double npeso = Double.parseDouble(p);
         Double naltura = Double.parseDouble(a);

         double resultadoimc = npeso / (naltura * naltura);

        String speso = Double.toString(npeso);
         imc.setText(speso);
        if (resultadoimc < 18.5)
            descripcion.setText("Peso bajo");
        else
            if (resultadoimc >= 18.5 && resultadoimc <= 24.9)
                descripcion.setText("Peso normal");

                else
                    if(resultadoimc >= 25 && resultadoimc<=29.9)
                        descripcion.setText("Sobre peso");


        }

        // Fin de boton Calcular

        // Inicio de boton Eliminar
        public void borrar(View view) {

        peso.setText("");
        altura.setText("");
        imc.setText("");
        descripcion.setText("");

        }

        // Fin de boton Eliminar

}