package com.example.baseactivitycode;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=(Button)findViewById(R.id.btn);
          add();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              StartIntent_2(getApplicationContext(),null);
            }
        });
    }
}
