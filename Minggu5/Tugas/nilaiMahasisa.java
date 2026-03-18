package Minggu5.Tugas;

public class nilaiMahasisa {

    static double nilaiUTStinggi(double[] nilai, int left, int right) {
        if (left == right) {
            return nilai[left];
        }
        int mid = (left + right) / 2;
        double leftDive = nilaiUTStinggi(nilai, left, mid);
        double rightDive = nilaiUTStinggi(nilai, mid + 1, right);
        if (leftDive > rightDive) {
            return leftDive;
        } else {
            return rightDive;
        }
    };

    static double nilaiUTSrendah(double[] nilai, int left, int right) {
        if (left == right) {
            return nilai[left];
        }
        int mid = (left + right) / 2;
        double leftDive = nilaiUTSrendah(nilai, left, mid);
        double rightDive = nilaiUTSrendah(nilai, mid + 1, right);
        if (leftDive < rightDive) {
            return leftDive;
        } else {
            return rightDive;
        }
    };

    static double rata2UAS(double[] nilai) {
        double total = 0;
        for (double n : nilai) {
            total += n;
        }
        return total / nilai.length;
    }

    public static void main(String[] args) {

        String dataMahasiswa[][] = {
                { "Ahmad", "220101001", "2022" },
                { "Budi", "220101002", "2022" },
                { "Cindy", "220101003", "2021" },
                { "Dian", "220101004", "2021" },
                { "Eko", "220101005", "2023" },
                { "Fajar", "220101006", "2020" },
                { "Gina", "220101007", "2023" },
                { "Hadi", "220101008", "2020" },
        };

        double nilaiUTS[] = {
                78.0, 85.0, 90.0, 76.0, 92.0, 88.0, 80.0, 82.0
        };

        double nilaiUAS[] = {
                82.0, 88.0, 87.0, 79.0, 95.0, 85.0, 83.0, 84.0
        };

        System.out.println("Nilai uts tertinggi: " + nilaiUTStinggi(nilaiUTS, 0, nilaiUTS.length - 1));
        System.out.println("Nilai uts terendah: " + nilaiUTSrendah(nilaiUTS, 0, nilaiUTS.length - 1));
        System.out.print("Rata-rata nilai uas: ");
        System.out.printf("%.2f", rata2UAS(nilaiUAS));
    }
}