# 📚 Kotlin OOP: Kumpulan Konsep & Implementasi

Repositori ini berisi kumpulan contoh kode Kotlin yang berfokus pada konsep Object-Oriented Programming (OOP). Cocok digunakan sebagai referensi belajar, memahami, dan mempraktikkan fitur-fitur OOP penting dalam bahasa Kotlin.

---

## 📄 Daftar File Kotlin

Berikut adalah daftar file dan folder yang ada di repositori ini, diorganisir berdasarkan topik dan struktur folder.

### 📁 **Folder Aplikasi Contoh**

Direktori ini berisi contoh-contoh implementasi konsep OOP dalam skenario aplikasi yang lebih spesifik.

-   **[`app_contoh/`](https://github.com/MENSTRUE/Kotlin-oop/tree/master/src/app_contoh)**: Folder yang berisi contoh aplikasi atau modul terpisah.
    -   [`isinya.kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/app_contoh/isinya.kt): (Deskripsi isi file ini perlu ditambahkan secara manual berdasarkan kontennya).

-   **[`app_lari/`](https://github.com/MENSTRUE/Kotlin-oop/tree/master/src/app_lari)**: Folder yang memuat bagian dari aplikasi yang berfokus pada fungsionalitas terkait "lari" atau "perlombaan".
    -   [`app.kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/app_lari/app.kt): (Deskripsi isi file ini perlu ditambahkan secara manual).
    -   [`constractor lomba.kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/app_lari/constractor%20lomba.kt): Contoh konstruktor terkait objek lomba.
    -   [`function overloading kata-kata.kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/app_lari/function%20overloading%20kata-kata.kt): Demonstrasi *function overloading* dengan parameter bertipe string atau "kata-kata".
    -   [`function rute.kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/app_lari/function%20rute.kt): Contoh fungsi yang menangani atau mendefinisikan rute.
    -   [`notification_sample.kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/app_lari/notification_sample.kt): Contoh implementasi atau penggunaan notifikasi.
    -   [`properties constractor program.kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/app_lari/properties%20constractor%20program.kt): Properti kelas yang diinisialisasi melalui konstruktor dalam konteks program.

### 🗄️ **Folder Database**

Direktori ini berisi file-file yang mungkin merepresentasikan struktur data, model, atau interaksi dengan database (meskipun implementasi database sebenarnya mungkin tidak ada, ini bisa menjadi representasi objek data).

-   **[`database/`](https://github.com/MENSTRUE/Kotlin-oop/tree/master/src/database)**: Folder untuk representasi data atau model database.
    -   [`data personal.kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/database/data%20personal.kt): Kelas atau objek untuk menyimpan data personal.
    -   [`kata_kata_pelari.kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/database/kata_kata_pelari.kt): Data terkait "kata-kata" atau frasa untuk pelari.
    -   [`lomba.kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/database/lomba.kt): Model data atau objek untuk entitas lomba.
    -   [`notification.kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/database/notification.kt): Model data atau objek untuk entitas notifikasi.
    -   [`program.kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/database/program.kt): Model data atau objek untuk entitas program.
    -   [`rute.kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/database/rute.kt): Model data atau objek untuk entitas rute.
    -   [`speed.kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/database/speed.kt): Model data atau objek untuk entitas kecepatan.
    -   [`waktu penyelesaian.kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/database/waktu%20penyelesaian.kt): Model data atau objek untuk entitas waktu penyelesaian.

### 📦 **Folder Contoh Package**

-   **[`misal_package/`](https://github.com/MENSTRUE/Kotlin-oop/tree/master/src/misal_package)**: Direktori yang menunjukkan penggunaan *package* untuk mengorganisir kode dan menghindari konflik penamaan.
    -   [`contoh_class.kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/misal_package/contoh_class.kt): Sebuah contoh kelas yang ditempatkan dalam sebuah package.

### ⚙️ **File Dasar Kelas & Objek**

File-file ini berada di root folder `src/` dan menjelaskan konsep-konsep inti OOP.

-   [`Main.kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/Main.kt) - Titik masuk utama program Kotlin. Kode di sini sering digunakan untuk memanggil dan menguji fungsionalitas dari file lain.
-   [`class.kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/class.kt) - Implementasi dasar sebuah kelas di Kotlin, menunjukkan bagaimana mendefinisikan properti dan fungsi.
-   [`constructor.kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/constructor.kt) - Contoh penggunaan konstruktor utama (primary constructor) untuk inisialisasi objek.
-   [`function overloading.kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/function%20overloading.kt) - Demonstrasi *method overloading*, yaitu kemampuan untuk memiliki beberapa fungsi dengan nama yang sama tetapi dengan daftar parameter yang berbeda.
-   [`function(method).kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/function(method).kt) - Penjelasan tentang bagaimana fungsi didefinisikan dan digunakan di dalam sebuah kelas (sebagai metode).
-   [`Inheritance.kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/Inheritance.kt) - Contoh implementasi pewarisan (inheritance), menunjukkan bagaimana sebuah kelas dapat mewarisi properti dan fungsi dari kelas lain.
-   [`initializer block.kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/initializer%20block.kt) - Penggunaan blok inisialisasi (`init`) untuk menjalankan logika inisialisasi saat sebuah objek dibuat.
-   [`object.kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/object.kt) - Contoh penggunaan *object declaration* dan *companion object* di Kotlin, yang sering digunakan untuk pola Singleton atau fungsi/properti statis.
-   [`properties.kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/properties.kt) - Penjelasan mendalam tentang berbagai jenis properti di Kotlin, termasuk properti mutable (var) dan immutable (val), serta kustomisasi getter/setter.
-   [`propertis constractor.kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/propertis%20constractor.kt) - Kemungkinan merupakan contoh spesifik atau lanjutan dari properti yang diinisialisasi melalui konstruktor.
-   [`secondary constractor.kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/secondary%20constractor.kt) - Contoh lebih lanjut atau fokus pada penggunaan dan skenario untuk konstruktor sekunder.
-   [`this_keyword.kt`](https://github.com/MENSTRUE/Kotlin-oop/blob/master/src/this_keyword.kt) - Penggunaan kata kunci `this` untuk merujuk pada instance kelas saat ini, membedakan antara properti kelas dan parameter fungsi, atau memanggil konstruktor lain.

---

## 🧠 Tujuan

Repositori ini dibuat untuk mempermudah proses belajar konsep Object-Oriented Programming (OOP) dalam Kotlin secara bertahap, dengan menyediakan contoh kode yang jelas dan terorganisir. Ini adalah sumber daya yang bagus untuk memahami bagaimana Kotlin menerapkan prinsip-prinsip OOP.

---

## 🚀 Cara Menjalankan

1.  **Clone repositori ini:**
    ```bash
    git clone [https://github.com/MENSTRUE/Kotlin-oop.git](https://github.com/MENSTRUE/Kotlin-oop.git)
    cd Kotlin-oop
    ```
2.  **Buka di IDE Kotlin:** Impor proyek ini ke lingkungan pengembangan terintegrasi (IDE) seperti IntelliJ IDEA atau Android Studio.
3.  **Jelajahi File:** Buka setiap file `.kt` untuk mempelajari kode dan komentar yang disediakan.
4.  **Jalankan:** Anda dapat menjalankan file `.kt` yang memiliki fungsi `main()` untuk melihat output atau perilaku kode tersebut.

---

## 🏷️ Lisensi

Bebas digunakan untuk tujuan pembelajaran dan edukasi. Jika repositori ini bermanfaat, jangan ragu untuk memberikan bintang! 🌟

---

## ✍️ Author

**Wafa Bila Syaefurokhman**
_Student of Darussalam Gontor_
[GitHub: MENSTRUE](https://github.com/MENSTRUE)

---
