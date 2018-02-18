package com.example.prmtptr.exa_1202154292_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListPesanan extends AppCompatActivity {

    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataHarga;
    private ArrayList<String> dataMenu;
    private ArrayList<Integer> gambar;
    private TextView a,b;

    //daftar mmenu
    private String[] Judul = {"Pancake", "Mango Sticky Rice", "Rib Eye Steak", "Spicy Crab", "Macaron", "Chicken Soup with Mushroom"};
    private String[] test = {"Rp. 50.000","Rp. 37.000","Rp. 150.000","Rp. 120.000","Rp. 35.000","Rp. 1400.000"};
    private int[] Gambar = {R.drawable.pancake1 , R.drawable.mangosticky , R.drawable.ribeye , R.drawable.spicycrab , R.drawable.macaron , R.drawable.chickensoup};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pesanan);

        //mendekralarsikan array list untuk menu harga dan gambar
        dataMenu = new ArrayList<>();
        dataHarga = new ArrayList<>();
        gambar = new ArrayList<>();
        DaftarItem();

        rvView = (RecyclerView) findViewById(R.id.recyclerview);
        rvView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter (dataHarga, dataMenu, gambar);
        rvView.setAdapter(adapter);
    }
    private void DaftarItem(){
        for (int w=0; w<Judul.length; w++){
            dataMenu.add(Judul[w]);
            dataHarga.add(test[w]);
            gambar.add(Gambar[w]);
        }
    }
}
