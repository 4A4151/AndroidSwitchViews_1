package com.example.androidswitchviews_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstScreenActivity extends AppCompatActivity {
    EditText inputName;
    EditText inputEmail;
    EditText inputEdad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen1);

        inputName=(EditText) findViewById(R.id.txtName);
        inputEmail=(EditText) findViewById(R.id.txtEmail);
        inputEdad=(EditText) findViewById(R.id.txtEdad);
        Button btnNextScreen=(Button) findViewById(R.id.btnNext);

        //Escuchando el botón de evento
        btnNextScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Comenzando un nuevo intento
                Intent nextScreen= new Intent(getApplicationContext(),SecondScreenActivity.class);


                //Enviando datos a otra Activty
                nextScreen.putExtra("txtName",inputName.getText().toString());
                nextScreen.putExtra("txtEmail", inputEmail.getText().toString());
                nextScreen.putExtra("txtEdad", inputEdad.getText().toString());

                Log.e("n",inputName.getText()+"."+ inputEmail.getText()+"."+ inputEdad.getText());

                startActivity(nextScreen);


            }
        });




    }
}
