package com.bibek.selftriagefront.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.bibek.selftriagefront.R;

public class ShowResultActivity extends AppCompatActivity {

    TextView ResultView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);

        ResultView = findViewById(R.id.ResultView);
        //create the get Intent Object
        Intent intent =getIntent();
        String str =intent.getStringExtra("thin");
        ResultView.setText(str);
    }
}