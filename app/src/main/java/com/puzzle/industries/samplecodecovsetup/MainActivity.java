package com.puzzle.industries.samplecodecovsetup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.puzzle.industries.samplecodecovsetup.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public ActivityMainBinding binding;
    public boolean state = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnTest.setOnClickListener(v -> {});

    }

    private void changeText(){
        if (state){
            binding.tvHello.setText("State On");
        }
        else{
            binding.tvHello.setText("State Off");
        }

        state = !state;
    }
}