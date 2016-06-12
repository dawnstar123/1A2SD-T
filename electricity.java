package com.woof.cuhacks_dawnstar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.woof.cuhacks_dawnstar.MainActivity;
import com.woof.cuhacks_dawnstar.R;

import java.text.DecimalFormat;

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

            //Intent myIntent = new Intent(v.getContext(), calculate.class);
            //startActivity(myIntent);
            Log.i(TAG, "pressed");
            EditText userInput = (EditText) findViewById(R.id.userInput);
            Log.i(TAG, String.valueOf(userInput));
            int usin = Integer.valueOf(userInput.getText().toString());
            double resUs =   calculate(usin);
            String s = resUs + "";
            String new_val = "";
            int count = 0;
            char ia = 'a';
            for (int i = 0; i < s.length(); i++){
                if (s.charAt(i) == '.'){
                    ia = s.charAt(i);
                }
                if (ia == '.'){
                    count++;
                }
                if (count <= 3){
                    new_val += s.charAt(i) + "";
                }else{
                    break;
                }
            }
            Double new_int = (Double.parseDouble(new_val));
            TextView text=(TextView)findViewById(R.id.textView5);
            text.setText(new_int + " kWh of power consumed");
            if(new_int > 911){
                TextView text1 =(TextView)findViewById(R.id.textView6);
                double finalcalc = ((new_int/911)*100.0);
                DecimalFormat df = new DecimalFormat("#.##");
              /*  int count1 = 0;
                char ia1 = 'a';
                String s1 = finalcalc +"";
                String new_newVal = "";
                for (int i = 0; i < s1.length(); i++){
                    if (s1.charAt(i) == '.'){
                        ia1 = s1.charAt(i);
                    }
                    if (ia1 == '.'){
                        count1++;
                    }
                    if (count1 <= 3){
                        new_newVal += s1.charAt(i) + "";
                    }else{
                        break;
                    }
                } */

                text1.setText(df.format(finalcalc) + "% more than the average american household power consumption");
                //text1.setText(resUs + " kWh of power consumed");
                if(finalcalc > 100 && finalcalc <300){
                    TextView text3=(TextView)findViewById(R.id.textView9);
                    text3.setText("Try to conserve energy by using the following sparingly : LED TV, Gaming System, 4 Light Bulbs");
                }
                if(finalcalc >= 300 && finalcalc <500){
                    TextView text3=(TextView)findViewById(R.id.textView9);
                    text3.setText("Try to conserve energy by using the following sparingly : 5-6 Light Bulbs, Clothes dryer, Room heater");
                }
                if(finalcalc >= 500 && finalcalc <700){
                    TextView text3=(TextView)findViewById(R.id.textView9);
                    text3.setText("Try to conserve energy by using the following sparingly : Desktop Computer, 5-7 Light Bulbs,3-4 Ceiling Fans");
                }
                if(finalcalc >= 700){
                    TextView text3=(TextView)findViewById(R.id.textView9);
                    text3.setText("Try to conserve energy by using the following sparingly : Central Climate Control, Water Heater, Washing Machine, 8-10 Light Bulbs");
                }
            }
            else{
                TextView text1 =(TextView)findViewById(R.id.textView6);
                double finalcalc = (911/(new_int))*100.0;
                DecimalFormat df = new DecimalFormat("#.##");
                text1.setText(df.format(finalcalc)+ "% less than the average american household power consumption");
            }
        }

    }
    public double calculate(int x){

        double usage = x / 0.218;

        return usage;
   }

    /*
    EditText editTextName = (EditText) findViewById(R.id.userInput);
    editTextName.setOnEditorActionListener(new TextView.OnEditorActionListener(){
        @Override
                public boolean onEditorAction(TextView, userInput)
    });
*/
}
