package Pertemuan6;

public class LatihanHariBulan {
    public static void main(String[] args) {

        int month = 4;   
        String monthName;

        System.out.println("=== JUMLAH HARI DALAM BULAN ===");

        switch (month) {
            case 1:
                monthName="Januari";
                break;
            case 2:
                monthName="Februari";
                break;
            case 3:
                monthName="Maret"; 
                break;
            case 4:
                monthName="April";
                break;
            case 5:
                monthName="Mei";
                break;
            case 6:
                monthName="Juni";
                break;
            case 7:
                monthName="Juli";
                break;
            case 8:
                monthName="Agustus";
                break;
            case 9:
                monthName="September";
                break;
            case 10:
                monthName="Oktober";
                break;
            case 11:
                monthName="November";
                break;
            case 12:
                monthName="Desember";
                break;
            default:
                System.out.println("Bulan tidak valid");
                return;
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Bulan: " + monthName + " (bulan ke-" + month + ")");
                System.out.println("Jumlah hari: 31 hari");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Bulan: " + monthName + " (bulan ke-" + month + ")");
                System.out.println("Jumlah hari: 30 hari");
                break;

            case 2:
                System.out.println("Bulan: " + monthName + " (bulan ke-" + month + ")");
                System.out.println("Jumlah hari: 28 hari");
                break;
        }
    }
}
/*
Naufrisya Rizqy Syabilla
D1041241081
Selasa, 24 Februari 2026
*/