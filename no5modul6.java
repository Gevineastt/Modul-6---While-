package modul5;

public class no5modul6 {
    public static void main(String[] args) {
       
        int hargaPerliter = 6500; // inisialisai variable hargaPerliter dengan nilai 6500
        int jumlahLiter = 1; //inisialisai variable jumlahLiter dengan nilai 1

        System.out.println("Harga per liter Rp" + hargaPerliter); 
        System.out.println("Jumlah liter Harga (Rp)");
        System.out.println(" =========================");

        while (jumlahLiter <= 8) { // perulangan while dengan kondisi jumlahLiter <= 8
            int totalHarga = hargaPerliter * jumlahLiter; // menyimpan hasil perhitungan hargaPerliter * jumlahLiter ke variable totalHarga
            System.out.println(jumlahLiter + "" + totalHarga);
            jumlahLiter++; // incremen nilai jumlahLiter dengan 1
            
        }
        System.out.println("=========================");
    }
}
