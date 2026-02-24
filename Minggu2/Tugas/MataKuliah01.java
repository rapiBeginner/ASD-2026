package Tugas;

public class MataKuliah01 {
    String kodeMK, nama;
    int sks, jumlahJam;

    MataKuliah01(){

    };

    MataKuliah01(String kdMK, String nm, int SKS, int jmlJam){
        kodeMK=kdMK;
        nama= nm;
        sks= SKS;
        jumlahJam=jmlJam;
    };

    void tampilkanInformasi(){
        System.out.println("Nama matkul: "+nama);
        System.out.println("Kode matkul: "+kodeMK);
        System.out.println("SKS : "+sks);
        System.out.println("Jumlah jam: "+jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks=sksBaru;
        System.out.println("SKS telah diubah");
    }

    void tambahJam(int jam){
        this.jumlahJam+=jam;
    }

    void kurangiJam(int jam){
        if (this.jumlahJam>=jam) {
            this.jumlahJam-=jam;
            System.out.println("Jumlah jam terbaru: "+jumlahJam);
        }else{
            System.out.println("Pengurangan tidak dapat dilakukan");
        }
    }




}
