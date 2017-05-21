package com.mupceet.activitytaskdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SingleInstanceActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance);

        Button toMainActivity = (Button) findViewById(R.id.btn_to_main);
        toMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingleInstanceActivity.this, MainActivity.class));
            }
        });

        Button toSingleTopActivity = (Button) findViewById(R.id.btn_to_single_top);
        toSingleTopActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingleInstanceActivity.this, SingleTopActivity.class));
            }
        });

        Button toStandardActivity = (Button) findViewById(R.id.btn_to_standard);
        toStandardActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingleInstanceActivity.this, StandardActivity.class));
            }
        });
    }
}
