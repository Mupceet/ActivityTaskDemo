package com.mupceet.activitytaskdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SingleTaskActivityWithAffinity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task_with_affinity);

        Button toStandardActivity = (Button) findViewById(R.id.btn_to_standard);
        toStandardActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingleTaskActivityWithAffinity.this, StandardActivity.class));
            }
        });
    }
}
