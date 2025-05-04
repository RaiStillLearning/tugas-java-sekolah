public class Looping {
    public static void main(String[] args) {

        // a. Bilangan Prima 1-1000 dengan for-loop
        System.out.println("Bilangan Prima antara 1 - 1000:");
        for (int i = 2; i <= 1000; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }

        // b. Bilangan Genap 1-1000 dengan while-loop
        System.out.println("\n\nBilangan Genap antara 1 - 1000:");
        int angka = 1;
        while (angka <= 1000) {
            if (angka % 2 == 0) {
                System.out.print(angka + " ");
            }
            angka++;
        }

        // b. Bilangan Ganjil 1-1000 dengan do-while-loop
        System.out.println("\n\nBilangan Ganjil antara 1 - 1000:");
        int angka2 = 1;
        do {
            if (angka2 % 2 != 0) {
                System.out.print(angka2 + " ");
            }
            angka2++;
        } while (angka2 <= 1000);
    }

    // Fungsi untuk mengecek apakah suatu angka adalah bilangan prima
    public static boolean isPrima(int angka) {
        if (angka < 2) return false;
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
}



// //📌 Penjelasan Singkat:
// 🔹 for-loop untuk prima
// Cocok karena jumlah iterasi sudah jelas (1 sampai 1000)

// Mengecek apakah i habis dibagi bilangan selain 1 dan dirinya sendiri

// 🔹 while-loop untuk genap
// Cocok saat kamu ingin mengecek kondisi dulu baru jalan

// Pakai angka % 2 == 0 untuk cek genap

// 🔹 do-while-loop untuk ganjil
// Cocok untuk kondisi minimal 1 kali jalan

// Pakai angka % 2 != 0 untuk cek ganjil