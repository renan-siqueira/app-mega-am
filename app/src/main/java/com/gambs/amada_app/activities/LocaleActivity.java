package com.gambs.amada_app.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.gambs.amada_app.R;

public class LocaleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locale);
    }

    public void mainHome(View view) {
        startActivity(new Intent(this, HomeActivity.class));
    }

    public void mainSearchStore(View view) {
        startActivity(new Intent(this, SearchStoreActivity.class));
    }

    public void mainAccess(View view) {
        startActivity(new Intent(this, MainAccess.class));
    }

    public void mainScanCheckpoint(View view) {
        startActivity(new Intent(this, ScanCheckpoint.class));
    }
}
