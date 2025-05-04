import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class InputGabungan {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih metode input:");
        System.out.println("1. Scanner");
        System.out.println("2. BufferedReader");
        System.out.println("3. JOptionPane");
        System.out.print("Pilihan anda: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                pakaiScanner();
                break;
            case 2:
                pakaiBufferedReader();
                break;
            case 3:
                pakaiJOptionPane();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    // Metode Scanner
    public static void pakaiScanner() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = input.nextDouble();
        System.out.println("Keliling lingkaran: " + (2 * Math.PI * r));

        System.out.print("Masukkan sisi atas trapesium: ");
        double a = input.nextDouble();
        System.out.print("Masukkan sisi bawah trapesium: ");
        double b = input.nextDouble();
        System.out.print("Masukkan tinggi trapesium: ");
        double t = input.nextDouble();
        System.out.println("Luas trapesium: " + (0.5 * (a + b) * t));

        System.out.print("Masukkan alas segitiga: ");
        double alas = input.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggiSegitiga = input.nextDouble();
        System.out.print("Masukkan tinggi prisma: ");
        double tinggiPrisma = input.nextDouble();
        double luasPrisma = 0.5 * alas * tinggiSegitiga * tinggiPrisma;
        System.out.println("Luas prisma segitiga: " + luasPrisma);
    }

    // Metode BufferedReader
    public static void pakaiBufferedReader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = Double.parseDouble(reader.readLine());
        System.out.println("Keliling lingkaran: " + (2 * Math.PI * r));

        System.out.print("Masukkan sisi atas trapesium: ");
        double a = Double.parseDouble(reader.readLine());
        System.out.print("Masukkan sisi bawah trapesium: ");
        double b = Double.parseDouble(reader.readLine());
        System.out.print("Masukkan tinggi trapesium: ");
        double t = Double.parseDouble(reader.readLine());
        System.out.println("Luas trapesium: " + (0.5 * (a + b) * t));

        System.out.print("Masukkan alas segitiga: ");
        double alas = Double.parseDouble(reader.readLine());
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggiSegitiga = Double.parseDouble(reader.readLine());
        System.out.print("Masukkan tinggi prisma: ");
        double tinggiPrisma = Double.parseDouble(reader.readLine());
        double luasPrisma = 0.5 * alas * tinggiSegitiga * tinggiPrisma;
        System.out.println("Luas prisma segitiga: " + luasPrisma);
    }

    // Metode JOptionPane
    public static void pakaiJOptionPane() {
        double r = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jari-jari lingkaran:"));
        double keliling = 2 * Math.PI * r;
        JOptionPane.showMessageDialog(null, "Keliling lingkaran: " + keliling);

        double a = Double.parseDouble(JOptionPane.showInputDialog("Masukkan sisi atas trapesium:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Masukkan sisi bawah trapesium:"));
        double t = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi trapesium:"));
        double luasTrapesium = 0.5 * (a + b) * t;
        JOptionPane.showMessageDialog(null, "Luas trapesium: " + luasTrapesium);

        double alas = Double.parseDouble(JOptionPane.showInputDialog("Masukkan alas segitiga:"));
        double tinggiSegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi segitiga:"));
        double tinggiPrisma = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi prisma:"));
        double luasPrisma = 0.5 * alas * tinggiSegitiga * tinggiPrisma;
        JOptionPane.showMessageDialog(null, "Luas prisma segitiga: " + luasPrisma);
    }
}


// penjelasan 
// Kita import semua library yang dibutuhkan:
// Scanner: input biasa via terminal
// BufferedReader: input juga via terminal, tapi lebih "manual"
// JOptionPane: input/output pakai popup GUI

//pusat program
// public class InputGabungan {
//     public static void main(String[] args) throws IOException {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Pilih metode input:");
//         System.out.println("1. Scanner");
//         System.out.println("2. BufferedReader");
//         System.out.println("3. JOptionPane");
//         System.out.print("Pilihan anda: ");
//         int pilihan = scanner.nextInt();
// Program tampilkan menu awal untuk memilih input.
// ➡️ Pakai scanner.nextInt() buat baca pilihan user.


//switch case
//kalau kamau pilih 1 fungsi misalnya (pakaiScanner) maka panggil fungsi pakaiScanner()

// Rumus yang digunakan
// | Nama                        | Rumus                                    |
// |-----------------------------|------------------------------------------|
// | Keliling lingkaran         | `2 × π × r`                              |
// | Luas trapesium             | `0.5 × (a + b) × t`                      |
// | Luas prisma segitiga       | `0.5 × alas × tinggiSegitiga × tinggiPrisma` |