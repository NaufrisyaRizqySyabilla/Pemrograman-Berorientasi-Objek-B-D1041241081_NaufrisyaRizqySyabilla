package Pertemuan8;

public class LatihanMenuHarian {

    public static void main(String[] args) {

        System.out.println("=== MENU MAKAN 3 HARI ===");

        for (int hari = 1; hari <= 3; hari++) {
            System.out.println("Hari " + hari + ":");

            for (int waktu = 1; waktu <= 2; waktu++) {

                switch (hari) {

                    case 1:
                        if (waktu == 1) {
                            System.out.println("  Pagi: Nasi Goreng");
                        } else {
                            System.out.println("  Siang: Soto Ayam");
                        }
                        break;

                    case 2:
                        if (waktu == 1) {
                            System.out.println("  Pagi: Bubur Ayam");
                        } else {
                            System.out.println("  Siang: Mie Goreng");
                        }
                        break;

                    case 3:
                        if (waktu == 1) {
                            System.out.println("  Pagi: Roti Bakar");
                        } else {
                            System.out.println("  Siang: Nasi Uduk");
                        }
                        break;
                }
            }

            System.out.println(); 
        }
    }
}
/*
Naufrisya Rizqy Syabilla
D1041241081
kamis, 26 Februari 2026
*/