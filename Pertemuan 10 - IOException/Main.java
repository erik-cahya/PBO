import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public void save_data(String name, String jurusan, Integer nim) {

        String fileName = "src/" + nim.toString() + ".txt";
        String fileContent = "Nama : " + name + "\nJurusan : " + jurusan + "\nNim : " + nim;

        try {
            FileWriter data = new FileWriter(fileName);
            data.write(fileContent);
            data.close();

            System.out.println("File Sudah Ditulis Ulang");
        } catch (IOException e) {
            System.out.println("Terjadi Kesalahan" + e.getMessage());
        }
    }

    public void read_data(Integer nim) {
        String fileName = "src/" + nim.toString() + ".txt";

        try {
            // Membaca File
            File myFile = new File(fileName);
            Scanner fileReader = new Scanner(myFile);

            // Cetak Isi File
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Terjadi Kesalahan : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda : ");
        String nama = input.nextLine();

        Main io = new Main();
        String name = nama;
        String jurusan = "Sistem Informatika";
        Integer nim = 190030209;

        io.save_data(name, jurusan, nim);
        // io.read_data(nim);
    }
}