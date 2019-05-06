package com.akmal.bangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Alas, Tinggi;
    TextView hasil ;
    Button Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tinggi = findViewById(R.id.Tinggi);
        hasil  = findViewById(R.id.hasil);
        Hasil  = findViewById(R.id.total);
        Alas = findViewById(R.id.alas);


        Hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Alas.getText().toString().isEmpty() || Tinggi.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "ISI RUMUS DULU", Toast.LENGTH_SHORT).show();

                }else {
                    hasil();
                }
            }

        });

    }

    void hasil(){
        int angka1 = Integer.parseInt(Alas.getText().toString());
        int angka2 = Integer.parseInt(Tinggi.getText().toString());


        int total = angka1 * angka2;
        hasil.setText(String.valueOf(total));

    }

    }

