package com.example.progetto_lista_cappelletti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{
    ListView listas;
    String aStati[] = {"Italia" , "Francia" , "Germania" , "Svizzera"};


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listas = (ListView) findViewById(R.id.ListaStati);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, R.layout.activity_main, R.id.ListaStati, aStati); // contesto corrente è il metodo this. Tutto questo permette di collegare  l'array con la listView
        listas.setAdapter(aa); // legare la ListView con il nostro ArrayAdapter


    }
}