package com.example.terremotosapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lista_terremotos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista_terremotos=findViewById(R.id.TerremotosList);

        ArrayList<Terremoto> terremotos = new ArrayList<>();

        terremotos.add(new Terremoto("1","tuGfa"));
        terremotos.add(new Terremoto("1","tuGfa"));
        terremotos.add(new Terremoto("1","tuGfa"));


        TerremotoAdapter terremotoAdapter = new TerremotoAdapter(this,R.layout.item_terremoto_helps,terremotos);
        lista_terremotos.setAdapter(terremotoAdapter);

    }
}
