## ANALISA PRAKTIKUM

- **Interface `Workable`**:
    - Mendefinisikan satu metode `work()` yang harus diimplementasikan oleh kelas-kelas yang menggunakan antarmuka ini.

- **Interface `Eatable`**:
    - Mendefinisikan satu metode `eat()` yang harus diimplementasikan oleh kelas-kelas yang menggunakan antarmuka ini.

- **Kelas `Developer`**:
    - Implementasi dari kedua antarmuka `Workable` dan `Eatable`.
    - Mengimplementasikan metode `work()` untuk mencetak "Developer is coding." ketika objek `Developer` dipanggil untuk bekerja.
    - Mengimplementasikan metode `eat()` untuk mencetak "Developer is eating." ketika objek `Developer` dipanggil untuk makan.

- **Kelas `Robot`**:
    - Implementasi dari antarmuka `Workable`.
    - Mengimplementasikan metode `work()` untuk mencetak "Robot is working." ketika objek `Robot` dipanggil untuk bekerja.

- **Kelas `Main`**:
    - Metode `main` sebagai titik masuk program.
    - Membuat objek `developer` dari kelas `Developer` dan memanggil `developer.work()` untuk mencetak "Developer is coding.".
    - Menggunakan referensi `developer` untuk mengakses `Eatable` dan memanggil `eatableDeveloper.eat()` untuk mencetak "Developer is eating.".
    - Membuat objek `robot` dari kelas `Robot` dan memanggil `robot.work()` untuk mencetak "Robot is working.".

