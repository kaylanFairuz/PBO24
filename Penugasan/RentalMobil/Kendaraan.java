abstract class Kendaraan {
    protected String merk;
    protected String model;
    protected int tahunProduksi;
    protected boolean tersedia = true;

    public Kendaraan(String merk, String model, int tahunProduksi) {
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }

    public void setTersedia(boolean status) {
        this.tersedia = status;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void displayInfo() {
        System.out.println(merk + " " + model + " (" + tahunProduksi + ")");
        System.out.println("Status: " + (tersedia ? "Tersedia" : "Sedang Disewa"));
    }
}
