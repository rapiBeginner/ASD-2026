package Minggu3;

import java.util.Scanner;

//import javax.xml.crypto.Data;

public class DosenDemo01 {
    public static void main(String[] args) {
        Scanner raffi = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        Dosen01[] arrayOfDosen = new Dosen01[raffi.nextInt()];
        DataDosen01 dataDosen= new DataDosen01();
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

        dataDosen.dataSemuaDosen(arrayOfDosen);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        dataDosen.infoDosenPalingmuda(arrayOfDosen);

    }
}
