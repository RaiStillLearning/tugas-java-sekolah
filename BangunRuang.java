abstract class BangunRuang {
    abstract double hitungVolume();
}

// Turunan: Kubus
class Kubus extends BangunRuang {
    double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double hitungVolume() {
        return Math.pow(sisi, 3);
    }
}

// Turunan: Balok
class Balok extends BangunRuang {
    double panjang, lebar, tinggi;

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

// Turunan: Tabung
class Tabung extends BangunRuang {
    double jariJari, tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolume() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }
}

// Turunan: Kerucut
class Kerucut extends BangunRuang {
    double jariJari, tinggi;

    public Kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi;
    }
}

// Turunan: Limas Segi Empat
class Limas extends BangunRuang {
    double panjang, lebar, tinggi;

    public Limas(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolume() {
        return (1.0 / 3.0) * panjang * lebar * tinggi;
    }
}

// Turunan: Prisma Segitiga
class Prisma extends BangunRuang {
    double alas, tinggiSegitiga, tinggiPrisma;

    public Prisma(double alas, double tinggiSegitiga, double tinggiPrisma) {
        this.alas = alas;
        this.tinggiSegitiga = tinggiSegitiga;
        this.tinggiPrisma = tinggiPrisma;
    }

    @Override
    double hitungVolume() {
        return 0.5 * alas * tinggiSegitiga * tinggiPrisma;
    }
}

// Turunan: Bola
class Bola extends BangunRuang {
    double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }
}
