package com.example.david.password_validator;

public class Validator{

    public static void main(String[] args)
    {
        String pwd = "ofshadowage12312312313";
        System.out.println(valid(pwd));
    }

    public static String valid(String pwd)
    {
        String pwd1 = pwd;
        String prompt;
        if(pwd1.length() >= 8 && pwd1 != "password")
        {
            prompt = "Password is valid";
        }
        else{
            prompt = "Password is invalid";
        }
        return prompt;
    }
}