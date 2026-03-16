package Minggu5;

import java.util.Scanner;

public class MainPangkat01 {
    public static void main(String[] args) {
        Scanner raffi = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = raffi.nextInt();

        Pangkat01[] png = new Pangkat01[elemen];
        for (int i = 0; i < png.length; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i + 1) + ": ");
            int basis = raffi.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i + 1) + ": ");
            int pangkat = raffi.nextInt();
            png[i]= new Pangkat01(basis, pangkat);

        }

        System.out.println("HASIL PANGKAT BRUTEFORCE");
        for (Pangkat01 pangkat01 : png) {
            System.out.println(pangkat01.nilai+"^"+pangkat01.pangkat+": "+pangkat01.PangkatBF(pangkat01.nilai, pangkat01.pangkat));
        }

        System.out.println("HASIL PANGKAT DEVIDE AND CONQUER");
        for (Pangkat01 pangkat01 : png) {
            System.out.println(pangkat01.nilai+"^"+pangkat01.pangkat+": "+pangkat01.PangkatDC(pangkat01.nilai, pangkat01.pangkat));
        }
        raffi.close();
    }
}
