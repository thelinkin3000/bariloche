package com.logica10.www.bariloche;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;

/**
 * Created by Carlos on 12/07/2014.
 */
public class ArrayAdapterNV extends ArrayAdapter<NvItem>{
    Context mContext;
    int layoutResourceId;
    NvItem data[] = null;
    HashMap<Integer,Integer> map;

    public ArrayAdapterNV(Context mContext, int layoutResourceId, NvItem[] data, HashMap<Integer,Integer> map) {

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
        NvItem item = data[position];

        // Asigna toda la faena de los valores, una garcha
        TextView title = (TextView) convertView.findViewById(R.id.nvtitle);
        ImageView icon = (ImageView) convertView.findViewById(R.id.icon);
        title.setText(item.titulo);
        //TODO: POR QUÉ CARAJO ME TIRA ERROR ESTO icon.setImageResource(item.icon);

        return convertView;

    }
}
