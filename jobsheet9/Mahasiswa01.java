public class Mahasiswa01 {
    String nim, nama, kelas;
    int nilai;

    Mahasiswa01(){}
    
    Mahasiswa01(String nama, String nim, String kelas){
        this.nim=nim;
        this.nama=nama;
        this.kelas=kelas;
        nilai=-1;
    }

    void tugasDInilai(int nilai){
        this.nilai=nilai;
    }
    
}