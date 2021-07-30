package com.example.toc_thaparonaclick;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Delete extends AppCompatActivity {

    EditText name3,password3;
    Button btnDelete3, signout3;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        name3 = findViewById(R.id.name3);
        password3 = findViewById(R.id.password3);
        signout3 = findViewById(R.id.signout3);
        btnDelete3 = findViewById(R.id.btnDelete3);
        DB = new DBHelper(this);

        btnDelete3.setOnClickListener(view -> {
            String nameTXT = name3.getText().toString();
            String passwordTXT = password3.getText().toString();

            if (nameTXT.equals("")||passwordTXT.equals(""))
                Toast.makeText(Delete.this, "Fill all fields", Toast.LENGTH_SHORT).show();
            else {
                if(DB.checkusernamepassword(nameTXT,passwordTXT))
                {
                    Boolean checkdeletedata = DB.deletedata(nameTXT);
                    if (checkdeletedata)
                    {
                        Toast.makeText(Delete.this, "Account deleted", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }
                    else Toast.makeText(Delete.this, "Account doesn't exist", Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(Delete.this, "Incorrect username/password", Toast.LENGTH_SHORT).show();
            }
        });
        signout3.setOnClickListener(view -> {
            Intent intent=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        });
    }
}