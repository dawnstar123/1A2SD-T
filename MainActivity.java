package com.woof.cuhacks_dawnstar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String TAG = "gg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");
        Button button = (Button) findViewById(R.id.waterButton);
        button.setOnClickListener(MainActivity.this);
        Button button2 = (Button) findViewById(R.id.waterButton2);
        button2.setOnClickListener(MainActivity.this);
        Button button3 = (Button) findViewById(R.id.pollutionButton);
        button3.setOnClickListener(MainActivity.this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.waterButton) {
            Intent myIntent = new Intent(v.getContext(), Water.class);
            startActivity(myIntent);
            Log.i(TAG, "pressed");
        }else if(v.getId() == R.id.waterButton2){
            Intent myIntent1 = new Intent(v.getContext(), WaterGraph.class);
            startActivity(myIntent1);
            Log.i(TAG, "pressed");
        }else if(v.getId() == R.id.pollutionButton){
            Intent myIntent2 = new Intent(v.getContext(), Pollution.class);
            startActivity(myIntent2);
            Log.i(TAG, "pressed");
        }
    }
}
