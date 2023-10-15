package com.example.coftea;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class listOfProductsTeaCashiers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_products_tea_cashiers);

        ImageButton imageButton = findViewById(R.id.AddTeaButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the SecondActivity
                Intent intent = new Intent(listOfProductsTeaCashiers.this, AddProductCashiers.class);
                startActivity(intent);
            }
        });
    }
}