class Customer {
    private String nama;
    private String nomorTelepon;

    public Customer(String nama, String nomorTelepon) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }

    public String getNama() {
        return nama;
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama + ", Telepon: " + nomorTelepon);
    }
}
