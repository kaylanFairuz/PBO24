import java.util.Scanner;

public class Main
{    
    public static void main(String[] args) {
        Pesanan pesanan = new Pesanan();
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di aplikasi FoodOrder:");
        
        System.out.println("Opsi: ");
        System.out.println("1. Tambahkan pesanan");
        System.out.println("2. Cek pesanan");
        System.out.println("3. Bayar");

        while(true) {
            System.out.print("Masukkan pilihan anda: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();
                
            if (pilihan == 1) {
                menu.displayMenu();
                
                while(true) {
                    System.out.println("");
                    System.out.print("Masukkan nama pesanan: ");
                    String nama_menu = scanner.nextLine();
                    pesanan.tambahPesanan(nama_menu);
                    
                    System.out.println("Pesan lagi? (y/n)");
                    char konfirmasi = scanner.next().charAt(0);
                    scanner.nextLine();
                    if(konfirmasi == 'y' || konfirmasi == 'Y') {
                        continue;
                    }
                    
                    System.out.println("");
                    break;
                }
                
            } else if (pilihan == 2) {
                pesanan.tampilkanPesanan();
                
            } else if (pilihan == 3) {
                if(pesanan.ambilTotalHarga() == 0) {
                    System.out.println("Anda belum memesan apapun");
                    System.out.println("Apakah anda ingin membatalkan pembelian? (y/n)");
                    
                    char konfirmasi = scanner.next().charAt(0);
                    if(konfirmasi == 'y' || konfirmasi == 'y') {
                        System.out.println("Terima kasih sudah menggunakan FoodOrder.");
                        System.out.println("");
                        break;
                    } else {
                        System.out.println("");
                        continue;
                    }
                }
                
                int jumlah = 0;
                while(true) {
                    System.out.println("Masukkan nominal pembayaran.");
                    jumlah += scanner.nextInt();
                    
                    if(jumlah < pesanan.ambilTotalHarga()) {
                        System.out.println("");
                        System.out.println("Uang masih kurang " + (pesanan.ambilTotalHarga()-jumlah) + " rupiah.");
                        continue;
                    }
                    
                    System.out.println("");
                    pesanan.bayarPesanan();
                    System.out.println("Kembalian anda sebesar " + (jumlah-pesanan.ambilTotalHarga()) + " rupiah. Mohon ditunggu :)");
                    System.out.println("");
                    break;
                }
                break;
            }
        }

        scanner.close();
    }
}
