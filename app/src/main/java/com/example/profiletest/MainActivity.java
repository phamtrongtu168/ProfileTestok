package com.example.profiletest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     Button bt_login,bt_sigup;
     EditText edt_tdn,edt_mk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_tdn = (EditText) findViewById(R.id.edt_tdn);
        edt_mk = (EditText) findViewById(R.id.edt_mk);
        bt_login=(Button)findViewById(R.id.bt_loginme);
        bt_sigup=(Button)findViewById(R.id.bt_sigup);
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edt_tdn.getText().toString().equals("2050531200325") && edt_mk.getText().toString().equals("1234")){
                    Intent i = new Intent(MainActivity.this, activity_profile.class);
                    startActivity(i);
                }
                else    {
                    Toast.makeText(MainActivity.this, "Tên Đăng Nhập Hoặc Mật Khẩu Không Chính Xác!!!", Toast.LENGTH_SHORT).show();
                }



            }
        });
        bt_sigup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent i = new Intent(MainActivity.this, Main_Singup.class);
                    startActivity(i);



            }
        });
    }
}