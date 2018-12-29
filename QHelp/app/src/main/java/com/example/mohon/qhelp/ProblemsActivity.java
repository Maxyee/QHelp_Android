package com.example.mohon.qhelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ProblemsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problems);

        configureHeadRelated();
    }

    private void configureHeadRelated(){
        TextView txtHead = (TextView)findViewById(R.id.textView5);
        txtHead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProblemsActivity.this,HeadrelatedActivity.class));
            }
        });
    }
}
