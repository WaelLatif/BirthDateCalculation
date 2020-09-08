package com.example.birthdatecalculation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    EditText txtBDate;
    TextView txtAge;
    Button btnCalc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtBDate = findViewById(R.id.txtYBDate);
        txtAge = findViewById(R.id.txtAge);
        btnCalc = findViewById(R.id.btnCalc);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"SimpleDateFormat", "SetTextI18n"})
            @Override
            public void onClick(View v) {
                SimpleDateFormat sdf;
                sdf = new  SimpleDateFormat("yyyy");
                int nowYear = Integer.parseInt( sdf.format(new Date()));
                int birthYear = Integer.parseInt(txtBDate.getText().toString());
                int age = nowYear-birthYear;
                txtAge.setText(age + "");

            }
        });
    }
}