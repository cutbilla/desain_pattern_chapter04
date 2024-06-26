## ANALISA PRAKTIKUM
- **Interface `Switchable`**
  - Merupakan antarmuka yang mendefinisikan dua metode `turnOn()` dan `turnOff()` yang harus diimplementasikan oleh kelas-kelas yang menggunakan antarmuka ini.

- **Kelas `LightBulb`**
  - Implementasi dari antarmuka `Switchable`.
  - Mengimplementasikan metode `turnOn()` untuk mencetak "LightBulb is turned on" ketika lampu dinyalakan.
  - Mengimplementasikan metode `turnOff()` untuk mencetak "LightBulb is turned off" ketika lampu dimatikan.

- **Kelas `Switch`**
  - Menerima objek yang mengimplementasikan `Switchable` melalui konstruktor.
  - Metode `flip(boolean on)` digunakan untuk menyalakan atau mematikan objek yang disediakan berdasarkan nilai boolean `on`.
  - Bergantung pada antarmuka `Switchable` daripada kelas spesifik `LightBulb`, mengikuti prinsip Dependency Inversion dengan mengurangi ketergantungan langsung pada implementasi kelas `LightBulb`.

- **Kelas `Main`**
  - Metode `main` sebagai titik masuk program.
  - Membuat objek `lightBulb` dari kelas `LightBulb` yang mengimplementasikan `Switchable`.
  - Membuat objek `lightSwitch` dari kelas `Switch` dengan objek `lightBulb` sebagai argumen konstruktor.
  - Memanggil `lightSwitch.flip(true)` untuk menyalakan lampu dan mencetak "LightBulb is turned on".
  - Memanggil `lightSwitch.flip(false)` untuk mematikan lampu dan mencetak "LightBulb is turned off".