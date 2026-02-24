package Tugas;

public class Dosen01 {
    String idDosen, nama, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;

    Dosen01(){

    }

    Dosen01(String idDsn, String nm, String bdKeahlian, boolean status, int thnGbng){
        idDosen=idDsn;
        nama=nm;
        bidangKeahlian=bdKeahlian;
        statusAktif=status;
        tahunBergabung=thnGbng;
    }

    void tampilkanInformasi(){
        System.out.println("id dosen: "+idDosen);
        System.out.println("nama: "+nama);
        System.out.println("bidang keahlian: "+bidangKeahlian);
        System.out.println("Status aktif: "+statusAktif);
        System.out.println("Tahun bergabung: "+tahunBergabung);
    }

    public void setStatusAktif(boolean statusAktif) {
        this.statusAktif = statusAktif;
    }

    int hitungMasaKerja(int thnSkrng){
        return thnSkrng-tahunBergabung;
    }

    void ubahKeahlian(String bidang){
        this.bidangKeahlian=bidang;
    }
}
