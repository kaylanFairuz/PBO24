class Sepeda extends Kendaraan {
    private String jenisSepeda;

    public Sepeda(String merk, String model, int tahunProduksi, String jenisSepeda) {
        super(merk, model, tahunProduksi);
        this.jenisSepeda = jenisSepeda;
    }

    @Override
    public void displayInfo() {
        System.out.print("Sepeda - ");
        super.displayInfo();
        System.out.println("Jenis: " + jenisSepeda);
    }
}

