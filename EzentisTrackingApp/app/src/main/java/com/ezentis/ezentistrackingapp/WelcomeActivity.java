package com.ezentis.ezentistrackingapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_welcome);

        findViewById(R.id.register).setOnClickListener(this);
        findViewById(R.id.login).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent;
        if (v.getId() == R.id.register) {
            intent = new Intent(this, RegisterActivity.class);
        } else {
            intent = new Intent(this, LoginActivity.class);
        }

        startActivity(intent);
    }
}
