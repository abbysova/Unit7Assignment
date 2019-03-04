package com.example.unit7assignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView FlooringSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Integer width = getText("wid");
        Integer length = getText("len");
        Integer total = width * length;
        FlooringSum= findViewById(R.id.FlooringSum);
        FlooringSum.setText("Width is \" + width + \" and length is \" + length +\n" +
                "                \" and flooring needed is\"+ total + \" .\"");



    }
}
