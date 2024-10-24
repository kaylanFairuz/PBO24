import java.util.HashMap;

public class Menu
{
    private HashMap<String, Integer> daftarMenu;
    
    public Menu()
    {
        daftarMenu = new HashMap<String, Integer>();
        
        daftarMenu.put("Nasi Goreng", 13000);
        daftarMenu.put("Nasi Bakar", 10000);
        daftarMenu.put("Nasi Rebus", 15000);
        daftarMenu.put("Es Teh Tawar", 4000);
        daftarMenu.put("Es Teh Manis", 5000);
        daftarMenu.put("Es Teh Asam", 6000);
    }
    
    public void addMenu(String nama_menu, int harga) {
        daftarMenu.put(nama_menu, harga);
    }
    
    public boolean checkMenu(String nama_menu) {
        if(daftarMenu.containsKey(nama_menu)) {
            return true;
        }
        return false;
    }
    
    public int getPrice(String nama_menu) {
        return daftarMenu.get(nama_menu);
    }
    
    public void displayMenu() {
        System.out.println("DAFTAR MENU");
        System.out.println("===========");
        for (String nama_menu : daftarMenu.keySet()) {
          System.out.println(nama_menu + "\t" + daftarMenu.get(nama_menu));
        }
    }
}
