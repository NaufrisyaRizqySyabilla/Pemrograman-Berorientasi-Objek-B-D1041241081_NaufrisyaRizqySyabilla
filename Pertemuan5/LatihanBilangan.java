package Pertemuan5;

public class LatihanBilangan {
    public static void main(String[] args) {

        int number = 12;   
        System.out.println("=== PEMERIKSAAN BILANGAN ===");
        System.out.println("Bilangan: " + number);

        if (number > 0) {
            System.out.println("Jenis: Bilangan positif");
            String tipe = (number % 2 == 0) ? "Genap" : "Ganjil";
            System.out.println("Tipe: " + tipe);

        } else if (number < 0) {
            System.out.println("Jenis: Bilangan negatif");
            String tipe = (number % 2 == 0) ? "Genap" : "Ganjil";
            System.out.println("Tipe: " + tipe);

        } else {
            System.out.println("Jenis: Nol");
        }
    }
}

/*
Naufrisya Rizqy Syabilla
D1041241081
Senin, 23 Februari 2026
 */