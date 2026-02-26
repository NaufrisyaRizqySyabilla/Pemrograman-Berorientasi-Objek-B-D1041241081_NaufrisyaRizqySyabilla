package Pertemuan6;

public class LatihanRestoran {
    public static void main(String[] args) {

        int menuCode = 1;
        int quantity = 2;
        String menuName;
        int price;

        System.out.println("=== MENU RESTORAN ===");
        System.out.println("Kode Menu: " + menuCode);
        System.out.println("Jumlah: " + quantity);
        System.out.println();

        switch (menuCode) {
            case 1:
                menuName = "Nasi Goreng";
                price = 15000;
                break;
            case 2:
                menuName = "Mie Ayam";
                price = 12000;
                break;
            case 3:
                menuName = "Bakso";
                price = 10000;
                break;
            case 4:
                menuName = "Soto Ayam";
                price = 13000;
                break;
            case 5:
                menuName = "Es Teh";
                price = 3000;
                break;
            default:
                System.out.println("Menu tidak valid");
                return;
        }

        int total = price * quantity;

        System.out.println("Pesanan Anda:");
        System.out.println("Nama Menu: " + menuName);
        System.out.println("Harga Satuan: Rp " + price);
        System.out.println("Jumlah: " + quantity);
        System.out.println("---");
        System.out.println("Total Bayar: Rp " + total);

    }
}
/*
Naufrisya Rizqy Syabilla
D1041241081
Selasa, 24 Februari 2026
*/