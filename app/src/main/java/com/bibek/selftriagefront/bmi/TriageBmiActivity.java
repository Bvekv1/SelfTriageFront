package com.bibek.selftriagefront.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.bibek.selftriagefront.R;

public class TriageBmiActivity extends AppCompatActivity implements  View.OnClickListener {

    private EditText EtWeight, EtHeight, etStatus;
    private Button btnAdd;
    private TextView Tvresult, ResultView;
    float Weight, Height, Result, bmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiage_bmi);
        //Binding
        EtWeight = findViewById(R.id.EtWeight);
        EtHeight = findViewById(R.id.EtHeight);
        Tvresult = findViewById(R.id.Tvresult);
        ResultView = findViewById(R.id.ResultView);
        etStatus = findViewById(R.id.etStatus);
        btnAdd = findViewById(R.id.btnAdd);


        btnAdd.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnAdd) {
            Weight = Float.parseFloat(EtWeight.getText().toString());
            String ht = EtHeight.getText().toString();
            Height = Float.parseFloat(ht) / 100;

            CalculateBMI cal = new CalculateBMI(Weight, Height);
            bmi = cal.BMI();
            appendStuffs();
            if (bmi < 18.5) {
                etStatus.setText("Underweight, visit they physican your bmi index is to low");
            } else if(bmi <= 24.9){
                etStatus.setText("Normal, You are healthy");
            } else if(bmi <= 29.9){
                etStatus.setText("overweight, Reconsider your diet and visit the doctor immediately");
            }
            else {
                etStatus.setText("Obese, Your health is at great risk visit doctor");
            }
            EtHeight.getText().clear();
            EtWeight.getText().clear();
        }





    }

    private void appendStuffs(){
        Tvresult.append("Your BMI is :"+bmi+ "\n");
    }







}
