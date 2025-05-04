public class MainBangunRuang {
    public static void main(String[] args) {
        BangunRuang[] bangunRuangList = {
            new Kubus(4),
            new Balok(3, 4, 5),
            new Tabung(3, 7),
            new Kerucut(3, 5),
            new Limas(4, 4, 6),
            new Prisma(4, 5, 8),
            new Bola(5)
        };

        String[] namaBangun = {
            "Kubus", "Balok", "Tabung", "Kerucut", "Limas", "Prisma", "Bola"
        };

        for (int i = 0; i < bangunRuangList.length; i++) {
            System.out.println("Volume " + namaBangun[i] + " = " + bangunRuangList[i].hitungVolume());
        }
    }
}
