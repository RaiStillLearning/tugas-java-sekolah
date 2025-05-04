public class MainAlatMusik {
    public static void main(String[] args) {
        AlatMusik[] musikList = {
            new Piano(),
            new Biola(),
            new Gitar(),
            new Drum(),
            new Saxophone(),
            new Trumpet()
        };

        System.out.println("===== Suara Alat Musik =====");
        for (AlatMusik alat : musikList) {
            alat.bunyi();
        }
    }
}

