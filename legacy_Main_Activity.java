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
        new Button.OnClickListener()
        {
            public void onClick(View v)
            {

            }
        };
    }

    @Override
    public void onClick(View v) {
        Log.i(TAG, "Pressed");
        Intent myIntent = new Intent(v.getContext(), CHEM.class);
        startActivity(myIntent);
        EditText editText = (EditText) findViewById(R.id.editText2);
        String value = editText.getText().toString();
        Log.i(TAG, value);
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
