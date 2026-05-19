package Tugas;

public class NodeMahasiswaTugas01 {
    MahasiswaTugas01 data;
    NodeMahasiswaTugas01 next;

    NodeMahasiswaTugas01(){

    }

    NodeMahasiswaTugas01(MahasiswaTugas01 mhs, NodeMahasiswaTugas01 next){
        this.data=mhs;
        this.next=next;
    }
}
