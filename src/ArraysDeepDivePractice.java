import java.util.Arrays;

public class ArraysDeepDivePractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Arrays Deep Dive
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * array multidimensi, operasi lanjutan, parameter/return value, dan utility methods.
         */

        // ===== ARRAY MULTIDIMENSI DASAR =====
        System.out.println("=== ARRAY MULTIDIMENSI DASAR ===");

        // Latihan 1: Membuat dan mengisi array 2D (matriks)
        // - Buat array 2D integer dengan ukuran 3x4 (3 baris, 4 kolom)
        int[][] arr1 = new int[3][4];
        // - Isi array dengan nilai: baris 0: [1,2,3,4], baris 1: [5,6,7,8], baris 2: [9,10,11,12]
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[0][3] = 4;
        arr1[1][0] = 5;
        arr1[1][1] = 6;
        arr1[1][2] = 7;
        arr1[1][3] = 8;
        arr1[2][0] = 9;
        arr1[2][1] = 10;
        arr1[2][2] = 11;
        arr1[2][3] = 12;


        // - Print seluruh matriks menggunakan nested loop dengan format yang rapi
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        // Latihan 2: Array 2D dengan inisialisasi langsung
        // - Buat array 2D string yang merepresentasikan papan catur 3x3 dengan nilai awal "."

        // - Tempatkan "X" di posisi [0][0], [1][1], dan [2][2] (diagonal)
        // - Tempatkan "O" di posisi [0][2], [1][0], dan [2][1]
        char[][] arr2 = new char[3][3];
        arr2[0][0] = 'X';
        arr2[1][1] = 'X';
        arr2[2][2] = 'X';

        arr2[0][1] = '.';
        arr2[1][2] = '.';
        arr2[2][0] = '.';


        arr2[0][2] = 'O';
        arr2[1][0] = 'O';
        arr2[2][1] = 'O';


        // - Print papan dengan format grid yang rapi
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        // ===== ARRAY JAGGED (IRREGULAR) =====
        System.out.println("\n=== ARRAY JAGGED (IRREGULAR) ===");

        // Latihan 3: Array dengan panjang baris yang berbeda
        // - Buat array 2D integer dengan 4 baris: baris 0 panjang 2, baris 1 panjang 4, baris 2 panjang 3, baris 3 panjang 5
        int[][] jagged = new int[4][];
        jagged[0] = new int[2];
        jagged[1] = new int[4];
        jagged[2] = new int[3];
        jagged[3] = new int[5];
        // - Isi setiap baris dengan angka berurutan dimulai dari 1
        int counter = 1;
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = counter++;
            }
        }

        // - Print array jagged dengan menampilkan panjang setiap baris
        for (int i = 0; i < jagged.length; i++) {
            System.out.print("row " + i + " (length " + jagged[i].length + "): ");
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        // ===== OPERASI LANJUTAN PADA ARRAY =====
        System.out.println("\n=== OPERASI LANJUTAN PADA ARRAY ===");

        // Latihan 4: Operasi matematika pada array 2D
        // - Buat dua matriks 2x3 dengan nilai bebas
        int[][] arr3 = {{3, 90, 32},
                {6, 86, 67}};
        int[][] arr4 = {{84, 94, 78},
                {34, 63, 96}};
        // - Implementasikan penjumlahan matriks (buat method addMatrices)
        int[][] result = addMatrices(arr3, arr4);


        // - Implementasikan perkalian setiap elemen dengan scalar 2 (buat method multiplyByScalar)
        int[][] result2 = multiplyByScalar(arr3, 2);

        // - Print hasil operasi
        System.out.println("Result of sum of matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < result2.length; i++) {
            for (int j = 0; j < result2[i].length; j++) {
                System.out.print(result2[i][j] + "\t");
            }
            System.out.println();
        }

        // ===== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE =====
        System.out.println("\n=== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE ===");

        // Latihan 5: Method yang menerima dan mengembalikan array
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        // - Panggil method sortArray untuk mengurutkan array
        // (implementasikan method sortArray yang menerima array dan mengembalikan array yang sudah diurutkan)

        int[] sorted = sortArray(numbers);
        System.out.println("sorted array values:");
        printArray(sorted);

        // - Panggil method reverseArray untuk membalik array
        // (implementasikan method reverseArray)
        int[] reversed = reverseArray(sorted);
        System.out.println("reversed array values:");
        printArray(reversed);


        // - Panggil method findMinMax untuk mencari nilai minimum dan maksimum
        // (implementasikan method yang mengembalikan array int dengan 2 elemen: [min, max])
        int[] minMax = findMinMax(numbers);
        System.out.println("minimum value: " + minMax[0]);
        System.out.println("maximum value: " + minMax[1]);


        // ===== UTILITY METHODS JAVA.UTIL.ARRAYS =====
        System.out.println("\n=== UTILITY METHODS JAVA.UTIL.ARRAYS ===");

        // Latihan 6: Eksplorasi utility methods Arrays
        int[] data = {5, 2, 8, 1, 9, 3};

        // - Gunakan Arrays.toString() untuk print array
        System.out.println(Arrays.toString(data));

        // - Gunakan Arrays.sort() untuk mengurutkan array
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));

        // - Gunakan Arrays.binarySearch() untuk mencari elemen (array harus sudah diurutkan)
        int find = 1;
        int index = Arrays.binarySearch(data, find);
        if (index >= 0) {
            System.out.println("Element " + find + " found at index " + index);
        } else {
            System.out.println("Element " + find + " not found.");
        }

        // - Gunakan Arrays.fill() untuk mengisi array dengan nilai tertentu
        Arrays.fill(data, 10);
        System.out.println(Arrays.toString(data));
        // - Gunakan Arrays.equals() untuk membandingkan dua array
        System.out.println(Arrays.equals(data, numbers));
        // - Gunakan Arrays.copyOf() untuk membuat copy array dengan ukuran berbeda\
        int[] cat = Arrays.copyOfRange(data, 0, 6);
        System.out.println(Arrays.toString(cat));

        // ===== ARRAY 3D DAN KOMPLEKS =====
        System.out.println("\n=== ARRAY 3D DAN KOMPLEKS ===");

        // Latihan 7: Array 3 dimensi
        // - Buat array 3D integer ukuran 2x3x4 (seperti 2 buah matriks 3x4)
        int[][][] trips = {{{1, 2, 3, 4}, {5, 6, 7, 8}},
                {{9, 10, 11, 12}, {13, 14, 15, 16}},
                {{17, 18, 19, 20}, {21, 22, 23, 24}}};

        // - Isi dengan nilai berurutan dari 1

        // - Print menggunakan triple nested loop dengan format yang jelas
        for (int i = 0; i < trips.length; i++) {
            for (int j = 0; j < trips[i].length; j++) {
                for (int k = 0; k < trips[i][j].length; k++) {
                    System.out.print(trips[i][j][k] + " ");
                }
            }
            System.out.println();
        }

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\n=== SKENARIO APLIKASI NYATA ===");

        // Latihan 8: Sistem nilai mahasiswa
        // - Buat array 2D untuk menyimpan nilai 5 mahasiswa, 4 mata kuliah
        String[] namaMahasiswa = {"Alice", "Bob", "Charlie", "Diana", "Eva"};
        String[] mataKuliah = {"Math", "Physics", "Chemistry", "Biology"};

        int[][] grd = new int[namaMahasiswa.length][mataKuliah.length];

        // - Isi dengan nilai random antara 60-100
        fillRandomGrades(grd, 60, 100);

        // - Hitung rata-rata per mahasiswa
        System.out.println("\nRata-rata per Mahasiswa:");
        for (int i = 0; i < grd.length; i++) {
            double rata = calculateAverage(grd[i]);
            System.out.printf("%s: %.2f%n", namaMahasiswa[i], rata);
        }


        // - Hitung rata-rata per mata kuliah
        System.out.println("\nRata-rata per Mata Kuliah:");
        for (int j = 0; j < mataKuliah.length; j++) {
            int[] col = new int[namaMahasiswa.length];
            for (int i = 0; i < namaMahasiswa.length; i++) {
                col[i] = grd[i][j];
            }
            double rata = calculateAverage(col);
            System.out.printf("%s: %.2f%n", mataKuliah[j], rata);
        }


        // - Tentukan mahasiswa dengan nilai tertinggi
        double nilaiTertinggi = 0;
        String mahasiswaTerbaik = "";
        for (int i = 0; i < grd.length; i++) {
            double rata = calculateAverage(grd[i]);
            if (rata > nilaiTertinggi) {
                nilaiTertinggi = rata;
                mahasiswaTerbaik = namaMahasiswa[i];
            }
        }
        System.out.printf("\nMahasiswa dengan nilai tertinggi: %s (%.2f)%n", mahasiswaTerbaik, nilaiTertinggi);


        // - Print dalam format tabel yang rapi
        System.out.println("Tabel Nilai Mahasiswa:");
        displayMatrix(grd, namaMahasiswa, mataKuliah);

        // Latihan 9: Game Tic-Tac-Toe sederhana
        // - Buat array 2D char 3x3 untuk papan permainan
        char[][] papan = new char[3][3];

        papan[0][0] = 'X';
        papan[0][1] = 'O';
        papan[0][2] = 'X';
        papan[1][0] = 'O';
        papan[1][1] = 'X';
        papan[2][2] = 'X';


        // - Implementasikan method untuk menampilkan papan



        // - Implementasikan method untuk mengecek apakah ada pemenang



        // - Simulasikan beberapa langkah permainan
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // ===== IMPLEMENTASI METHODS =====
    // TODO: Implementasikan method-method yang diperlukan di sini

    // Method untuk penjumlahan matriks
    // Method untuk perkalian scalar
    public static int[][] multiplyByScalar(int[][] matrix, int scalar) {
        int[][] result2 = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result2[i][j] = matrix[i][j] * scalar;
            }
        }
        return result2;
    }

    // Method untuk sorting array
    public static int[] sortArray(int[] arr) {
        int[] sorted = arr.clone(); // salin array agar tidak ubah aslinya
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[i] > sorted[j]) {
                    int temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
        return sorted;
    }

    // Method untuk reverse array
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // Method untuk find min dan max
    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        return new int[]{min, max};
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Method untuk display array 2D
    public static void displayMatrix(int[][] matrix, String[] namaMahasiswa, String[] mataKuliah) {
        System.out.printf("%-10s", "Nama");
        for (String mk : mataKuliah) {
            System.out.printf("%-10s", mk);
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("%-10s", namaMahasiswa[i]);
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%-10d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    // Method untuk mengisi array 2D dengan nilai random
    public static void fillRandomGrades(int[][] grades, int min, int max) {
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                grades[i][j] = (int) (Math.random() * (max - min + 1)) + min;
            }
        }
    }

    // Method untuk menghitung rata-rata array
    public static double calculateAverage(int[] values) {
        int sum = 0;
        for (int v : values) {
            sum += v;
        }
        return (double) sum / values.length;
    }


}





