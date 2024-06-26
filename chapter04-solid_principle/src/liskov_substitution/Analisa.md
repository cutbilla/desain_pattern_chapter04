## ANALISA PRAKTIKUM

- **Kelas Abstrak Bird**:
    - `Bird` adalah kelas abstrak yang memiliki satu metode abstrak `move()`.
    - Ini menegaskan bahwa setiap turunan dari `Bird` harus mengimplementasikan metode `move()`, tetapi tidak memberikan implementasi standar untuk itu.

- **Kelas Sparrow**:
    - `Sparrow` adalah turunan dari `Bird`.
    - Implementasi metode `move()` pada `Sparrow` mencetak "Sparrow is flying", sesuai dengan perilaku burung pipit yang terbang.

- **Kelas Penguin**:
    - `Penguin` juga turunan dari `Bird`.
    - Implementasi metode `move()` pada `Penguin` mencetak "Penguin is swimming", sesuai dengan perilaku penguin yang berenang.

- **Kelas Main**:
    - `Main` memiliki metode `main` sebagai titik masuk program.
    - Membuat objek `sparrow` dari kelas `Sparrow` dan `penguin` dari kelas `Penguin`.
    - Memanggil metode `move()` pada objek `sparrow` akan mencetak "Sparrow is flying".
    - Memanggil metode `move()` pada objek `penguin` akan mencetak "Penguin is swimming".
