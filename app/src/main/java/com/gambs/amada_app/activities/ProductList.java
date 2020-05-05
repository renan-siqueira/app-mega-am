package com.gambs.amada_app.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.gambs.amada_app.R;

public class ProductList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
    }

    public void returnSearchProducts(View view) {
        startActivity(new Intent(this, SearchProducts.class));
    }

    public void returnHome(View view) {
        startActivity(new Intent(this, HomeActivity.class));
    }

    public void accessPayStore(View view) {
        startActivity(new Intent(this, PayStore.class));
    }

    public void accessInfoProduct(View view) {
        startActivity(new Intent(this, InfoProduct.class));
    }
}
