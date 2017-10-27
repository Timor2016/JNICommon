package com.wc.commontondk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.wc.commontondk.myjni.Codec;

public class MainActivity extends AppCompatActivity {
    private TextView hellow_jni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hellow_jni = (TextView)findViewById(R.id.hellow_jni);
        hellow_jni.setText(Codec.hexEncode());
        
    }
}
