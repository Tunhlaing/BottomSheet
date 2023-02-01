package com.example.bottomsheet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btClick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btClick = findViewById(R.id.btClick);
        MyBottomSheet bottomSheet = new MyBottomSheet();
        btClick.setOnClickListener(view ->{
            bottomSheet.show(getSupportFragmentManager(), "myBottomSheet"); });
    }
}