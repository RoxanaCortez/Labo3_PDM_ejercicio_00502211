package com.roxyapps.roxana.tarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.roxyapps.roxana.tarea.utils.AppConstants;

public class ShareActivity extends AppCompatActivity {
    private TextView tvTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        tvTxt = findViewById(R.id.tv_text);

        Intent secondIntent=getIntent();
        //Envio del textoK
        if(secondIntent != null){

            tvTxt.setText(secondIntent.getStringExtra(Intent.EXTRA_TEXT));
        }

    }
}
