import java.util.Scanner;

public class LayananAkademikSIAKAD01 {
    public static void main(String[] args) {
        Scanner raffi = new Scanner(System.in);
        AntrianLayanan01 antrian = new AntrianLayanan01(5);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = raffi.nextInt();
            raffi.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = raffi.nextLine();
                    System.out.print("Nama  : ");
                    String nama = raffi.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = raffi.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = raffi.nextLine();
                    antrian.tambahAntrian(new Mahasiswa01(nim, nama, prodi, kelas));
                    break;
                case 2:
                    Mahasiswa01 dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.print("Melayani mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                case 0:
                    System.out.println("Terima Kasir");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 0);
    }
}
