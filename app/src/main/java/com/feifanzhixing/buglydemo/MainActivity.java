package com.feifanzhixing.buglydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Log.e("bugly", "热更新！！!Bug");
        Log.e("bugly", "热更新！！!修复好了");
        findViewById(R.id.test).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "修复好了第二次", Toast.LENGTH_SHORT).show();
//        Toast.makeText(this, "Bug", Toast.LENGTH_SHORT).show();
    }
}
