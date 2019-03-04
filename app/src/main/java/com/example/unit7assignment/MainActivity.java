package com.example.unit7assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button resultBtn;
    EditText RWInput;
    EditText RLInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultBtn = findViewById(R.id.resultBtn);
        RWInput = findViewById(R.id.RWInput);
        RLInput = findViewById(R.id.RLInput);
        resultBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Integer wid = Integer.parseInt(RWInput.getText().toString());
                Integer len = Integer.parseInt(RLInput.getText().toString());
                Integer total;
                Intent intent = new Intent(view.getContext(), Main2Activity.class);
                startActivity(intent);
                total = wid * len;
            }
        }
    }



    }
}
