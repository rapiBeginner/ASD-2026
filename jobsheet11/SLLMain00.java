public class SLLMain00 {
    public static void main(String[] args) {
        
            SingleLinkedList01 sill= new SingleLinkedList01();
            Mahasiswa01 mhs1= new Mahasiswa01("333", "Alvaro", "TI1F", 3.3);
            Mahasiswa01 mhs2= new Mahasiswa01("222", "Bimon", "TI1F", 3.9);
            Mahasiswa01 mhs3= new Mahasiswa01("111", "Cintia", "TI1F", 4.0);
            Mahasiswa01 mhs4= new Mahasiswa01("444", "Dirga", "TI1F", 3.6);
            sill.print();
            sill.addFirst(mhs4);
            sill.print();
            sill.addLast(mhs1);
            sill.print();
            sill.insertAfter("Dirga", mhs3);
            sill.insertAt(2, mhs2);
            sill.print();

    }
}
