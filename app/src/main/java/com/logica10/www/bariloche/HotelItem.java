package com.logica10.www.bariloche;

/**
 * Created by Carlos on 04/07/2014.
 */
public class HotelItem {
    public int id;
    public String titulo;
    public String foto;
    public int estrellas;
    public String tel;

    public HotelItem(int id, String titulo, String foto, int estrellas, String tel){
        this.id = id;
        this.titulo = titulo;
        this.foto = foto;
        this.estrellas = estrellas;
        this.tel = tel;
    }
}
