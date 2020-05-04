package com.gambs.amada_app.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.gambs.amada_app.R;

public class SearchStoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_store);
    }

    public void returnLocale(View view) {
        startActivity(new Intent(this, LocaleActivity.class));
    }

    public void returnHome(View view) {
        startActivity(new Intent(this, HomeActivity.class));
    }
}
