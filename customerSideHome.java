package com.example.coftea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class customerSideHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_side_home);

        Button orderItems = findViewById(R.id.orderItems);
        Button queueCustomer = findViewById(R.id.queueCustomer);

        orderItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the SecondActivity
                Intent intent = new Intent(customerSideHome.this, orderItemsCustomer.class);
                startActivity(intent);
            }
        });


        queueCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the SecondActivity
                Intent intent = new Intent(customerSideHome.this, .class);
                startActivity(intent);
            }
        });
    }
}