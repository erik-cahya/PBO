import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        // ----------------------------------------------- Scanner
        Scanner scanner = new Scanner(System.in);

        // ---------------------------------------------------------------- Array
        String[] titleProgram = { "Program Kalkulator Bangun Datar & Ruang", "Kalkulator Bangun Datar",
                "Kalkulator Bangun Ruang", "Kalkulator Bangun Datar Persegi", "Kalkulator Bangun Datar Persegi Panjang",
                "Kalkulator Bangun Datar Segitiga" };

        String repeatProgram;
        // ------------------------------------------------ Repeat Until
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

            // ----------------------------------------------- Switch Case
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
                // ----------------------------------------------- If Else
                // Program Persegi
                if (userInput == 1) {
                    System.out.println("=============================================");

                    // ----------------------------------------------- For Do
                    for (int i = 0; i <= 4; i++) {
                        for (int x = 0; x <= 6; x++) {
                            System.out.print(" *");
                        }
                        System.out.println(" *");
                    }
                    // end for

                    System.out.println("=============================================");
                    System.out.println(titleProgram[3]);
                    System.out.println("=============================================");
                    System.out.print("Masukkan Panjang Sisi : ");
                    int sisi = scanner.nextInt();

                    var luasPersegi = sisi * sisi;
                    var kelilingPersegi = 4 * sisi;

                    System.out.println("=============================================");
                    System.out.println("Luas Persegi = " + luasPersegi + " cm2");
                    System.out.println("Keliling Pesegi = " + kelilingPersegi + " cm");
                    System.out.println("=============================================");
                }
                // End Program Persegi

                // Program Persegi Panjang
                else if (userInput == 2) {
                    System.out.println("=============================================");

                    // ----------------------------------------------- For Do
                    for (int i = 0; i <= 4; i++) {
                        for (int x = 0; x <= 10; x++) {
                            System.out.print(" *");
                        }
                        System.out.println(" *");
                    }
                    // end for
                    System.out.println("=============================================");
                    System.out.println(titleProgram[4]);
                    System.out.println("=============================================");
                    System.out.print("Masukkan Panjang (AB) : ");
                    int panjang = scanner.nextInt();
                    System.out.print("Masukkan Lebar (BC) : ");
                    int lebar = scanner.nextInt();

                    var luasPersegiPanjang = panjang * lebar;
                    var kelilingPersegiPanjang = 2 * (panjang + lebar);

                    System.out.println("=============================================");
                    System.out.println("Luas Persegi Panjang = " + luasPersegiPanjang + " cm2");
                    System.out.println("Keliling Pesegi Panjang = " + kelilingPersegiPanjang + " cm");
                    System.out.println("=============================================");
                }
                // End Program Persegi Panjang

                // Program Segitiga
                else if (userInput == 3) {
                    System.out.println("=============================================");

                    // ----------------------------------------------- For Do
                    int i, x;
                    for (i = 0; i < 6; i++) {
                        for (x = 2 * (6 - i); x >= 0; x--) {
                            System.out.print(" ");
                        }
                        for (x = 0; x <= i; x++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    // end for
                    System.out.println("=============================================");
                    System.out.println(titleProgram[5]);
                    System.out.println("=============================================");
                    System.out.print("Masukkan ukuran alas : ");
                    int alas = scanner.nextInt();

                    System.out.print("Masukkan Ukuran Tinggi : ");
                    int tinggi = scanner.nextInt();

                    System.out.print("Masukkan Sisi Miring Segitiga : ");
                    int miring = scanner.nextInt();

                    var luasSegitiga = 0.5 * alas * tinggi;
                    var kelilingSegitiga = alas + tinggi + miring;

                    System.out.println("=============================================");
                    System.out.println("Luas Segitiga = " + luasSegitiga + " cm");
                    System.out.println("Keliling Segitiga = " + kelilingSegitiga + " cm");
                    System.out.println("=============================================");
                }
                // End Program Segitiga
                else {
                    System.out.println("Maaf Program Tidak Tersedia");
                }
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

                // Program Kubus
                if (userInput == 1) {
                    System.out.println("=============================================");
                    System.out.println("Kalkulator Kubus");
                    System.out.println("=============================================");
                    System.out.print("Masukkan Ukuran Sisi : ");
                    int sisi = scanner.nextInt();

                    var volumeKubus = sisi * sisi * sisi;
                    var luasPermukaan = 6 * (sisi * sisi);

                    System.out.println("=============================================");
                    System.out.println("Ukuran Volume Kubus = " + volumeKubus + " cm3");
                    System.out.println("Ukuran Luas Permukaan Kubus = " + luasPermukaan + " cm2");
                }
                // End Program Kubus

                // Program Balok
                else if (userInput == 2) {

                }
                // End Program Balok
                else {
                    System.out.println("Program Tidak Tersedia");
                }

                break;
            // End Bangun Ruang Program

            default:
                System.out.println("Program Tidak Tersedia");
                break;
            }
            // end switch

            System.out.print("Apakah Anda Ingin Mengulang ? (y/n) : ");
            repeatProgram = scanner.next();

        } while ((repeatProgram.equals("y")) || (repeatProgram.equals("Yes")));
    }
}