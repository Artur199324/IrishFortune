package com.brave.browse.ac;

import static com.brave.browse.AppIF.vieModIF;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.brave.browse.R;

import java.util.ArrayList;

public class GAMIF extends AppCompatActivity {

    ConstraintLayout vdes;
    ImageView vdfhy, bfb, gfts, mgfd;
    Display bfd;
    Button bdwa;
    TextView nngf;
    int vses;
    int bda;
    int bdaa = 0;
    Vibrator v;
    ArrayList<ImageView> arrayListWol;
    ArrayList<ImageView> arrayListBrd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayListWol = new ArrayList<>();
        arrayListBrd =  new ArrayList<>();
        bfd = getWindowManager().getDefaultDisplay();
        vses = bfd.getHeight();
        bda = bfd.getWidth();
        vieModIF.wh(vses, bda);
        vdes = findViewById(R.id.con);
        vdfhy = findViewById(R.id.imageView);
        bfb = findViewById(R.id.imageView2);
        gfts = findViewById(R.id.imageView4);
        bdwa = findViewById(R.id.buttonshot);
        nngf = findViewById(R.id.textView);
        mgfd = findViewById(R.id.imageView6);
        v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);


        mgfd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putInt("coun", bdaa).apply();
                Toast toast = Toast.makeText(getApplicationContext(), "Balls saved", Toast.LENGTH_SHORT);
                toast.show();
            }
        });


        int as = getSharedPreferences(getPackageName(), MODE_PRIVATE).getInt("coun", 0);

        if (as == 0){
            nngf.setText("You points : " + bdaa);
        }else {
            bdaa = as;
            nngf.setText("You points : " + bdaa);
        }

        bdwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0 ; i<arrayListBrd.size();i++){
                    ImageView dsfs = arrayListBrd.get(i);
                    Rect esv = new Rect();
                    dsfs.getHitRect(esv);
                    Rect sds = new Rect();
                    gfts.getHitRect(sds);
                    if (Rect.intersects(esv, sds)) {
                        vdes.removeView(dsfs);
                        arrayListBrd.remove(i);
                        Log.d("weq","111");
                        bdaa +=100;
                        v.vibrate(100);
                        nngf.setText("You points : " + bdaa);
                    }
                }

                for (int i = 0; i < arrayListWol.size();i++){
                    ImageView dfsa = arrayListWol.get(i);
                    Rect bdrs = new Rect();
                    dfsa.getHitRect(bdrs);
                    Rect bbd = new Rect();
                    gfts.getHitRect(bbd);
                    if (Rect.intersects(bdrs, bbd)) {
                        vdes.removeView(dfsa);
                        arrayListWol.remove(i);
                        Log.d("weq","222");
                        bdaa +=50;
                        nngf.setText("You points : " + bdaa);
                        v.vibrate(100);
                    }
                }
            }
        });

        vdfhy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), IFBU.class));
                finishAffinity();
            }
        });

        bfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), RulesIF.class));

            }
        });



        new Thread(new Runnable() {
            @Override
            public void run() {
                vdes.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        gfts.setY(motionEvent.getY()- gfts.getHeight()/2);
                        gfts.setX(motionEvent.getX()- gfts.getWidth()/2);
                        return false;
                    }
                });
            }
        }).start();

        Handler bbfd = new Handler();

        bbfd.post(new Runnable() {
            @Override
            public void run() {
                ImageView dsa = new ImageView(GAMIF.this);
                dsa.setImageResource(R.drawable.wol);
                ConstraintLayout.LayoutParams imageViewLayoutParams =
                        new ConstraintLayout.LayoutParams(bda /5, bda /5);
                vdes.addView(dsa);
                dsa.setLayoutParams(imageViewLayoutParams);
                vieModIF.gg(dsa);
                arrayListWol.add(dsa);
                bbfd.postDelayed(this::run,1000);
            }
        });


        bbfd.post(new Runnable() {
            @Override
            public void run() {
                ImageView dhss = new ImageView(GAMIF.this);
                dhss.setImageResource(R.drawable.brd);
                ConstraintLayout.LayoutParams cssc =
                        new ConstraintLayout.LayoutParams(bda /5, bda /5);
                vdes.addView(dhss);
                dhss.setLayoutParams(cssc);
                vieModIF.hgf(dhss);
                arrayListBrd.add(dhss);
                bbfd.postDelayed(this::run,2000);
            }
        });

        bbfd.post(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<arrayListBrd.size();i++){
                    ImageView vses = arrayListBrd.get(i);
                    vieModIF.jdj(vses);
                    if (vses.getX()<0){
                        vdes.removeView(vses);
                        arrayListBrd.remove(i);
                        bdaa -=10;
                        nngf.setText("You points : " + bdaa);
                    }
                }

                bbfd.postDelayed(this::run,10);
            }
        });

        bbfd.post(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<arrayListWol.size();i++){
                    ImageView vsfes = arrayListWol.get(i);
                    arrayListWol.remove(vsfes);
                    vdes.removeView(vsfes);
                    bdaa -=10;
                    nngf.setText("You points : " + bdaa);
                }

                bbfd.postDelayed(this::run,1200);
            }
        });

    }
}