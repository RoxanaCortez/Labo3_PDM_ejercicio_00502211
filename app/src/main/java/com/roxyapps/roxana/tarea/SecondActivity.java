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
        BtShare = findViewById(R.id.bt_share);

        Intent mIntent = this.getIntent();
        if(mIntent != null){
            TvName.setText(mIntent.getStringExtra(AppConstants.TEXT_NAME));
            TvPass.setText(mIntent.getStringExtra(AppConstants.TEXT_PASSWORD));
            TvEmail.setText(mIntent.getStringExtra(AppConstants.TEXT_EMAIL));
            TvGender.setText(mIntent.getStringExtra(AppConstants.TEXT_GENDER));
        }

        //Intent implicito completo
        BtShare.setOnClickListener(v->{
            Intent secondIntent = new Intent();
            secondIntent.setAction(Intent.ACTION_SEND);
            secondIntent.setType("text/plain");

            secondIntent.putExtra(Intent.EXTRA_TEXT,"\nUsername: "+TvName.getText().toString()
                                                    +"\nPassword: "+TvPass.getText().toString()
                                                    +"\nEmail: "+TvEmail.getText().toString()
                                                    +"\nGender: "+TvGender.getText().toString());

            startActivity(secondIntent);
        });
    }
}
