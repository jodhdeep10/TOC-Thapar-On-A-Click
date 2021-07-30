package com.example.toc_thaparonaclick;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class UpdateActivity extends AppCompatActivity {

    EditText name4, password4, email4, rno4, batch4;
    Button update4, signout4;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        name4 = findViewById(R.id.name4);
        password4 = findViewById(R.id.password4);
        email4 = findViewById(R.id.email4);
        rno4 = findViewById(R.id.rno4);
        batch4 = findViewById(R.id.batch4);
        update4 = findViewById(R.id.update4);
        signout4 = findViewById(R.id.signout4);
        DB = new DBHelper(this);
        update4.setOnClickListener(view -> {
            String nameTXT = name4.getText().toString();
            String passwordTXT = password4.getText().toString();
            String emailTXT = email4.getText().toString();
            String rnoTXT = rno4.getText().toString();
            String batchTXT = batch4.getText().toString();
            if (nameTXT.equals("")||passwordTXT.equals("")||emailTXT.equals("")||rnoTXT.equals("")||batchTXT.equals(""))
                Toast.makeText(UpdateActivity.this, "Fill all fields", Toast.LENGTH_SHORT).show();
            else {
                Boolean checkupdatedata = DB.updateuserdata(nameTXT, passwordTXT, emailTXT, rnoTXT, batchTXT);
                if (checkupdatedata) {
                    Intent intent = new Intent(getApplicationContext(), Menu.class);
                    startActivity(intent);
                    Toast.makeText(UpdateActivity.this, "Entry Updated", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(UpdateActivity.this, "New Entry Not Updated", Toast.LENGTH_SHORT).show();
            }
        });
        signout4.setOnClickListener(view -> {
            Intent intent=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        });
    }
}