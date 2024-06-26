## ANALISA PRAKTIKUM

### a. Program `single_responsibility.Author.java`
- **Analisis**:
    - Baris 1-6: Mendefinisikan kelas `single_responsibility.Author` dengan dua atribut `authorId` (int) dan `name` (String).
    - Baris 9-12: Setter dan getter untuk atribut `authorId`.
    - Baris 14-17: Setter dan getter untuk atribut `name`.

### b. Program `single_responsibility.AuthorRepo.java`
- **Analisis**:
    - Baris 1-4: Interface `single_responsibility.AuthorRepo` yang mendefinisikan dua metode:
        - `checkAuthorId(int authorId)`: Untuk memeriksa keberadaan penulis berdasarkan `authorId`.
        - `save(single_responsibility.Author author)`: Untuk menyimpan objek `single_responsibility.Author`.

### c. Program `single_responsibility.InMemoryAuthorRepo.java`
- **Analisis**:
    - Baris 1-2: Import paket yang diperlukan.
    - Baris 4: Deklarasi kelas `single_responsibility.InMemoryAuthorRepo` yang mengimplementasikan `single_responsibility.AuthorRepo`.
    - Baris 5: Deklarasi `Map` `authors` untuk menyimpan objek `single_responsibility.Author`.
    - Baris 7-10: Override dari metode `checkAuthorId` untuk memeriksa keberadaan `authorId` dalam `Map`.
    - Baris 12-15: Override dari metode `save` untuk menyimpan objek `single_responsibility.Author` ke dalam `Map`.

### d. Program `single_responsibility.Book.java`
- **Analisis**:
    - Baris 1-4: Deklarasi atribut `authorId`, `name`, dan `publisher`.
    - Baris 7-10: Konstruktor untuk menginisialisasi objek `single_responsibility.Book` dengan nilai awal.
    - Baris 13-16: Getter dan setter untuk `authorId`.
    - Baris 18-21: Getter dan setter untuk `name`.
    - Baris 23-26: Getter dan setter untuk `publisher`.

### e. Program `single_responsibility.BookRepo.java`
- **Analisis**:
    - Baris 1-4: Interface `single_responsibility.BookRepo` yang mendefinisikan dua metode:
        - `save(single_responsibility.Book book)`: Untuk menyimpan objek `single_responsibility.Book`.
        - `findByAuthorIdAndBookName(int authorId, String bookName)`: Untuk mencari objek `single_responsibility.Book` berdasarkan `authorId` dan `bookName`.

### f. Program `single_responsibility.InMemoryBookRepo.java`
- **Analisis**:
    - Baris 1-2: Import paket yang diperlukan.
    - Baris 4: Deklarasi kelas `single_responsibility.InMemoryBookRepo` yang mengimplementasikan `single_responsibility.BookRepo`.
    - Baris 5: Deklarasi `Map` `books` untuk menyimpan objek `single_responsibility.Book`.
    - Baris 7-10: Override dari metode `save` untuk menyimpan objek `single_responsibility.Book` ke dalam `Map` dengan menggunakan `authorId` dan `name` sebagai kunci.
    - Baris 12-16: Override dari metode `findByAuthorIdAndBookName` untuk mencari objek `single_responsibility.Book` berdasarkan `authorId` dan `bookName` dari `Map`.

### g. Program `single_responsibility.AuthorService.java`
- **Analisis**:
    - Baris 1-2: Deklarasi kelas `single_responsibility.AuthorService` dengan atribut `authorRepo` yang merupakan instance dari `single_responsibility.AuthorRepo`.
    - Baris 4-7: Konstruktor untuk menginisialisasi `authorRepo`.
    - Baris 9-13: Metode `saveIfNotExist` untuk menyimpan penulis baru dengan nama default "unknown" jika penulis belum ada dalam repositori.

### h. Program `single_responsibility.BookService.java`
- **Analisis**:
    - Baris 1-2: Deklarasi kelas `single_responsibility.BookService` dengan atribut `bookRepo` (repositori buku) dan `authorService` (layanan penulis).
    - Baris 4-8: Konstruktor untuk menginisialisasi `bookRepo` dan `authorService`.
    - Baris 10-25: Metode `saveBook` untuk menyimpan buku dengan melakukan validasi buku, menyimpan penulis jika belum ada menggunakan `authorService`, dan menyimpan buku ke dalam `bookRepo`.
    - Baris 27-32: Metode `getPublisherName` untuk mendapatkan nama penerbit atau default "Anonym".
    - Baris 34-41: Metode `validateBook` untuk memvalidasi buku berdasarkan `authorId` dan `bookName`, dan melempar exception jika buku sudah ada.

### i. Program `Main.java`
- **Analisis**:
  - Baris 3-10: Blok `try-catch` untuk mencoba menyimpan beberapa buku menggunakan `bookService`. Pada baris 5, penggunaan `null` pada `publisher` menyebabkan nama penerbit menjadi "Anonym".
  - Baris 13-17: Setelah menyimpan buku, dilakukan pencarian buku dengan `authorId` dan `bookName` tertentu menggunakan `bookRepo`. Jika buku ditemukan, informasi buku (nama dan ID penulis) dicetak; jika tidak, pesan "Buku tidak ditemukan" ditampilkan.
