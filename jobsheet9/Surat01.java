public class Surat01 {
    String idSurat, namaMahasiswa, kelas;
    char jenisIzin;
    int durasi;

    Surat01() {
    }

    Surat01(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.durasi = durasi;
        this.jenisIzin = jenisIzin;
        this.kelas = kelas;
        this.namaMahasiswa = namaMahasiswa;
    }

    void tampil() {
        System.out.println("Id Surat        : " + idSurat);
        System.out.println("Nama            : " + namaMahasiswa);
        System.out.println("Kelas           : " + kelas);
        System.out.println("Jenis izin      : " + jenisIzin);
        System.out.println("Durasi          : " + durasi + " hari\n");
    }

    
}
