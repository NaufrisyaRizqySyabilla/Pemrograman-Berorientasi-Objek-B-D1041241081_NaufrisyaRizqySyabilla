package Pertemuan9;

class Mobil{
    String merk;
    String warna;
    int tahun;
    int kecepatan;

    public void percepat(){
        System.out.println("Kecepatan: " + kecepatan);
    }

    public void tampilkanInfo(){
        System.out.println("Merk     : " + merk);
        System.out.println("Warna    : " + warna);
        System.out.println("Tahun    : " + tahun);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}

public class ObyekDanClass {
    public static void main(String[] args) {

        Mobil obj = new Mobil();
        obj.merk = "Toyota";
        obj.warna = "Hitam";
        obj.tahun = 2026;
        obj.kecepatan = 60;

        System.out.println("=== Informasi Mobil ===");
        obj.tampilkanInfo();
    }
}
/*
Naufrisya Rizqy Syabilla
D1041241081
senin, 9 Maret 2026
*/