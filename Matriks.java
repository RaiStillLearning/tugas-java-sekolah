import java.util.Scanner;

public class Matriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] X = new int[2][2];
        int[][] Y = new int[2][2];
        int[][] hasil = new int[2][2];

        System.out.println("Masukkan elemen matriks X (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("X[" + i + "][" + j + "] = ");
                X[i][j] = input.nextInt();
            }
        }

        System.out.println("Masukkan elemen matriks Y (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Y[" + i + "][" + j + "] = ");
                Y[i][j] = input.nextInt();
            }
        }

        System.out.println("\nPilih operasi:");
        System.out.println("1. Pengurangan Matriks (X - Y)");
        System.out.println("2. Perkalian Matriks (X * Y)");
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                // Pengurangan Matriks
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        hasil[i][j] = X[i][j] - Y[i][j];
                    }
                }
                System.out.println("Hasil pengurangan matriks (X - Y):");
                printMatriks(hasil);
                break;

            case 2:
                // Perkalian Matriks
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        hasil[i][j] = 0;
                        for (int k = 0; k < 2; k++) {
                            hasil[i][j] += X[i][k] * Y[k][j];
                        }
                    }
                }
                System.out.println("Hasil perkalian matriks (X * Y):");
                printMatriks(hasil);
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }

    // Method untuk mencetak matriks 2x2
    public static void printMatriks(int[][] matriks) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
