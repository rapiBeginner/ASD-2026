package Tugas;

import java.util.Scanner;

public class SLLTugasMain01 {
    public static void main(String[] args) {
        SingleLinkListTugas01 sll = new SingleLinkListTugas01();
        Scanner raffi = new Scanner(System.in);
        int menu;
        do {
            System.out.println("\nPilih menu berikut: ");
            System.out.println("1. Cek antrean kosong");
            System.out.println("2. Cek antrean penuh");
            System.out.println("3. Kosongkan antrean");
            System.out.println("4. Menambahkan antrean");
            System.out.println("5. Mengambil antrian");
            System.out.println("6. Menampilkan data terdepan dan terakhir");
            System.out.println("7. Menampilkan yang masih mengantre");
            System.out.print("Pilih: ");
            menu = raffi.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Apakah antrian kosong? (true/false) : " + sll.isEmpty());
                    break;
                case 2:
                    System.out.println("Apakah antrian penuh? (true/false) : " + sll.isFull());
                    break;
                case 3:
                    sll.clear();
                    break;
                case 4:
                    raffi.nextLine();
                    System.out.println("Masukkan data mahasiswa");
                    System.out.print("NIM       : ");
                    String nim = raffi.nextLine();
                    System.out.print("Nama      : ");
                    String nama = raffi.nextLine();
                    System.out.print("Kelas     : ");
                    String kelas = raffi.nextLine();
                    System.out.print("IPK       : ");
                    double ipk = raffi.nextDouble();
                    sll.add(new MahasiswaTugas01(nim, nama, kelas, ipk));
                    break;
                case 5:
                    MahasiswaTugas01 hasil = sll.call();
                    if (hasil != null) {
                        System.out.println("Data mahasiswa atas nama " + hasil.nama + " telah ditangani");
                    }
                    break;
                case 6:
                    sll.print();
                    break;
                case 7:
                    sll.count();
                    break;
                default:
                    break;
            }

        } while (menu != 0);
        raffi.close();
    }
}
