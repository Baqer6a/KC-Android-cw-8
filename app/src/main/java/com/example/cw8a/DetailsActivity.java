package com.example.cw8a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle bb2 = getIntent().getExtras();
        Items items2 = (Items) bb2.getSerializable("ii4");
        TextView tv1 = findViewById(R.id.tv1);
        ImageView imv1 = findViewById(R.id.imv1);

        tv1.setText(items2.getItemName());
        imv1.setImageResource(items2.getItemImage());

    }
}