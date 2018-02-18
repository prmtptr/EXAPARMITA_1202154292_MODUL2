package com.example.prmtptr.exa_1202154292_modul2;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class TakeAway extends AppCompatActivity {

    private EditText a,b,c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

        //melakukan inisiasi TextInputLayout dgn menggunakan id
        a = (EditText) findViewById(R.id.nama);
        b = (EditText) findViewById(R.id.nomor);
        c = (EditText) findViewById(R.id.alamat);
        d = (EditText) findViewById(R.id.catatan);
    }

    public void pilihpesan (View view) {
        String nama = a.getText().toString();
        String nomor = b.getText().toString();
        String alamat = c.getText().toString();
        String catatan = d.getText().toString();

        if (nama.isEmpty() || nomor.isEmpty() || alamat.isEmpty() || catatan.isEmpty()) {
            Toast.makeText(this, "Data Harus Di Isi", Toast.LENGTH_LONG).show();
        }
        //untuk mengirimkan data nama dan jumlah intent agar data bisa di ambil pd class tujuan
        Intent v = new Intent(TakeAway.this, ListPesanan.class);
        startActivity(v);
    }

   // public void showDatePickerDialog(View v) {
     //   DialogFragment newFragment = new DatePickerFragment();
       // newFragment.show(getSupportFragmentManager(), getString(R.string.date_picker));
//    }

  //  public void showTimePickerDialog(View view) {
    //    DialogFragment newFragment = new TimePickerFragment();
      //  newFragment.show(getSupportFragmentManager(), getString(R.string.time_picker));
    //}



    public void processDatePickerResult(int year, int month, int day) {

        a = (EditText) findViewById(R.id.nama);
        b = (EditText) findViewById(R.id.nomor);

        //membuat string nama dana jumlah untuk mengambil nilai dari TextInputLayout
        String nama = a.getText().toString();
        String nomor = b.getText().toString();

        if (nama.isEmpty() || nomor.isEmpty()) {
            Toast.makeText(this, "HARUS DI ISI", Toast.LENGTH_LONG).show();
        } else {

            //Memasukkan bulan pertama dan bulan selanjutnya
            String month_string = Integer.toString(month + 1);
            String day_string = Integer.toString(day);
            String year_string = Integer.toString(year);
            // Assign the concatenated strings to dateMessage.
            String dateMessage = (month_string + "/" + day_string + "/" + year_string);
            Toast.makeText(this, "Atas Nama : " + nama + "\n No Telepon : " + nomor + "\n Akan Mengambil pada : " + getString(R.string.date) + dateMessage, Toast.LENGTH_SHORT).show();
        }
    }

    public void processTimePickerResult(int hourOfDay, int minute) {
        //membuat string nama dana jumlah untuk mengambil nilai dari TextInputLayout
        String nama = a.getText().toString();
        String nomor = b.getText().toString();

        if (nama.isEmpty() || nomor.isEmpty()) {
            Toast.makeText(this, "Isi dulu bro", Toast.LENGTH_LONG).show();
        } else {


            // melakukan convert kedalam waktu
            String hour_string = Integer.toString(hourOfDay);
            String minute_string = Integer.toString(minute);
            String timeMessage = (hour_string + ":" + minute_string);
            Toast.makeText(this, "Atas Nama : " + nama + "\n No Telepon : " + nomor + "\n Akan Mengambil pada : " + getString(R.string.time) + timeMessage, Toast.LENGTH_SHORT).show();
        }
    }
}


