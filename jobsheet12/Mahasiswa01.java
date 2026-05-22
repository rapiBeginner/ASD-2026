public class Mahasiswa01 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa01(String nim, String nama, String kelas, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampil() {
        System.out.println(
                "NIM    :   " + nim +
                        "\nNama :   " + nama +
                        "\nKelas    :" + kelas +
                        "\nIPK  :" + ipk);
    }
}