package com.example.toc_thaparonaclick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    EditText name1, password1, email1, rno1, batch1;
    Button insert1,signin1;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        name1 = findViewById(R.id.name1);
        password1 = findViewById(R.id.password1);
        email1 = findViewById(R.id.email1);
        rno1 = findViewById(R.id.rno1);
        batch1 = findViewById(R.id.batch1);
        insert1 = findViewById(R.id.btnInsert1);
        signin1= findViewById(R.id.signin1);
        DB = new DBHelper(this);
        insert1.setOnClickListener(view -> {
            String nameTXT = name1.getText().toString();
            String passwordTXT = password1.getText().toString();
            String emailTXT = email1.getText().toString();
            String rnoTXT = rno1.getText().toString();
            String batchTXT = batch1.getText().toString();
            if (nameTXT.equals("") || passwordTXT.equals("") || emailTXT.equals("") || rnoTXT.equals("") || batchTXT.equals(""))
                Toast.makeText(SignUpActivity.this, "All fields are mandatory", Toast.LENGTH_SHORT).show();
            else if(! DB.checkusername(nameTXT)){
                Boolean checkinsertdata = DB.insertuserdata(nameTXT, passwordTXT, emailTXT, rnoTXT, batchTXT);
                if (checkinsertdata) {
                    Toast.makeText(SignUpActivity.this, "New Entry Inserted", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), Menu.class);
                    startActivity(intent);
                } else
                    Toast.makeText(SignUpActivity.this, "New Entry Not Inserted", Toast.LENGTH_SHORT).show();
            }
            else Toast.makeText(SignUpActivity.this, "Username already taken", Toast.LENGTH_SHORT).show();
        });
        signin1.setOnClickListener(view -> {
            Intent intent=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        });
    }
}