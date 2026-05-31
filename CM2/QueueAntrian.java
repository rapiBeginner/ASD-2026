public class QueueAntrian {
    NodeAntrian head, tail;
    int number;

    QueueAntrian() {
        head = tail = null;
        number = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void add(Pembeli dataPembeli) {
        number++;
        NodeAntrian newAntrian = new NodeAntrian(dataPembeli, number);
        if (isEmpty()) {
            head = tail = newAntrian;
        } else {
            tail.next = newAntrian;
            newAntrian.prev = tail.next;
            tail=tail.next;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor " + number);
    }

    Pembeli pop() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return null;
        } else if (head.next == null) {
            NodeAntrian temp = head;
            head = null;
            return temp.data;
        } else {
            NodeAntrian temp = head;
            head = head.next;
            head.prev = null;
            return temp.data;
        }
    }

    void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            NodeAntrian tmp = head;
            System.out.println("===============================");
            System.out.println("Daftar Antrian pembeli");
            System.out.println("===============================");
            System.out.printf("%-20s %-20s %-20s%n", "No Antrian", "Nama", "No HP");
            while (tmp != null) {
                System.out.printf("%-21d", tmp.queueNumber);
                tmp.data.tampilData();
                tmp = tmp.next;
            }
        }
    }
}
