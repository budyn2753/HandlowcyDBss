package com.example.darek.handlowiec;

/**
 * Created by Darek on 2017-09-13.
 */

public class produkty {
    private int id;
    private String nazwa;
    private float cena;
    private int ilosc;
    private String informacjedodatkowe;

    produkty(int id_k, String nazwa_k, float cena_k,int ilosc_k, String informacjedodatkowe_k){
        setId(id_k);
        setNazwa(nazwa_k);
        setCena(cena_k);
        setIlosc(ilosc_k);
        setInformacjedodatkowe(informacjedodatkowe_k);
    }

    produkty(int id_k, String nazwa_k, float cena_k){
        setId(id_k);
        setNazwa(nazwa_k);
        setCena(cena_k);
    }

    produkty(int id_k){
        setId(id_k);
    }

    produkty(produkty xxx, int ilosc_k){
        this.setId(xxx.getId());
        setNazwa(xxx.getNazwa());
        setCena(xxx.getCena());
        setIlosc(ilosc_k);
    }

    @Override
    public boolean equals(Object object)
    {
        boolean sameSame = false;

        if (object != null && object instanceof produkty)
        {
            sameSame = this.getId() == ((produkty) object).getId();
        }

        return sameSame;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

    public String getInformacjedodatkowe() {
        return informacjedodatkowe;
    }

    public void setInformacjedodatkowe(String informacjedodatkowe) {
        this.informacjedodatkowe = informacjedodatkowe;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }
}
