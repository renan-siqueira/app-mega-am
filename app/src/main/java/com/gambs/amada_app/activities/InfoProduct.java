package com.gambs.amada_app.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.gambs.amada_app.R;

public class InfoProduct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_product);
    }

    public void returnHome(View view) {
        startActivity(new Intent(this, HomeActivity.class));
    }

    public void returnProductList(View view) {
        startActivity(new Intent(this, ProductList.class));
    }

    public void accessPayStore(View view) {
        startActivity(new Intent(this, PayStore.class));
    }


}
