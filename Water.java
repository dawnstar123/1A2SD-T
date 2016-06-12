package com.woof.cuhacks_dawnstar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Water extends AppCompatActivity implements View.OnClickListener {
    String TAG = "gg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water);
        Log.i(TAG,"onCreate");
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(Water.this);
    }

    @Override
    public void onClick(View v) {
        EditText editText = (EditText) findViewById(R.id.editText);
        int s = Integer.valueOf(editText.getText().toString());
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        int s1 = Integer.valueOf(editText2.getText().toString());
        Log.i(TAG, String.valueOf(s));
        Log.i(TAG, String.valueOf(s1));
    }
}
