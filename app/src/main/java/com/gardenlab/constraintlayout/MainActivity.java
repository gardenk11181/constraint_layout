package com.gardenlab.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button buttonChange;
    private ImageView imageFirst;
    private ImageView imageSecond;
    private int index =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_layout);

        buttonChange = findViewById(R.id.button_change);
        imageFirst = findViewById(R.id.image_first);
        imageSecond = findViewById(R.id.image_second);

        buttonChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImage();
            }
        });
    }

    public void changeImage() {
        if(index == 0) {
            imageFirst.setVisibility(View.INVISIBLE);
            imageSecond.setVisibility(View.VISIBLE);

            index =1;
        } else {
            imageFirst.setVisibility(View.VISIBLE);
            imageSecond.setVisibility(View.INVISIBLE);
            index=0;
        }
    }
}
