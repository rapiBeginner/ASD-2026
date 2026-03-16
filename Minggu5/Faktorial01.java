package Minggu5;

public class Faktorial01 {

    int faktorial01BF(int n) {
        int fakto = 1, i = 1;
        // for (int i = 1; i <= n; i++) {
        // fakto *= i;
        // }
        while (i <= n) {
            fakto *= i;
            i++;
        }
        return fakto;
    }

    int faktorial01DC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorial01BF(n - 1);
            return fakto;
        }
    }
}