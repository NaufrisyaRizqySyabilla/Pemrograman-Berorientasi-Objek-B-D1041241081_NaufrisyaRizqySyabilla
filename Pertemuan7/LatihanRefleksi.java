package Pertemuan7;

public class LatihanRefleksi {

    public static void main(String[] args) {

        System.out.println("=== MENGGUNAKAN WHILE ===");
        int a = 1;
        while (a <= 5) {
            System.out.print(a + " ");
            a++;
        }

        System.out.println("\n");

        System.out.println("=== MENGGUNAKAN DO-WHILE ===");
        int b = 1;
        do {
            System.out.print(b + " ");
            b++;
        } while (b <= 5);

        System.out.println("\n");

        System.out.println("=== MENGGUNAKAN FOR ===");
        for (int c = 1; c <= 5; c++) {
            System.out.print(c + " ");
        }
    }
}

/*
Refleksi:
Menurut saya, loop yang paling mudah dipahami untuk kasus ini adalah for loop,
karena penulisan inisialisasi, kondisi, dan increment berada dalam satu baris.
Strukturnya lebih ringkas dan jelas ketika digunakan untuk perulangan
yang jumlahnya sudah diketahui (misalnya dari 1 sampai 5).
*/

/*
Naufrisya Rizqy Syabilla
D1041241081
Rabu, 25 Februari 2026
*/