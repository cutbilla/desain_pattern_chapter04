## ANALISA PRAKTIKUM

1. **Interface Shape**
    - `Shape` adalah sebuah antarmuka yang mendefinisikan metode `calculateArea()` untuk menghitung luas area bentuk geometris.

2. **Kelas Rectangle**
    - `Rectangle` merupakan implementasi dari `Shape`.
    - Memiliki atribut `width` dan `height` untuk mendefinisikan panjang dan lebar persegi panjang.
    - Konstruktor `Rectangle(double width, double height)` digunakan untuk inisialisasi atribut `width` dan `height`.
    - Mengimplementasikan metode `calculateArea()` untuk menghitung dan mengembalikan luas persegi panjang.
    - Menyediakan getter dan setter untuk `width` dan `height`.

3. **Kelas Circle**
    - `Circle` juga mengimplementasikan `Shape`.
    - Memiliki atribut `radius` untuk mendefinisikan jari-jari lingkaran.
    - Konstruktor `Circle(double radius)` digunakan untuk inisialisasi atribut `radius`.
    - Mengimplementasikan metode `calculateArea()` untuk menghitung dan mengembalikan luas lingkaran menggunakan formula `π * radius^2`.
    - Menyediakan getter dan setter untuk `radius`.

4. **Kelas AreaCalculator**
    - `AreaCalculator` memiliki metode `calculateArea(Shape shape)` yang menggunakan polimorfisme untuk menghitung luas area berdasarkan jenis `Shape` yang diberikan.
    - Memanggil metode `calculateArea()` dari objek `Shape` yang diteruskan sebagai argumen.

#### Main.java
1. **Kelas Main**
    - Pada metode `main`, membuat objek `rectangle` dari kelas `Rectangle` dengan lebar 4 dan tinggi 5.
    - Membuat objek `circle` dari kelas `Circle` dengan radius 3.
    - Membuat objek `calculator` dari kelas `AreaCalculator`.
    - Memanggil `calculator.calculateArea(rectangle)` untuk menghitung dan mencetak luas area persegi panjang.
    - Memanggil `calculator.calculateArea(circle)` untuk menghitung dan mencetak luas area lingkaran.
