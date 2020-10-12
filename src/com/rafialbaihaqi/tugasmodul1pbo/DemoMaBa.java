package com.rafialbaihaqi.tugasmodul1pbo;

public class DemoMaBa {
    public static void main(String[] args) {
        DaftarMaBa arrayMaba[] = new DaftarMaBa[3];

        DaftarMaBa maba1 = new DaftarMaBa();//Membuat objek
        //pemanggilan setnama, setnomor, set asal
        maba1.setNama("Rafi");//memanggil setnama
        maba1.setNomor(String.valueOf(852));
        maba1.setAsal("Tegal");

        DaftarMaBa maba2 = new DaftarMaBa("Varel", "Jakarta", String.valueOf(853));
        DaftarMaBa maba3 = new DaftarMaBa("Alvin", "Tegal", String.valueOf(888));

        //Deklarasi array untuk maba
        arrayMaba[0] = maba1;
        arrayMaba[1] = maba2;
        arrayMaba[2] = maba3;

        System.out.println("==========STUDENT REGISTRATION==========");
        System.out.println("Welcome To Bulakpacing University");

        //Output program
        for (DaftarMaBa x : arrayMaba){
            System.out.println("Mahasiswa Baru");
            System.out.println("Nama\t: " + x.getNama());
            System.out.println("Nomor\t: " + x.getNomor());
            System.out.println("Asal\t: " + x.getAsal());
            System.out.println("Selamat Anda Berhasil Registrasi!");
            System.out.println();
        }
    }
}
