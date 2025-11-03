import java.util.Scanner;

public class SoalSedang2 {
    public static double VolumeTabung(double jariJari, double tinggi) {                       <--------- Untuk Fungsi menghitung volumenya Tabung yakni (phi * r * r * t)
        double volume = 3.14 * jariJari * jariJari * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        //input
        Scanner input = new Scanner(System.in);                          <--------- Scanner lagi
        System.out.println("Masukkan Jari Jari Tabung : ");              <---------- sout untuk scanner jari jari tabung
        double r = input.nextDouble();     
        System.out.println("Masukkan Tinggi Tabung : ");                 <---------- sout untuk scanner Tinggi tabung
        double t = input.nextDouble();    

        //Volumenya
        double volume = VolumeTabung(r, t);                              <------------- Untuk Volumenya dipanggil rumusnya

        //Menampilkan Hasil                      <----------- Untuk menampilkan hasil
        System.out.println("Jari-jari : " + r);
        System.out.println("Tinggi    : " + t);
        System.out.println("Volume tabung : " + volume);                <--------- Cara kerjanya kurang lebih seperti masukkan inputan jari jari dan tinggi tabung lalu kita pangggil fungsi rumusnya dan tinggal dihitung dengan gabungan keduanya


        input.close();
    }
}
