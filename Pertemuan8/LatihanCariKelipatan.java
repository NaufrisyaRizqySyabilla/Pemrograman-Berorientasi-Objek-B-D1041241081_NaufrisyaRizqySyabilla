package Pertemuan8;

public class LatihanCariKelipatan {

    public static void main(String[] args) {

        System.out.println("=== CARI KELIPATAN 7 ===");

        for (int i = 1; i <= 50; i++) {
            System.out.println("Cek: " + i);

            if (i % 7 == 0) {
                System.out.println("Kelipatan 7 pertama: " + i);
                break;
            }
        }

        System.out.println("Pencarian selesai.");
    }
}

/*
Naufrisya Rizqy Syabilla
D1041241081
Kamis, 26 Februari 2026
*/