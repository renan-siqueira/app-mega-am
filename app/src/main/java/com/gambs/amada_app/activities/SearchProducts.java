package com.gambs.amada_app.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.gambs.amada_app.R;

public class SearchProducts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_products);
    }

    public void accessProductList(View view) {
        startActivity(new Intent(this, ProductList.class));
    }

    public void accessHowToUse(View view) {
        startActivity(new Intent(this, HowToUse.class));
    }

    public void returnHome(View view) {
        startActivity(new Intent(this, HomeActivity.class));
    }
}
