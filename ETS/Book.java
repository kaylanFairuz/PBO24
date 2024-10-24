/**
 * Kelas buku berfungsi untuk menyimpan serta
 * menampilkan data buku
 */
public class Book
{
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private String namaPenerbit;
    private String kategoriBuku;
    
    /**
     * Konstruktor objek kelas buku
     */
    public Book(String Judul, String Penulis, int TahunTerbit, String NamaPenerbit, String KategoriBuku)
    {
        judul = Judul;
        penulis = Penulis;
        tahunTerbit = TahunTerbit;
        namaPenerbit = NamaPenerbit;
        kategoriBuku = KategoriBuku;
    }

    public void printDetails()
    {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Nama Penerbit: " + namaPenerbit);
        System.out.println("Kategori: " + kategoriBuku);
    }
}
