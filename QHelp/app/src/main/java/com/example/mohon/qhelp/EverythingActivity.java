package com.example.mohon.qhelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class EverythingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_everything);

        configureDoctorList();
    }


    private void configureDoctorList(){
        TextView txtDoctorlist = (TextView)findViewById(R.id.textView11);
        txtDoctorlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EverythingActivity.this,DoctorListActivity.class));
            }
        });
    }
}
