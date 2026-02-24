public class MahasiswaMain01 {
    public static void main(String[] args) {
        Mahasiswa01 mhs1 = new Mahasiswa01();
        mhs1.nama = "Andi";
        mhs1.nim = "123456";
        mhs1.kelas = "TI-1F";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI-1B");
        mhs1.updateIPK(3.75);
        mhs1.tampilkanInformasi();

        Mahasiswa01 mhs2= new Mahasiswa01("Sultan Alfayyad", "254107020087", 3.77, "TI 1H");
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa01 mhsRaffi= new Mahasiswa01("Raffi", "254107020097", 3.85,"TI 1F");
    }
}

