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
        int [][] arr1 = new int[3][4];
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
        char[][] arr2 = new char [3][3];
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
        System.out.println("\\n=== ARRAY JAGGED (IRREGULAR) ===");

        // Latihan 3: Array dengan panjang baris yang berbeda
        // - Buat array 2D integer dengan 4 baris: baris 0 panjang 2, baris 1 panjang 4, baris 2 panjang 3, baris 3 panjang 5

        // - Isi setiap baris dengan angka berurutan dimulai dari 1

        // - Print array jagged dengan menampilkan panjang setiap baris

        // ===== OPERASI LANJUTAN PADA ARRAY =====
        System.out.println("\\n=== OPERASI LANJUTAN PADA ARRAY ===");

        // Latihan 4: Operasi matematika pada array 2D
        // - Buat dua matriks 2x3 dengan nilai bebas
        double[][] arr3 = {{3 , 90  ,32},
                {6, 86, 67}};
        double[][] arr4 = {{84, 94, 78},
                {34, 63, 96}};
        public static int[][] addMatrices(int[][] matrix1, int[][] matrix2){
            int [][] result = new int[matrix1.length][matrix1[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        }

        // - Implementasikan penjumlahan matriks (buat method addMatrices)



        // - Implementasikan perkalian setiap elemen dengan scalar 2 (buat method multiplyByScalar)

        // - Print hasil operasi

        // ===== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE =====
        System.out.println("\\n=== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE ===");

        // Latihan 5: Method yang menerima dan mengembalikan array
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        // - Panggil method sortArray untuk mengurutkan array
        // (implementasikan method sortArray yang menerima array dan mengembalikan array yang sudah diurutkan)

        // - Panggil method reverseArray untuk membalik array
        // (implementasikan method reverseArray)

        // - Panggil method findMinMax untuk mencari nilai minimum dan maksimum
        // (implementasikan method yang mengembalikan array int dengan 2 elemen: [min, max])

        // ===== UTILITY METHODS JAVA.UTIL.ARRAYS =====
        System.out.println("\\n=== UTILITY METHODS JAVA.UTIL.ARRAYS ===");

        // Latihan 6: Eksplorasi utility methods Arrays
        int[] data = {5, 2, 8, 1, 9, 3};

        // - Gunakan Arrays.toString() untuk print array

        // - Gunakan Arrays.sort() untuk mengurutkan array

        // - Gunakan Arrays.binarySearch() untuk mencari elemen (array harus sudah diurutkan)

        // - Gunakan Arrays.fill() untuk mengisi array dengan nilai tertentu

        // - Gunakan Arrays.equals() untuk membandingkan dua array

        // - Gunakan Arrays.copyOf() untuk membuat copy array dengan ukuran berbeda

        // ===== ARRAY 3D DAN KOMPLEKS =====
        System.out.println("\\n=== ARRAY 3D DAN KOMPLEKS ===");

        // Latihan 7: Array 3 dimensi
        // - Buat array 3D integer ukuran 2x3x4 (seperti 2 buah matriks 3x4)

        // - Isi dengan nilai berurutan dari 1

        // - Print menggunakan triple nested loop dengan format yang jelas

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\\n=== SKENARIO APLIKASI NYATA ===");

        // Latihan 8: Sistem nilai mahasiswa
        // - Buat array 2D untuk menyimpan nilai 5 mahasiswa, 4 mata kuliah
        String[] namaMahasiswa = {"Alice", "Bob", "Charlie", "Diana", "Eva"};
        String[] mataKuliah = {"Math", "Physics", "Chemistry", "Biology"};

        // - Isi dengan nilai random antara 60-100

        // - Hitung rata-rata per mahasiswa

        // - Hitung rata-rata per mata kuliah

        // - Tentukan mahasiswa dengan nilai tertinggi

        // - Print dalam format tabel yang rapi

        // Latihan 9: Game Tic-Tac-Toe sederhana
        // - Buat array 2D char 3x3 untuk papan permainan

        // - Implementasikan method untuk menampilkan papan

        // - Implementasikan method untuk mengecek apakah ada pemenang

        // - Simulasikan beberapa langkah permainan
    }

    // ===== IMPLEMENTASI METHODS =====
    // TODO: Implementasikan method-method yang diperlukan di sini

    // Method untuk penjumlahan matriks
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        // Implementasi penjumlahan matriks
        return null; // Ganti dengan implementasi yang benar
    }

    // Method untuk perkalian scalar
    public static int[][] multiplyByScalar(int[][] matrix, int scalar) {
        // Implementasi perkalian scalar
        return null; // Ganti dengan implementasi yang benar
    }

    // Method untuk sorting array
    public static int[] sortArray(int[] arr) {
        // Implementasi sorting (bisa menggunakan Arrays.sort atau implementasi sendiri)
        return null; // Ganti dengan implementasi yang benar
    }

    // Method untuk reverse array
    public static int[] reverseArray(int[] arr) {
        // Implementasi reverse array
        return null; // Ganti dengan implementasi yang benar
    }

    // Method untuk find min dan max
    public static int[] findMinMax(int[] arr) {
        // Return array dengan format [min, max]
        return null; // Ganti dengan implementasi yang benar
    }

    // Method untuk display array 2D
    public static void displayMatrix(int[][] matrix) {
        // Implementasi untuk menampilkan matriks dengan format rapi
    }

    // Method untuk mengisi array 2D dengan nilai random
    public static void fillRandomGrades(int[][] grades, int min, int max) {
        // Implementasi untuk mengisi array dengan nilai random
    }

    // Method untuk menghitung rata-rata array
    public static double calculateAverage(int[] values) {
        // Implementasi untuk menghitung rata-rata
        return 0.0; // Ganti dengan implementasi yang benar
    }
}

