package com.example.prmtptr.exa_1202154292_modul2;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Button a;
    private RadioGroup b;
    private RadioButton c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = (Button) findViewById(R.id.pesan);
        b = (RadioGroup) findViewById(R.id.pilihmenu);
        c = (RadioButton) findViewById(R.id.dine);
        d = (RadioButton) findViewById(R.id.take);
    }

    public void pesan (View view) {
        b = (RadioGroup) findViewById(R.id.pilihmenu);
        c = (RadioButton) findViewById(R.id.dine);
        d = (RadioButton) findViewById(R.id.take);
    }

    public void pilih (View view) {
        int selectedItem = b.getCheckedRadioButtonId();
        if (selectedItem == c.getId()){
            Toast.makeText(this, "Anda memiilih Dine In", Toast.LENGTH_LONG).show();

            Intent a = new Intent(MainActivity.this, DineIn.class);
            startActivity(a);
        }
        else if (selectedItem == d.getId()){
            Toast.makeText(this, "Anda memiilih Take Away", Toast.LENGTH_LONG).show();

            Intent a = new Intent(MainActivity.this, TakeAway.class);
            startActivity(a);
        }
    }
    public void pilihpesanan(View view){
        //mengecek button
        boolean pesan = ((RadioButton) view).isChecked();

        //cek button apa yg di pilih
        switch (view.getId()){
            case R.id.take:
            if (pesan)
                //method utk menampilkan pesanan dan pindah ke take away
                take();
                break;
            case R.id.dine:
            if (pesan)
                //method utk menampilkan pesanan dan pindah ke dinein
                dine();
                break;
        }
    }

    private void dine(){
        //utk menampilkan dine
        Toast.makeText(this, "Anda Memilih Dine In",Toast.LENGTH_LONG).show();

        //pindah ke layout dine in
        Intent a = new Intent(MainActivity.this, DineIn.class);
        startActivity(a);
    }
    private void take(){
        Toast.makeText(this, "Anda Memilih Take Away", Toast.LENGTH_LONG).show();
        Intent a = new Intent(MainActivity.this, TakeAway.class);
        startActivity(a);
    }
}
