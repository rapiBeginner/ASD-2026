package Minggu6;

public class Mahasiswa01 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa01(){};

    Mahasiswa01(String nm, String name, String kls, double ip){
        nama=name;
        nim=nm;
        kelas=kls;
        ipk=ip;
    };

    void tampilInformasi(){
        System.out.println("| NIM: "+nim+" | Nama :"+nama+" | Kelas: "+kelas+" | IPK: "+ipk+" |");
    }
}
