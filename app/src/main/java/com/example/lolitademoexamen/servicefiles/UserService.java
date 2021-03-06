package com.example.lolitademoexamen.servicefiles;

import com.example.lolitademoexamen.autorisation.LoginRequest;
import com.example.lolitademoexamen.autorisation.LoginResponse;
import com.example.lolitademoexamen.registration.RegisterRequest;
import com.example.lolitademoexamen.registration.RegisterResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserService {

    @POST("/auth/login")
    Call<LoginResponse> loginUser(@Body LoginRequest loginRequest);
    @POST("/auth/register")
    Call<RegisterResponse> registerUser(@Body RegisterRequest registerRequest);
}
