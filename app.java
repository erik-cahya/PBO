import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Array
        String[] titleProgram = { "Program Kalkulator Bangun Datar & Bangun Ruang", "Program Bangun Datar",
                "Program Bangun Ruang" };

        String repeatProgram;

        do {

            // Program Start
            System.out.println("\n\n\n==============================================");
            System.out.println(titleProgram[0]);
            System.out.println("==============================================");

            System.out.println("Main Menu : ");
            System.out.println("1. Bangun Datar");
            System.out.println("2. Bangun Ruang");
            System.out.print("Masukkan Pilihan Program : ");
            int mainMenu = scanner.nextInt();

            // Switch
            switch (mainMenu) {

            // Program Bangun Datar
            case 1:
                System.out.println("==============================================");
                System.out.println(titleProgram[1]);
                System.out.println("1. Persegi");
                System.out.println("2. Persegi Panjang");
                System.out.println("3. Segitiga");
                System.out.println("==============================================");
                System.out.print("Masukkan Pilihan Program : ");
                int userInput = scanner.nextInt();

                // Program Persegi
                if (userInput == 1) {
                    System.out.println("=============================================");

                    // for
                    for (int i = 0; i <= 4; i++) {
                        for (int x = 0; x <= 6; x++) {
                            System.out.print(" *");
                        }
                        System.out.println(" *");
                    }
                    // end for

                    System.out.println("=============================================");
                    System.out.println("Kalkulator Bangun Datar Persegi");
                    System.out.println("=============================================");
                    System.out.print("Masukkan Panjang Sisi : ");
                    int sisi = scanner.nextInt();

                    var luasPersegi = sisi * sisi;
                    var kelilingPersegi = 4 * sisi;

                    System.out.println("=============================================");
                    System.out.println("Panjang Luas Persegi : " + luasPersegi + "cm2");
                    System.out.println("Panjang Keliling Pesegi : " + kelilingPersegi + "cm");
                    System.out.println("=============================================");
                }
                // End Program Persegi

                break;
            // End Bangun Datar Program

            // Program Bangun Ruang
            case 2:
                System.out.println("==================================================");
                System.out.println(titleProgram[2]);
                System.out.println("1. Kubus");
                System.out.println("2. Balok");
                System.out.println("3. Lingkaran");
                System.out.println("==================================================");
                System.out.print("Masukkan Pilihan Program : ");
                userInput = scanner.nextInt();

                break;
            // End Bangun Ruang Program

            default:
                System.out.println("Tidak Ada Program Yang Dipilih");
                break;
            }
            // end switch

            System.out.print("Apakah Anda Ingin Mengulang ? : ");
            repeatProgram = scanner.next();

        } while ((repeatProgram.equals("y")) || (repeatProgram.equals("Yes")));

        // Program End

        System.out.println();
        System.out.println();
        System.out.println();
    }
}