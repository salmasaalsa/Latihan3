package com.example.latihan3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context ctx;

    public Integer[] datagambar = {
            R.mipmap.jakarta, R.mipmap.bandung, R.mipmap.bogor, R.mipmap.depok, R.mipmap.surabaya
    };

    public ImageAdapter(Context c){
        ctx = c;
    }

    @Override
    public int getCount() {
        return datagambar.length;
    }

    @Override
    public Object getItem(int position) {
        return datagambar[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgView = new ImageView(ctx);
        imgView.setImageResource(datagambar[position]);
        imgView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imgView.setLayoutParams(new GridView.LayoutParams( 160, 160));
        return imgView;
    }
}
