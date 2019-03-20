package com.example.androidswitchviews_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondScreenActivity extends AppCompatActivity {

    //Se llama cuando se crea por primera vez la actividad

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);

        TextView txtNamee=(TextView) findViewById(R.id.txtName2);
        TextView txtEmail=(TextView) findViewById(R.id.txtEmail2);
        TextView txtEdad=(TextView) findViewById(R.id.txtEdad2);
        Button btnClose=(Button) findViewById(R.id.btnClose);

        Intent i= getIntent();
        //Recibiendo los datos
        String name=i.getStringExtra("txtName");
        String email=i.getStringExtra("txtEmail");
        String edad=i.getStringExtra("txtEdad");
        Log.e("Second Screen",name+"."+ email + "." + edad);

        //Mostrar datos recibidos

        txtNamee.setText(name);
        txtEmail.setText(email);
        txtEdad.setText(edad);

        //Encuadernación click en evento al botón
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Cierre
                finish();
            }
        });

    }
}
