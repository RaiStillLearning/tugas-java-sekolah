import javax.swing.JOptionPane;

public class testJOP {
    public static void main(String[] args) {
        pakaiJOptionPane();
    }

    public static void pakaiJOptionPane() {
        // Keliling lingkaran
        double r = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jari-jari lingkaran:"));
        double keliling = 2 * Math.PI * r;
        JOptionPane.showMessageDialog(null, "Keliling lingkaran: " + keliling);

        // Luas trapesium
        double a = Double.parseDouble(JOptionPane.showInputDialog("Masukkan sisi atas trapesium:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Masukkan sisi bawah trapesium:"));
        double t = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi trapesium:"));
        double luasTrapesium = 0.5 * (a + b) * t;
        JOptionPane.showMessageDialog(null, "Luas trapesium: " + luasTrapesium);

        // Luas prisma segitiga
        double alas = Double.parseDouble(JOptionPane.showInputDialog("Masukkan alas segitiga:"));
        double tinggiSegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi segitiga:"));
        double tinggiPrisma = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi prisma:"));
        double luasPrisma = 0.5 * alas * tinggiSegitiga * tinggiPrisma;
        JOptionPane.showMessageDialog(null, "Luas prisma segitiga: " + luasPrisma);
    }
}
