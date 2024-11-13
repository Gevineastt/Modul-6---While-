package modul5;

import java.util.Scanner;

public class no6modul6 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);// membuat objek Scanner untuk menginputkan data dari user
        
        System.out.print("Banyak data yang akan diproses = ");
        int N = input.nextInt(); // Membaca jumlah data yang dimasukkan oleh pengguna
        
        double total = 0; // Variabel untuk menyimpan total dari semua data
        int count = 1; // Variabel untuk menghitung jumlah data yang sudah dimasukkan

        // Menggunakan loop while untuk meminta input data sebanyak N kali
        while (count <= N) {
            // Meminta pengguna untuk memasukkan data ke-n
            System.out.print("Data ke " + count + " : ");
            double data = input.nextDouble(); // Membaca data yang dimasukkan
            total += data; // Menambahkan data ke total
            count++; // Menaikkan count untuk data berikutnya
        }

        // Menghitung rata-rata dengan membagi total dengan jumlah data N
        double rataRata = total / N;
        // Menampilkan hasil rata-rata ke layar
        System.out.println("Rata-rata data adalah = " + rataRata);
        
        // Menutup scanner untuk menghindari kebocoran memori
        input.close();
    }
}