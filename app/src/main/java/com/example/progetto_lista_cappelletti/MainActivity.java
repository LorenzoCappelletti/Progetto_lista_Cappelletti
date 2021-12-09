package com.example.progetto_lista_cappelletti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    ListView listas;
    String aStati[] = {"Italia" , "Francia" , "Germania" , "Svizzera"};
    Button bottone;
    Button annulla;
    TextView nome;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listas = (ListView) findViewById(R.id.ListaStati);
        bottone = (Button) findViewById(R.id.bottone);
        annulla = (Button) findViewById(R.id.annulla);
        nome = (TextView) findViewById(R.id.immetti);

        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, R.layout.activity_main, R.id.ListaStati, aStati); // contesto corrente è il metodo this. Tutto questo permette di collegare  l'array con la listView
        listas.setAdapter(aa); // legare la ListView con il nostro ArrayAdapter

        bottone.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                bottone.setText("Ciao " + nome.getText().toString());
            }
        });


        annulla.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                nome.setText("");
                bottone.setText("ok");
            }
        });



    }
}