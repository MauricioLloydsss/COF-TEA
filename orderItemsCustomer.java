package com.example.coftea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class orderItemsCustomer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_items_customer);

        Button orderCoffee = findViewById(R.id.orderCoffee);
        Button orderTea = findViewById(R.id.orderTea);
        Button advanceOrderBtn = findViewById(R.id.Advancedorder);
        Button MyOrder = findViewById(R.id.MyOrder);



        orderCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the SecondActivity
                Intent intent = new Intent(orderItemsCustomer.this, orderProductsCoffeeCustomer.class);
                startActivity(intent);
            }
        });

        orderTea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the SecondActivity
                Intent intent = new Intent(orderItemsCustomer.this, orderProductTeaCustomer.class);
                startActivity(intent);
            }
        });

        advanceOrderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the SecondActivity
                Intent intent = new Intent(orderItemsCustomer.this, orderDetailsCashiers.class);
                startActivity(intent);
            }
        });

        MyOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the SecondActivity
                Intent intent = new Intent(orderItemsCustomer.this, cartCustomer.class);
                startActivity(intent);
            }
        });

    }
}