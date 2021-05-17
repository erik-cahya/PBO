import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class App {

    public void save_data() {
        String fileName = "src/PBO_Senin.txt";
        String fileContent = "Selamat Belajar Java IO";

        try {
            FileWriter data = new FileWriter(fileName);
            data.write(fileContent);
            data.close();

            System.out.println("File Sudah Ditulis Ulang");
        } catch (IOException e) {
            System.out.println("Terjadi Kesalahan Karena : " + e.getMessage());
        }
    }

    public void read_data() {
        String fileName = "src/PBO_Senin.txt";

        try {
            // Membaca File
            File myFile = new File(fileName);
            Scanner fileReader = new Scanner(myFile);

            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Terjadi Kesalahan " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        App io = new App();

        // io.save_data();
        io.read_data();
    }
}
