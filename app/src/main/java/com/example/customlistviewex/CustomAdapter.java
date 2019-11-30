package com.example.customlistviewex;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CustomAdapter extends BaseAdapter
{
    Context mContext;
    String[] mfruits;
    int[] mimages;
    String[] mtaste;


    public CustomAdapter(MainActivity context, String[] fruits, int[] images, String[] taste)
    {
        this.mContext= context;
        mfruits = fruits;
        mimages=images;
        mtaste = taste;

    }

    @Override
    public int getCount() {
        return mfruits.length;
    }

    @Override
    public Object getItem(int i) {
        return mfruits[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        view=layoutInflater.inflate(R.layout.list_row, null);
        TextView txtname= (TextView)view.findViewById(R.id.txtname);
        txtname.setText(mfruits[i]);
        TextView txttaste= (TextView)view.findViewById(R.id.txtaste);
        txttaste.setText(mtaste[i]);
        ImageView ivimage = (ImageView)view.findViewById(R.id.ivimage);
        ivimage.setBackgroundResource(mimages[i]);
        return view;
    }
}
