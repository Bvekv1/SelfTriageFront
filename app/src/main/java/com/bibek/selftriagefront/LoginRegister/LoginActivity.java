package com.bibek.selftriagefront.LoginRegister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bibek.selftriagefront.BBL.LoginLogic;
import com.bibek.selftriagefront.R;
import com.bibek.selftriagefront.StrictMode.StrictModeClass;

public class LoginActivity extends AppCompatActivity {
    EditText etEmail, etPassword;
    Button btnSignin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etEmail = findViewById(R.id.etUserName);
        etPassword = findViewById(R.id.etPassword);
        btnSignin = findViewById(R.id.btnSignin);
        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StrictModeClass.StrictMode();
        LoginLogic loginLogic = new LoginLogic();
        if(loginLogic.checkUser(etEmail.getText().toString(),etPassword.getText().toString()) == true){
             Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
             startActivity(intent);
            Toast.makeText(LoginActivity.this,"Login Sucess", Toast.LENGTH_SHORT).show();
        }
//                Sign();
//                Toast.makeText(LoginActivity.this,"Login Sucess", Toast.LENGTH_SHORT).show();
            }
        });
    }

//    private void Sign() {
//        StrictModeClass.StrictMode();
//        LoginLogic loginLogic = new LoginLogic();
//        if(loginLogic.checkUser(etUserName.getText().toString(),etPassword.getText().toString()) == true){
//            Toast.makeText(LoginActivity.this,"Login Sucess", Toast.LENGTH_SHORT).show();
//        }
//    }
}
