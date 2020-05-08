package com.example.bhavanielectronics.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProductDescription extends AppCompatActivity {
    ImageView selectedImage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        int image = extras.getInt("Image");
        String name = extras.getString("Name");
    }
}
