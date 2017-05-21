package com.mupceet.activitytaskdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SingleTopActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_top);

        Button toSingleTopActivity = (Button) findViewById(R.id.btn_single_self);
        toSingleTopActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingleTopActivity.this, SingleTopActivity.class));
            }
        });

        Button toOtherTopActivity = (Button) findViewById(R.id.btn_to_other_top);
        toOtherTopActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingleTopActivity.this, OtherTopActivity.class));
            }
        });

        Button toSingleInstanceActivity = (Button) findViewById(R.id.btn_to_single_instance);
        toSingleInstanceActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingleTopActivity.this, SingleInstanceActivity.class));
            }
        });
    }
}
