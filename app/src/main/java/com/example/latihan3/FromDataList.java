package com.example.latihan3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class FromDataList extends AppCompatActivity {
    String kota;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_from_list);
        ImageView iv_sample = findViewById(R.id.iv_satu);
        TextView tv_sample = findViewById(R.id.tv_sample);


        Bundle b = getIntent().getExtras();
        if (b != null){
            kota = b.getString( "kota");

        }

        if (kota.equals("bdg")) {
            iv_sample.setImageResource(R.mipmap.bandung);
            tv_sample.setText(R.string.bandung);
        }else if (kota.equals("jkt")) {
            iv_sample.setImageResource(R.mipmap.jakarta);
            tv_sample.setText(R.string.jakarta);
        }else if (kota.equals("dpk")) {
            iv_sample.setImageResource(R.mipmap.depok);
            tv_sample.setText(R.string.depok);
        }else if (kota.equals("bgr")) {
            iv_sample.setImageResource(R.mipmap.bogor);
            tv_sample.setText(R.string.bogor);
        }else if (kota.equals("srby")) {
            iv_sample.setImageResource(R.mipmap.surabaya);
            tv_sample.setText(R.string.surabaya);
        }else{}
        };
        }


