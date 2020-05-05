package com.gambs.amada_app.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.gambs.amada_app.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void returnLocale(View view) {
        startActivity(new Intent(this, LocaleActivity.class));
    }

    public void accessNeedHelp(View view) {
        startActivity(new Intent(this, NeedHelp.class));
    }

    public void accessProductsInfo(View view) {
        startActivity(new Intent(this, SearchProducts.class));
    }

    public void accessTalkEmployee(View view) {
        startActivity(new Intent(this, TalkEmployee.class));
    }

    public void accessOffers(View view) {
        startActivity(new Intent(this, Offers.class));
    }

    public void accessPayStore(View view) {
        startActivity(new Intent(this, PayStore.class));
    }

    public void accessPickUpStore(View view) {
        startActivity(new Intent(this, Offers.class));
    }
}
