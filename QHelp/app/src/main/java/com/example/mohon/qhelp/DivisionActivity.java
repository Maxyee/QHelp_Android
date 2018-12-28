package com.example.mohon.qhelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DivisionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);

        configureNextDhaka();
    }


    private void configureNextDhaka(){
        TextView txtDhaka = (TextView)findViewById(R.id.textView5);
        txtDhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DivisionActivity.this,DhakaActivity.class));
            }
        });
    }
}
