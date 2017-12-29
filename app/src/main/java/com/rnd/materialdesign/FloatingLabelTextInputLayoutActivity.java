package com.rnd.materialdesign;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by shailendra.chotalia on 29/12/2017.
 */
public class FloatingLabelTextInputLayoutActivity extends AppCompatActivity{

    TextInputLayout inputLayoutFullname, inputLayoutEmail, inputLayoutPassword;
    EditText editTextFullname, editTextEmail, editTextPassword;
    Button login;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_label_text_input);

        inputLayoutFullname = (TextInputLayout) findViewById(R.id.inputLayoutFullname);
        inputLayoutEmail = (TextInputLayout) findViewById(R.id.inputLayoutEmail);
        inputLayoutPassword = (TextInputLayout) findViewById(R.id.inputLayoutPassword);

        editTextFullname = (EditText) findViewById(R.id.fullname);
        editTextEmail = (EditText) findViewById(R.id.email);
        editTextPassword = (EditText) findViewById(R.id.password);

        login = (Button) findViewById(R.id.login);
    }

    public void login(View view) {
        boolean isValid = true;

        if(editTextFullname.getText().toString().isEmpty()){
            inputLayoutFullname.setError("Fullname is manadatory!");
            isValid = false;
        }else{
            inputLayoutFullname.setErrorEnabled(false);
        }
    }
}
