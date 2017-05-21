package com.mupceet.activitytaskdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OtherTaskActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_task);

        Button toSingleTaskActivity = (Button) findViewById(R.id.btn_to_single_task);
        toSingleTaskActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OtherTaskActivity.this, SingleTaskActivity.class));
            }
        });
    }
}
