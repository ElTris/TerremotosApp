package com.example.terremotosapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class TerremotoAdapter extends ArrayAdapter<Terremoto> {
    private ArrayList<Terremoto> terremotoArrayList;
    private Context context;
    private int id;

    public TerremotoAdapter(Context context, int resource,List<Terremoto> objects) {
        super(context, resource, objects);
        this.context=context;
        this.id=resource;
        terremotoArrayList = new ArrayList<>(objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView,ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rootvew = layoutInflater.inflate(id,null);

        TextView magnitudeTXT = (TextView) rootvew.findViewById(R.id.txtmagnitude);
        TextView placeTXT = (TextView) rootvew.findViewById(R.id.txtplace);

        Terremoto terremoto = terremotoArrayList.get(position);

        magnitudeTXT.setText(terremoto.getMagnitude());
        placeTXT.setText(terremoto.getPlace());

        return rootvew;
    }
}
