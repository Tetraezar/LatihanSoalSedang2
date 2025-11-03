import java.util.Scanner;

public class SoalSedang2 {
    public static double VolumeTabung(double jariJari, double tinggi) {
        double volume = 3.14 * jariJari * jariJari * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        //input
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jari Jari Tabung : ");
        double r = input.nextDouble();     
        System.out.println("Masukkan Tinggi Tabung : ");
        double t = input.nextDouble();    

        //Volumenya
        double volume = VolumeTabung(r, t);

        //Menampilkan Hasil
        System.out.println("Jari-jari : " + r);
        System.out.println("Tinggi    : " + t);
        System.out.println("Volume tabung : " + volume);


        input.close();
    }
}
