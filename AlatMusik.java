class AlatMusik {
    void bunyi() {
        System.out.println("Alat musik mengeluarkan suara...");
    }
}

class Piano extends AlatMusik {
    @Override
    void bunyi() { System.out.println("Piano: Plink plonk..."); }
}

class Biola extends AlatMusik {
    @Override
    void bunyi() { System.out.println("Biola: Sreeeng..."); }
}

class Gitar extends AlatMusik {
    @Override
    void bunyi() { System.out.println("Gitar: Jreng jreng..."); }
}

class Drum extends AlatMusik {
    @Override
    void bunyi() { System.out.println("Drum: Dum tak dum tak..."); }
}

class Saxophone extends AlatMusik {
    @Override
    void bunyi() { System.out.println("Saxophone: Wuu wuuu..."); }
}

class Trumpet extends AlatMusik {
    @Override
    void bunyi() { System.out.println("Trumpet: Tuuut tuuut..."); }
}
