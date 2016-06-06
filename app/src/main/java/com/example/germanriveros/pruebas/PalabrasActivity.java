package com.example.germanriveros.pruebas;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class PalabrasActivity extends AppCompatActivity {


    Bundle b;
    public TextView tv_letra;
    private ListView lista;
    private DataBaseManager dataBaseManager;
    private Cursor cursor;
    private SimpleCursorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palabras);

        dataBaseManager = new DataBaseManager(this);
        tv_letra = (TextView) findViewById(R.id.tv_letra);

        b = getIntent().getExtras();
        String letra = b.getString("Letra");
        tv_letra.setText(letra);

        //Sector - programación del listView

        lista = (ListView) findViewById(R.id.lista);
        char l = letra.charAt(0);

        switch (l)
        {
            case 'A': mostrarPalabrasLetras('A'); break;

            case 'B': mostrarPalabrasLetras('B'); break;

            case 'C': mostrarPalabrasLetras('C'); break;

            case 'D': mostrarPalabrasLetras('D'); break;

            case 'E': mostrarPalabrasLetras('E'); break;

            case 'F': mostrarPalabrasLetras('F'); break;

            case 'G': mostrarPalabrasLetras('G'); break;

            case 'H': mostrarPalabrasLetras('H'); break;

            case 'I': mostrarPalabrasLetras('I'); break;

            case 'J': mostrarPalabrasLetras('J'); break;

            //case 'K': mostrarPalabrasLetras('K'); break;

            case 'L': mostrarPalabrasLetras('L'); break;

            //case 'LL': mostrarPalabrasLetras('LL'); break;

            case 'M': mostrarPalabrasLetras('M'); break;

            case 'N': mostrarPalabrasLetras('N'); break;

            case 'O': mostrarPalabrasLetras('O'); break;

            case 'P': mostrarPalabrasLetras('P'); break;

            case 'Q': mostrarPalabrasLetras('Q'); break;

            case 'R': mostrarPalabrasLetras('R'); break;

            case 'S': mostrarPalabrasLetras('S'); break;

            case 'T': mostrarPalabrasLetras('T'); break;

            case 'U': mostrarPalabrasLetras('U'); break;

            case 'V': mostrarPalabrasLetras('V'); break;

            //case 'W': mostrarPalabrasLetras('W'); break;

            case 'X': mostrarPalabrasLetras('X'); break;

            case 'Y': mostrarPalabrasLetras('Y'); break;

            case 'Z': mostrarPalabrasLetras('Z'); break;

            //case 'Ñ': mostrarPalabrasLetras('Ñ'); break;


        }


    }

    public void mostrarPalabrasLetras(char Caracter)
    {
        String[] from_table = new String[]{dataBaseManager.CN_ESP,dataBaseManager.CN_MAPU};
        int[] to_table = new int[]{android.R.id.text1, android.R.id.text2 };

        cursor = dataBaseManager.cargarCursorLetras(Caracter);
        adapter = new SimpleCursorAdapter(this, android.R.layout.two_line_list_item, cursor,from_table,to_table,0);
        lista.setAdapter(adapter);

    }


}

