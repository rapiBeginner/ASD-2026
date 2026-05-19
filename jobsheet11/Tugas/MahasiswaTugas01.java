package Tugas;

public class MahasiswaTugas01 {
    String nim, nama, kelas;
    double ipk;

    MahasiswaTugas01(){
        
    }

    MahasiswaTugas01(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilData() {
        System.out.println(this.nama + " | " + this.nim + " | " + this.kelas + " | " + this.ipk);
    }
}
