package com.example.coftea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cashiersSideHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cashiers_side_home);

        Button ItemsAvailable = findViewById(R.id.ItemsAvailable);
        Button Queue = findViewById(R.id.Queue);
        Button DiscountBtn = findViewById(R.id.Discount);

        ItemsAvailable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the SecondActivity
                Intent intent = new Intent(cashiersSideHome.this, itemsAvailableCashiers.class);
                startActivity(intent);
            }
        });


        Queue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the SecondActivity
                Intent intent = new Intent(cashiersSideHome.this, queueCashiers.class);
                startActivity(intent);
            }
        });

        DiscountBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the SecondActivity
                Intent intent = new Intent(cashiersSideHome.this, discountCashier.class);
                startActivity(intent);
            }
        });
    }
}

