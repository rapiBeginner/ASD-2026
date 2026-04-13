package Praktikum5.Tugas;

public class Dosen01 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    Dosen01(String kd, String name, boolean jk, int age){
        kode=kd;
        nama=name;
        jenisKelamin=jk;
        usia=age;
    }

    void tampil(){

        System.out.println(
        "| Kode: "+kode+" | Nama: "+nama+" | jenisKelamin: "+(jenisKelamin?"Perempuan":"Laki-laki")+" | Usia: "+usia+" |"
        );
    }
}
