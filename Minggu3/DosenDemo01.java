package Minggu3;

import java.util.Scanner;

public class DosenDemo01 {
    public static void main(String[] args) {
        Scanner raffi = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        Dosen01[] arrayOfDosen = new Dosen01[raffi.nextInt()];
        raffi.nextLine();
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode                  :");
            String kode = raffi.nextLine();
            System.out.print("Nama                  :");
            String nama = raffi.nextLine();
            System.out.print("Jenis Kelamin(P/L)    :");
            String jk = raffi.next();
            boolean jenisKel = true;
            if (jk.equalsIgnoreCase("L")) {
                jenisKel = false;
            }
            System.out.print("Usia                  :");
            int usia = raffi.nextInt();
            raffi.nextLine();
            System.out.println("--------------------------------");
            arrayOfDosen[i] = new Dosen01(kode, nama, jenisKel, usia);
        }

        System.out.println("\n====DAFTAR DOSEN=====");
        int counter = 1;
        for (Dosen01 dosen01 : arrayOfDosen) {
            System.out.println("Data dossen ke-" + counter);
            System.out.println("Kode            :" + dosen01.kode);
            System.out.println("Nama            :" + dosen01.nama);
            System.out.println("Usia            :" + dosen01.usia);
            String jenisKelamin = dosen01.jenisKelamin == true ? "Perempuan" : "Laki-laki";
            System.out.println("Jenis Kelamin   :" + jenisKelamin);
            System.out.println("--------------------------------");
            counter++;
            // System.out.println("");
        }

    }
}
