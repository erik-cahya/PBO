import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        String repeatProgram, suhu; // Tipe Data String
        Rumus rumus = new Rumus(); // Untuk menghubungkan file Main.java dengan Rumus.java
        String[] menuProgram = { "Konversi Celcius", "Konversi Farenheit", "Konversi Reamur", "Konversi Kelvin" }; // Array
        do {
            System.out.println("\n--------------------------------------------");
            System.out.println("Menu Program :");
            for (int x = 0; x < menuProgram.length; x++) { // Perulangan for untuk mengambil data Array
                System.out.println(x + 1 + ". " + menuProgram[x]);
            }
            System.out.println("--------------------------------------------");
            System.out.print("Masukkan pilihan program : ");
            short pilih = scr.nextShort(); // Tipe Data Short

            Scanner inputUser = new Scanner(System.in);
            switch (pilih) {
            case 1: // Konversi Celcius
                System.out.println("--------------------------------------------");
                System.out.println("Konversi suhu Celcius");
                System.out.print("Masukan suhu dalam Celcius : ");
                suhu = inputUser.nextLine();
                while (suhu.isEmpty()) {
                    System.out.print("\nError : Inputan tidak boleh kosong \n");
                    System.out.print("Masukan suhu dalam Celcius : ");
                    suhu = inputUser.nextLine();
                }
                if (suhu.matches("[0-9.]*")) {
                    Float newSuhu = Float.parseFloat(suhu); // Tipe Data Float
                    rumus.konversiCelcius(newSuhu);
                } else {
                    System.out.println("\nError : Inputan harus berupa angka\n");
                }
                break; // End Konversi Celcius
            case 2: // Konversi Farenheit
                System.out.println("--------------------------------------------");
                System.out.println("Konversi suhu Farenheit");
                System.out.print("Masukan suhu dalam Farenheit : ");
                suhu = inputUser.nextLine();
                while (suhu.isEmpty()) { //
                    System.out.print("\nError : Inputan tidak boleh kosong \n");
                    System.out.print("Masukan suhu dalam Farenheit : ");
                    suhu = inputUser.nextLine();
                }
                if (suhu.matches("[0-9.]*")) {
                    Float newSuhu = Float.parseFloat(suhu); // Tipe Data Float
                    rumus.konversiFarenheit(newSuhu);
                } else {
                    System.out.println("\nError : Inputan harus berupa angka\n");
                }
                break; // End Konversi Farenheit
            case 3: // Konversi Reamur
                System.out.println("--------------------------------------------");
                System.out.println("Konversi suhu Reamur");
                System.out.print("Masukan suhu dalam Reamur : ");
                suhu = inputUser.nextLine();
                while (suhu.isEmpty()) { // Pengecekan apakah inputan diisi/tidak
                    System.out.print("\nError : Inputan tidak boleh kosong \n");
                    System.out.print("Masukan suhu dalam Reamur : ");
                    suhu = inputUser.nextLine();
                }
                if (suhu.matches("[0-9.]*")) {
                    Float newSuhu = Float.parseFloat(suhu); // Tipe Data Float
                    rumus.konversiReamur(newSuhu);
                } else {
                    System.out.println("\nError : Inputan harus berupa angka\n");
                }
                break; // End Konversi Reamur
            case 4: // Konversi Kelvin
                System.out.println("--------------------------------------------");
                System.out.println("Konversi suhu Kelvin");
                System.out.print("Masukan suhu dalam Kelvin : ");
                suhu = inputUser.nextLine();
                while (suhu.isEmpty()) {
                    System.out.print("\nError : Inputan tidak boleh kosong \n");
                    System.out.print("Masukan suhu dalam Kelvin : ");
                    suhu = inputUser.nextLine();
                }
                if (suhu.matches("[0-9.]*")) {
                    Float newSuhu = Float.parseFloat(suhu); // Tipe Data Float
                    rumus.konversiKelvin(newSuhu);
                } else {
                    System.out.println("\nError : Inputan harus berupa angka\n");
                }
                break; // End Konversi Kelvin
            default:
                System.out.println("--------------------------------------------");
                System.out.println("Program yang anda pilih tidak tersedia");
                break;
            }
            System.out.println("--------------------------------------------");
            System.out.print("Apakah Anda Ingin Mengulang ? (y/n) : ");
            repeatProgram = scr.next();
        } while ((repeatProgram.equals("y")) || (repeatProgram.equals("Y")));
    }
}