package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    private Button btn_back;
    private TextView tv_Sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tv_Sub = findViewById(R.id.tv_sub);
        btn_back = findViewById(R.id.btn_back);

        Intent intent = getIntent();
        String str = intent.getStringExtra("str");

        tv_Sub.setText(str);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back_intent = new Intent(SubActivity.this , MainActivity.class);
                startActivity(back_intent);
            }
        });
    }
}
