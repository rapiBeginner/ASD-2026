import org.w3c.dom.Node;

public class BinaryTree01 {
    Node01 root;

    BinaryTree01() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(Mahasiswa01 mahasiswa) {
        Node01 newNode = new Node01(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node01 current = root;
            Node01 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void addRekursif(Mahasiswa01 mhs) {
        root = insertRekursif(root, mhs);
    }

    private Node01 insertRekursif(Node01 node, Mahasiswa01 mhs) {
        if (node == null) {
            Node01 newNode = new Node01(mhs);
            return newNode;
        }

        double ipkBaru = mhs.ipk;
        double ipkNode = node.mahasiswa.ipk;

        if (ipkBaru < ipkNode) {
            node.left = insertRekursif(node.left, mhs);
        } else if (ipkBaru > ipkNode) {
            node.right = insertRekursif(node.right, mhs);
        }

        return node;
    }

    public void searchMinIPK() {
        if (root == null) {
            System.out.println("Tree kosong");
            return;
        }

        Node01 minNode = root;

        while (minNode.left != null) {
            minNode = minNode.left;
        }

        System.out.println("Mahasiswa dengan IPK paling rendah:");
        minNode.mahasiswa.tampilInformasi();
    }

    public void searchMaxIPK() {
        if (root == null) {
            System.out.println("Tree kosong");
            return;
        }

        Node01 current = root;

        while (current.right != null) {
            current = current.right;
        }

        System.out.println("Mahasiswa dengan IPK Maksimum:");
        current.mahasiswa.tampilInformasi();
    }

    public void showMhsIPKdiAtas(double ipkBatas) {
        showMhsIPKdiAtas(root, ipkBatas);
    }

    private void showMhsIPKdiAtas(Node01 node, double ipkBatas) {
        if (node != null) {
            showMhsIPKdiAtas(node.left, ipkBatas);

            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }

            showMhsIPKdiAtas(node.right, ipkBatas);
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        Node01 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node01 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node01 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node01 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node01 getSuccessor(Node01 del) {
        Node01 successor = del.right;
        Node01 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        // cari node (current) yang akan dihapus
        Node01 parent = root;
        Node01 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node01 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }
}