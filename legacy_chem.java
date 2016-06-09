package com.example.ananth.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CHEM extends AppCompatActivity implements View.OnClickListener  {
    String TAG = "gg";
    private Button btnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chem);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnClick = (Button) findViewById(R.id.button4);
        btnClick.setOnClickListener((View.OnClickListener) this);
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
        EditText editText = (EditText) findViewById(R.id.editText);
        //EditText editText3 = (EditText) findViewById(R.id.editText3);
        int in = Integer.valueOf(editText.getText().toString());
        String value = String.valueOf(in*2);
        //String value = "ss";
        Log.i(TAG, String.valueOf(value.length()));
    }

    /*
    public void onClick(View v) {
        Log.i(TAG, "Pressed");
        Intent myIntent = new Intent(v.getContext(), CHEM.class);
        startActivity(myIntent);
        EditText editText = (EditText) findViewById(R.id.editText2);
        String value = editText.getText().toString();
        Log.i(TAG, value);
    }
    */

}
