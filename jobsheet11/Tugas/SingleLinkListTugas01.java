package Tugas;

public class SingleLinkListTugas01 {
    NodeMahasiswaTugas01 head;
    NodeMahasiswaTugas01 tail;
    int limit = 5;
    int size = 0;

    boolean isEmpty() {
        return head == null;
    }

    boolean isFull() {
        return size == limit;
    }

    void add(MahasiswaTugas01 mhs) {
        NodeMahasiswaTugas01 nodeMhs = new NodeMahasiswaTugas01(mhs, null);
        if (isEmpty()) {
            head = tail = nodeMhs;
            size++;
            System.out.println("Data atas nama " + mhs.nama + " berhasil ditambahkan  ");

        } else if (isFull()) {
            System.out.println("Antrian sedang penuh (5 orang batas maksimal)");
        } else {
            tail.next = nodeMhs;
            tail = tail.next;
            size++;
            System.out.println("Data atas nama " + mhs.nama + " berhasil ditambahkan  ");
        }

    }

    void clear() {
        head = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan");
    }

    MahasiswaTugas01 call() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return null;
        } else {
            NodeMahasiswaTugas01 temp = head;
            head = head.next;
            size--;
            return temp.data;
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.print("\nAntrian terdepan: ");
            head.data.tampilData();
            System.out.print("Antrian terakhir: ");
            tail.data.tampilData();
        }
    }

    void count() {
        System.out.println("Jumlah yang sedang mengantri: " + size);
    }

}
