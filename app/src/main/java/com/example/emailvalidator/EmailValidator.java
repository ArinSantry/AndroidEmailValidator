package com.example.emailvalidator;

public class EmailValidator {
    public boolean isValid(String email)
    {
        if(email.contains("@"))
            return true;
        return false;
    }
}
