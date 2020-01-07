package com.example.activitylifecycletest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {


    private static final String TAG="MainActivity";
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addActivity(this);
        Button btn1=(Button)findViewById(R.id.start_normal_activity);
        Button btn2=(Button)findViewById(R.id.start_dialog_activity);
        Log.e(TAG,this.toString());
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent=new Intent(getApplicationContext(),Nomar_activity.class);
//                intent.putExtra("key",savedInstanceState);//将bundle保存在intent里
//                intent.getBundleExtra("key");//获得bundle
//              实验启动方式
//                startActivity(intent);
//                Intent intent=new Intent(getApplicationContext(),MainActivity.this.getClass());
                Intent intent=new Intent(getApplicationContext(),Nomar_activity.class);
                startActivity(intent);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           Intent intent=new Intent(getApplicationContext(),DialogActivity.class);
           startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"Onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"onRestart");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.get("hello");
    }
}
