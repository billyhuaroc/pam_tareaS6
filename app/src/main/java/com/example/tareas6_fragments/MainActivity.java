package com.example.tareas6_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //Declaración de variables
    Fragment baseFrag, amarilloFrag, plomoFrag, azulFrag, naranjaFrag, violetaFrag, celesteFrag;
    FragmentTransaction transaccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instanciamos los fragments
        baseFrag = new baseFrag();
        amarilloFrag = new amarilloFrag();
        plomoFrag = new plomoFrag();
        azulFrag = new azulFrag();
        naranjaFrag = new naranjaFrag();
        violetaFrag = new violetaFrag();
        celesteFrag = new celesteFrag();

        //lanzamos el fragmento base
        getSupportFragmentManager().beginTransaction().add(R.id.contenedorFragment, baseFrag).commit();
    }

    public void onClick(View view){

        //almacenamos la llamada al fragmento y su inicializancion
        transaccion = getSupportFragmentManager().beginTransaction();

        switch (view.getId())
        {
            case R.id.btn_amarillo:
                //remplazamos el fragmento
                transaccion.replace(R.id.contenedorFragment, amarilloFrag);
                //addToBackStack revierte la transacción y recupera el fragmento
                transaccion.addToBackStack(null);
                break;
            case R.id.btn_plomo:
                //remplazamos el fragmento
                transaccion.replace(R.id.contenedorFragment, plomoFrag);
                //addToBackStack revierte la transacción y recupera el fragmento
                transaccion.addToBackStack(null);
                break;
            case R.id.btn_azul:
                //remplazamos el fragmento
                transaccion.replace(R.id.contenedorFragment, azulFrag);
                //addToBackStack revierte la transacción y recupera el fragmento
                transaccion.addToBackStack(null);
                break;
            case R.id.btn_naranja:
                //remplazamos el fragmento
                transaccion.replace(R.id.contenedorFragment, naranjaFrag);
                //addToBackStack revierte la transacción y recupera el fragmento
                transaccion.addToBackStack(null);
                break;
            case R.id.btn_violeta:
                //remplazamos el fragmento
                transaccion.replace(R.id.contenedorFragment, violetaFrag);
                //addToBackStack revierte la transacción y recupera el fragmento
                transaccion.addToBackStack(null);
                break;
            case R.id.btn_celeste:
                //remplazamos el fragmento
                transaccion.replace(R.id.contenedorFragment, celesteFrag);
                //addToBackStack revierte la transacción y recupera el fragmento
                transaccion.addToBackStack(null);
                break;
        }
        transaccion.commit();
    }
}