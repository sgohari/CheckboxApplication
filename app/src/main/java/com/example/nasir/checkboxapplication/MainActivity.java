package com.example.nasir.checkboxapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {


    Intent intentData;
    Button buttonSend;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intentData=new Intent(MainActivity.this,SecondActivity.class);
        buttonSend=(Button)findViewById(R.id.button1);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                startActivity(intentData);
            }
        });
    }

    public void onCheckedBox(View view)
    {
        boolean checked=((CheckBox)view).isChecked();

        switch (view.getId())
        {

            case R.id.mon:if (checked)
            {
                intentData.putExtra("MON","Monday");
            }else
                {
                intentData.removeExtra("MON");
            }break;

            case R.id.tue:if (checked){
                intentData.putExtra("TUE","Tuesday");
            }else {
                intentData.removeExtra("TUE");
            }break;

            case R.id.wed:if (checked){
                intentData.putExtra("WED","Wednesday");
            }else {
                intentData.removeExtra("WED");
            }break;

            case R.id.thu:if (checked){
                intentData.putExtra("THU","Thursday");
            }else {
                intentData.removeExtra("THU");
            }break;

            case R.id.fri:if (checked){
                intentData.putExtra("FRI","Friday");
            }else {
                intentData.removeExtra("FRI");
            }break;

            case R.id.sat:if (checked){
                intentData.putExtra("SAT","Saturday");
            }else {
                intentData.removeExtra("SAT");
            }break;

            case R.id.sun:if (checked){
                intentData.putExtra("SUN","Sunday");
            }else {
                intentData.removeExtra("SUN");
            }break;

            default:break;
        }
    }
}
