package com.example.miexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Unidades extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unidades);
    }

    public void Autoestima(View view){
        Intent autoestima = new Intent(this, Autoestima.class);
        startActivity(autoestima);

    }

    public void Integridad(View view){
        Intent integridad = new Intent(this, Integridad.class);
        startActivity(integridad);

    }

    public void ManejoDeConfilctos(View view){
        Intent manejo_de_conflictos = new Intent(this, ManejoDeConflictos.class);
        startActivity(manejo_de_conflictos);

    }

    public void TomaDeDecisiones(View view){
        Intent toma_de_decisones = new Intent(this, TomaDeDecisiones.class);
        startActivity(toma_de_decisones);

    }


}