public class Peminjaman01 {
    Mahasiswa01 mhs;
    Buku01 buku;
    int lamaPinjam, batasPinjam = 5, terlambat, denda;
    boolean isCanceled = false;//B. tambahkan atribut keterangan dibatalkan atau tidak, defaultnya tidak

    Peminjaman01(Mahasiswa01 mhs, Buku01 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
    }

    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat > 10 ? 20000 : terlambat * 2000;// A. buat batasan jika terlambat lebih dari 10 hari //
                                                              // (10x2000=20000), agar dendanya di set tetap ke 20000
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    void tampilPeminjaman() {
        if (isCanceled == false) {
            System.out.println(mhs.nama + " | " + buku.judul + " | Lama: " + lamaPinjam + " | Terlambat: " + terlambat
                    + " | Denda: " + denda);//B Tampilkan yang tidak dibatalkan saja
        }
    }

    void batalkan() { //B method yang digunakan untuk menghapus
        isCanceled = true;
    }
}
