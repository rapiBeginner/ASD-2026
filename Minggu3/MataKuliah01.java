package Minggu3;

import java.util.Scanner;

public class MataKuliah01 {
    public String kode, nama, dummy;
    public int sks, jumlahJam;
    public Scanner raffi = new Scanner(System.in);

    void tambahData() {
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
    }

    void cekInfo() {
        System.out.println("Kode        :" + kode);
        System.out.println("Nama        :" + nama);
        System.out.println("Sks         :" + sks);
        System.out.println("jumlah jam: "+ jumlahJam);
        System.out.println("------------------------------------");
    }

}
