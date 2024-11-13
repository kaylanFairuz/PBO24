import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class RentalMobil {
    public static void main(String[] args) {
        clearScreen();
        ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();
        ArrayList<Penyewaan> daftarPenyewaan = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Tambah data kendaraan
        daftarKendaraan.add(new Mobil("Toyota", "Avanza", 2021));
        daftarKendaraan.add(new Motor("Yamaha", "NMax", 2022));
        daftarKendaraan.add(new Sepeda("Polygon", "BMX", 2019, "BMX"));

        int pilihan;
        do {
            System.out.println("=== Sistem Rental Mobil ===");
            System.out.println("1. Lihat Daftar Kendaraan");
            System.out.println("2. Sewa Kendaraan");
            System.out.println("3. Lihat Daftar Penyewaan");
            System.out.println("4. Edit Daftar Penyewaan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            
            String error = "";
            switch (pilihan) {
                case 1:
                    clearScreen();
                    System.out.println("--- Daftar Kendaraan ---");
                    for (int i = 0; i < daftarKendaraan.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        daftarKendaraan.get(i).displayInfo();
                    }
                    System.out.println("");
                    break;
                case 2:
                    while (true) {
                        clearScreen();
                        System.out.println("--- Kendaraan Tersedia ---");
                        ArrayList<Kendaraan> kendaraanTersedia = new ArrayList<>();
                        for (Kendaraan k : daftarKendaraan) {
                            if (k.isTersedia()) {
                                kendaraanTersedia.add(k);
                            }
                        }
                        
                        if (kendaraanTersedia.isEmpty()) {
                            System.out.println("Tidak ada kendaraan yang tersedia untuk disewa.");
                            break;
                        }
    
                        for (int i = 0; i < kendaraanTersedia.size(); i++) {
                            System.out.print((i + 1) + ". ");
                            kendaraanTersedia.get(i).displayInfo();
                        }
                        
                        if (!error.isEmpty()) {
                            System.out.println("\n" + error);
                        }
                        System.out.print("\nPilih kendaraan untuk disewa: ");
                        int pilihanKendaraan = scanner.nextInt() - 1;
                        
                        
                        if (pilihanKendaraan >= 0 && pilihanKendaraan < kendaraanTersedia.size()) {
                            Kendaraan kendaraan = kendaraanTersedia.get(pilihanKendaraan);
                            
                            if (!kendaraan.isTersedia()) {
                                error = "Kendaraan sudah disewa";
                                continue;
                            }
    
                            System.out.print("Nama Customer: ");
                            String nama = scanner.next();
                            System.out.print("Nomor Telepon: ");
                            String noTelp = scanner.next();
                            System.out.print("Lama Peminjaman (Hari): ");
                            int lamaSewa = scanner.nextInt();
                            scanner.nextLine();
                            
                            if (lamaSewa < 1) {
                                error = "Lama peminjaman setidaknya 1 hari";
                                continue;
                            }
    
                            Customer customer = new Customer(nama, noTelp);
                            Penyewaan penyewaan = new Penyewaan(customer, kendaraan, LocalDate.now(), LocalDate.now().plusDays(lamaSewa));
                            daftarPenyewaan.add(penyewaan);
                            System.out.println("Kendaraan berhasil disewa!");
                        } else {
                            error = "Masukkan nomor kendaraan dari 1-" + kendaraanTersedia.size();
                            continue;
                        }
                        System.out.println("");
                        break;
                    }
                    error = "";
                    break;
                case 3:
                    clearScreen();
                    System.out.println("--- Daftar Penyewaan ---");
                    if (daftarPenyewaan.isEmpty()) {
                        System.out.println("Tidak ada kendaraan yang sedang disewa.");
                        System.out.println("");
                        break;
                    }
                    
                    for (int i = 0; i < daftarPenyewaan.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        daftarPenyewaan.get(i).displayInfo();
                        System.out.println("");
                    }
                    
                    System.out.println("");
                    break;
                case 4:
                    while (true) {
                        clearScreen();
                        System.out.println("--- Daftar Penyewaan ---");
                        if (daftarPenyewaan.isEmpty()) {
                            System.out.println("Tidak ada kendaraan yang sedang disewa.");
                            System.out.println("");
                            break;
                        }
                        
                        for (int i = 0; i < daftarPenyewaan.size(); i++) {
                            System.out.print((i + 1) + ". ");
                            daftarPenyewaan.get(i).displayInfo();
                            System.out.println("");
                        }
                        
                        if (!error.isEmpty()) {
                            System.out.println("\n" + error);
                        }
                        System.out.print("Pilih penyewaan untuk dikembalikan: ");
                        int pilihanSewa = scanner.nextInt() - 1;
                        if (pilihanSewa >= 0 && pilihanSewa < daftarPenyewaan.size()) {
                            Penyewaan penyewaan = daftarPenyewaan.remove(pilihanSewa);
                            penyewaan.getKendaraan().setTersedia(true);
                            System.out.println("Kendaraan berhasil dikembalikan!");
                        } else {
                            error = "Masukkan nomor penyewaan dari 1-" + daftarPenyewaan.size();
                            continue;
                        }
                        System.out.println("");
                        break;
                    }
                    error = "";
                    break;
            }
        } while (pilihan != 0);
        
        clearScreen();
        System.out.println("Program telah ditutup.");
        
        scanner.close();
    }
    
    public static void clearScreen() {
    try {
        if (System.getProperty("os.name").contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    } catch (Exception e) {
        System.out.println("Tidak bisa membersihkan terminal");
    }
}
}
