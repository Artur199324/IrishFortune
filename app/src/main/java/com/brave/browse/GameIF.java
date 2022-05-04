package com.brave.browse;

import android.widget.ImageView;

import java.util.Random;

public class GameIF {

   private int vsdvs;
   private int dsds;

    public int getVsdvs() {
        return vsdvs;
    }

    public void setVsdvs(int vsdvs) {
        this.vsdvs = vsdvs;
    }

    public int getDsds() {
        return dsds;
    }

    public void setDsds(int dsds) {
        this.dsds = dsds;
    }

    public GameIF() {
    }

    public void crateIF(ImageView dsfsd){
        dsfsd.setY(rnd(getDsds()/2, getDsds()- getDsds()/6));
        dsfsd.setX(rnd(0+dsfsd.getWidth(), getVsdvs()-dsfsd.getWidth()+100));
    }

    public void jdd(ImageView erwq){
        erwq.setY(rnd(0+200, getDsds()/2));
        erwq.setX(getVsdvs());
    }

    public void hfh(ImageView hyte){
        hyte.setX(hyte.getX() - 10);
    }

    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public void jjj(ImageView hyy , ImageView bbgf,ImageView bgfd){
        Random random = new Random();
        switch (random.nextInt(3)){
            case 0:
                hyy.setTag(1);
                bbgf.setTag(0);
                bgfd.setTag(0);
                break;
            case 1:
                hyy.setTag(0);
                bbgf.setTag(1);
                bgfd.setTag(0);
                break;
            case 2:
                hyy.setTag(0);
                bbgf.setTag(0);
                bgfd.setTag(1);
                break;
        }

    }
}
