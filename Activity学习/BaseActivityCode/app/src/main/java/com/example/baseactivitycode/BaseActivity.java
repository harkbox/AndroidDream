package com.example.baseactivitycode;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BaseActivity extends AppCompatActivity {

    protected static final String TAG="BaseActivity";
    private static ArrayList<Activity> Activity_Manage=new ArrayList<>();
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.e(TAG,getClass().getName());

    }
    public void add()
    {
        Activity_Manage.add(this);
    }
    //结束清除activity.
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Activity_Manage.remove(this);
    }

    protected static void finish_all()
    {
      for(int i=0;i<Activity_Manage.size();i++)
      {
          Activity_Manage.get(i).finish();
      }
        Activity_Manage.clear();
    }
    //启动模式
    public void StartIntent_2(Context context,String message)
    {
        Intent intent=new Intent(context,Main2Activity.class);
        startActivity(intent);
    }


}
