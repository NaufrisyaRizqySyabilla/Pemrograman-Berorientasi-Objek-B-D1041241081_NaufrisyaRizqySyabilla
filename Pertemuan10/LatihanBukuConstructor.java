class Buku {
    String judul;
    String pengarang;
    int harga;

    Buku() {
        judul = "Belum diisi";
        pengarang = "Belum diisi";
        harga = 0;
    }

    Buku(String judul, String pengarang, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    void tampilkanInfo() {
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul     : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Harga     : Rp " + harga);
        System.out.println();
    }
}

public class LatihanBukuConstructor {
    public static void main(String[] args) {

        Buku buku1 = new Buku();
        Buku buku2 = new Buku("Pemrograman Java", "Budi Raharjo", 125000);
        Buku buku3 = new Buku("Algoritma dan Struktur Data", "Rinaldi Munir", 150000);

        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
        buku3.tampilkanInfo();
    }
}

/*
Naufrisya Rizqy Syabilla
D1041241081
senin, 9 Maret 2026
*/