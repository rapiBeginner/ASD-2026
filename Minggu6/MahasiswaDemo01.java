package Minggu6;

import java.util.Scanner;

public class MahasiswaDemo01 {
    public static void main(String[] args) {
        Scanner raffi= new Scanner(System.in);
        System.out.println("Masukkan jumlah mahasiswa");
        int jumMhs= raffi.nextInt();
        raffi.nextLine();
        MahasiswaBerprestasi01 list= new MahasiswaBerprestasi01(jumMhs);
        
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-"+(i+1));
            System.out.print("NIM   : ");
            String nim= raffi.nextLine();
            System.out.print("Nama  : ");
            String nama= raffi.nextLine();
            System.out.print("Kelas : ");
            String kelas=raffi.nextLine();
            System.out.print("IPK   : ");
            double ipk= raffi.nextDouble();
            raffi.nextLine();
            System.out.println("---------------------------");
            list.tambah(new Mahasiswa01(nim, nama, kelas, ipk));
        }

        list.tampil();
        //cari data sequential
        System.out.println("--------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari= raffi.nextDouble();

        System.out.println("Menggunakan sequential searching");
        int posisi= list.sequentialSearching(cari);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);

        System.out.println("Menggunakan binary search");
        int posisi2= list.findBinarySearch(cari, 0, jumMhs-1);
        list.tampilPosisi(cari, posisi2);
        list.tampilDataSearch(cari, posisi2);
    } 
}
