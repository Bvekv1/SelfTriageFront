package com.bibek.selftriagefront.LoginRegister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.bibek.selftriagefront.BBL.LoginLogic;
import com.bibek.selftriagefront.DashBoard.UserDashBoardActivity;
import com.bibek.selftriagefront.R;
import com.bibek.selftriagefront.StrictMode.StrictModeClass;
import com.bibek.selftriagefront.entry.TriageDashActivity;

public class LoginActivity extends AppCompatActivity {
    EditText etEmail, etPassword;
    Button btnSignin;
    TextView txtSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etEmail = findViewById(R.id.etUserName);
        etPassword = findViewById(R.id.etPassword);
        btnSignin = findViewById(R.id.btnSignin);
        txtSignUp = findViewById(R.id.txtSignUp);
        txtSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newAccount();
            }
        });
        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StrictModeClass.StrictMode();
        LoginLogic loginLogic = new LoginLogic();
        if(loginLogic.checkUser(etEmail.getText().toString(),etPassword.getText().toString()) == true){
             Intent intent = new Intent(LoginActivity.this, TriageDashActivity.class);
             startActivity(intent);
            Toast.makeText(LoginActivity.this,"Login Sucess", Toast.LENGTH_SHORT).show();
        }
//                Sign();
//                Toast.makeText(LoginActivity.this,"Login Sucess", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void newAccount() {
        Intent newintentAccount =new Intent(LoginActivity.this,RegisterActivity.class);
        startActivity(newintentAccount);
    }

//    private void Sign() {
//        StrictModeClass.StrictMode();
//        LoginLogic loginLogic = new LoginLogic();
//        if(loginLogic.checkUser(etUserName.getText().toString(),etPassword.getText().toString()) == true){
//            Toast.makeText(LoginActivity.this,"Login Sucess", Toast.LENGTH_SHORT).show();
//        }
//    }
}
