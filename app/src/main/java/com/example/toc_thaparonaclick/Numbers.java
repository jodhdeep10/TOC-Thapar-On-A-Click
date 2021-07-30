package com.example.toc_thaparonaclick;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Numbers extends AppCompatActivity {
    private Button call1;
    private Button call2;
    private Button call3;
    private Button call4;
    private Button call5;
    private Button call6;
    private Button call7;
    private Button call8;
    private Button call9;
    private Button call10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        call1=findViewById(R.id.call1);
        call1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (ActivityCompat.checkSelfPermission(Numbers.this,
//                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    return;
//                }
                autorikshaw();
            }
        });
        call2=findViewById(R.id.call2);
        call2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (ActivityCompat.checkSelfPermission(Numbers.this,
//                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    return;
//                }
                autorikshaw2();
            }
        });
        call3=findViewById(R.id.call3);
        call3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (ActivityCompat.checkSelfPermission(Numbers.this,
//                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    return;
//                }
                wardenboys();
            }
        });
        call5=findViewById(R.id.call5);
        call5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (ActivityCompat.checkSelfPermission(Numbers.this,
//                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    return;
//                }
                sportofficer();
            }
        });
        call7=findViewById(R.id.call7);
        call7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (ActivityCompat.checkSelfPermission(Numbers.this,
//                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    return;
//                }
                boyshostel();
            }
        });
        call9=findViewById(R.id.call9);
        call9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (ActivityCompat.checkSelfPermission(Numbers.this,
//                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    return;
//                }
                mess();
            }
        });
        call10=findViewById(R.id.call10);
        call10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (ActivityCompat.checkSelfPermission(Numbers.this,
//                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    return;
//                }
                canteen();
            }
        });
    }

    private void canteen() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M
                && checkSelfPermission(Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED){
            requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 1);
        }
        else {
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            Intent intent = callIntent.setData(Uri.parse("tel:8587919205"));
            startActivity(callIntent);
        }
    }

    private void mess() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M
                && checkSelfPermission(Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED){
            requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 1);
        }
        else {
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            Intent intent = callIntent.setData(Uri.parse("tel:9306167850"));
            startActivity(callIntent);
        }
    }

    private void boyshostel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M
                && checkSelfPermission(Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED){
            requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 1);
        }
        else {
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            Intent intent = callIntent.setData(Uri.parse("tel:8288026130"));
            startActivity(callIntent);
        }
    }

    private void sportofficer() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M
                && checkSelfPermission(Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED){
            requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 1);
        }
        else {
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            Intent intent = callIntent.setData(Uri.parse("tel:9872873474"));
            startActivity(callIntent);
        }
    }

    private void autorikshaw2() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M
                && checkSelfPermission(Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED){
            requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 1);
        }
        else {
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            Intent intent = callIntent.setData(Uri.parse("tel:9876386420"));
            startActivity(callIntent);
        }
    }

    private void wardenboys() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M
                && checkSelfPermission(Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED){
            requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 1);
        }
        else {
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            Intent intent = callIntent.setData(Uri.parse("tel:9466852190"));
            startActivity(callIntent);
        }
    }

    private void autorikshaw() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M
                && checkSelfPermission(Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED){
            requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 1);
        }
        else {
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            Intent intent = callIntent.setData(Uri.parse("tel:7087505061"));
            startActivity(callIntent);
        }

    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 1) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                return;
            } else {
                Toast.makeText(this, "Permission Denied.Try Again !",Toast.LENGTH_SHORT).
                        show();
            }
        }
    }
}