package Pertemuan5;

public class LatihanDiskon {
    public static void main(String[] args) {

        double totalBelanja = 750000;   
        double persenDiskon;
        
        if (totalBelanja < 100000) {
            persenDiskon = 0.0;
        } else if (totalBelanja <= 499999) {
            persenDiskon = 0.05;
        } else if (totalBelanja <= 999999) {
            persenDiskon = 0.10;
        } else {
            persenDiskon = 0.15;
        }

        double diskon = totalBelanja * persenDiskon;
        double hargaAkhir = totalBelanja - diskon;

        System.out.println("=== KALKULATOR DISKON ===");
        System.out.println("Total Belanja: Rp " + totalBelanja);
        System.out.println("Diskon (" + (int)(persenDiskon*100) + "%): Rp " + diskon);
        System.out.println("Harga Akhir: Rp " + hargaAkhir);
        System.out.println("Anda hemat: Rp " + diskon);
    }
}
/*
Naufrisya Rizqy Syabilla
D1041241081
Senin, 23 Februari 2026
 */