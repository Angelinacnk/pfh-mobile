package com.example.countingclicks;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int count = 0; // Zähler
    private TextView textViewCount; // Anzeige Anzahl

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button) findViewById(R.id.button_count);
        textViewCount = (TextView) findViewById(R.id.text_view_count);

        // Zählt und aktualisiert Text
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                textViewCount.setText(String.valueOf(count));
            }
        });
    }
}