public class Mahasiswa01 {
    String nim, nama, prodi, kelas;

    Mahasiswa01(String nim, String nama, String prodi, String kelas) {
        this.kelas = kelas;
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
