package com.woof.cuhacks_dawnstar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Water extends AppCompatActivity implements View.OnClickListener {
    static int xfs = 0;
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

        EditText editText2 = (EditText) findViewById(R.id.editText2);
        int showerNum = Integer.valueOf(editText2.getText().toString());
        EditText editText = (EditText) findViewById(R.id.editText);
        int showerDur = Integer.valueOf(editText.getText().toString());
        EditText editText3 = (EditText) findViewById(R.id.editText3); //3
        Double drinkWat = (Integer.valueOf(editText3.getText().toString()) * 0.236588);
        EditText editText4 = (EditText) findViewById(R.id.editText4); //4
        int car = Integer.valueOf(editText4.getText().toString()) *340;
        EditText editText5 = (EditText) findViewById(R.id.editText5); //5
        int numPlants = Integer.valueOf(editText5.getText().toString());
        EditText editText6 = (EditText) findViewById(R.id.editText6); //6
        int numWatPlants = Integer.valueOf(editText6.getText().toString());
        EditText editText7 = (EditText) findViewById(R.id.editText7);//7
        int numToilet = Integer.valueOf(editText7.getText().toString()) *14;
        EditText editText8 = (EditText) findViewById(R.id.editText8);//8
        int misc1 = Integer.valueOf(editText8.getText().toString());

        int showerfinal = (int) (showerNum*showerDur*9.5);
        int plants = numPlants*numWatPlants *2;

        String xs = String.valueOf(showerfinal+drinkWat+car+plants+numToilet+misc1);
        xfs = (int) (showerfinal+drinkWat+car+plants+numToilet+misc1);


        Log.i(TAG, String.valueOf(showerNum));
        Log.i(TAG, String.valueOf(showerDur));
        Log.i(TAG, String.valueOf(drinkWat));
        Log.i(TAG, String.valueOf(car));
        Log.i(TAG, String.valueOf(numPlants));
        Log.i(TAG, String.valueOf(numWatPlants));
        Log.i(TAG, String.valueOf(numToilet));
        Log.i(TAG, String.valueOf(misc1));

        TextView text=(TextView)findViewById(R.id.textView3);
        text.setText(xs + " liters of water");
    }
    public static int getMyInt(){
        return xfs;
    }
}
