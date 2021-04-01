package com.example.emailvalidator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void validate(View v)
    {
        Log.w( "MainActivity", "v = " + v );
        EditText emailEditText = findViewById(R.id.emailEditText);
        String emailString = emailEditText.getText().toString();
        EmailValidator emailValidator = new EmailValidator();

        if(emailValidator.isValid(emailString))
            setValidText();
        else
            setInvalidText();
    }

    public void setValidText()
    {
        TextView validView = (TextView) findViewById(R.id.validationView);
        validView.setText(R.string.valid);
    }

    public void setInvalidText()
    {
        TextView validView = (TextView) findViewById(R.id.validationView);
        validView.setText(R.string.invalid);
    }
}
