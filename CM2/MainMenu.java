import java.util.Scanner;

public class MainMenu {

    static void menu() {
        System.out.println("===============================");
        System.out.println("SISTEM ANTRIAN ROYAL DELISH");
        System.out.println("===============================");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian dan Pesan");
        System.out.println("4. Laporan Pesanan");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu : ");
    }

    public static void main(String[] args) {
        QueueAntrian antrian = new QueueAntrian();
        QueuePesanan pesanan = new QueuePesanan();
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do {
            menu();
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli  : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP         : ");
                    String noHP = sc.nextLine();
                    antrian.add(new Pembeli(nama, noHP));
                    break;
                case 2:
                    antrian.printQueue();
                    break;
                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian masih kosong, tidak bisa membuat pesanan");
                    } else {
                        System.out.print("Kode Pesanan  : ");
                        int kodePesanan = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nama Pesanan  : ");
                        String namaPesanan = sc.nextLine();
                        System.out.print("Harga         : ");
                        int harga = sc.nextInt();
                        sc.nextLine();
                        pesanan.order(new Pesanan(kodePesanan, namaPesanan, harga, antrian.pop()));
                    }
                    break;
                case 4:
                    pesanan.reportOrder();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilihan != 0);
    }
}
