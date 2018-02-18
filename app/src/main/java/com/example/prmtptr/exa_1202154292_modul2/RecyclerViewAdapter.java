package com.example.prmtptr.exa_1202154292_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;


/**
 * Created by prmtptr on 2/17/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<String> rvData, rvHarga;
    private ArrayList<Integer> gambar;

    public RecyclerViewAdapter (ArrayList<String> inputData, ArrayList<String> dataHarga, ArrayList<Integer> gmbr){
        rvData = inputData;
        rvHarga = dataHarga;
        gambar = gmbr;
    }

   // @Override
    //public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      //  return null;
   // }

    //@Override
    //public void onBindViewHolder(ViewHolder holder, int position) {

    //}

    //@Override
    //public int getItemCount() {
      //  return 0;
    //}

    public class ViewHolder extends RecyclerView.ViewHolder {
        //menggunakan integer dan string untuk setiap data
        public TextView tvTitle;
        public TextView tvSubtitle;
        public ImageView a;
        private RelativeLayout ItemList;

        private Context context;

        public ViewHolder (View v){
            super(v);

            //untuk mendapatkan context pd main activity
            context = itemView.getContext();
            //melakukan insiasi textview, imageview, dan linear layout
            tvSubtitle = (TextView) v.findViewById(R.id.tv_subtitle);
            tvTitle =  (TextView) v.findViewById(R.id.tv_title);
            a = (ImageView) v.findViewById(R.id.icon);
            ItemList = v.findViewById(R.id.list);
            ItemList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, DetailMakanan.class);
                    String ingredient = "";
                    switch (getAdapterPosition()){
                        case 0 :
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = "gula, air, madu";
                            intent.putExtra("Komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 1 :
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = "ketan, mangga, santan, gula";
                            intent.putExtra("Komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 2 :
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = "daging, garam, lada";
                            intent.putExtra("Komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 3 :
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = "kepiting, cabai bubuk, air, gula, garam";
                            intent.putExtra("Komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 4 :
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = "gula, strawberry, selai";
                            intent.putExtra("Komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 5 :
                            intent.putExtra("judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            ingredient = "ayam, gula, jamur, garam, air";
                            intent.putExtra("Komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                    }

                }
            });
        }
    }
    @Override
    public ViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
        //membuat view baru
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_list, parent, false);
        //set ukuran view, margin dan padding
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder (ViewHolder holder, int position){
        //mengaambil elemen dari dataset (arraylist) pada posisi tertentu
        //set isi view dengan elemen
        final String name = rvData.get(position);
        final String harga = rvHarga.get(position);
        final Integer text = gambar.get(position);
        holder.tvTitle.setText(name);
        holder.tvSubtitle.setText(harga);
        holder.a.setImageResource(text);
    }
    @Override
    public int getItemCount() {
        //menghitung jumlah data yang di tampilkan
        return rvData.size();
    }
}
