package com.example.tugasnomer1.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugasnomer1.R;
import com.example.tugasnomer1.models.Hewan;

import java.util.List;

public class HewanAdapter extends RecyclerView.Adapter<HewanAdapter.MyViewHolder>{

    List<Hewan> hewanList;

    public HewanAdapter(List<Hewan> hewanList) {
        this.hewanList = hewanList;
    }

    @NonNull
    @Override
    public HewanAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //object context diambil dari parent
        Context context = parent.getContext();
        //object context digunakan untuk membuat object layoutInflater
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        //object layoutInflater digunakan untuk membuat object view yang merupakan hasil inflate  layout ( mengubungkan adapter degnan layout)
        View hewanView = layoutInflater.inflate(R.layout.item_hewan,parent,false);
        //object superHeroView digunakan untuk membuat object viewHolder
        MyViewHolder viewHolder = new MyViewHolder(hewanView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HewanAdapter.MyViewHolder holder, int position) {
        //ambil satu item hero
        Hewan hewan = hewanList.get(position);
        //set text heroName berdasarkan data dari model hero
        holder.hewanName.setText(hewan.getHewanName());
        holder.hewanGambar.setImageDrawable(hewan.getHewanGambar());
    }

    @Override
    public int getItemCount() {
        return (hewanList != null) ? hewanList.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView hewanName;
        public ImageView hewanGambar;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
//            TextView heroName = itemView.findViewById(R.id.heroName);
            hewanName = itemView.findViewById(R.id.hewanName);
            hewanGambar = itemView.findViewById(R.id.hewanGambar);
//            TextView heroName = itemView.findViewById(R.id.heroName);
        }
    }
}
