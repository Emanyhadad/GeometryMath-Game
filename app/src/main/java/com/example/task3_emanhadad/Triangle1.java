package com.example.task3_emanhadad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.task3_emanhadad.databinding.ActivityTriangle1Binding;

public class Triangle1 extends AppCompatActivity {
ActivityTriangle1Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityTriangle1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnTriangleCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double triangleBase =Double.parseDouble(binding.edTriangleBase.getText().toString());
                double triangleHeight =Double.parseDouble(binding.edTriangleHeight.getText().toString());
                double triangleResult=.5*triangleBase*triangleHeight;

                Intent intent=new Intent();
                intent.putExtra("triangleResult",triangleResult);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}