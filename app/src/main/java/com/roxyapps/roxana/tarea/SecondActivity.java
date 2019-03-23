package com.roxyapps.roxana.tarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.roxyapps.roxana.tarea.utils.AppConstants;

public class SecondActivity extends AppCompatActivity {
    private TextView TvName, TvPass, TvEmail, TvGender;
    private Button BtShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TvName = findViewById(R.id.tv_username);
        TvPass = findViewById(R.id.tv_password);
        TvEmail = findViewById(R.id.tv_email);
        TvGender = findViewById(R.id.tv_gender);


        Intent mIntent = this.getIntent();
        if(mIntent != null){
            TvName.setText(mIntent.getStringExtra(AppConstants.TEXT_NAME));
            TvPass.setText(mIntent.getStringExtra(AppConstants.TEXT_PASSWORD));
            TvEmail.setText(mIntent.getStringExtra(AppConstants.TEXT_EMAIL));
            TvGender.setText(mIntent.getStringExtra(AppConstants.TEXT_GENDER));
        }
    }
}
