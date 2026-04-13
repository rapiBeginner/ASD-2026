package Praktikum5.Tugas;

import java.util.Scanner;

public class MainDosen01 {
    static DataDosen01 arrayDosen = new DataDosen01();
    static Scanner raffi = new Scanner(System.in);

    static void tambahDosen() {
        raffi.nextLine();
        System.out.println("\n====TAMBAHKAN DOSEN====");
        System.out.print("Kode: ");
        String kode = raffi.nextLine();
        System.out.print("Nama: ");
        String nama = raffi.nextLine();
        System.out.print("Perempuan? (true/false): ");
        boolean jk = raffi.nextBoolean();
        System.out.print("Usia: ");
        int usia = raffi.nextInt();
        Dosen01 dosenBaru = new Dosen01(kode, nama, jk, usia);
        arrayDosen.tambah(dosenBaru);
    }

    public static void main(String[] args) {
        int menu;
        while (true) {
            System.out.println("====MENU DOSEN====");
            System.out.println("1. Tambah data dosen");
            System.out.println("2. Tampilkan data dosen");
            System.out.println("3. Urutkan ASC");
            System.out.println("4. Urutkan DESC (selection)");
            System.out.println("4. Urutkan DESC (insertion)");
            System.out.print("Pilih: ");
            menu=raffi.nextInt();
            if (menu==1) {
                tambahDosen();
            }else if (menu==2) {
                arrayDosen.tampil();
            }else if (menu==3) {
                arrayDosen.SortingASC();
                arrayDosen.tampil();
            }else if (menu==4) {
                arrayDosen.sortingDSC();
                arrayDosen.tampil();
            }else if (menu==5) {
                arrayDosen.insertionSortDESC();
                arrayDosen.tampil();
            }
            else{
                break;
            }
        }
    }
}
