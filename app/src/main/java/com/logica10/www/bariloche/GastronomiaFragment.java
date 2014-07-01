package com.logica10.www.bariloche;

/**
 * Created by Carlos on 29/06/2014.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
public class GastronomiaFragment extends Fragment{
    @Override
    public android.view.View onCreateView(LayoutInflater inflater, ViewGroup container,
                                          Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.gastronomia_layout, container, false);
    }
}
