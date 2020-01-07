package com.example.activitylifecycletest;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Stack;

public class BaseActivity extends AppCompatActivity {


    private static final String TAG="BaseActivity";
    private static Stack<Activity> Activity_Manage=new Stack<>();//声明成保护类型的变量
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.e(TAG,this.getClass().getName());
    }
    public void addActivity(Activity activity)
    {
        Activity_Manage.add(activity);
    }

    protected static void exit_all()//关闭全部程序
    {
        for(Activity act:Activity_Manage)
        {
            act.finish();
        }
        Activity_Manage.clear();
    }

}
