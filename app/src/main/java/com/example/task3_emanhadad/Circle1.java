package com.example.task3_emanhadad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.task3_emanhadad.databinding.ActivityCircle1Binding;

public class Circle1 extends AppCompatActivity {
ActivityCircle1Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCircle1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnCircleCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double Radius=Double.parseDouble(binding.edCircleRadius.getText().toString());
                double circle_result=Math.PI*Math.pow(Radius,2);
                Intent intent =new Intent();
                intent.putExtra("circle_result",circle_result);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }

}