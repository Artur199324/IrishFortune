package com.brave.browse;

import static com.brave.browse.ApsIF.bbgd;
import static com.brave.browse.ApsIF.cdsvds;
import static com.brave.browse.ApsIF.bfdwax;
import static com.brave.browse.ApsIF.bgfds;
import static com.brave.browse.ApsIF.bbff;
import static com.brave.browse.ApsIF.zzs;
import static com.brave.browse.IF.dd;
import static com.brave.browse.IF.gg;

import android.os.Bundle;
import android.util.Base64;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RulesIF extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rulif);

    }

    public static String decodeIF(String ssa){
        byte[] sals = android.util.Base64.decode(ssa, Base64.DEFAULT);
        return new String(sals);
    }

    public static String pac;
    public static String parseIF(String  dfsv){

        String gdvf;
        String vdfd;
        String vsdrs;
        String vdvfrs;
        String bfdz;
        String bbfg;
        String qqqws;
        String vfdx;
        String bbfdcs;
        String bbbd;

        String[] gdgrs = dfsv.split("_");

        try {
            gdvf = gdgrs[0];
        } catch (Exception e) {

            gdvf = "";
        }
        try {
            vdfd = gdgrs[1];
        } catch (Exception e) {

            vdfd = "";
        }
        try {
            vsdrs = gdgrs[2];
        } catch (Exception e) {
            vsdrs = "";

        }
        try {
            vdvfrs = gdgrs[3];
        } catch (Exception e) {
            vdvfrs = "";

        }
        try {
            bfdz = gdgrs[4];
        } catch (Exception e) {
            bfdz = "";
            ;
        }
        try {
            bbfg = gdgrs[5];
        } catch (Exception e) {
            bbfg = "";

        }

        try {
            qqqws = gdgrs[6];
        } catch (Exception e) {
            qqqws = "";
        }
        try {
            vfdx = gdgrs[7];
        } catch (Exception e) {
            vfdx = "";
        }
        try {
            bbfdcs = gdgrs[8];
        } catch (Exception e) {
            bbfdcs = "";
        }
        try {
            bbbd = gdgrs[9];
        } catch (Exception e) {
            bbbd = "";
        }


        String gdwfs[] = {decodeIF("P21lZGlhX3NvdXJjZT0="), bbff,
                decodeIF("JnN1YjE9"), gdvf,
                decodeIF("JnN1YjI9"), vdfd,
                decodeIF("JnN1YjM9"), vsdrs,
                decodeIF("JnN1YjQ9"), vdvfrs,
                decodeIF("JnN1YjU9"), bfdz,
                decodeIF("JnN1YjY9"), bbfg,
                decodeIF("JnN1Yjc9"), qqqws,
                decodeIF("JnN1Yjg9"), vfdx,
                decodeIF("JnN1Yjk9"), bbfdcs,
                decodeIF("JnN1YjEwPQ=="), bbbd,
                decodeIF("JmNhbXBhaWduPQ=="), bgfds,
                decodeIF("Jmdvb2dsZV9hZGlkPQ=="), bfdwax,
                decodeIF("JmFmX3VzZXJpZD0="), cdsvds,
                decodeIF("JmFmX2NoYW5uZWw9"), zzs,
                decodeIF("JmRldl9rZXk9"), bbgd,
                decodeIF("JmJ1bmRsZT0="), pac,
                decodeIF("JmZiX2FwcF9pZD0="),dd,
                decodeIF("JmZiX2F0PQ=="), gg};

        StringBuilder gdr = new StringBuilder();
        for (int i = 0; i < gdwfs.length; i++) {
            gdr.append(gdwfs[i]);
        }

        return gdr.toString();

    }
}
