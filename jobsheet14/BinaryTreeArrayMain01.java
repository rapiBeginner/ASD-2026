

// public class BinaryTreeArrayMain01 {
//     public static void main(String[] args) {

//         BinaryTreeArray01 bta = new BinaryTreeArray01();

//         Mahasiswa01 m1 = new Mahasiswa01("244160121", "Ali", "A", 3.57);
//         Mahasiswa01 m2 = new Mahasiswa01("244160185", "Candra", "C", 3.41);
//         Mahasiswa01 m3 = new Mahasiswa01("244160221", "Badar", "B", 3.75);
//         Mahasiswa01 m4 = new Mahasiswa01("244160220", "Dewi", "B", 3.35);
//         Mahasiswa01 m5 = new Mahasiswa01("244160131", "Devi", "A", 3.48);
//         Mahasiswa01 m6 = new Mahasiswa01("244160205", "Ehsan", "D", 3.61);
//         Mahasiswa01 m7 = new Mahasiswa01("244160170", "Fajar", "B", 3.86);

//         Mahasiswa01[] dataMahasiswa = {
//                 m1, m2, m3, m4, m5, m6, m7
//         };

//         int idxLast = 6;

//         bta.populateData(dataMahasiswa, idxLast);

//         System.out.println("\nTraversal InOrder Binary Tree Array:");
//         bta.traverseInOrder(0);
//     }
// }

public class BinaryTreeArrayMain01 {
    public static void main(String[] args) {

        BinaryTreeArray01 bta = new BinaryTreeArray01();

        bta.data = new Mahasiswa01[10];
        bta.idxLast = -1;

        Mahasiswa01 m1 = new Mahasiswa01("244160121", "Ali", "A", 3.57);
        Mahasiswa01 m2 = new Mahasiswa01("244160185", "Candra", "C", 3.41);
        Mahasiswa01 m3 = new Mahasiswa01("244160221", "Badar", "B", 3.75);
        Mahasiswa01 m4 = new Mahasiswa01("244160220", "Dewi", "B", 3.35);
        Mahasiswa01 m5 = new Mahasiswa01("244160131", "Devi", "A", 3.48);
        Mahasiswa01 m6 = new Mahasiswa01("244160205", "Ehsan", "D", 3.61);
        Mahasiswa01 m7 = new Mahasiswa01("244160170", "Fajar", "B", 3.86);

        bta.add(m1);
        bta.add(m2);
        bta.add(m3);
        bta.add(m4);
        bta.add(m5);
        bta.add(m6);
        bta.add(m7);

        System.out.println("\nTraversal InOrder:");
        bta.traverseInOrder(0);

        System.out.println("\nTraversal PreOrder:");
        bta.traversePreOrder(0);
    }
}