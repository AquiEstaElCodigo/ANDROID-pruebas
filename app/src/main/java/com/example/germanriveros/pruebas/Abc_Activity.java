package com.example.germanriveros.pruebas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Abc_Activity extends AppCompatActivity
{

    private Button btn_A, btn_B, btn_C, btn_D, btn_E, btn_F,btn_G,
            btn_H,btn_I,btn_J,btn_K,btn_L,btn_LL,btn_M,btn_N,btn_O,
            btn_P,btn_Q,btn_R,btn_S,btn_T,btn_U,btn_V,btn_W,btn_X,
            btn_Y,btn_Z,btn_enye;


    private Intent i;
    private PalabrasActivity pa;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abc_);


        btn_A = (Button) findViewById(R.id.btn_A);
        btn_B = (Button) findViewById(R.id.btn_B);
        btn_C = (Button) findViewById(R.id.btn_C);
        btn_D = (Button) findViewById(R.id.btn_D);
        btn_E = (Button) findViewById(R.id.btn_E);
        btn_F = (Button) findViewById(R.id.btn_F);
        btn_G = (Button) findViewById(R.id.btn_G);
        btn_H = (Button) findViewById(R.id.btn_H);
        btn_I = (Button) findViewById(R.id.btn_I);
        btn_J = (Button) findViewById(R.id.btn_J);
        btn_K = (Button) findViewById(R.id.btn_K);          btn_K.setEnabled(false);
        btn_L = (Button) findViewById(R.id.btn_L);
        btn_LL = (Button) findViewById(R.id.btn_LL);        btn_LL.setEnabled(false);
        btn_M = (Button) findViewById(R.id.btn_M);
        btn_N = (Button) findViewById(R.id.btn_N);
        btn_O = (Button) findViewById(R.id.btn_O);
        btn_P = (Button) findViewById(R.id.btn_P);
        btn_Q = (Button) findViewById(R.id.btn_Q);
        btn_R = (Button) findViewById(R.id.btn_R);
        btn_S = (Button) findViewById(R.id.btn_S);
        btn_T = (Button) findViewById(R.id.btn_T);
        btn_U = (Button) findViewById(R.id.btn_U);
        btn_V = (Button) findViewById(R.id.btn_V);
        btn_W = (Button) findViewById(R.id.btn_W);          btn_W.setEnabled(false);
        btn_X = (Button) findViewById(R.id.btn_X);          btn_X.setEnabled(false);
        btn_Y = (Button) findViewById(R.id.btn_Y);
        btn_Z = (Button) findViewById(R.id.btn_Z);
        btn_enye = (Button) findViewById(R.id.btn_enye);    btn_enye.setEnabled(false);


    }


    /*
    el método mostrarPalabras() es para llamar o ejecutar la Actividad PalabrasActivity
    y funciona con el método traspasarIntent() (se hizo esto para resumir código)
     */

    public void mostrarPalabras(View view)
    {
        pa = new PalabrasActivity();

        switch (view.getId())
        {
            case R.id.btn_A: traspasarIntent(btn_A.getText().toString()); break;

            case R.id.btn_B: traspasarIntent(btn_B.getText().toString()); break;

            case R.id.btn_C: traspasarIntent(btn_C.getText().toString()); break;

            case R.id.btn_D: traspasarIntent(btn_D.getText().toString()); break;

            case R.id.btn_E: traspasarIntent(btn_E.getText().toString()); break;

            case R.id.btn_F: traspasarIntent(btn_F.getText().toString()); break;

            case R.id.btn_G: traspasarIntent(btn_G.getText().toString()); break;

            case R.id.btn_H: traspasarIntent(btn_H.getText().toString()); break;

            case R.id.btn_I: traspasarIntent(btn_I.getText().toString()); break;

            case R.id.btn_J: traspasarIntent(btn_J.getText().toString()); break;

        //  case R.id.btn_K: traspasarIntent(btn_K.getText().toString()); break;

            case R.id.btn_L: traspasarIntent(btn_L.getText().toString()); break;

        //  case R.id.btn_LL: traspasarIntent(btn_LL.getText().toString());break;

            case R.id.btn_M: traspasarIntent(btn_M.getText().toString()); break;

            case R.id.btn_N: traspasarIntent(btn_N.getText().toString()); break;

            case R.id.btn_O: traspasarIntent(btn_O.getText().toString()); break;

            case R.id.btn_P: traspasarIntent(btn_P.getText().toString()); break;

            case R.id.btn_Q: traspasarIntent(btn_Q.getText().toString()); break;

            case R.id.btn_R: traspasarIntent(btn_R.getText().toString()); break;

            case R.id.btn_S: traspasarIntent(btn_S.getText().toString()); break;

            case R.id.btn_T: traspasarIntent(btn_T.getText().toString()); break;

            case R.id.btn_U: traspasarIntent(btn_U.getText().toString()); break;

            case R.id.btn_V: traspasarIntent(btn_V.getText().toString()); break;

         // case R.id.btn_W: traspasarIntent(btn_W.getText().toString()); break;

        //  case R.id.btn_X: traspasarIntent(btn_X.getText().toString()); break;

            case R.id.btn_Y: traspasarIntent(btn_Y.getText().toString()); break;

            case R.id.btn_Z: traspasarIntent(btn_Z.getText().toString()); break;

        //  case R.id.btn_enye: traspasarIntent(btn_enye.getText().toString());break;


        }

    }

    public void traspasarIntent(String textoBoton)
    {

        i = new Intent(Abc_Activity.this, PalabrasActivity.class);
        i.putExtra("Letra", textoBoton);
        startActivity(i);

    }


}
//Toast toast = Toast.makeText(getApplicationContext(),"C", Toast.LENGTH_SHORT); toast.show();