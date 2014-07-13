package com.logica10.www.bariloche;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.HashMap;

/**
 * Created by Carlos on 04/07/2014.
 */


public class HotelesActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.hoteles_cat_layout);
        setLista();

    }


    public void setLista(){

        // add your items, this can be done programatically
        // your items can be from a database
        HotelItem[] listaHoteles = new HotelItem[6];
        listaHoteles[0] = new HotelItem(1,"Hotelito","",3,"+543624586954");
        listaHoteles[1] = new HotelItem(1,"Hotelazo","",3,"+543624586954");
        listaHoteles[2] = new HotelItem(1,"Un Hotel","",3,"+543624586954");
        listaHoteles[3] = new HotelItem(1,"El Hotel","",3,"+543624586954");
        listaHoteles[4] = new HotelItem(1,"Hotel de los Enfermitos","",3,"+543624586954");
        listaHoteles[5] = new HotelItem(1,"Mi Hotel","",3,"+543624586954");



        // our adapter instance
        ArrayAdapterHoteles adapter = new ArrayAdapterHoteles(this, R.layout.hotel, listaHoteles,new HashMap<String, Integer>());

        // create a new ListView, set the adapter and item click listener
        ListView listViewItems = (ListView) findViewById(R.id.listViewHoteles);
        listViewItems.setAdapter(adapter);


    }
}
