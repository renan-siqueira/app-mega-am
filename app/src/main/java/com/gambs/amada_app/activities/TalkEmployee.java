package com.gambs.amada_app.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.gambs.amada_app.R;

public class TalkEmployee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talk_employee);
    }

    public void returnHome(View view) {
        startActivity(new Intent(this, HomeActivity.class));
    }

    public void accessPerguntasFrequentes(View view) {
        startActivity(new Intent(this, PerguntasFrequentes.class));
    }

    public void accessEntrarFilaEspera(View view) {
        startActivity(new Intent(this, EntrarFilaEspera.class));
    }

    public void accessNeedHelp(View view) {
        startActivity(new Intent(this, NeedHelp.class));
    }

}
