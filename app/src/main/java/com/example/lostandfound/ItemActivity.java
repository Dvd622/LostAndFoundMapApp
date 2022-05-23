package com.example.lostandfound;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ItemActivity extends AppCompatActivity {

    TextView nameTextView;
    TextView descriptionTextView;
    TextView dateTextView;
    TextView locationTextView;
    TextView phoneTextView;
    Button removeItemButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        nameTextView = findViewById(R.id.itemNameTextView);
        descriptionTextView = findViewById(R.id.itemDescriptionTextView);
        dateTextView = findViewById(R.id.itemDateTextView);
        locationTextView = findViewById(R.id.itemLocationTextView);
        phoneTextView = findViewById(R.id.itemPhoneTextView);
        removeItemButton = findViewById(R.id.removeItemButton);

        Intent intentReceive = getIntent();
        String name = intentReceive.getStringExtra("name");
        String description = "Description \n" + intentReceive.getStringExtra("description");
        String date = "Date \n" + intentReceive.getStringExtra("date");
        String location = "Location \n" + intentReceive.getStringExtra("location");
        String phone = "Phone \n" + intentReceive.getStringExtra("phone");
        String id = intentReceive.getStringExtra("id");

        nameTextView.setText(name);
        descriptionTextView.setText(description);
        dateTextView.setText(date);
        locationTextView.setText(location);
        phoneTextView.setText(phone);

        removeItemButton.setOnClickListener(view -> {
            DatabaseHelper db = new DatabaseHelper(this);
            Item item = new Item(name, phone, description, date, location);
            item.setItemId(Integer.parseInt(id));
            db.deleteItem(item);
            Toast.makeText(this, "Item removed", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent();
            setResult(RESULT_OK, intent);
            finish();
        });
    }
}