public class StackSurat01 {
    Surat01[] stack;
    int size, top;

    StackSurat01(int size) {
        this.top = -1;
        this.size = size;
        stack = new Surat01[size];
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    void push(Surat01 surat) {
        if (isFull()) {
            System.out.println("Slot pengumpulan penuh");
        } else {
            top++;
            stack[top] = surat;
            System.out.println("Surat milik " + surat.namaMahasiswa + " telah dikumpulkan");
        }
    }

    Surat01 pop() {
        if (isEmpty()) {
            System.out.println("Slot pengumpulan surat sedang kosong ");
            return null;
        }
        Surat01 hasil = stack[top];
        top--;
        return hasil;
    }

    Surat01 peak() {
        if (isEmpty()) {
            System.out.println("Slot pengumpulan surat sedang kosong ");
            return null;
        }
        return stack[top];
    }

    Surat01[] serch(String nama) {
        Surat01[] hasil = new Surat01[size];
        int index = 0;
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] == null) {
                break;
            } else if (stack[i].namaMahasiswa.toLowerCase().contains(nama.toLowerCase()) && i <= top) {
                hasil[index] = stack[i];
                index++;
            }
        }
        return hasil;
    }
}
