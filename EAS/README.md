# Evaluasi Akhir Semester PBO G
Nama: Kaylan Fairuza Aqila

NRP: 5025231092

## Soal

1. Apa yang dimaksud dengan Inheritance dalam Java. Bagaimana implementasi inheritance dalam Final Project yang sedang dikerjakan.

2. Jelaskan fitur Aplikasi yang ada dalam Final Project

3. Buatlah desain Diagram Kelas dari aplikasi Final Project

4. Implementasikan Aplikasi yang telah didesain dengan menggunakan Pemrograman Berbasis Obyek Java

5. Buat PPT presentasi yang menunjang Demo Aplikasi

6. Demokan aplikasi dengan membuat video dan diupload di Youtube.

## Jawaban
1. _Inheritance_ adalah proses pewarisan atribut dan method dari kelas induk oleh kelas turunan. Tujuan dari _inheritance_ adalah pengefisienan kode/mencegah penulisan kode yang berulang untuk satu kelas yang mirip dengan kelas lainnya. 

    Dalam Snake Game, _inheritance_ dilakukan pada class `Snake` dari class `JFrame` dalam library Java Swing serta pada class `Board` dari class `JPanel` dalam library Java Swing.

    ```JAVA
    public class Snake extends JFrame {
        ...
    }

    public class Board extends JPanel implements ActionListener {
        ...
    }
    ```

2. Snake adalah permainan arkade klasik yang memiliki mekanika permainan yang sangat sederhana. Fitur yang disediakan antara lain:

    - Permainan disajikan melalui sebuah _window_ kecil yang dapat berpindah tempat.
    - Permainan disajikan melalui grafik pixel serta tema warna seperti permainan arkade klasik.
    - Permainan memberikan tantangan melalui modifikasi dari mekanika permainan Snake klasik dengan menambahkan penghalang di tengah papan permainan.

3. Karena adanya penggunaan library Java Swing, desain diagram kelas hanya terdiri dari dua class yaitu `Snake` dan `Board`. Desain diagram kelas adalah sebagai berikut:

    <img src="no-3.png">

4. Implementasi Snake Game dapat dilihat [disini](/EAS/snake-game/).

5. PPT presentasi dapat dilihat [disini](https://drive.google.com/file/d/1HXAgUEDUrIcrkcFe7ctBcgfRc6qsSBCV/view?usp=sharing).

6. Demo aplikasi dapat dilihat [disini](https://www.youtube.com/@kaylanfairuza9819) (menyusul)