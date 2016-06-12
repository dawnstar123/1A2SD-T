package com.woof.cuhacks_dawnstar;

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
