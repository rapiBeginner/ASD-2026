import java.util.Scanner;

public class Main01 {
    static void urutkanDenda() {
        for (Peminjaman01 peminjaman01 : arrayPeminjaman) {
            peminjaman01.hitungDenda();
        }
        for (int i = 1; i < arrayPeminjaman.length - 1; i++) {
            int j = i - 1;
            Peminjaman01 temp = arrayPeminjaman[i];
            while (j >= 0 && arrayPeminjaman[j].denda < temp.denda) {
                arrayPeminjaman[j + 1] = arrayPeminjaman[j];
                j--;
            }
            arrayPeminjaman[j + 1] = temp;
        }
        for (Peminjaman01 peminjaman01 : arrayPeminjaman) {
            peminjaman01.tampilPeminjaman();
        }
    }

    static Scanner raffi = new Scanner(System.in);
    static Mahasiswa01 arrayMhs[] = {
            new Mahasiswa01("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa01("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa01("22003", "Citra", "Sistem Informasi Bisnis"),
    };

    static Buku01 arrauBuku[] = {
            new Buku01("B001", "Algoritma", 2020),
            new Buku01("B002", "Basis Data", 2019),
            new Buku01("B003", "Pemrograman", 2021),
            new Buku01("B004", "Fisika", 2024),
    };

    static Peminjaman01 arrayPeminjaman[] = {
            new Peminjaman01(arrayMhs[0], arrauBuku[0], 7),
            new Peminjaman01(arrayMhs[1], arrauBuku[1], 3),
            new Peminjaman01(arrayMhs[2], arrauBuku[2], 30),
            new Peminjaman01(arrayMhs[2], arrauBuku[3], 6),
            new Peminjaman01(arrayMhs[0], arrauBuku[1], 4),
    };

    static void cariNIM(String nim) {
        for (int i = 0; i < arrayPeminjaman.length; i++) {
            if (arrayPeminjaman[i].mhs.nim.equalsIgnoreCase(nim) && arrayPeminjaman[i].isCanceled!=true) {//B tambahkan agar data yang di cancel tidak bisa dicari
                arrayPeminjaman[i].tampilPeminjaman();
            }
        }
    }

    static void batalkanPeminjaman(String nim) {//B Mencari nim yang dimasukkan, lalu mengubah semua data yang nimnya                                        // sesuai, lalu memanggil method yang mengubah isCanceled nya jadi true
        for (int i = 0; i < arrayPeminjaman.length; i++) {
            if (arrayPeminjaman[i].mhs.nim.equalsIgnoreCase(nim)) {
                arrayPeminjaman[i].batalkan();
            }
        }
    }

    static int menu;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("6. Batalkan transaksi lewat NIM");//B tambahkan menu baru
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            menu = raffi.nextInt();
            if (menu == 1) {
                for (Mahasiswa01 mhs : arrayMhs) {
                    mhs.tampilMahasiswa();
                }
            } else if (menu == 2) {
                for (Buku01 buku : arrauBuku) {
                    buku.tampilBuku();
                }
            } else if (menu == 3) {
                for (Peminjaman01 peminjaman01 : arrayPeminjaman) {
                    peminjaman01.hitungDenda();
                    peminjaman01.tampilPeminjaman();
                }
            } else if (menu == 4) {
                urutkanDenda();
            } else if (menu == 5) {
                raffi.nextLine();
                System.out.print("Masukkan NIM: ");
                String nim = raffi.nextLine();
                cariNIM(nim);
            } else if (menu == 6) {
                raffi.nextLine();
                System.out.print("Masukkan NIM: ");
                String nim = raffi.nextLine();
                cariNIM(nim);//B Tampilkan data yang akan dihapus dulu
                System.out.print("\nHapus data tersebut? (Y/N): "); //B konfirmasi kepada user apakah yakin untuk menghapus data tersebut
                String confim = raffi.nextLine();
                if (confim.equalsIgnoreCase("Y")) {//B Jika iya, maka jalankan method untuk membatalkan peminjaman
                    batalkanPeminjaman(nim);
                    System.out.println("Tersebut telah dihapus, lihat pada daftar baru berikut:\n");
                    for (Peminjaman01 peminjaman01 : arrayPeminjaman) {
                        peminjaman01.hitungDenda();
                        peminjaman01.tampilPeminjaman();//B setelah selesai membatalkan, tampilkan lagi data yang masih ada (tidak dibatalkan)
                    }
                }
            } else {
                break;
            }
        }
        raffi.close();
    }
}