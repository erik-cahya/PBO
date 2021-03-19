import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println();

        // Program Start
        System.out.println("==================================================");
        System.out.println("Program Kalkulator Bangun Ruang & Bangun Datar");
        System.out.println("==================================================");
        System.out.println("Main Menu : ");
        System.out.println("1. Bangun Ruang");
        System.out.println("2. Bangun Datar");
        System.out.print("Masukkan Pilihan Program : ");
        int mainMenu = input.nextInt();

        switch (mainMenu) {
        case 1:
            System.out.println("Program Bangun Ruang");
            break;

        case 2:
            System.out.println("Program Bangun Ruang");
            break;
        }
        // Program End
        System.out.println();
        System.out.println();
        System.out.println();
    }
}