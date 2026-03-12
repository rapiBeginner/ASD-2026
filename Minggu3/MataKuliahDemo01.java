package Minggu3;

import java.text.Format;
import java.util.Scanner;

public class MataKuliahDemo01 {
    public static void main(String[] args) {
        Scanner raffi = new Scanner(System.in);
        MataKuliah01[] arrayOfMataKuliah01 = new MataKuliah01[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode          :");
            kode = raffi.nextLine();
            System.out.print("Nama          :");
            nama = raffi.nextLine();
            System.out.print("SKS           :");
            dummy = raffi.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam    :");
            dummy = raffi.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------------");
            arrayOfMataKuliah01[i] = new MataKuliah01(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Dara Matakuliah ke-" + (i + 1));
            System.out.println("Kode        :"+ arrayOfMataKuliah01[i].kode);
            System.out.println("Nama        :"+ arrayOfMataKuliah01[i].sks);
            System.out.println("Sks         :"+ arrayOfMataKuliah01[i].jumlahJam);
            System.out.println("------------------------------------");
        }

        raffi.close();
    }
}
