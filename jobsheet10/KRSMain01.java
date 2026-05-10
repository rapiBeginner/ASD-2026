import java.util.Scanner;

public class KRSMain01 {
    public static void main(String[] args) {
        Scanner raffi = new Scanner(System.in);
        AntrianKRS01 antrian = new AntrianKRS01();
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("Jumlah maksimum antrian 10");
            System.out.println("1. Cek Antrian Kosong");
            System.out.println("2. Cek Antrian Penuh");
            System.out.println("3. Kosongkan Antrian");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Lihat dua mahasiswa terdepan");
            System.out.println("6. Lihat mahasiswa terakhir");
            System.out.println("7. Tambahkan Antrian");
            System.out.println("8. Proses KRS");
            System.out.println("9. Cek jumlah antrian");
            System.out.println("10. Cek jumlah KRS selesai");
            System.out.println("11. Cek jumlah yang belum KRS");
            System.out.print("Pilih menu: ");
            pilihan = raffi.nextInt();
            raffi.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println("Apakah antrian kosong (true/false): " + antrian.isEmpty());
                    break;
                case 2:
                    System.out.println("Apakah antrian penuh (true/false): " + antrian.isFull());
                    break;
                case 3:
                    antrian.clear();
                    break;
                case 10:
                    System.out.println("jumlah KRS yang selesai: " + antrian.getJumlahSelesai());
                    break;
                case 11:
                    System.out.println("jumlah yang belum KRS: " + antrian.getBelumMelakukanKRS());
                case 7:
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
                case 8:
                    Mahasiswa01[] dilayani = antrian.layaniMahasiswa();
                    System.out.print("KRS yang diproses: ");
                    for (Mahasiswa01 mahasiswa01 : dilayani) {
                        if (mahasiswa01 != null) {
                            mahasiswa01.tampilkanData();
                        }
                    }
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    antrian.lihatTerdepan();
                    break;
                case 9:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 6:
                    antrian.lihatAkhir();
                    break;
                case 0:
                    System.out.println("Terima Kasir");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 0);
    }
}
