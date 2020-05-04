package com.gambs.amada_app.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.gambs.amada_app.MainActivity;
import com.gambs.amada_app.R;

public class MainAccess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_access);
    }

    public void mainReturn(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void mainNext(View view) {
        startActivity(new Intent(this, LocaleActivity.class));
    }
}
