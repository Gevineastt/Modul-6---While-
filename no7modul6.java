package modul5;

import java.util.Scanner;
public class no7modul6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan banyak data yang akan diolah: ");
        int N = input.nextInt();
        
        double jumlah = 0, jumlahKuadrat = 0;
        double data, maks, min;
        
        // Meminta input data pertama
        System.out.print("Masukkan data ke 1: ");
        data = input.nextDouble();
        
        // Inisialisasi nilai awal untuk maks dan min dengan data pertama
        maks = data;
        min = data;
        jumlah += data;
        jumlahKuadrat += data * data;
        
        int i = 2;
        while (i <= N) {
            System.out.print("Masukkan data ke " + i + ": ");
            data = input.nextDouble();
            
            jumlah += data;
            jumlahKuadrat += data * data;
            
            // Menentukan nilai maksimum dan minimum
            if (data > maks) {
                maks = data;
            }
            if (data < min) {
                min = data;
            }
            
            i++;
        }
        
        double rataRata = jumlah / N;
        double rentang = maks - min;
        double variansi = (jumlahKuadrat - (jumlah * jumlah / N)) / N;
        double deviasiStandar = Math.sqrt(variansi);
        
        //Mencetak output
        System.out.println("Data terbesar\t: " + maks);
        System.out.println("Data terkecil\t: " + min);
        System.out.println("Rentang data\t: " + rentang);
        System.out.println("Rata-rata\t: " + rataRata);
        System.out.println("Variansi\t: " + variansi);
        System.out.println("Deviasi standar\t: " + deviasiStandar);
    }
}
