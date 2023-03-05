package com.example.task3_emanhadad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.task3_emanhadad.databinding.ActivityRectangle1Binding;

public class Rectangle1 extends AppCompatActivity {
ActivityRectangle1Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRectangle1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnRectangleCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double rct_Height =Double.parseDouble(binding.edRectangleHeight.getText().toString());
                double rct_Width =Double.parseDouble(binding.edRectangleWidth.getText().toString());
                double rct_result =rct_Height*rct_Width;

                Intent intent=new Intent();
                intent.putExtra("rct_result",rct_result);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
    }
