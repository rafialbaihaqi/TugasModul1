package com.rafialbaihaqi.tugasmodul1pbo;

public class DaftarMaBa {
    private String nama, asal, nomor;

    //Constructor Pertama tanpa menggunakan parameter
    public DaftarMaBa(){}

    //Constuctor untuk nama
    public DaftarMaBa(String nama) {
        this.nama = nama;
    }

    //Constuctor untuk nama dan asal
    public DaftarMaBa(String nama, String asal) {
        this.nama = nama;
        this.asal = asal;
    }

    //Constructor untuk nama, asal, nomor
    public DaftarMaBa(String nama, String asal, String nomor) {
        this.nama = nama;
        this.asal = asal;
        this.nomor = nomor;
    }

    //Getter & Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
}
