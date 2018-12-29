package com.example.mohon.qhelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HeadrelatedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_headrelated);

        configureDoctor();
    }


    private void configureDoctor(){
        TextView txtDoctor = (TextView)findViewById(R.id.textView11);
        txtDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HeadrelatedActivity.this,Doctor.class));
            }
        });
    }
}
