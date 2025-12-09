package com.example.myapplication;

public class Przepis {
    private String nazwaPrzepisu;
    private String kategoria;
    private int idObrazka;
    private String skladniki;
    private String opis;

    private int idPrzepisu;

    private static int licznikPrzepisow = 0;
    public Przepis(String nazwaPrzepisu) {
        this.nazwaPrzepisu = nazwaPrzepisu;
        kategoria = "Desery";
        idObrazka = R.drawable.chocolate;
        skladniki = "";
        opis = "";
        licznikPrzepisow++;
        idPrzepisu = licznikPrzepisow;
    }

    public Przepis(String nazwaPrzepisu, String kategoria, int idObrazka, String skladniki, String opis) {
        this.nazwaPrzepisu = nazwaPrzepisu;
        this.kategoria = kategoria;
        this.idObrazka = idObrazka;
        this.skladniki = skladniki;
        this.opis = opis;
        licznikPrzepisow++;
        idPrzepisu = licznikPrzepisow;
    }

    public String getNazwaPrzepisu() {
        return nazwaPrzepisu;
    }

    public void setNazwaPrzepisu(String nazwaPrzepisu) {
        this.nazwaPrzepisu = nazwaPrzepisu;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public void setIdObrazka(int idObrazka) {
        this.idObrazka = idObrazka;
    }

    public String getSkladniki() {
        return skladniki;
    }

    public void setSkladniki(String skladniki) {
        this.skladniki = skladniki;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public String toString() {
        return nazwaPrzepisu;
    }

    public int getIdPrzepisu() {
        return idPrzepisu;
    }

    public void setIdPrzepisu(int idPrzepisu) {
        this.idPrzepisu = idPrzepisu;
    }

    public static int getLicznikPrzepisow() {
        return licznikPrzepisow;
    }

    public static void setLicznikPrzepisow(int licznikPrzepisow) {
        Przepis.licznikPrzepisow = licznikPrzepisow;
    }
}