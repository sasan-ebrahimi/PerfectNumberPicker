package com.sasanebrahimi.perfectnumberpickerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.sasanebrahimi.perfectnumberpicker.PerfectNumberPicker;

public class SampleActivity extends AppCompatActivity {

    PerfectNumberPicker np;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        np = findViewById(R.id.npMaxOrder);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SampleActivity.this ,"" + np.getValue() , Toast.LENGTH_LONG ).show();
            }
        });
    }
}
