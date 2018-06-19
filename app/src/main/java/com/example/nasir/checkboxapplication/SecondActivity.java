package com.example.nasir.checkboxapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    TextView showResult;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        showResult = (TextView) findViewById(R.id.textview_result);

        Intent intentResult = this.getIntent();

        String monday = intentResult.getStringExtra("MON");
        String tuesday = intentResult.getStringExtra("TUE");
        String wednesday = intentResult.getStringExtra("WED");
        String thursday = intentResult.getStringExtra("THU");
        String friday = intentResult.getStringExtra("FRI");
        String saturday = intentResult.getStringExtra("SAT");
        String sunday = intentResult.getStringExtra("SUN");

        showResult.setText(monday+" , "+tuesday+" , "+wednesday+" , "+thursday+" , "+friday+",  "+saturday+" , "+sunday);

    }
}
