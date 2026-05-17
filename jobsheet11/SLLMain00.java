import java.util.Scanner;

public class SLLMain00 {
    public static void main(String[] args) {

        //Percobaan 1
        // SingleLinkedList01 sill= new SingleLinkedList01();
        // Mahasiswa01 mhs1= new Mahasiswa01("333", "Alvaro", "TI1F", 3.3);
        // Mahasiswa01 mhs2= new Mahasiswa01("222", "Bimon", "TI1F", 3.9);
        // Mahasiswa01 mhs3= new Mahasiswa01("111", "Cintia", "TI1F", 4.0);
        // Mahasiswa01 mhs4= new Mahasiswa01("444", "Dirga", "TI1F", 3.6);
        // sill.print();
        // sill.addFirst(mhs4);
        // sill.print();
        // sill.addLast(mhs1);
        // sill.print();
        // sill.insertAfter("Dirga", mhs3);
        // sill.insertAt(2, mhs2);
        // sill.print();

        // Percobaan 1 pertanyaan 3
        // SingleLinkedList01 sill = new SingleLinkedList01();
        // String add;
        // System.out.println("Masukkan data mahasiswa");
        // Scanner raffi = new Scanner(System.in);
        // do {
        //     System.out.print("Nama      : ");
        //     String nama = raffi.nextLine();
        //     System.out.print("NIM       : ");
        //     String nim = raffi.nextLine();
        //     System.out.print("Kelas     : ");
        //     String kelas = raffi.nextLine();
        //     System.out.print("IPK       : ");
        //     double ipk = raffi.nextDouble();
        //     raffi.nextLine();
        //     sill.addLast(new Mahasiswa01(nim, nama, kelas, ipk));
        //     System.out.println();
        //     sill.print();
        //     System.out.print("\nTambahkan Mahasiswa Lagi? (y/n) : ");
        //     add = raffi.nextLine();
        // } while (!add.equalsIgnoreCase("n"));
        // raffi.close();


        //Percobaan2
        SingleLinkedList01 sill= new SingleLinkedList01();
        Mahasiswa01 mhs1= new Mahasiswa01("333", "Alvaro", "TI1F", 3.3);
        Mahasiswa01 mhs2= new Mahasiswa01("222", "Bimon", "TI1F", 3.9);
        Mahasiswa01 mhs3= new Mahasiswa01("111", "Cintia", "TI1F", 4.0);
        Mahasiswa01 mhs4= new Mahasiswa01("444", "Dirga", "TI1F", 3.6);
        sill.addFirst(mhs4);
        sill.addLast(mhs1);
        sill.insertAfter("Dirga", mhs3);
        sill.insertAt(2, mhs2);
        System.out.println("data index 1 : ");
        sill.getData(1);

        System.out.println("data mahasiswa bernama Bimon berada pada index "+sill.indexOf("bimon"));
        System.out.println();

        sill.removeFirst();
        sill.removeLast();
        sill.print();
        sill.removeAt(0);
        sill.print();
    }
}
