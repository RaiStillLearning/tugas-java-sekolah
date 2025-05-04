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
