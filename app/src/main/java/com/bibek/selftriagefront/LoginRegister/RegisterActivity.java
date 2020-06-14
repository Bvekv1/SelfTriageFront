package com.bibek.selftriagefront.LoginRegister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.bibek.selftriagefront.R;

public class RegisterActivity extends AppCompatActivity {
    EditText etFullName, etEmail, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
}
