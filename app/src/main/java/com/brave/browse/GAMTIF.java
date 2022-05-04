package com.brave.browse;

import static com.brave.browse.AppIF.vieModIF;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GAMTIF extends AppCompatActivity {

    ImageView dshtht, vgt, fsbf;
    TextView dfg, jhhg;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamtif);

        dshtht = findViewById(R.id.imageView3);
        vgt = findViewById(R.id.imageView5);
        fsbf = findViewById(R.id.imageView7);
        dfg = findViewById(R.id.textView2);
        jhhg = findViewById(R.id.textView3);

        new Thread(new Runnable() {
            @Override
            public void run() {
                vieModIF.jdh(dshtht, vgt, fsbf);
            }
        }).start();

        dshtht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("weq", dshtht.getTag()+"");
                int a  = (int) dshtht.getTag();
                if ( a == 1){
                    dshtht.setImageResource(R.drawable.sss4);
                    jhhg.setVisibility(View.VISIBLE);
                    int as = getSharedPreferences(getPackageName(), MODE_PRIVATE).getInt("coun", 0);
                    getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putInt("coun", as+200).apply();
                }else {
                    dshtht.setImageResource(R.drawable.sss2);
                    dfg.setVisibility(View.VISIBLE);
                }
                fsbf.setClickable(false);
                vgt.setClickable(false);
                dshtht.setClickable(false);
            }
        });

        vgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("weq", vgt.getTag()+"");
                int a  = (int) vgt.getTag();
                if ( a == 1){
                    vgt.setImageResource(R.drawable.sss4);
                    jhhg.setVisibility(View.VISIBLE);
                    int as = getSharedPreferences(getPackageName(), MODE_PRIVATE).getInt("coun", 0);
                    getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putInt("coun", as+200).apply();
                }else {
                    vgt.setImageResource(R.drawable.sss2);
                    dfg.setVisibility(View.VISIBLE);
                }
                fsbf.setClickable(false);
                vgt.setClickable(false);
                dshtht.setClickable(false);
            }
        });

        fsbf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("weq", fsbf.getTag()+"");
                int a  = (int) fsbf.getTag();
                if ( a == 1){
                    fsbf.setImageResource(R.drawable.sss4);
                    jhhg.setVisibility(View.VISIBLE);
                    int as = getSharedPreferences(getPackageName(), MODE_PRIVATE).getInt("coun", 0);
                    getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putInt("coun", as+200).apply();
                }else {
                    fsbf.setImageResource(R.drawable.sss2);
                    dfg.setVisibility(View.VISIBLE);
                }
                fsbf.setClickable(false);
                vgt.setClickable(false);
                dshtht.setClickable(false);
            }
        });
    }
}
