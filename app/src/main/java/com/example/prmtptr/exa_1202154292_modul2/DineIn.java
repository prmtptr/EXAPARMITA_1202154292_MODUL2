package com.example.prmtptr.exa_1202154292_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class DineIn extends AppCompatActivity {

    private EditText a, b;
    private Spinner c;
    String mSpinnerlabel = "";

    // @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        c = (Spinner) findViewById(R.id.nomeja);

        //memanggil array untuk menampung data yang ada pada spinner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.labels_array,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //jika spinner tidak null maka akan di set sesuai isi yang kita masukan di string.xml
        if (c !=null){
            c.setAdapter(adapter);
        }
    }

    public void pilihpesanan (View view){
        //inisiasi edit text
        a = (EditText) findViewById(R.id.nama);

        //membuat string test agar spinner dapat di pilih
        String test = c.getSelectedItem().toString();

        //jika spinner null
        if (a == null){
            Toast.makeText(this, "Data Harus Diisi", Toast.LENGTH_LONG).show();
        }
        //jika di pilih meja 1 maka akan muncul toast kalau kita memilih meja satu
        else if (test.equalsIgnoreCase("Meja 1")){
            String nama = a.getText().toString();
            Toast.makeText(this, "Anda " + nama + "Memilih Meja 1", Toast.LENGTH_LONG).show();
        }
        else if (test.equalsIgnoreCase("Meja 2")){
            String nama = a.getText().toString();
            Toast.makeText(this, "Anda " + nama + "Memilih Meja 2", Toast.LENGTH_LONG).show();
        }
        else if (test.equalsIgnoreCase("Meja 3")){
            String nama = a.getText().toString();
            Toast.makeText(this, "Anda " + nama + "Memilih Meja 3", Toast.LENGTH_LONG).show();
        }
        else if (test.equalsIgnoreCase("Meja 4")){
            String nama = a.getText().toString();
            Toast.makeText(this, "Anda " + nama + "Memilih Meja 4", Toast.LENGTH_LONG).show();
        }
        else if (test.equalsIgnoreCase("Meja 5")){
            String nama = a.getText().toString();
            Toast.makeText(this, "Anda " + nama + "Memilih Meja 5", Toast.LENGTH_LONG).show();
        }
        //mengirimkan data (nama dan jumlah) kedalam intent agar data bisa di ambil oleh class tujuan
        Intent v = new Intent(DineIn.this, ListPesanan.class);
        startActivity(v);
    }

    }
