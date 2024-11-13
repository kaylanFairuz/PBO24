import java.time.LocalDate;

class Penyewaan {
    private Customer customer;
    private Kendaraan kendaraan;
    private LocalDate tanggalSewa;
    private LocalDate tanggalKembali;

    public Penyewaan(Customer customer, Kendaraan kendaraan, LocalDate tanggalSewa, LocalDate tanggalKembali) {
        this.customer = customer;
        this.kendaraan = kendaraan;
        this.tanggalSewa = tanggalSewa;
        this.tanggalKembali = tanggalKembali;
        kendaraan.setTersedia(false);
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void displayInfo() {
        customer.displayInfo();
        kendaraan.displayInfo();
        System.out.println("Tanggal Sewa: " + tanggalSewa);
        System.out.println("Tanggal Kembali: " + tanggalKembali);
    }
}
