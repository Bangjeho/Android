package com.example.study_android;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_id;
    Button btn_id;
    TextView tv_id;

    @RequiresApi(api = Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_id = findViewById(R.id.et_test);
        btn_id = findViewById(R.id.btn_test);
        tv_id = findViewById(R.id.tv_test);

        btn_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et_id.setText("test");

                tv_id.setText(et_id.getText());
            }
        });
    }
}
