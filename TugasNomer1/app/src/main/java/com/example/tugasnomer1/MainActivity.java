package com.example.tugasnomer1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tugasnomer1.adapters.HewanAdapter;
import com.example.tugasnomer1.models.Hewan;

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
        Hewan hewan = new Hewan("Bebek", this.getResources().getDrawable(R.drawable.bebek_hewan));
        //menambahkan hero ke listSuperHero
        listHewan.add(hewan);
        //membuat object hero baru
        hewan = new Hewan("Gajah", this.getResources().getDrawable(R.drawable.gajah_hewan));
        //menambahkan hero ke listSuperHero
        listHewan.add(hewan);
        //Instansiasi Adapter
        HewanAdapter hewanAdapter = new HewanAdapter(listHewan);
        //set adapter dan layoutmanager
        rvHewan.setAdapter(hewanAdapter);
        rvHewan.setLayoutManager(new LinearLayoutManager(this));
    }
}
