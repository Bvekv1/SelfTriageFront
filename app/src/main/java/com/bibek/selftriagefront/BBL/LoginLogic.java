package com.bibek.selftriagefront.BBL;

import android.os.StrictMode;

import com.bibek.selftriagefront.API.SelfTriageAPI;
import com.bibek.selftriagefront.SignUpResponse.SignUpResponse;
import com.bibek.selftriagefront.StrictMode.StrictModeClass;
import com.bibek.selftriagefront.URL.URL;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

public class LoginLogic
{
    private Boolean isSuccess = false;

    public boolean checkUser(String email, String password){
        SelfTriageAPI selfTriageAPI = URL.getInstance().create(SelfTriageAPI.class);
        Call<SignUpResponse> userCall = selfTriageAPI.checkUser(email,password);
        StrictModeClass.StrictMode();
        try {
            Response<SignUpResponse> loginResponse = userCall.execute();
            if (loginResponse.isSuccessful()) {
                loginResponse.body().getStatus().equals("200");
                URL.token += loginResponse.body().getToken();

                isSuccess = true;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return isSuccess;
    }
}
