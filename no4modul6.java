package modul5;

import java.util.Scanner;

public class no4modul6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // membuat objek Scanner
        int putar = 1; // inisislaisasi variable putar
        double jumlah = 0; // inisialisasi variable jumlah 
        double bilangan = 0; // inisialisasi variable bilangan

        while ( putar <= 5 ) { // melakukan perulangan sebanyak 5 kali
            System.out.print("Masukkan data ke"+putar+ ":"); 
            bilangan = input.nextDouble(); // membaca dan menyimpan input user ke dalam variable bilangan
            jumlah = jumlah + bilangan; // menyimpan hasil perhtiungan bilangan dengan jumlah ke variable jumlah
            putar++; // increament variable putar
            }
            System.out.println(" Jumlah 5 bilangan tersebut adalah "+  jumlah);
            

            input.close(); // mengehentikan input yang sedang dijalankan 
    }
}
