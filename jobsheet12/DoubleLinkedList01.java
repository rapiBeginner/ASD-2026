
public class DoubleLinkedList01 {
    Node01 head;
    Node01 tail;

    DoubleLinkedList01() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void addLast(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    Node01 search(String nim) {
        Node01 current = head;

        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }

        return null;
    }

    void insertAfter(String keyNim, Mahasiswa01 data) {
        Node01 current = search(keyNim);

        if (current == null) {
            System.out.println("Node dengan NIM tersebut tidak ditemukan");
            return;
        }

        Node01 newNode = new Node01(data);

        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            tail = newNode;
        }

        current.next = newNode;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        Node01 current = head;

        while (current != null) {
            System.out.println("NIM   : " + current.data.nim);
            System.out.println("Nama  : " + current.data.nama);
            System.out.println("Kelas : " + current.data.kelas);
            System.out.println("IPK   : " + current.data.ipk);

            current = current.next;
        }
    }

    void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        Node01 current = tail;

        while (current != null) {
            System.out.println("NIM   : " + current.data.nim);
            System.out.println("Nama  : " + current.data.nama);
            System.out.println("Kelas : " + current.data.kelas);
            System.out.println("IPK   : " + current.data.ipk);

            current = current.prev;
        }
    }
}