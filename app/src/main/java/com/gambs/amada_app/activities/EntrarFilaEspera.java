package com.gambs.amada_app.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.gambs.amada_app.R;

public class EntrarFilaEspera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrar_fila_espera);
    }

    public void returnHome(View view) {
        startActivity(new Intent(this, HomeActivity.class));
    }

    public void returnTalkEmployee(View view) {
        startActivity(new Intent(this, TalkEmployee.class));
    }

    public void accessChatWithEmployee(View view) {
        startActivity(new Intent(this, ChatWithEmployee.class));
    }

}
