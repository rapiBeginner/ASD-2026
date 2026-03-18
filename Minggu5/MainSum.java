package Minggu5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner raffi= new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = raffi.nextInt();

        Sum sm= new Sum(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-"+(i+1)+": ");
            sm.keuntungan[i] = raffi.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan Bruteforce: "+sm.totalBF());
        System.out.println("Total keuntungan menggunakan Devide and Conquer: "+sm.totalDC(sm.keuntungan, 0,elemen-1));
        raffi.close();
    }
}
