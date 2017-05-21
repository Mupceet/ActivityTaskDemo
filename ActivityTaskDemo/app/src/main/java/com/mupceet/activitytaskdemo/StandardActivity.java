package com.mupceet.activitytaskdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StandardActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard);

        Button toSecondActivity = (Button) findViewById(R.id.btn_second_self);
        toSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StandardActivity.this, StandardActivity.class));
            }
        });
    }
}
