package com.example.betaversion1;

import static com.example.betaversion1.FBref.reAuth;
import static com.example.betaversion1.FBref.refUsers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUp extends AppCompatActivity {

    EditText eT_username,eT_email,eT_password,eT_address;
    String username,email,password,address,uid;
    private FirebaseAuth mAuth;
    Users user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mAuth = FirebaseAuth.getInstance();
        eT_username=(EditText) findViewById(R.id.eT_username);
        eT_email=(EditText) findViewById(R.id.eT_email);
        eT_password=(EditText) findViewById(R.id.eT_password);
        eT_address=(EditText) findViewById(R.id.eT_address);
    }


}