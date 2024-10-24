# Evaluasi Tengah Semester PBO G 2024
## Soal

1. Apa yang dimaksud dengan _inheritance_/**pewarisan** dalam OOP? Berikan contoh penerapan pewarisan dengan menunjukkan hubungan antara kelas induk dan kelas turunan.
2. Apakah fungsi konstruktor dalam sebuah kelas atau obyek? Buatlah kelas book yang memiliki dua atribut, yaitu judul, penulis, tahun terbit, nama penerbit, kategori buku. Tambahkan konstruktor untuk menginisialisasi atribut tersebut dan tambahkan metode printDetails() untuk mencetak detail buku.
3. Buatlah kelas bernama `ParkingTicketMachine` yang mensimulasikan mesin tiket parkir dengan fitur berikut:
   
   Atribut:
   - `balance` (jumlah nominal uang yang dimasukkan/di-_tap_ oleh pengguna)
   - `ticketPrice` (harga tiket parkir per jam, misalnya Rp5.000)
   - `ticketTime` (jumlah waktu parkir yang dibeli dalam jam)
   
   Method:
   - `insertMoney(int amount)`: menambahkan uang yang dimasukkan
   - `issueTicket()`: mengeluarkan tiket berdasarkan uang yang dimasukkan (jika saldo cukup) dan mengatur waktu parkir sesuai dengan saldo
   - `getTimePurchased()`: mengembalikan jumlah jam parkir yang telah dibeli
4. Buatkan desain kelas untuk aplikasi `FoodOrder` yang menyimpan data pemesanan makanan di sebuah restoran. Setiap pesanan memiliki atribut `menuItems` (daftar menu), `totalPrice`, dan `isPaid`. Implementasikan perilaku berikut: menggunakan library java.util.ArrayList.<br>
   a. Gambarkan _class diagram_-nya.<br>
   b. Implementasikan kodenya.

## Jawaban
1. _Inheritance_ adalah proses pewarisan atribut dari kelas induk oleh kelas turunan. Tujuan dari _inheritance_ adalah pengefisienan kode/mencegah penulisan kode yang berulang untuk satu kelas yang mirip dengan kelas lainnya.
   
   Salah satu contoh penerapan pewarisan adalah pada kelas `hewan`. Setiap hewan memiliki ciri-ciri makhluk hidup, dimana kemudian yang membedakan satu hewan dengan hewan lainnya adalah kingdom, genus, dan seterusnya. Misalnya kelas `hewan` dapat diturunkan menjadi dua kelas turunan yang berbeda, yaitu `mamalia` dan `reptil` dimana kedua kelas turunan ini mewarisi sifat hewan pada umumnya, tetapi memiliki perbedaannya tersendiri.

2. Konstruktor berfungsi untuk menginisialisasi variabel dalam objek saat pembuatan objek baru dari sebuah kelas. Dengan konstruktor, nilai dari sebuah variabel dalam objek dapat ditentukan langsung saat pembuatan objek tersebut. Implementasi kelas `Book` dapat dilihat [disini](Book.java).

3. Implementasi kelas `ParkingTicketMachine` dapat dilihat [disini](No-3)
   
4. (a) Desain kelas adalah sebagai berikut:
   
   (b) Implementasi dapat dilihat [disini](No-4).
