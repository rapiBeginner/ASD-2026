package Tugas;

public class MataKuliahMain {
    public static void main(String[] args) {
        MataKuliah01 mk1= new MataKuliah01();
        mk1.jumlahJam=4;
        mk1.kodeMK="K01";
        mk1.nama="Basis data";
        mk1.sks=5;
        mk1.tampilkanInformasi();
        mk1.kurangiJam(1);
        mk1.tambahJam(4);
        mk1.ubahSKS(4);
        mk1.tampilkanInformasi();
        System.out.println();
        MataKuliah01 mk2= new MataKuliah01("K02", "Matdas", 6, 4);
        mk2.tampilkanInformasi();
        mk2.kurangiJam(5);
        mk2.tambahJam(4);
        mk2.ubahSKS(4);
        mk2.tampilkanInformasi();
        
    }
}
