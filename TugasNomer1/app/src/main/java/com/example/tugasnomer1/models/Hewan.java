package com.example.tugasnomer1.models;

import android.graphics.drawable.Drawable;

public class Hewan {
    public String hewanName;
    public Drawable hewanGambar;

    public Hewan(String hewanName, Drawable hewanGambar){
        this.hewanName = hewanName;
        this.hewanGambar = hewanGambar;
    }

    public String getHewanName() {
        return hewanName;
    }

    public void setHewanName(String hewanName) {
        this.hewanName = hewanName;
    }

    public Drawable getHewanGambar() {
        return hewanGambar;
    }

    public void setHewanGambar(Drawable hewanGambar) {
        this.hewanGambar = hewanGambar;
    }
}
