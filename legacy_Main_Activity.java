package com.example.ananth.test;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity implements View.OnClickListener {
    private static final String TAG = "gg";
    public final static String EXTRA_MESSAGE = "com.example.test.MESSAGE";
    private Button button;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(MainActivity.this);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(MainActivity.this);
        new Button.OnClickListener()
        {
            public void onClick(View v)
            {

            }
        };
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button){
            Log.i(TAG, "Pressed b1");
            Intent myIntent = new Intent(v.getContext(), CHEM.class);
            startActivity(myIntent);
            EditText editText = (EditText) findViewById(R.id.editText2);
            String value = editText.getText().toString();
            Log.i(TAG, value);
        }else{
            Log.i(TAG, "Pressed b2");
            Intent myIntent1 = new Intent(v.getContext(), E3.class);
            startActivity(myIntent1);
        }
        /*
        switch(v.getId()) {
           case R.id.button:
            Log.i(TAG, "Pressed");
            Intent myIntent = new Intent(v.getContext(), CHEM.class);
            startActivity(myIntent);
            EditText editText = (EditText) findViewById(R.id.editText2);
            String value = editText.getText().toString();
            Log.i(TAG, value);
            case R.id.button2:
                Log.i(TAG, "Pressed");
                Intent myIntent1 = new Intent(v.getContext(), E3.class);
                startActivity(myIntent1);
       }
       */
    }


    /*
    @Override
    public void onClick(View v) {
        Log.i(TAG, "Pressed");
        Intent intent = new Intent(this, CHEM.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
    }
    */
}
