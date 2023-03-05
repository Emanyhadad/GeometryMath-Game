package com.example.task3_emanhadad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.task3_emanhadad.databinding.ActivityMainBinding;

public class Calculation extends AppCompatActivity {
ActivityMainBinding binding;
    private final int Circle_Request_Code=3;
    private final int Rectangle_Request_Code=1;
    private final int Triangle_Request_Code=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.Rectangle.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),Rectangle1.class);
                startActivityForResult(intent,Rectangle_Request_Code);
            }
        });

        binding.Triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
          Intent intent=new Intent(getBaseContext(),Triangle1.class);
          startActivityForResult(intent,Triangle_Request_Code);
      }
        });

        binding.Circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),Circle1.class);
                startActivityForResult(intent,Circle_Request_Code);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==RESULT_OK && requestCode==Rectangle_Request_Code){
            double Rct_result=data.getDoubleExtra("rct_result",0);
            binding.ResultNum.setText(String.valueOf(Rct_result));
        }
         else if (resultCode==RESULT_OK && requestCode==Triangle_Request_Code){
            double Triangle_result=data.getDoubleExtra("triangleResult",0);
            binding.ResultNum.setText(String.valueOf(Triangle_result));}

        else if (resultCode==RESULT_OK && requestCode==Circle_Request_Code){
            double Circle_result=data.getDoubleExtra("circle_result",0);
            binding.ResultNum.setText(String.valueOf(Circle_result));}
    }
}