package com.example.ctof_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button bc;
    private EditText celsious;
    private EditText farhrenheit;
    private Button bv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        celsious = (EditText) findViewById(R.id.cel);
        farhrenheit = (EditText) findViewById(R.id.far);
        bc = (Button) findViewById(R.id.bc);
        bv = (Button) findViewById(R.id.bv);

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double cel = Double.parseDouble(celsious.getText().toString());
                double far = cel*1.8+32;
                farhrenheit.setText(String.valueOf(far));
            }
        });

        bv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double far = Double.parseDouble(farhrenheit.getText().toString());
                double cel = (far-32)/1.8;
                celsious.setText(String.valueOf(cel));
            }
        });
    }
}