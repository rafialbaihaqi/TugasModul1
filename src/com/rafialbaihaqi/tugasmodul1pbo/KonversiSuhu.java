package com.rafialbaihaqi.tugasmodul1pbo;

public class KonversiSuhu {
    //Method dengan menggunakan parameter tipe data integer
    void Celcius (int C){
        System.out.println("Konversi Suhu C -> F\t: " + ((C * 9 / 5) + 32));
    }

    void Fahrenheit (int F){
        System.out.println("Konversi Suhu F -> K\t: " + ((F - 32) * 5 / 9 + 273));
    }

    void Kelvin (int K){
        System.out.println("Konversi Suhu K -> R\t: " + ((K - 273) * 4 / 5));
    }

    void Reamur (int R){
        System.out.println("Konversi Suhu R -> C\t: " + (R * 5 / 4));
    }
    //main program
    public static void main(String[] args) {
        KonversiSuhu konversi = new KonversiSuhu();//deklarasi scanner

        System.out.println("=====Program Menghitung Konversi Suhu=====\n");
        //Memanggil method dari Celcius, Fahrenheit, Kelvin, Reamur
        konversi.Celcius(5);
        konversi.Fahrenheit(30);
        konversi.Kelvin(10);
        konversi.Reamur(4);
    }
}
