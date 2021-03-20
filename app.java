import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        // ----------------------------------------------- Scanner
        Scanner scanner = new Scanner(System.in);

        // ---------------------------------------------------------------- Array
        String[] judulProgram =
        {
            "Kalkulator Bangun Datar & Ruang",

            "Kalkulator Bangun Datar",
            "Kalkulator Bangun Ruang",

            "Kalkulator Bangun Datar Persegi",
            "Kalkulator Bangun Datar Persegi Panjang",
            "Kalkulator Bangun Datar Segitiga",

            "Kalkulator Bangun Ruang Kubus",
            "Kalkulator Bangun Ruang Balok"

        };

        String repeatProgram;

        // ------------------------------------------------ Repeat Until
        do {

            clrscr();

            // Program Start
            System.out.println("==================================================");
            System.out.println(judulProgram[0]);
            System.out.println("==================================================");

            System.out.println("Main Menu : ");
            System.out.println("1. Bangun Datar");
            System.out.println("2. Bangun Ruang");
            System.out.println("==================================================");
            System.out.print("Masukkan Pilihan Program : ");
            int mainMenu = scanner.nextInt();

            // ----------------------------------------------- Switch Case

            switch (mainMenu) {
            // Program Bangun Datar
            case 1:
                clrscr();
                System.out.println("==================================================");
                System.out.println(judulProgram[1]);
                System.out.println("==================================================");
                System.out.println("Main Menu :");
                System.out.println("1. Persegi");
                System.out.println("2. Persegi Panjang");
                System.out.println("3. Segitiga");
                System.out.println("==================================================");
                System.out.print("Masukkan Pilihan Program : ");
                int userInput = scanner.nextInt();
                // ----------------------------------------------- If Else
                // Program Persegi
                if (userInput == 1) {
                    System.out.println("==================================================");

                    // ----------------------------------------------- For Do
                    for (int i = 0; i <= 5; i++) {
                        for (int x = 0; x <= 7; x++) {
                            System.out.print(" *");
                        }
                        System.out.println(" *");
                    }
                    // end for

                    System.out.println("==================================================");
                    System.out.println(judulProgram[3]);
                    System.out.println("==================================================");
                    System.out.print("Masukkan Panjang Sisi (cm) : ");
                    int sisi = scanner.nextInt();

                    double luasPersegi = sisi * sisi;
                    double kelilingPersegi = 4 * sisi;

                    System.out.println("==================================================");
                    System.out.println("Luas Persegi = " + luasPersegi + " cm2");
                    System.out.println("Keliling Pesegi = " + kelilingPersegi + " cm");
                    System.out.println("==================================================");
                }
                // End Program Persegi

                // Program Persegi Panjang
                else if (userInput == 2) {
                    System.out.println("==================================================");

                    // ----------------------------------------------- For Do
                    for (int i = 0; i <= 4; i++) {
                        for (int x = 0; x <= 18; x++) {
                            System.out.print(" *");
                        }
                        System.out.println(" *");
                    }
                    // end for
                    System.out.println("==================================================");
                    System.out.println(judulProgram[4]);
                    System.out.println("==================================================");
                    System.out.print("Masukkan Panjang (cm) : ");
                    int panjang = scanner.nextInt();
                    System.out.print("Masukkan Lebar (cm) : ");
                    int lebar = scanner.nextInt();

                    double luasPersegiPanjang = panjang * lebar;
                    double kelilingPersegiPanjang = 2 * (panjang + lebar);

                    System.out.println("==================================================");
                    System.out.println("Luas Persegi Panjang = " + luasPersegiPanjang + " cm2");
                    System.out.println("Keliling Pesegi Panjang = " + kelilingPersegiPanjang + " cm");
                    System.out.println("==================================================");
                }
                // End Program Persegi Panjang

                // Program Segitiga
                else if (userInput == 3) {
                    System.out.println("==================================================");

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
                    System.out.println("==================================================");
                    System.out.println(judulProgram[5]);
                    System.out.println("==================================================");
                    System.out.print("Masukkan ukuran alas (cm): ");
                    int alas = scanner.nextInt();

                    System.out.print("Masukkan Ukuran Tinggi (cm ): ");
                    int tinggi = scanner.nextInt();

                    System.out.print("Masukkan Sisi Miring Segitiga (cm) : ");
                    int miring = scanner.nextInt();

                    double luasSegitiga = 0.5 * alas * tinggi;
                    double kelilingSegitiga = alas + tinggi + miring;

                    System.out.println("==================================================");
                    System.out.println("Luas Segitiga = " + luasSegitiga + " cm");
                    System.out.println("Keliling Segitiga = " + kelilingSegitiga + " cm");
                    System.out.println("==================================================");
                }
                // End Program Segitiga
                else {
                    System.out.println("==================================================");
                    System.out.println("Maaf Program Tidak Tersedia");
                    System.out.println("==================================================");
                }
                break;
            // End Bangun Datar Program

            // Program Bangun Ruang
            case 2:
                clrscr();
                System.out.println("==================================================");
                System.out.println(judulProgram[2]);
                System.out.println("==================================================");
                System.out.println("Main Menu :");
                System.out.println("1. Kubus");
                System.out.println("2. Balok");
                System.out.println("==================================================");
                System.out.print("Masukkan Pilihan Program : ");
                userInput = scanner.nextInt();

                // Program Kubus
                if (userInput == 1) {
                    System.out.println("==================================================");
                    System.out.println(judulProgram[6]);
                    System.out.println("==================================================");
                    System.out.print("Masukkan Ukuran Sisi (cm) : ");
                    int sisi = scanner.nextInt();

                    double volumeKubus = sisi * sisi * sisi;
                    double luasPermukaan = 6 * (sisi * sisi);

                    System.out.println("==================================================");
                    System.out.println("Ukuran Volume Kubus = " + volumeKubus + " cm3");
                    System.out.println("Ukuran Luas Permukaan Kubus = " + luasPermukaan + " cm2");
                    System.out.println("==================================================");
                }
                // End Program Kubus

                // Program Balok
                else if (userInput == 2) {
                    System.out.println("==================================================");
                    System.out.println(judulProgram[7]);
                    System.out.println("==================================================");

                    System.out.print("Masukkan Ukuran Panjang Balok (cm) : ");
                    int panjang = scanner.nextInt();

                    System.out.print("Masukkan Ukuran Lebar Balok (cm) : ");
                    int lebar = scanner.nextInt();

                    System.out.print("Masukkan Ukuran Tinggi Balok (cm) : ");
                    int tinggi = scanner.nextInt();

                    double luasPermukaanBalok = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
                    double volumeBalok = panjang * lebar * tinggi;

                    System.out.println("==================================================");
                    System.out.println("Ukuran Volume Balok = " + volumeBalok + " cm3");
                    System.out.println("Ukuran Luas Permukaan Balok = " + luasPermukaanBalok + " cm2");
                    System.out.println("==================================================");
                }
                // End Program Balok
                else {
                    System.out.println("==================================================");
                    System.out.println("Program Tidak Tersedia");
                    System.out.println("==================================================");
                }

                break;
            // End Bangun Ruang Program


            default:
                System.out.println("==================================================");
                System.out.println("Program Tidak Tersedia");
                System.out.println("==================================================");

                break;
            }
            // end switch

            System.out.print("Apakah Anda Ingin Mengulang ? (y/n) : ");
            repeatProgram = scanner.next();

        } while ((repeatProgram.equals("y")) || (repeatProgram.equals("Yes")));
    }



    public static void clrscr(){
        try
        {
            new ProcessBuilder("cmd","/c", "cls").inheritIO().start().waitFor();
        }catch(Exception E)
        {
            System.out.println(E);
        }
    }
}