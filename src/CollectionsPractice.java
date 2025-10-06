import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Collections
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * ArrayList, generics, operasi CRUD, dan iterasi collections.
         */

        // ===== PERBEDAAN ARRAY VS ARRAYLIST =====
        System.out.println("=== PERBEDAAN ARRAY VS ARRAYLIST ===");

        // Latihan 1: Demonstrasi keterbatasan array vs keunggulan ArrayList
        // - Buat array integer dengan ukuran tetap 3
        int[] arrayInt = new int[3];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;

        // - Buat ArrayList<Integer> kosong
        ArrayList<Integer> arrayListInt = new ArrayList<>();

        // - Coba tambahkan 5 elemen ke array (akan error/terbatas)
        // - Tambahkan 5 elemen ke ArrayList (dinamis)
        arrayListInt.add(1);
        arrayListInt.add(2);
        arrayListInt.add(3);
        arrayListInt.add(4);
        arrayListInt.add(5);

        // - Print ukuran keduanya dan jelaskan perbedaannya dalam komentar
        System.out.println("Ukuran array: " + arrayInt.length);
        System.out.println("Ukuran ArrayList: " + arrayListInt.size());
        System.out.println("// Array punya ukuran tetap, ArrayList dinamis\n");

        // ===== GENERICS DASAR =====
        System.out.println("\n=== GENERICS DASAR ===");

        // Latihan 2: Memahami generics dan type safety
        // - Buat ArrayList tanpa generics (raw type) dan tambahkan berbagai tipe data
        ArrayList rawList = new ArrayList();
        rawList.add("String");
        rawList.add(10);
        rawList.add(3.14);
        System.out.println("Raw ArrayList: " + rawList);

        // - Buat ArrayList<String> dengan generics dan tambahkan hanya String
        ArrayList<String> listString = new ArrayList<>();
        listString.add("Halo");
        listString.add("Dunia");

        // - Buat ArrayList<Double> untuk menyimpan nilai desimal
        ArrayList<Double> listDouble = new ArrayList<>();
        listDouble.add(3.14);
        listDouble.add(2.71);

        // - Demonstrasikan type safety dengan mencoba menambahkan tipe yang salah
        System.out.println("ArrayList<String>: " + listString);
        System.out.println("ArrayList<Double>: " + listDouble);

        // ===== OPERASI CRUD PADA ARRAYLIST =====
        System.out.println("\n=== OPERASI CRUD PADA ARRAYLIST ===");

        // Latihan 3: Create - Menambah data
        ArrayList<String> daftarMahasiswa = new ArrayList<>();
        daftarMahasiswa.add("andrew");
        daftarMahasiswa.add("evan");
        daftarMahasiswa.add("mark");
        daftarMahasiswa.add("david");
        daftarMahasiswa.add("john");

        // - Tambahkan mahasiswa di posisi tertentu menggunakan add(index, element)
        daftarMahasiswa.add(2, "doe");

        // - Print daftar mahasiswa
        System.out.println("Daftar mahasiswa: " + daftarMahasiswa);

        // Latihan 4: Read - Membaca data
        // - Baca mahasiswa pertama menggunakan get(0)
        System.out.println("Mahasiswa pertama: " + daftarMahasiswa.get(0));

        // - Baca mahasiswa terakhir
        System.out.println("Mahasiswa terakhir: " + daftarMahasiswa.get(daftarMahasiswa.size() - 1));

        // - Cek apakah ada mahasiswa dengan nama tertentu menggunakan contains()
        System.out.println("john? " + daftarMahasiswa.contains("john!")); // false karena tanda seru

        // - Temukan index mahasiswa tertentu menggunakan indexOf()
        System.out.println("Index mark: " + daftarMahasiswa.indexOf("mark"));

        // - Print ukuran ArrayList menggunakan size()
        System.out.println("Ukuran ArrayList: " + daftarMahasiswa.size());

        // Latihan 5: Update - Mengubah data
        // - Ubah nama mahasiswa di index tertentu menggunakan set()
        daftarMahasiswa.set(1, "Bagus");

        // - Print daftar setelah update
        System.out.println("Setelah update: " + daftarMahasiswa);

        // Latihan 6: Delete - Menghapus data
        // - Hapus mahasiswa berdasarkan index menggunakan remove(index)
        daftarMahasiswa.remove(0);

        // - Hapus mahasiswa berdasarkan nama menggunakan remove(object)
        daftarMahasiswa.remove("david");
        System.out.println("Setelah remove: " + daftarMahasiswa);

        // - Hapus semua mahasiswa menggunakan clear()
        daftarMahasiswa.clear();

        // - Cek apakah ArrayList kosong menggunakan isEmpty()
        System.out.println("Setelah clear, kosong? " + daftarMahasiswa.isEmpty());

        // ===== ITERASI ARRAYLIST =====
        System.out.println("\n=== ITERASI ARRAYLIST ===");

        // Latihan 7: Berbagai cara iterasi
        ArrayList<Integer> angka = new ArrayList<>();
        // Isi dengan angka 10, 20, 30, 40, 50
        Collections.addAll(angka, 10, 20, 30, 40, 50);

        // - Iterasi menggunakan traditional for loop
        System.out.println("Traditional for loop:");
        for (int i = 0; i < angka.size(); i++) {
            System.out.print(angka.get(i) + " ");
        }
        System.out.println();

        // - Iterasi menggunakan enhanced for loop (for-each)
        System.out.println("Enhanced for loop:");
        for (int num : angka) {
            System.out.print(num + " ");
        }
        System.out.println();

        // - Iterasi menggunakan while loop
        System.out.println("While loop:");
        int index = 0;
        while (index < angka.size()) {
            System.out.print(angka.get(index) + " ");
            index++;
        }
        System.out.println();

        // - Iterasi menggunakan Iterator
        System.out.println("Iterator:");
        Iterator<Integer> iter = angka.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        // ===== ARRAYLIST DENGAN TIPE DATA KOMPLEKS =====
        System.out.println("\n=== ARRAYLIST DENGAN TIPE DATA KOMPLEKS ===");

        // Latihan 8: ArrayList of Arrays (simulasi objects)
        ArrayList<String[]> dataMahasiswa = new ArrayList<>();
        // - Tambahkan 3 data mahasiswa
        dataMahasiswa.add(new String[]{"mark", "101", "IT"});
        dataMahasiswa.add(new String[]{"john", "102", "accountant"});
        dataMahasiswa.add(new String[]{"evan", "103", "law"});

        // - Print semua data dengan format tabel
        System.out.println("Nama\tNIM\tJurusan");
        for (String[] mhs : dataMahasiswa) {
            System.out.println(mhs[0] + "\t" + mhs[1] + "\t" + mhs[2]);
        }

        // ===== UTILITY METHODS COLLECTIONS =====
        System.out.println("\n=== UTILITY METHODS COLLECTIONS ===");

        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 64, 34, 25, 12, 22, 11, 90);

        // - Gunakan Collections.sort() untuk mengurutkan
        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);

        // - Gunakan Collections.reverse() untuk membalik urutan
        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);

        // - Gunakan Collections.shuffle() untuk mengacak
        Collections.shuffle(numbers);
        System.out.println("Shuffled: " + numbers);

        // - Gunakan Collections.max() dan Collections.min()
        System.out.println("Max: " + Collections.max(numbers));
        System.out.println("Min: " + Collections.min(numbers));

        // - Gunakan Collections.frequency() untuk menghitung kemunculan elemen
        System.out.println("Frequency of 22: " + Collections.frequency(numbers, 22));

        // ===== SEARCHING DAN SORTING =====
        System.out.println("\n=== SEARCHING DAN SORTING ===");

        ArrayList<String> buah = new ArrayList<>();
        Collections.addAll(buah, "Apel", "Jeruk", "Mangga", "Pisang", "Anggur");

        // - Sort secara alfabetis
        Collections.sort(buah);
        System.out.println("Sorted buah: " + buah);

        // - Implementasikan binary search pada list yang sudah diurutkan
        int idx = Collections.binarySearch(buah, "Mangga");
        System.out.println("Binary search Mangga: index " + idx);

        // - Implementasikan linear search untuk list yang tidak diurutkan
        System.out.println("Linear search Pisang: index " + linearSearch(buah, "Pisang"));

        // ===== ARRAYLIST 2D =====
        System.out.println("\n=== ARRAYLIST 2D ===");

        ArrayList<ArrayList<Integer>> matrix2D = new ArrayList<>();
        matrix2D.add(new ArrayList<>(List.of(1, 2, 3)));
        matrix2D.add(new ArrayList<>(List.of(4, 5)));
        matrix2D.add(new ArrayList<>(List.of(6, 7, 8, 9)));
        printMatrix2D(matrix2D);

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\n=== SKENARIO APLIKASI NYATA ===");

        ArrayList<String[]> daftarBuku = new ArrayList<>();
        daftarBuku.add(new String[]{"Java Dasar", "Andi", "2020", "tersedia"});
        daftarBuku.add(new String[]{"Python Lanjut", "Budi", "2021", "tersedia"});
        daftarBuku.add(new String[]{"Data Science", "Citra", "2022", "dipinjam"});
        daftarBuku.add(new String[]{"Algoritma", "Dewi", "2020", "tersedia"});

        // Print tabel buku
        System.out.println("Judul\tPenulis\tTahun\tStatus");
        for (String[] buku : daftarBuku) {
            System.out.println(buku[0] + "\t" + buku[1] + "\t" + buku[2] + "\t" + buku[3]);
        }
    }

    public static int linearSearch(List<String> list, String target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) return i;
        }
        return -1;
    }

    public static void printMatrix2D(ArrayList<ArrayList<Integer>> matrix) {
        System.out.println("Matrix 2D:");
        for (ArrayList<Integer> row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static void pinjamBuku(ArrayList<String[]> daftarBuku, String judul) {
        for (String[] buku : daftarBuku) {
            if (buku[0].equalsIgnoreCase(judul)) {
                if (buku[3].equalsIgnoreCase("tersedia")) {
                    buku[3] = "dipinjam";
                    System.out.println("Buku \"" + judul + "\" berhasil dipinjam.");
                } else {
                    System.out.println("Buku \"" + judul + "\" sedang tidak tersedia.");
                }
                return;
            }
        }
        System.out.println("Buku \"" + judul + "\" tidak ditemukan.");
    }
    public static void cariBuku(ArrayList<String[]> daftarBuku, String judul) {
        for (String[] buku : daftarBuku) {
            if (buku[0].equalsIgnoreCase(judul)) {
                System.out.println("Buku ditemukan: " + buku[0] + ", Penulis: " + buku[1] + ", Tahun: " + buku[2] + ", Status: " + buku[3]);
                return;
            }
        }
        System.out.println("Buku \"" + judul + "\" tidak ditemukan.");
    }
    public static void kembalikanBuku(ArrayList<String[]> daftarBuku, String judul) {
        for (String[] buku : daftarBuku) {
            if (buku[0].equalsIgnoreCase(judul)) {
                if (buku[3].equalsIgnoreCase("dipinjam")) {
                    buku[3] = "tersedia";
                    System.out.println("Buku \"" + judul + "\" berhasil dikembalikan.");
                } else {
                    System.out.println("Buku \"" + judul + "\" tidak sedang dipinjam.");
                }
                return;
            }
        }
        System.out.println("Buku \"" + judul + "\" tidak ditemukan.");
    }
}
