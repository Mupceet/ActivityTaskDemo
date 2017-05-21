package com.mupceet.activitytaskdemo2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toOtherActivityWithAffinity = (Button) findViewById(R.id.btn_to_other_with_affinity);
        toOtherActivityWithAffinity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, OtherActivityWithActivity.class));
            }
        });

        Button toDemoSingleInstanceActivity = (Button) findViewById(R.id.btn_to_demo_single_instance);
        toDemoSingleInstanceActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.mupceet.ACTION");
                startActivity(intent);
            }
        });

        Button toDemoStandardActivity = (Button) findViewById(R.id.btn_to_demo_standard);
        toDemoStandardActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.mupceet.ACTION_STANDARD");
                startActivity(intent);
            }
        });

        Button toSecondActivity = (Button) findViewById(R.id.btn_to_second);
        toSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, StandardActivity.class));
            }
        });

    }
}
