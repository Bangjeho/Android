package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_01;
    Button btn_01;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_01 = findViewById(R.id.et_01);
        btn_01 = findViewById(R.id.btn_01);

        btn_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                str = et_01.getText().toString();

                Intent intent = new Intent(MainActivity.this , SubActivity.class);
                intent.putExtra("str",str);
                startActivity(intent);

            }
        });
    }
}
