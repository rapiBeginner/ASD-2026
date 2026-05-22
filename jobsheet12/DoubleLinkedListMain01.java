import java.util.Scanner;

public class DoubleLinkedListMain01 {
    public static void main(String[] args) {
        Scanner raffi = new Scanner(System.in);
        DoubleLinkedList01 dll = new DoubleLinkedList01();

        int pilih;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("7. tampilkan data dari belakang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilih = raffi.nextInt();
            raffi.nextLine();

            switch (pilih) {

                case 1:
                    System.out.print("Masukkan NIM  : ");
                    String nim1 = raffi.nextLine();

                    System.out.print("Masukkan Nama : ");
                    String nama1 = raffi.nextLine();

                    System.out.print("Masukkan Kelas : ");
                    String kelas1 = raffi.nextLine();

                    System.out.print("Masukkan IPK   : ");
                    double ipk1 = raffi.nextDouble();
                    raffi.nextLine();

                    Mahasiswa01 mhs1 = new Mahasiswa01(nim1, nama1, kelas1, ipk1);
                    dll.addFirst(mhs1);

                    break;

                case 2:
                    System.out.print("Masukkan NIM  : ");
                    String nim2 = raffi.nextLine();

                    System.out.print("Masukkan Nama : ");
                    String nama2 = raffi.nextLine();

                    System.out.print("Masukkan Kelas : ");
                    String kelas2 = raffi.nextLine();

                    System.out.print("Masukkan IPK   : ");
                    double ipk2 = raffi.nextDouble();
                    raffi.nextLine();

                    Mahasiswa01 mhs2 = new Mahasiswa01(nim2, nama2, kelas2, ipk2);
                    dll.addLast(mhs2);

                    break;

                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String key = raffi.nextLine();

                    System.out.println("Masukkan data baru");

                    System.out.print("Masukkan NIM   : ");
                    String nim3 = raffi.nextLine();

                    System.out.print("Masukkan Nama  : ");
                    String nama3 = raffi.nextLine();

                    System.out.print("Masukkan Kelas : ");
                    String kelas3 = raffi.nextLine();

                    System.out.print("Masukkan IPK   : ");
                    double ipk3 = raffi.nextDouble();
                    raffi.nextLine();

                    Mahasiswa01 mhs3 = new Mahasiswa01(nim3, nama3, kelas3, ipk3);

                    dll.insertAfter(key, mhs3);

                    System.out.println("Data berhasil disisipkan setelah NIM " + key);

                    break;

                case 4:
                    dll.removeFirst();
                    break;

                case 5:
                    dll.removeLast();
                    break;

                case 6:
                    dll.print();
                    break;
                case 7:
                    dll.printReverse();
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }

        } while (pilih != 0);

        raffi.close();
    }
}