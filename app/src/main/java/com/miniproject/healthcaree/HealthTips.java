package com.miniproject.healthcaree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class HealthTips extends AppCompatActivity {
    private Spinner spinner;
    int ci=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_tips);
         spinner=findViewById(R.id.spinner);
         spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
             @Override
             public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                   if(ci==i)
                       return;
                   else
                   {
                       if(i==1) {
                           Intent in = new Intent(HealthTips.this, Cold.class);
                           startActivity(in);
                       }
                       if(i==2) {
                           Intent in = new Intent(HealthTips.this, Cough.class);
                           startActivity(in);
                       }
                       if(i==3) {
                           Intent in = new Intent(HealthTips.this, Fever.class);
                           startActivity(in);
                       }if(i==4) {
                       Intent in = new Intent(HealthTips.this, Migrane.class);
                       startActivity(in);
                   }if(i==5) {
                       Intent in = new Intent(HealthTips.this, Periods.class);
                       startActivity(in);
                   }
                       if(i==6) {
                           Intent in = new Intent(HealthTips.this, Acne.class);
                           startActivity(in);
                       }


                   }
             }

             @Override
             public void onNothingSelected(AdapterView<?> adapterView) {

             }
         });



    }
}