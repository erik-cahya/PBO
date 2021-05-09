import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        var hitung = new Hitung();
        String ulang;

        do {
            clrscr();

            String[] menu = { "1. Mobil", "2. Motor" };
            System.out.println("===============================================");
            System.out.println("=       SISTEM HITUNG BIAYA PARKIR INAP       =");
            System.out.println("=   BANDARA INTERNASIONAL I GUSTI NGURAH RAI  =");
            System.out.println("===============================================");
            System.out.println("Pilihan Jenis Kendaraan :                   ");
            for (int x = 0; x <= 1; x++) {
                System.out.println(menu[x]);
            }
            System.out.println("===============================================");
            System.out.print("Masukkan Pilihan : ");
            short jenis = input.nextShort();

            
            System.out.println("===============================================");

            switch (jenis) {
            // Mobil
            case 1:
                hitung.HitungMobil();
                break;

            // Motor
            case 2:
                hitung.HitungMotor();
                break;
            default:
                System.out.println("Program yang anda pilih tidak ada");
                break;
            }
            System.out.println("===============================================");

            System.out.print("Apakah anda ingin mengulang ? : ");
            ulang = input.next();
        } while ((ulang.equals("y")) || (ulang.equals("Y")));
    }

    public static void clrscr() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }
}