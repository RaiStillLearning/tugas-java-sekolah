// Kelas untuk Abstraksi
abstract class BangunRuang {
    abstract double hitungVolume();
}

class Balok extends BangunRuang {
    private double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolume() {
        return panjang * lebar * tinggi;
    }
}

class Bola extends BangunRuang {
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }
}

// Kelas untuk Enkapsulasi
class Biodata {
    private String nama, nim, jurusan, fakultas, universitas, alamat, email, pekerjaan, hobi, keahlian, karya;

    // Setter method
    public void setBiodata(String nama, String nim, String jurusan, String fakultas, String universitas,
                           String alamat, String email, String pekerjaan, String hobi, String keahlian, String karya) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.universitas = universitas;
        this.alamat = alamat;
        this.email = email;
        this.pekerjaan = pekerjaan;
        this.hobi = hobi;
        this.keahlian = keahlian;
        this.karya = karya;
    }

    // Getter method
    public void tampilkanBiodata() {
        System.out.println("===== BIODATA =====");
        System.out.println("Nama        : " + nama);
        System.out.println("NIM         : " + nim);
        System.out.println("Jurusan     : " + jurusan);
        System.out.println("Fakultas    : " + fakultas);
        System.out.println("Universitas : " + universitas);
        System.out.println("Alamat      : " + alamat);
        System.out.println("Email       : " + email);
        System.out.println("Pekerjaan   : " + pekerjaan);
        System.out.println("Hobi        : " + hobi);
        System.out.println("Keahlian    : " + keahlian);
        System.out.println("Karya       : " + karya);
    }
}

// Kelas Main untuk menjalankan program
public class BiodataMain {
    public static void main(String[] args) {
        // Program Abstraksi: Menghitung Volume Balok dan Bola
        Balok balok = new Balok(4, 3, 2);
        Bola bola = new Bola(5);

        System.out.println("Volume Balok: " + balok.hitungVolume());
        System.out.println("Volume Bola: " + bola.hitungVolume());

        // Program Enkapsulasi: Menampilkan Biodata
        Biodata data = new Biodata();
        data.setBiodata(
            "Rakha Arkhana",
            "123456789",
            "Informatika",
            "Fakultas Ai Engineering",
            "Universitas Indonesia",
            "Depok, Jawa Barat",
            "rakha@email.com",
            "Freelancer",
            "Coding, Baca buku",
            "Frontend & Backend",
            "Aplikasi Web Analisis Kesehatan"
        );
        data.tampilkanBiodata();
    }
}
