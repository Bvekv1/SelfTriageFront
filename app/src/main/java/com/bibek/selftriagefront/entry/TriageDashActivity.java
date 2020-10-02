package com.bibek.selftriagefront.entry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.bibek.selftriagefront.DashBoard.UserDashBoardActivity;
import com.bibek.selftriagefront.LoginRegister.LoginActivity;
import com.bibek.selftriagefront.R;
import com.bibek.selftriagefront.bmi.TriageBmiActivity;
import com.bibek.selftriagefront.stepcounter.StepCounterActivity;

public class TriageDashActivity extends AppCompatActivity {
 Button button, button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triage_dash);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TriageDashActivity.this, UserDashBoardActivity.class);
                startActivity(intent);
                Toast.makeText(TriageDashActivity.this,"Loading...", Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TriageDashActivity.this, TriageBmiActivity.class);
                startActivity(intent);
                Toast.makeText(TriageDashActivity.this,"Loading..", Toast.LENGTH_SHORT).show();
            }
        });

      button3.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(TriageDashActivity.this, StepCounterActivity.class);
              startActivity(intent);
              Toast.makeText(TriageDashActivity.this,"Loading", Toast.LENGTH_SHORT).show();
          }
      });


    }
}