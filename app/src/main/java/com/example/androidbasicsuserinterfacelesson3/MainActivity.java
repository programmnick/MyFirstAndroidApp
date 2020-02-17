package com.example.androidbasicsuserinterfacelesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mybutton;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mybutton = findViewById(R.id.buttons);

        View.OnClickListener slushatel = new View.OnClickListener() {

            public void onClick(View v) {
                if (count == 1) {
                    mybutton.setText("ГИП-ГИП УРА! :)");
                    count++;
                }
                if (count == 0) {
                    mybutton.setText("УРА! :)");
                    count++;
                }
            }
        };

        mybutton.setOnClickListener(slushatel);
    }
}
