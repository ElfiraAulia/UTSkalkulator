package com.example.luaspersegipanjang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edPanjang, edLebar, edLuas, edKeliling;
    Button btPersegi, btSegitiga, btLingkaran;
    double panjang, lebar, luas, Keliling, alas, tinggi, diameter, jarijari;
    private Object view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edPanjang = findViewById(R.id.edPanjang);
        edLebar = findViewById(R.id.edLebar);
        edLuas = findViewById(R.id.edLuas);
        edKeliling = findViewById(R.id.edKeliling);
        btPersegi = findViewById(R.id.btPersegi);
        btSegitiga = findViewById(R.id.btSegitiga);
        btLingkaran = findViewById(R.id.btLingkaran);

        btPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                panjang =Double.parseDouble(edPanjang.getText().toString());
                lebar =Double.parseDouble(edLebar.getText().toString());

                luas = panjang*lebar;
                Keliling = 2 * (panjang+lebar);

                edLuas.setText(""+ luas);
                edKeliling.setText(""+ Keliling);
            }
        });

        btSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alas = Double.parseDouble(edPanjang.getText().toString());
                tinggi = Double.parseDouble(edLebar.getText().toString());

                luas=alas*tinggi/2;
                Keliling=alas+alas+alas;

                edLuas.setText(""+ luas);
                edKeliling.setText(""+ Keliling);
            }
        });

        btLingkaran.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            diameter = Double.parseDouble(edPanjang.getText().toString());
            jarijari = Double.parseDouble(edLebar.getText().toString());

            luas=3.14*jarijari*jarijari;
            Keliling=3.14*diameter;

            edLuas.setText(""+luas);
            edKeliling.setText(""+Keliling);
        }
    });


    }
}