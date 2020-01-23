package com.gardenlab.constraintlayout;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DoitMission4 extends AppCompatActivity {
    private EditText editTextInput;
    private TextView textViewByte;
    private Button btnSend;
    private Button btnClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doit_mission4);

        editTextInput = findViewById(R.id.edit_text_input);
        textViewByte = findViewById(R.id.text_view_byte);
        btnSend = findViewById(R.id.btn_send);
        btnClose = findViewById(R.id.btn_close);

        editTextInput.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = editTextInput.getText().toString();
                Toast toast = Toast.makeText(DoitMission4.this, msg, Toast.LENGTH_LONG);
                toast.show();
            }
        });

        editTextInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                textViewByte.setText("0 / 80 byte");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                textViewByte.setText(editTextInput.length()+" / 80 byte");
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });



    }

}
