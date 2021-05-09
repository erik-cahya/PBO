import java.util.Scanner;

public class Hitung extends App {

    Scanner input = new Scanner(System.in);

    Scanner masukan = new Scanner(System.in);

    void HitungMobil() {
        System.out.println("=           BIAYA PARKIR INAP MOBIL           =");
        System.out.println("= Rp. 10000 / 12 Jam Pertama                  =");
        System.out.println("= Rp. 5000 / 1 Jam Berikutnya                 =");
        System.out.println("===============================================");
        

        

        System.out.print("Nomor Polisi : ");
        String nopolMobil = masukan.nextLine();
        
        
        System.out.print("Lama Parkir : ");
        int lamaMobil = masukan.nextInt();
        



        System.out.println("===============================================");
        if (lamaMobil <= 12) {
            final int biaya = 10000;
            int totalBiaya = biaya;
            System.out.println("Nomor Polisi    : " + nopolMobil);
            System.out.println("Lama Parkir : " + lamaMobil + " Jam");
            System.out.println("Biaya Parkir : Rp " + totalBiaya);
        } else if (lamaMobil >= 12) {
            final int biaya = 10000;
            int totalBiaya = biaya + 5000 * (lamaMobil - 12);
            System.out.println("Nomor Polisi    : " + nopolMobil);
            System.out.println("Lama Parkir : " + lamaMobil + " Jam");
            System.out.println("Biaya Parkir : Rp " + totalBiaya);
        }
    }

    void HitungMotor() {
        System.out.println("=           BIAYA PARKIR INAP MOTOR           =");
        System.out.println("= Rp. 4000 / 12 Jam Pertama                   =");
        System.out.println("= Rp. 2000 / 1 Jam Berikutnya                 =");
        System.out.println("===============================================");

        System.out.print("Nomor Polisi : ");
        String nopolMotor = masukan.nextLine();

        System.out.print("Lama Parkir : ");
        int lamaMotor = masukan.nextInt();
        System.out.println("===============================================");
        if (lamaMotor <= 12) {
            final int biaya = 4000;
            int totalBiaya = biaya;
            System.out.println("Nomor Polisi    : " + nopolMotor);
            System.out.println("Lama Parkir     : " + lamaMotor + " Jam");
            System.out.println("Biaya Parkir    : Rp " + totalBiaya);
        } else if (lamaMotor >= 12) {
            final int biaya = 4000;
            int totalBiaya = biaya + 2000 * (lamaMotor - 12);
            System.out.println("Nomor Polisi    : " + nopolMotor);
            System.out.println("Lama Parkir : " + lamaMotor + " Jam");
            System.out.println("Biaya Parkir : Rp " + totalBiaya);
        }
    }

}