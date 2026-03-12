package Minggu3;

import java.text.Format;
import java.util.Scanner;

public class MataKuliahDemo01 {
    public static void main(String[] args) {
        Scanner raffi = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        MataKuliah01[] arrayOfMataKuliah01 = new MataKuliah01[raffi.nextInt()];
        // String kode, nama, dummy;
        // int sks, jumlahJam;

        for (int i = 0; i < arrayOfMataKuliah01.length; i++) {
            arrayOfMataKuliah01[i] = new MataKuliah01();
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah01[i].tambahData();
        }
        for (int i = 0; i < arrayOfMataKuliah01.length; i++) {
            System.out.println("Dara Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah01[i].cekInfo();
        }
        raffi.close();
    }
}
