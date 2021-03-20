import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        System.out.println("===============================");
        System.out.println("           KEDAI PBO3          ");
        System.out.println("===============================");

        System.out.println("1.Eceran    ||  2.Perbox");
        System.out.println("");
        int pmenu;
        Scanner menu = new Scanner(System.in);
        System.out.println("Masukkan Pilihan Anda [1]/[2]:");
        pmenu = menu.nextInt();

        switch (pmenu) {
        case 1:
            String lagi = "Y";
            while (lagi.equals("Y")) {
                System.out.println("===============================");
                System.out.println("          [1]. ECERAN          ");
                System.out.println("===============================");

                Scanner input = new Scanner(System.in);
                System.out.println("Masukkan Banyak Pesanan : ");
                int brg = input.nextInt();

                String barang[] = new String[brg];
                int harga[] = new int[brg];
                int jumlah[] = new int[brg];
                int total[] = new int[brg];
                int kembalian;
                int tot = 0;
                double jtotal = 0, jdiskon = 0;
                int i;

                for (i = 0; i < brg; i++) {
                    System.out.print("Nama Barang " + (i + 1) + " = ");
                    barang[i] = input.next();
                    System.out.print("Harga " + barang[i] + " = ");
                    harga[i] = input.nextInt();
                    System.out.print("Jumlah " + barang[i] + " = ");
                    jumlah[i] = input.nextInt();
                    total[i] = harga[i] * jumlah[i];
                    System.out.println("Total Bayar = " + total[i]);
                    System.out.println(" ");
                    tot = tot + total[i];
                }

                for (int j = 0; j < brg; j++) {
                    System.out.println("=================================");
                    System.out.println("        Barang ke- " + (j + 1));
                    System.out.println("---------------------------------");
                    System.out.println(" 1. Nama Barang   = " + barang[j]);
                    System.out.println(" 2. Harga Barang  = " + harga[j]);
                    System.out.println(" 3. Jumlah Barang = " + jumlah[j]);
                    System.out.println("=================================");
                }

                if (tot >= 50000) {
                    double diskon = 0.05;
                    jdiskon = diskon * tot;
                    System.out.println("Anda Mendapat Diskon 5%");

                } else if (tot >= 100000) {
                    double diskon = 0.1;
                    jdiskon = diskon * tot;
                    System.out.println("Anda Mendapat Diskon 10%");
                } else {
                    System.out.println("Anda Tidak Mendapat Diskon");
                }

                jtotal = tot - jdiskon;

                System.out.println("");
                System.out.println("Total Harga Belanja  = " + jtotal);
                System.out.println("=================================");

                Scanner uang = new Scanner(System.in);
                System.out.println("Masukkan Jumlah Uang Anda : ");
                int uangb = uang.nextInt();

                kembalian = uangb - tot;
                System.out.println("Total Kembalian Anda : " + kembalian);
                System.out.println("=================================");

                System.out.println("Ingin Memesan Lagi (Y/T) ?");
                Scanner ulang = new Scanner(System.in);
                lagi = ulang.nextLine().toUpperCase();
            }
            break;

        case 2:
            String lagi1 = "Y";
            while (lagi1.equals("Y")) {
                System.out.println("===============================");
                System.out.println("          [1]. PERBOX          ");
                System.out.println("===============================");

                Scanner input = new Scanner(System.in);
                System.out.println("Masukkan Banyak Box Pesanan : ");
                int brg = input.nextInt();

                String barang[] = new String[brg];
                int harga[] = new int[brg];
                int jumlah[] = new int[brg];
                int total[] = new int[brg];
                int kembalian;
                int tot = 0;
                double jtotal = 0, jdiskon = 0;
                int i;

                for (i = 0; i < brg; i++) {
                    System.out.print("Nama Barang Perbox " + (i + 1) + " = ");
                    barang[i] = input.next();
                    System.out.print("Harga Perbox " + barang[i] + " = ");
                    harga[i] = input.nextInt();
                    System.out.print("Jumlah Perbox " + barang[i] + " = ");
                    jumlah[i] = input.nextInt();
                    total[i] = harga[i] * jumlah[i];
                    System.out.println("Total Bayar = " + total[i]);
                    System.out.println(" ");
                    tot = tot + total[i];
                }

                for (int j = 0; j < brg; j++) {
                    System.out.println("=================================");
                    System.out.println("        Barang ke- " + (j + 1));
                    System.out.println("---------------------------------");
                    System.out.println(" 1. Nama Barang Perbox  = " + barang[j]);
                    System.out.println(" 2. Harga Barang Perbox = " + harga[j]);
                    System.out.println(" 3. Jumlah Barang Perbox = " + jumlah[j]);
                    System.out.println("=================================");
                }

                if (tot >= 500000) {
                    double diskon = 0.1;
                    jdiskon = diskon * tot;
                    System.out.println("Anda Mendapat Diskon 10%");

                } else if (tot >= 1000000) {
                    double diskon = 0.2;
                    jdiskon = diskon * tot;
                    System.out.println("Anda Mendapat Diskon 20%");
                } else {
                    System.out.println("Anda Tidak Mendapat Diskon");
                }

                jtotal = tot - jdiskon;

                System.out.println("");
                System.out.println("Total Harga Belanja  = " + jtotal);
                System.out.println("=================================");

                Scanner uang = new Scanner(System.in);
                System.out.println("Masukkan Jumlah Uang Anda : ");
                int uangb = uang.nextInt();

                kembalian = uangb - tot;
                System.out.println("Total Kembalian Anda : " + kembalian);
                System.out.println("=================================");

                System.out.println("Ingin Memesan Lagi (Y/T) ?");
                Scanner ulang = new Scanner(System.in);
                lagi1 = ulang.nextLine().toUpperCase();
            }
            break;
        }
    }
}