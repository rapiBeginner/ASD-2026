public class Buku01 {
    String kodeBuku, judul;
    int tahunTerbit;

    Buku01(String kode, String judul, int tahun){
        this.kodeBuku=kode;
        this.judul=judul;
        this.tahunTerbit=tahun;
    }

    void tampilBuku(){
        System.out.println("Kode: "+kodeBuku+" | Judul: "+judul+" | Tahun: "+tahunTerbit);
    }
}
