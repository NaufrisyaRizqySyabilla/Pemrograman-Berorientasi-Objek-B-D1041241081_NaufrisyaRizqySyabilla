package Pertemuan7;

public class LatihanValidasi {
    public static void main(String[] args) {
        System.out.println("=== VALIDASI NILAI UJIAN ===");

        int[] percobaan = {-10, 150, 85};
        int i = 0;
        int nilai;

        do {
            nilai = percobaan[i];
            System.out.println("\nPercobaan input: " + nilai);

            if (nilai < 0 || nilai > 100) {
                System.out.println("Error: Nilai harus antara 0-100!");
            } else {
                System.out.println("Nilai valid: " + nilai);
            }

            i++;
        } while (nilai < 0 || nilai > 100);
    }
}
/*
Naufrisya Rizqy Syabilla
D1041241081
Rabu, 25 Februari 2026
*/