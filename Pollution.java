package com.woof.cuhacks_dawnstar;

/**
 * Created by nihar on 6/11/2016.
 */

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Pollution extends AppCompatActivity {
    DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
    Button zip_butt;
    EditText edit_zip;
    String zip_str= "";
    String[] stateURLS = new String[]{
            "https://files.airnowtech.org/airnow/today/forecast_aqi_20160612_al_ga_fl.jpg",
            "https://files.airnowtech.org/airnow/today/forecast_aqi_20160612_alaska.jpg",
            "https://files.airnowtech.org/airnow/today/forecast_aqi_20160612_co_ut_az_nm.jpg",
            "https://files.airnowtech.org/airnow/today/forecast_aqi_20160612_ar_la_ms.jpg,",
            "https://files.airnowtech.org/airnow/today/forecast_aqi_20160612_ca_nv.jpg",
            "https://files.airnowtech.org/airnow/today/forecast_aqi_20160612_vt_nh_ma_ct_ri_me.jpg",
            "https://files.airnowtech.org/airnow/today/forecast_aqi_20160612_va_wv_md_de_dc.jpg",
            "https://files.airnowtech.org/airnow/today/forecast_aqi_20160612_hawaii.jpg",
            "https://files.airnowtech.org/airnow/today/forecast_aqi_20160612_mt_id_wy.jpg",
            "https://files.airnowtech.org/airnow/today/forecast_aqi_20160612_ia_il_mo.jpg",
            "https://files.airnowtech.org/airnow/today/forecast_aqi_20160612_mi_in_oh.jpg",
            "https://files.airnowtech.org/airnow/today/forecast_aqi_20160612_ne_ks.jpg",
            "https://files.airnowtech.org/airnow/today/forecast_aqi_20160612_ky_tn.jpg",
            "https://files.airnowtech.org/airnow/today/forecast_aqi_20160612_maryland.jpg",
            "https://files.airnowtech.org/airnow/today/forecast_aqi_20160612_mn_wi.jpg",
            "https://files.airnowtech.org/airnow/today/forecast_aqi_20160612_ny_pa_nj.jpg",
            "https://files.airnowtech.org/airnow/today/forecast_aqi_20160612_nc_sc.jpg",
            "https://files.airnowtech.org/airnow/today/forecast_aqi_20160612_tx_ok.jpg",
            "https://files.airnowtech.org/airnow/today/forecast_aqi_20160612_wa_or.jpg"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pollution);
        zip_butt = (Button) findViewById(R.id.button_zip);
        edit_zip = (EditText) findViewById(R.id.editText_zip);
        zip_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zip_str = edit_zip.getText().toString();
                myRef.push().setValue(zip_str);
                Intent intent = new Intent();
                switch (zip_str){
                    case "Georgia":
                    case "Florida":
                    case "Alabama":
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse(stateURLS[0]));
                        startActivity(intent);
                        break;
                    case "Alaska":
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse(stateURLS[1]));
                        startActivity(intent);
                        break;
                    case "New Mexico":
                    case "Arizona":
                    case "Utah":
                    case "Colorado":
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse(stateURLS[2]));
                        startActivity(intent);
                        break;
                    case "Louisiana":
                    case "Mississippi":
                    case "Arkansas":
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse(stateURLS[3]));
                        startActivity(intent);
                        break;
                    case "California":
                    case "Nevada":
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse(stateURLS[4]));
                        startActivity(intent);
                        break;
                    case "Vermont":
                    case "New Hampshire":
                    case "Massachusetts":
                    case "Connecticut":
                    case "Rhode Island":
                    case "Maine":
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse(stateURLS[5]));
                        startActivity(intent);
                        break;
                    case "Virginia":
                    case "West Virginia":
                    case "Delaware":
                    case "District of Columbia":
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse(stateURLS[6]));
                        startActivity(intent);
                        break;
                    case "Hawaii":
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse(stateURLS[7]));
                        startActivity(intent);
                        break;
                    case "Idaho":
                    case "Wyoming":
                    case "Montana":
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse(stateURLS[8]));
                        startActivity(intent);
                        break;
                    case "Illinois":
                    case "Missouri":
                    case "Iowa":
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse(stateURLS[9]));
                        startActivity(intent);
                        break;
                    case "Michigan":
                    case "Indiana":
                    case "Ohio":
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse(stateURLS[10]));
                        startActivity(intent);
                        break;
                    case "Nebraska":
                    case "Kansas":
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse(stateURLS[11]));
                        startActivity(intent);
                        break;
                    case "Kentucky":
                    case "Tennessee":
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse(stateURLS[12]));
                        startActivity(intent);
                        break;
                    case "Maryland":
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse(stateURLS[13]));
                        startActivity(intent);
                        break;
                    case "Wisconsin":
                    case "Minnesota":
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse(stateURLS[14]));
                        startActivity(intent);
                        break;
                    case "Pennsylvania":
                    case "New Jersey":
                    case "New York":
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse(stateURLS[15]));
                        startActivity(intent);
                        break;
                    case "North Carolina":
                    case "South Carolina":
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse(stateURLS[16]));
                        startActivity(intent);
                        break;
                    case "Oklahoma":
                    case "Texas":
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse(stateURLS[17]));
                        startActivity(intent);
                        break;
                    case "Oregon":
                    case "Washington":
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse(stateURLS[18]));
                        startActivity(intent);
                        break;
                    default:
                        break;
                }
            }
        });

        //myRef.child("Hi").setValue("Anant");

        /*myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot postSnapshot: dataSnapshot.getChildren()){
                    //try {
                        Log.d("Value", (String) postSnapshot.getValue());
                    //}catch(java.lang.ClassCastException e){
                    //}
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });*/
    }
}
