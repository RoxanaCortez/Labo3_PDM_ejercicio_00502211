package com.roxyapps.roxana.tarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.roxyapps.roxana.tarea.utils.AppConstants;

public class MainActivity extends AppCompatActivity {

    private EditText EtName, EtPass, EtEmail, EtGender;
    private Button BtSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EtName = findViewById(R.id.et_Name);
        EtPass = findViewById(R.id.et_Pass);
        EtEmail = findViewById(R.id.et_Email);
        EtGender = findViewById(R.id.et_Gender);
        BtSend = findViewById(R.id.bt_send);

        //Intent explícito completo
        BtSend.setOnClickListener(v->{
            Intent mIntent = new Intent(MainActivity.this, SecondActivity.class);
            mIntent.putExtra(AppConstants.TEXT_NAME, EtName.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_PASSWORD, EtPass.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_EMAIL, EtEmail.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_GENDER, EtGender.getText().toString());
            startActivity(mIntent);

        });

    }
}
