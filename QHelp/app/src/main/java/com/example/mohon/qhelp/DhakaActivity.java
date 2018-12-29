package com.example.mohon.qhelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DhakaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka);

        configureEverything();
        configureProblems();
    }


    private void configureEverything(){
        Button btnEvery = (Button)findViewById(R.id.button);
        btnEvery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DhakaActivity.this,EverythingActivity.class));
            }
        });
    }


    private void configureProblems(){
        Button btnProb = (Button)findViewById(R.id.button3);
        btnProb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DhakaActivity.this,ProblemsActivity.class));
            }
        });
    }
}
