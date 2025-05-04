public class MainExceptionHandling {

    public static void main(String[] args) {
        
        // Contoh ArithmeticException
        try {
            int a = 10;
            int b = 2;
            int result = a / b;  // Pembagian dengan nol
            System.out.println("Hasil pembagian: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi ArithmeticException: " + e.getMessage());
        }

        // Contoh IndexOutOfBoundsException
        try {
            int[] angka = {1, 2, 3};  // Array dengan 3 elemen
            System.out.println(angka[5]);  // Mencoba mengakses indeks ke-5 yang tidak ada
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Terjadi IndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
