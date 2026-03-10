public class LatihanPersegiConstructor {
    int sisi;
    int luas;
    int keliling;
    boolean error = false;

    LatihanPersegiConstructor(int sisi) {
        if (sisi <= 0) {
            this.sisi = 1;
            error = true;
        } else {
            this.sisi = sisi;
        }

        luas = this.sisi * this.sisi;
        keliling = 4 * this.sisi;
    }

    void tampilkanHasil() {

        if (error) {
            System.out.println("ERROR: Sisi tidak boleh <= 0. Diset ke default (1).");
        }

        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi     : " + sisi + " cm");
        System.out.println("Luas     : " + luas + " cm²");
        System.out.println("Keliling : " + keliling + " cm");
        System.out.println();
    }

    public static void main(String[] args) {

        LatihanPersegiConstructor p1 = new LatihanPersegiConstructor(5);
        LatihanPersegiConstructor p2 = new LatihanPersegiConstructor(-3);

        p1.tampilkanHasil();
        p2.tampilkanHasil();
    }
}

/*
Naufrisya Rizqy Syabilla
D1041241081
senin, 9 Maret 2026
*/
