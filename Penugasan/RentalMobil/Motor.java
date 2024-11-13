class Motor extends Kendaraan {
    private int jumlahRoda = 2;

    public Motor(String merk, String model, int tahunProduksi) {
        super(merk, model, tahunProduksi);
    }

    @Override
    public void displayInfo() {
        System.out.print("Motor - ");
        super.displayInfo();
        System.out.println("Jumlah Roda: " + jumlahRoda);
    }
}
