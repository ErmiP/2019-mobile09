package com.example.tugasnomer2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tugasnomer2.adapters.HewanAdapter;
import com.example.tugasnomer2.models.Hewan;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvHewan;
    List<Hewan> listHewan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menyambungkan rvSuperHero ke layout
        rvHewan = findViewById(R.id.rvHewan);
        //Membuat object hero
        Hewan hewan = new Hewan("Kucing", this.getResources().getDrawable(R.drawable.kucing_hewan));
        //menambahkan hero ke listSuperHero
        listHewan.add(hewan);
        //membuat object hero baru
        hewan = new Hewan("Anjing", this.getResources().getDrawable(R.drawable.anjing_hewan));
        //menambahkan hero ke listSuperHero
        listHewan.add(hewan);
        //Instansiasi Adapter
        HewanAdapter hewanAdapter = new HewanAdapter(listHewan);
        //set adapter dan layoutmanager
        rvHewan.setAdapter(hewanAdapter);
        rvHewan.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }
}
