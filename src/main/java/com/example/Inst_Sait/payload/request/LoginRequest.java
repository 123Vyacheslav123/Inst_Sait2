package com.example.Inst_Sait.payload.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class LoginRequest
{
    @NotEmpty(message = "User name cannot be empty")
    private  String username;
    @NotEmpty(message = "Password name cannot be empty")
    private String password;
}
