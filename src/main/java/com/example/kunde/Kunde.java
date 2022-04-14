package com.example.kunde;

public class Kunde {
    private String fornavn;
    private String adresse;

    public Kunde(String fornavn,String adresse){
        this.fornavn=fornavn;
        this.adresse=adresse;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
