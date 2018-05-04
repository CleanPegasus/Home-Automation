package com.example.clean_pegasus.homeautomation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch switch1 = (Switch) findViewById(R.id.switch1);
        Switch switch2 = (Switch) findViewById(R.id.switch2);
        Switch switch3 = (Switch) findViewById(R.id.switch3);


        Boolean switchState1 = switch1.isChecked();
        Boolean switchState2 = switch2.isChecked();
        Boolean switchState3 = switch3.isChecked();


        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // do something, the isChecked will be
                // true if the switch is in the On position

                if(isChecked)
                {
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("Switch1");

                    myRef.setValue("1");
                }

                else
                {
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("Switch1");

                    myRef.setValue("0");
                }


            }
        });

        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // do something, the isChecked will be
                // true if the switch is in the On position

                if(isChecked)
                {
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("Switch2");

                    myRef.setValue("1");
                }

                else
                {
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("Switch2");

                    myRef.setValue("0");
                }


            }
        });


        switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // do something, the isChecked will be
                // true if the switch is in the On position

                if(isChecked)
                {
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("Switch3");

                    myRef.setValue("1");
                }

                else
                {
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("Switch3");

                    myRef.setValue("0");
                }


            }
        });



    }
}
