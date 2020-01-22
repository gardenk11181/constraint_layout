package com.gardenlab.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

public class DoitMission3 extends AppCompatActivity {
    private Button buttonChange;
    private ScrollView scrollFirst;
    private ScrollView scrollSecond;
    private int index=0;
    private String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doit_mission3);

        buttonChange = findViewById(R.id.button_change);
        scrollFirst = findViewById(R.id.scroll_first);
        scrollSecond = findViewById(R.id.scroll_second);

        buttonChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePosition();
            }
        });

        buttonChange.setAllCaps(false);
    }

    public void changePosition() {
        if(index==0) {
            scrollFirst.setVisibility(View.INVISIBLE);
            scrollSecond.setVisibility(View.VISIBLE);
            index=1;
        } else {
            scrollFirst.setVisibility(View.VISIBLE);
            scrollSecond.setVisibility(View.INVISIBLE);
            index=0;
        }
    }
}
