package com.mupceet.activitytaskdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SingleTaskActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task);

        Button toSingleTaskActivity = (Button) findViewById(R.id.btn_single_task_self);
        toSingleTaskActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingleTaskActivity.this, SingleTaskActivity.class));
            }
        });

        Button toOtherTaskActivity = (Button) findViewById(R.id.btn_to_other_task);
        toOtherTaskActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingleTaskActivity.this, OtherTaskActivity.class));
            }
        });

        Button toStandardActivity = (Button) findViewById(R.id.btn_to_standard);
        toStandardActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingleTaskActivity.this, StandardActivity.class));
            }
        });
    }
}
