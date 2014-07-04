package com.logica10.www.bariloche;

/**
 * Created by Carlos on 04/07/2014.
 *
 */
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.logica10.www.bariloche.HotelItem;

import java.util.HashMap;
import java.util.Map;

public class ArrayAdapterHoteles extends ArrayAdapter<HotelItem> {
    Context mContext;
    int layoutResourceId;
    HotelItem data[] = null;
    HashMap<String,Integer> map;

    public ArrayAdapterHoteles(Context mContext, int layoutResourceId, HotelItem[] data, HashMap<String,Integer> map) {

        super(mContext, layoutResourceId, data);

        this.layoutResourceId = layoutResourceId;
        this.mContext = mContext;
        this.data = data;
        this.map = map;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        /*
         * The convertView argument is essentially a "ScrapView" as described is Lucas post
         * http://lucasr.org/2012/04/05/performance-tips-for-androids-listview/
         * It will have a non-null value when ListView is asking you recycle the row layout.
         * So, when convertView is not null, you should simply update its contents instead of inflating a new row layout.
         */
        if(convertView==null){
            // inflate the layout
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            convertView = inflater.inflate(layoutResourceId, parent, false);
        }

        // object item based on the position
        HotelItem item = data[position];

        // get the TextView and then set the text (item name) and tag (item ID) values
        TextView titulo = (TextView) convertView.findViewById(R.id.titulo);
        ImageView foto = (ImageView) convertView.findViewById(R.id.foto);
        TextView tel = (TextView) convertView.findViewById(R.id.tel);
        titulo.setText(item.titulo);
        tel.setText(item.tel);
        if (item.foto != "") {
            foto.setImageResource(map.get(item.foto));
        }

        return convertView;

    }
}
