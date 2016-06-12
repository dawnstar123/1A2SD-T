package com.example.chrismatthewcyril.cuhacks_dawnstar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class electricity extends MainActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electricity);
        Button button1 = (Button) findViewById(R.id.button_accept);
        button1.setOnClickListener(electricity.this);
       /* Button button2 = (Button) findViewById(R.id.button_water);
        button2.setOnClickListener(electricity.this); */


    }

    public void onClick(View v) {
        if (v.getId() == R.id.button_accept) {

            Intent myIntent = new Intent(v.getContext(), calculate.class);
            startActivity(myIntent);
            Log.i(TAG, "pressed");
            EditText userInput = (EditText) findViewById(R.id.userInput);
            Log.i(TAG, String.valueOf(userInput));
        }
    }
    /*
    EditText editTextName = (EditText) findViewById(R.id.userInput);
    editTextName.setOnEditorActionListener(new TextView.OnEditorActionListener(){
        @Override
                public boolean onEditorAction(TextView, userInput)

    });
*/
}
