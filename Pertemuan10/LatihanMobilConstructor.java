class Mobil {

    String merk;
    String warna;
    int tahun;

    Mobil() {
        merk = "Belum diisi";
        warna = "Belum diisi";
        tahun = 0;
    }

    Mobil(String merk) {
        this.merk = merk;
        this.warna = "Belum diisi";
        this.tahun = 0;
    }

    Mobil(String merk, String warna, int tahun) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }

    void tampilkanSpesifikasi() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk  : " + merk);
        System.out.println("Warna : " + warna);
        System.out.println("Tahun : " + tahun);
        System.out.println();
    }
}

public class LatihanMobilConstructor {
    public static void main(String[] args) {

        Mobil mobil1 = new Mobil();
        Mobil mobil2 = new Mobil("Toyota");
        Mobil mobil3 = new Mobil("Honda Civic", "Merah", 2023);

        mobil1.tampilkanSpesifikasi();
        mobil2.tampilkanSpesifikasi();
        mobil3.tampilkanSpesifikasi();
    }
}
/*
Naufrisya Rizqy Syabilla
D1041241081
senin, 9 Maret 2026
*/