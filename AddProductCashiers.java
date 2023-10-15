package com.example.coftea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddProductCashiers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product_cashiers);

        final EditText editProductID = findViewById(R.id.productID);
        final EditText editProductName = findViewById(R.id.productName);

        editProductID.setOnClickListener(new View.OnClickListener() {
                                             public void onClick(View v) {
                                                 editProductID.setText(""); // Clear the text when clicked
                                             }

                                         }
        );

        editProductName.setOnClickListener(new View.OnClickListener() {

                                               public void onClick(View v) {
                                                   editProductName.setText(""); // Clear the text when clicked
                                               }

                                           }
        );
    }
}