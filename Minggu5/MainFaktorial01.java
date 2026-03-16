package Minggu5;

import java.util.Scanner;

public class MainFaktorial01 {
     public static void main(String[] args) {
        Scanner raffi= new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = raffi.nextInt();

        Faktorial01 fk= new Faktorial01();
        System.err.println("Nilai faktorial "+nilai+ " menggunakan BF: "+fk.faktorial01BF(nilai));
        System.err.println("Nilai faktorial "+nilai+ " menggunakan DC: "+fk.faktorial01DC(nilai));
        raffi.close();
     }
}
