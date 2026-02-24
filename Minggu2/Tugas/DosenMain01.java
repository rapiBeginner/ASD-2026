package Tugas;

public class DosenMain01 {
    public static void main(String[] args) {
        Dosen01 dsn1= new Dosen01();
        dsn1.bidangKeahlian="Design grafis";
        dsn1.idDosen="KD01";
        dsn1.nama="Pak bagas";
        dsn1.statusAktif=false;
        dsn1.tahunBergabung=2008;
        dsn1.tampilkanInformasi();
        dsn1.setStatusAktif(true);
        System.out.println("Lama Masa kerja: "+dsn1.hitungMasaKerja(2026));
        dsn1.ubahKeahlian( "K3");
        dsn1.tampilkanInformasi();
        System.out.println();
        Dosen01 dsn2= new Dosen01("KD02", "Bu Bella", "Basis data", true, 2020);
        dsn2.tampilkanInformasi();
        dsn2.setStatusAktif(false);
        System.out.println("Lama Masa kerja: "+dsn2.hitungMasaKerja(2026));
        dsn2.ubahKeahlian( "Rekayasa Perangkat Lunak");
        dsn2.tampilkanInformasi();
    }
}
