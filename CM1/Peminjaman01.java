public class Peminjaman01 {
    Mahasiswa01 mhs;
    Buku01 buku;
    int lamaPinjam, batasPinjam=5, terlambat, denda;

    Peminjaman01(Mahasiswa01 mhs, Buku01 buku, int lamaPinjam){
        this.mhs=mhs;
        this.buku=buku;
        this.lamaPinjam=lamaPinjam;
    }

    void hitungDenda(){
        if (lamaPinjam>batasPinjam) {
            terlambat=lamaPinjam-batasPinjam;
            denda=terlambat*2000;
        } else{
            terlambat=0;
            denda=0;
        }
    }

    void tampilPeminjaman(){
        System.out.println(mhs.nama+" | "+buku.judul+" | Lama: "+lamaPinjam+" | Terlambat: "+terlambat+" | Denda: "+denda);

    }
}
