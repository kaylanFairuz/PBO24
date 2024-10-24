import java.util.ArrayList;

public class Pesanan
{
    private Menu menu;
    private ArrayList<String> menuItems;
    private int totalHarga;
    private boolean isPaid;

    public Pesanan()
    {
        menu = new Menu();
        menuItems = new ArrayList<>();
        totalHarga = 0;
        isPaid = false;
    }
    
    public void tambahPesanan(String nama_menu) {
        if(menu.checkMenu(nama_menu)) {
            menuItems.add(nama_menu);
            totalHarga += menu.getPrice(nama_menu);
            System.out.println("Pilihan menu berhasil ditambahkan.");
        } else {
            System.out.println("Pilihan menu tidak ditemukan.");   
        }
    }
    
    public void hapusPesanan(String nama_menu) {
        if(menu.checkMenu(nama_menu)) {
            menuItems.remove(nama_menu);
            totalHarga -= menu.getPrice(nama_menu);
            System.out.println("Pilihan menu berhasil dihapus.");
        } else {
            System.out.println("Pilihan menu tidak ditemukan.");   
        }
    }
    
    public void tampilkanPesanan() {
        if(menuItems.isEmpty()) {
            System.out.println("Anda belum memesan apapun");
            System.out.println("");
            
            return;
        }
        
        System.out.println("DAFTAR PESANAN");
        System.out.println("==============");
        for(String nama_menu : menuItems) {
            System.out.println(nama_menu + " x1");
        }
        System.out.println("Total: " + totalHarga);
        System.out.println("");
    }
    
    public int ambilTotalHarga() {
        return totalHarga;
    }
    
    public void bayarPesanan() {
        isPaid = true;
        System.out.println("Pesanan berhasil dibayar");
    }
}
