package com.example.germanriveros.pruebas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button btn_abc;
    private DataBaseManager dataBaseManager;
    private Tablas tbl;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataBaseManager = new DataBaseManager(this);



//probando git 2.0

        btn_abc = (Button) findViewById(R.id.btn_abc);
        btn_abc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                startActivity(new Intent(MainActivity.this, Abc_Activity.class));
            }
        });


    }




}
