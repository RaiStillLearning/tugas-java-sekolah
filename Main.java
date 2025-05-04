public class Main {
    public static void main(String[] args) {
        // Kelas BangunRuang berada dalam Main.java
        class BangunRuang {
            // Volume tabung = π * r² * t
            double volumeTabung(double jariJari, double tinggi) {
                return Math.PI * jariJari * jariJari * tinggi;
            }

            // Luas persegi panjang = p * l
            double luasPersegiPanjang(double panjang, double lebar) {
                return panjang * lebar;
            }

            // Luas trapesium = 1/2 * (a + b) * t
            double luasTrapesium(double sisiAtas, double sisiBawah, double tinggi) {
                return 0.5 * (sisiAtas + sisiBawah) * tinggi;
            }
        }

        BangunRuang bangun = new BangunRuang();

        System.out.println("Volume Tabung: " + bangun.volumeTabung(7, 10));
        System.out.println("Luas Persegi Panjang: " + bangun.luasPersegiPanjang(5, 3));
        System.out.println("Luas Trapesium: " + bangun.luasTrapesium(6, 4, 5));
    }
}
