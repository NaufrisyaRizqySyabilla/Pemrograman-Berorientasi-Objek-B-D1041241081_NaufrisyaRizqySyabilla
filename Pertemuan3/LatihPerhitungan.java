package Pertemuan3;

public class LatihPerhitungan {

    public static void main(String[] args) {

        //untuk menyimpan jumlah uang
        int saldo = 100000;

        //menampilkan saldo awal
        System.out.println("=== SIMULASI TRANSAKSI BANK ===");
        System.out.println("Saldo Awal          : " + saldo);

        //proses setoran atau penambahan saldo
        int setoran = 500000;
        saldo = saldo + setoran;
        System.out.println("Setoran             : " + setoran);
        System.out.println("Saldo Setelah Setor : " + saldo);

        //proses penarikan atau pengurangan saldo
        int penarikan = 250000;
        saldo = saldo - penarikan;
        System.out.println("Penarikan           : " + penarikan);

        //saldo akhir setelah transaksi
        System.out.println("Saldo Akhir         : " + saldo);
    }
}
/*
Naufrisya Rizqy Syabilla
D1041241081
Kamis, 13 Februari 2025
 */

