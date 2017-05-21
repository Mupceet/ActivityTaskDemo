package com.mupceet.activitytaskdemo;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class BaseActivity extends AppCompatActivity {
    public static final String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "************* onCreate *************");
        Log.i(TAG, getClass().getSimpleName()
                + " TaskId: " + getTaskId() 
                + " HashCode:" + this.hashCode());
        dumpTaskAffinity();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i(TAG, "************* onNewIntent *************");
        Log.i(TAG, getClass().getSimpleName()
                + " TaskId: " + getTaskId() 
                + " HashCode:" + this.hashCode());
        dumpTaskAffinity();
    }

    protected void dumpTaskAffinity(){
        try {
            ActivityInfo info = this.getPackageManager()
                    .getActivityInfo(getComponentName(), PackageManager.GET_META_DATA);
            Log.i(TAG, "taskAffinity:"+info.taskAffinity);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
