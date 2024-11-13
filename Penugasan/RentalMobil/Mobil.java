class Mobil extends Kendaraan {
    private int jumlahRoda = 4;

    public Mobil(String merk, String model, int tahunProduksi) {
        super(merk, model, tahunProduksi);
    }

    @Override
    public void displayInfo() {
        System.out.print("Mobil - ");
        super.displayInfo();
        System.out.println("Jumlah Roda: " + jumlahRoda);
    }
}
