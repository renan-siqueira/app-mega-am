package com.gambs.amada_app.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.gambs.amada_app.R;

public class ChatWithEmployee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_with_employee);
    }

    public void returnTalkEmployee(View view) {
        startActivity(new Intent(this, TalkEmployee.class));
    }

    public void returnHome(View view) {
        startActivity(new Intent(this, HomeActivity.class));
    }
}
