package com.example.coftea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class queueCashiers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue_cashiers);

        Button customersQueueBtn = findViewById(R.id.customersQueueButton);
        Button customersOrderBtn = findViewById(R.id.customersOrderButton);
        Button advanceOrderBtn = findViewById(R.id.advanceOrderButton);
        Button successfulOrderBtn = findViewById(R.id.successfulOrderButton);

        customersQueueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the SecondActivity
                Intent intent = new Intent(queueCashiers.this, customersQueueCashiers.class);
                startActivity(intent);
            }
        });


        customersOrderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the SecondActivity
                Intent intent = new Intent(queueCashiers.this, orderDetailsCashiers.class);
                startActivity(intent);
            }
        });

        advanceOrderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the SecondActivity
                Intent intent = new Intent(queueCashiers.this, orderDetailsCashiers.class);
                startActivity(intent);
            }
        });

        successfulOrderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the SecondActivity
                Intent intent = new Intent(queueCashiers.this, orderDetailsCashiers.class);
                startActivity(intent);
            }
        });

    }
}
