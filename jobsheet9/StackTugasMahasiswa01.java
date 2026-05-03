public class StackTugasMahasiswa01 {
    Mahasiswa01[] stack;
    int top, size, count;

    StackTugasMahasiswa01(int size) {
        this.size = size;
        stack = new Mahasiswa01[size];
        top = -1;
    }

    boolean isFull() {
        if (top == size) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void push(Mahasiswa01 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
            count++;
        } else {
            System.out.println("Stack penuh");
        }
    }

    Mahasiswa01 pop() {
        if (!isEmpty()) {
            Mahasiswa01 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! tidak ada tugas untuk dinilai");
            return null;
        }
    }

    Mahasiswa01 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    Mahasiswa01 bottom() {
        if (!isEmpty()) {
            return stack[0];
        }
        System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
        return null;
    }

    void print() {
        for (int i = top; i >= 0; i--) {
            // ubah jadi urut dari tumpukan atas ke bawah
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    void count() {
        if (count == 0) {
            System.out.println("Belum pernah ada tugas yang dikumpulkan");
        } else {
            System.out.println("Total tugas yang dikumpulkan: " + count);
            if (isEmpty()) {
                System.out.println("Stack kosong! Tidak ada tugas yang belum dinilai");
            } else {
                System.out.println("Jumlah tugas yang belum dinilai: " + (top + 1));
            }
        }
    }

    String konversiDesimalKeBiner(int nilai) {
        StackKonversi01 stack = new StackKonversi01();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner= new String();
        while (!stack.isEmpty()) {
            biner+=stack.pop();
        }
        return biner;
    }
}
