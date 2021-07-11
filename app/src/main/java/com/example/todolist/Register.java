package com.example.todolist;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Register {
    private EditText regmail, regpwd;
    private Button regbtn;
    private EditText regtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        regmail=findViewById(R.id.EmailAddress);
        regpwd= findViewById(R.id.login);
        regpwd=findViewById(R.id.reg);
    }
}

