package com.bibek.selftriagefront.LoginRegister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bibek.selftriagefront.API.SelfTriageAPI;
import com.bibek.selftriagefront.R;
import com.bibek.selftriagefront.SignUpResponse.SignUpResponse;
import com.bibek.selftriagefront.URL.URL;
import com.bibek.selftriagefront.model.Users;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {
    EditText etFullName, etEmail, etPassword;
    Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etFullName = findViewById(R.id.etFullName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnRegister = findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
    }

    private void register() {
        String fullName = etFullName.getText().toString();
        String email = etEmail.getText().toString();
        String password = etPassword.getText().toString();

        Users users = new Users(fullName,email,password);
        SelfTriageAPI selfTriageAPI = URL.getInstance().create(SelfTriageAPI.class);
        Call<SignUpResponse> usersCall = selfTriageAPI.registerUser(users);
        usersCall.enqueue(new Callback<SignUpResponse>() {
            @Override
            public void onResponse(Call<SignUpResponse> call, Response<SignUpResponse> response) {
                if(!response.isSuccessful()){
                    Toast.makeText(RegisterActivity.this,"Code" + response.code(),Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(RegisterActivity.this, "Sucessfully added", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<SignUpResponse> call, Throwable t) {
                Toast.makeText(RegisterActivity.this, "Error" + t.getLocalizedMessage(),Toast.LENGTH_SHORT).show();


            }
        });
    }
}
