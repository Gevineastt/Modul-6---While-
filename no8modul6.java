package modul5;

public class no8modul6 {
    public static void main(String[] args) {
        int jumlahSuku = 10;
        double konstanta = -2 / Math.PI;

        double x = 1.5;
        double hasilFx = 0.5;
        int n = 1;

        while (n <= jumlahSuku) {
            int koefisien = 2 * n - 1;
            double suku = Math.sin(koefisien * x) / koefisien;
            hasilFx += suku;
            n++;
        }
        System.out.printf("f(%.2f) = %.5f%n", x, hasilFx);

        x = 2.75;
        hasilFx = 0.5;
        n = 1;

        while (n <= jumlahSuku) {
            int koefisien = 2 * n - 1;
            double suku = Math.sin(koefisien * x) / koefisien;
            hasilFx += suku;
            n++;
        }
        System.out.printf("f(%.2f) = %.5f%n", x, hasilFx);
    }
}
