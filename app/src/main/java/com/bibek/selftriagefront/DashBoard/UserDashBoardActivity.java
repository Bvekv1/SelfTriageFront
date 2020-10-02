package com.bibek.selftriagefront.DashBoard;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.bibek.selftriagefront.R;

public class UserDashBoardActivity extends AppCompatActivity {
    RadioGroup rg_gender,rg_temp,rg_fatigue,rg_breathe,rg_bodyPain,rg_diarrhoea,rg_runnynose,rg_nausea,rg_travel;
    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dash_board);
        btn_submit = (Button) findViewById(R.id.btn_submit);
        rg_gender = (RadioGroup) findViewById(R.id.rg_gender);
        rg_temp = (RadioGroup) findViewById(R.id.rg_temp);
        rg_fatigue = (RadioGroup) findViewById(R.id.rg_fatigue);
        rg_breathe = (RadioGroup) findViewById(R.id.rg_breathe);
        rg_bodyPain = (RadioGroup) findViewById(R.id.rg_bodyPain);
        rg_diarrhoea = (RadioGroup) findViewById(R.id.rg_diarrhoea);
        rg_runnynose = (RadioGroup) findViewById(R.id.rg_runnynose);
        rg_nausea = (RadioGroup) findViewById(R.id.rg_nausea);
        rg_travel = (RadioGroup) findViewById(R.id.rg_travel);

        rg_gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //get selected radio button
                RadioButton radioButton = (RadioButton)group.findViewById(checkedId);
            }
        });

        rg_temp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = (RadioButton)group.findViewById(checkedId);
            }
        });
        rg_fatigue.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = (RadioButton)group.findViewById(checkedId);
            }
        });
        rg_breathe.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = (RadioButton)group.findViewById(checkedId);
            }
        });
        rg_bodyPain.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = (RadioButton)group.findViewById(checkedId);
            }
        });
        rg_diarrhoea.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = (RadioButton)group.findViewById(checkedId);
            }
        });
       rg_runnynose.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup group, int checkedId) {
               RadioButton radioButton = (RadioButton)group.findViewById(checkedId);
           }
       });
       rg_nausea.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup group, int checkedId) {
               RadioButton radioButton = (RadioButton)group.findViewById(checkedId);
           }
       });
       rg_travel.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup group, int checkedId) {
               RadioButton radioButton = (RadioButton)group.findViewById(checkedId);
           }
       });
        //adding click listener
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               //creating the object of alertDialog Builder class
                AlertDialog.Builder builder = new AlertDialog.Builder(UserDashBoardActivity.this);
                //Set the message show for the Alert time
                builder.setMessage("Their is high chance that you may have been infected please contact near by health personnel?");

                //Set Alert Title
                builder.setTitle("Alert !");

                builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                //Create Alert Dialog
             AlertDialog alertDialog = builder.create();
             alertDialog.show();


                //if no Radio Button is ser , -1 will be returned
//                int selectedId = rg_gender.getCheckedRadioButtonId();
//                if (selectedId == -1){
//                    Toast.makeText(UserDashBoardActivity.this, "No Selection", Toast.LENGTH_SHORT).show();
//                } else {
//                    RadioButton radioButton = (RadioButton) rg_gender.findViewById(selectedId);
//                    Toast.makeText(UserDashBoardActivity.this, radioButton.getText() , Toast.LENGTH_SHORT).show();
//                }
//                int selectId1 = rg_temp.getCheckedRadioButtonId();
//
//                if (selectId1 == -1){
//                    Toast.makeText(UserDashBoardActivity.this, "No Selection", Toast.LENGTH_SHORT).show();
//                } else {
//                    RadioButton radioButton = (RadioButton) rg_temp.findViewById(selectId1);
//                    Toast.makeText(UserDashBoardActivity.this, radioButton.getText() , Toast.LENGTH_SHORT).show();
//                }
//                int selectId2 = rg_fatigue.getCheckedRadioButtonId();
//                if (selectId2 == -1){
//                    Toast.makeText(UserDashBoardActivity.this, "No Selection", Toast.LENGTH_SHORT).show();
//                } else{
//                    RadioButton radioButton = (RadioButton) rg_fatigue.findViewById(selectId2);
//                    Toast.makeText(UserDashBoardActivity.this, radioButton.getText() , Toast.LENGTH_SHORT).show();
//                }
//
//                int selectId3 = rg_breathe.getCheckedRadioButtonId();
//                if(selectId3 == -1){
//                    Toast.makeText(UserDashBoardActivity.this, "No Selection", Toast.LENGTH_SHORT).show();
//                } else {
//                    RadioButton radioButton = (RadioButton) rg_breathe.findViewById(selectId3);
//                    Toast.makeText(UserDashBoardActivity.this, radioButton.getText() , Toast.LENGTH_SHORT).show();
//                }
//
//                int selectId4 = rg_bodyPain.getCheckedRadioButtonId();
//                if(selectId4 == -1){
//                    Toast.makeText(UserDashBoardActivity.this, "No Selection", Toast.LENGTH_SHORT).show();
//                }
//                else {
//                    RadioButton radioButton = (RadioButton) rg_bodyPain.findViewById(selectId4);
//                    Toast.makeText(UserDashBoardActivity.this, radioButton.getText() , Toast.LENGTH_SHORT).show();
//                }
//                int selectId5 = rg_diarrhoea.getCheckedRadioButtonId();
//                if(selectId5 == -1){
//                    Toast.makeText(UserDashBoardActivity.this, "No Selection", Toast.LENGTH_SHORT).show();
//                } else{
//                    RadioButton radioButton = (RadioButton) rg_diarrhoea.findViewById(selectId5);
//                    Toast.makeText(UserDashBoardActivity.this, radioButton.getText() , Toast.LENGTH_SHORT).show();
//                }
//                int selectId6 =  rg_runnynose.getCheckedRadioButtonId();
//                if(selectId6 == -1){
//                    Toast.makeText(UserDashBoardActivity.this, "No Selection", Toast.LENGTH_SHORT).show();
//                }
//                else {
//                    RadioButton radioButton = (RadioButton) rg_runnynose.findViewById(selectId6);
//                    Toast.makeText(UserDashBoardActivity.this, radioButton.getText() , Toast.LENGTH_SHORT).show();
//                }
//                int selectId7 = rg_nausea.getCheckedRadioButtonId();
//                if(selectId7 == -1){
//                    Toast.makeText(UserDashBoardActivity.this, "No Selection", Toast.LENGTH_SHORT).show();
//                }
//                else{
//                    RadioButton radioButton = (RadioButton) rg_nausea.findViewById(selectId7);
//                    Toast.makeText(UserDashBoardActivity.this, radioButton.getText() , Toast.LENGTH_SHORT).show();
//                }
//                int selectId8 = rg_travel.getCheckedRadioButtonId();
//                if(selectId8 == -1){
//                    Toast.makeText(UserDashBoardActivity.this, "No Selection", Toast.LENGTH_SHORT).show();
//                } else{
//                    RadioButton radioButton = (RadioButton) rg_travel.findViewById(selectId8);
//                    Toast.makeText(UserDashBoardActivity.this, radioButton.getText() , Toast.LENGTH_SHORT).show();
//                }
            }
        });
    }
}
