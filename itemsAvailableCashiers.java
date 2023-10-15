package com.example.coftea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class itemsAvailableCashiers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_available_cashiers);

        Button availableCoffee = findViewById(R.id.availableCoffee);
        Button availableTea = findViewById(R.id.availableTea);



        availableCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the SecondActivity
                Intent intent = new Intent(itemsAvailableCashiers.this, orderProductsCoffeeCustomer.class);
                startActivity(intent);
            }
        });

        availableTea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the SecondActivity
                Intent intent = new Intent(itemsAvailableCashiers.this, orderProductTeaCustomer.class);
                startActivity(intent);
            }
        });

    }

}