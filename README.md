DOKUMENTASI PROYEK

Nama Kelompok:

1.Venda Alfingki (221401015) 
2.Tabhita Triana Florentina Pakpahan (221401041) 
3.Kyla Zahra Winnetou (221401106) 
4.Rizki Amalina Triwahyuni Nasution (221401123) 
5.Tabina Asyadda (221401129) 

Deskripsi Proyek : Glam Heaven
 - Aplikasi Desktop Belanja Online

Glam Heaven adalah sebuah aplikasi belanja online yang dirancang untuk memberikan pengalaman belanja yang nyaman dan efisien kepada pengguna. Aplikasi ini menyediakan berbagai fitur untuk memudahkan pengguna dalam memilih, membeli, dan mengelola produk-produk skincare dan kecantikan yang berkualitas. Dikembangkan sebagai aplikasi desktop dan web, Glam Heaven memastikan aksesibilitas dan kemudahan penggunaan di berbagai perangkat.
Proyek ini dikembangkan menggunakan aplikasi IntelliJ IDEA dengan framework JavaFX.

Cara instalasi:
Langkah-Langkah Instalasi dan Penggunaan JavaFX dan Scene Builder di IntelliJ IDEA

1.	Persiapan dan Unduhan. 
Kunjungi situs resminya (Gluon). Unduh JavaFX SDK yang sesuai dengan versi JDK Anda.
Ekstrak paket JavaFX SDK ke direktori pilihan Anda.
2.	Konfigurasi IntelliJ IDEA.
Buat Proyek JavaFX Baru :
-	Buka IntelliJ IDEA.
-	Buat proyek JavaFX baru melalui menu File > New > Project.
-	Pilih JavaFX sebagai template proyek.
Tambahkan JavaFX SDK ke Proyek :
-	Klik kanan pada folder proyek yang baru dibuat, pilih Open Module Settings.
-	Pergi ke Global Libraries, klik + dan pilih Java.
-	Pilih direktori lib di dalam folder JavaFX SDK yang telah diekstrak.
-	Tambahkan semua file JAR di dalam folder lib tersebut.
-	Klik OK untuk menyimpan perubahan.
Tambahkan Library JavaFX ke Modul :
-	Klik kanan, pilih Open Module Settings lagi.
-	Pergi ke Global Libraries, pilih library JavaFX yang baru ditambahkan.
-	Klik kanan dan pilih Add to Modules.
-	Pilih modul proyek Anda dan tambahkan library tersebut.
Konfigurasi module-info.java (bila diperlukan) :
-	Pastikan file module-info.java ada di dalam folder src proyek Anda.
-	Jika belum ada, buat file baru dengan mengklik kanan pada folder src, pilih New > module-info.java.
-	Tambahkan baris berikut ke dalam file module-info.java (contoh) :
requires javafx.controls;
requires javafx.fxml;
opens your.package.name to javafx.fxml;
3.	Unduh dan Konfigurasi Scene Builder
Kunjungi situs resminya (Gluon). Unduh Scene Builder yang sesuai dengan sistem operasi 
Anda.

Instal Scene Builder :
-	Windows : Jalankan file .exe dan ikuti petunjuk instalasi.
-	macOS : Buka file .dmg, seret ikon Scene Builder ke folder Applications.
-	Linux : Ekstrak file .tar.gz ke direktori yang diinginkan.
Konfigurasi Scene Builder di IntelliJ IDEA :
-	Buka IntelliJ IDEA.
-	Pergi ke File > Settings (atau IntelliJ IDEA > Preferences di macOS).
-	Navigasikan ke Languages & Frameworks > JavaFX.
-	Di bagian Path to SceneBuilder, klik telusuri lokasi instalasi Scene Builder.
4. 	Menggunakan Scene Builder dengan IntelliJ IDEA
Buka File FXML :
-	Klik kanan pada file FXML di proyek Anda.
-	Pilih Open in SceneBuilder.
-	Mulai Merancang Antarmuka
5. Instalasi MySQL
6. Konfigurasi MySQL dengan Intellij

Fitur Yang Tersedia:

1.	Halaman Login: Pengguna dapat mendaftar dan masuk ke akun mereka dengan mudah, memastikan keamanan dan privasi data.
2.	Beranda: Menampilkan berbagai produk
3.	Keranjang: Pengguna dapat menambahkan produk ke keranjang belanja mereka, dan melakukan modifikasi sebelum pembelian.
4.	Alamat Pengiriman: Memungkinkan pengguna untuk memilih metode pengiriman dan mengelola alamat pengiriman mereka dengan mudah.
5.	Struk: Setelah pembelian, pengguna dapat melihat dan mencetak struk pembelian sebagai bukti transaksi.

Penerapan OOP: 
Glam Heaven dikembangkan dengan menerapkan prinsip-prinsip Pemrograman Berorientasi Objek (OOP) untuk memastikan struktur kode yang modular, mudah dikelola, dan scalable.

Jobdesc:

1. Halaman login dan tampilan beranda (Tabina)
   
   ![image](https://github.com/tabinasydaa/UAS_PBO_GlamHeaven/assets/151441034/73b5771d-b4b7-41b2-a399-e079e8fc7eac)


   ![image](https://github.com/tabinasydaa/UAS_PBO_GlamHeaven/assets/151441034/e7d909ad-0ac5-4312-a578-74a89582d3f9)




   ![image](https://github.com/tabinasydaa/UAS_PBO_GlamHeaven/assets/151441034/3ef3549f-82db-487a-9dd4-982cf01e1ad4)


   ![image](https://github.com/tabinasydaa/UAS_PBO_GlamHeaven/assets/151441034/d36da949-8975-40ff-adda-048f0cd55eda)


   
Membuat tampilan login dan sign up untuk agar user memiliki data tersendiri dan memudahkan untuk pemesanan, saya membuat tampilan beranda yang berisi cart berupa produk produk yang bisa dipilih user untuk nanti nya akan masuk ke keranjang checkout. Saya membuat beberapa kategori unuk memudahkan user memilih product. Saya juga membuat permainan Ular yang mana ketika user mainkan dan menang maka user akan mendapat poin dan poin tersebut bisa dipakai untuk potongan harga pada barang yang di checkout user. 
    
2.  Database (Tabhita)

   
   ![image](https://github.com/tabinasydaa/UAS_PBO_GlamHeaven/assets/151441034/93629d00-7378-4b13-a9a4-fea3455b990f)

   
Mengurus semua database program ini mulai dari masukan user, juga masukan dari developer. semua data data akan diolah dalam setiap table dan akan di integrasikan ke aplikasi juga mengoptimalkan query agar membuat mudah pengolahan data pada aplikasi, juga membuat autentikasi pada fitur login agar menjaga keamanan data pengguna.

3.Keranjang (kyla) 



![image](https://github.com/tabinasydaa/UAS_PBO_GlamHeaven/assets/151441034/bda2346e-ab5a-475e-997a-f33e07bf10af)



Penjelasan:
Sebagai bagian dari tim pengembangan aplikasi Glam Heaven, tanggung jawab utama saya adalah merancang dan mengimplementasikan halaman keranjang belanja. Halaman ini memiliki judul besar yang mencerminkan fungsinya dan menampilkan semua produk yang telah ditambahkan oleh pengguna dari halaman beranda. Produk-produk yang ditambahkan akan ditampilkan secara dinamis, tidak terbatas pada jumlah tertentu. Setiap produk memiliki checkbox yang memungkinkan pengguna untuk dengan mudah memilih produk yang ingin mereka checkout atau hapus. Pengguna dapat menghapus produk dengan mencentang checkbox dan menekan tombol delete di bagian atas. Selain itu, terdapat checkbox "select all" yang otomatis mencentang semua produk, memudahkan pengguna dalam memilih seluruh produk sekaligus.

Setiap produk di halaman keranjang juga dilengkapi dengan tombol untuk menambah dan mengurangi kuantitas produk yang ingin dibeli. Di bagian bawah setiap produk, terdapat tanda eco-friendly yang menunjukkan komitmen Glam Heaven terhadap produk ramah lingkungan. Subtotal harga untuk produk-produk yang dicentang juga ditampilkan di halaman ini, memberikan pengguna gambaran jelas tentang total biaya sebelum melanjutkan ke tahap berikutnya. Setelah pengguna siap, mereka dapat melanjutkan ke halaman alamat pengiriman, yang dikelola oleh rekan tim saya, untuk menyelesaikan proses checkout. Halaman keranjang ini didesain untuk memberikan kemudahan dan fleksibilitas maksimal kepada pengguna dalam mengatur pembelian mereka.

4.Metode Pengiriman (Venda) 


     
![image](https://github.com/tabinasydaa/UAS_PBO_GlamHeaven/assets/151441034/04773043-c34a-4024-9358-159c1e7fe50e)





Penjelasan:

Sebagai bagian dari tim pengembangan aplikasi Glam Heaven, tanggung jawab utama saya adalah merancang dan mengimplementasikan halaman Metode pengiriman. 
Halaman ini berfokus pada pengumpulan informasi pengiriman dari pengguna secara terperinci. 
Di bagian atas, terdapat tiga tombol yang menunjukkan metode pengiriman yang tersedia: "Reguler" (biasa), "Instan" (cepat), dan "Hemat" (ekonomis). Di bawahnya, terdapat bagian "Informasi Penerima" yang terdiri dari beberapa bidang isian. 

Kolom pertama adalah "Nama Lengkap," di mana pengguna dapat memasukkan nama lengkap penerima paket. Selanjutnya, ada Kolom"Nomor Handphone" untuk mengisi nomor telepon penerima. Berikutnya, pengguna dapat mengisi "Alamat Penerima," yang berfungsi untuk memilih jenis alamat, apakah rumah atau kantor. 

Kolom"Alamat Lengkap" digunakan untuk memasukkan detail alamat seperti blok dan nama jalan. Kemudian, ada bidang "Kode Pos" untuk memasukkan kode pos alamat penerima. Terakhir, terdapat kotak centang dengan label "Gunakan sebagai alamat utama" yang memungkinkan pengguna untuk menyimpan alamat tersebut sebagai alamat utama mereka. Di bagian bawah form, ada dua tombol: "SAVE" untuk menyimpan informasi yang telah dimasukkan, dan "CANCEL" untuk membatalkan dan menghapus informasi yang sudah diisi. 

Setelah pengguna mengisi dan menyimpan informasi pengiriman ini, proses akan dilanjutkan ke bagian struk hasil yang memuat detail lebih lanjut mengenai status pengiriman, informasi pengiriman, alamat pengiriman, informasi item yang dibeli, metode pembayaran, serta informasi waktu terkait pesanan dan pengiriman. Struk hasil ini juga dilengkapi dengan opsi untuk menyimpan atau mencetak struk sesuai kebutuhan pengguna.

 5.Struk Hasil (Rizki)



 
![image](https://github.com/tabinasydaa/UAS_PBO_GlamHeaven/assets/151441034/2a63c31e-1716-4b8d-99fb-16d452f44668)



Sebagai bagian dari tim pengembangan aplikasi Glam Heaven, tanggung jawab utama saya adalah merancang dan mengimplementasikan halaman struk hasil. Halaman ini menampilkan struk pembelian yang detail setelah pengguna melakukan checkout dan mengisi form pengiriman. Struk hasil ini berisi informasi yang jelas dan lengkap untuk memastikan pengguna dapat memantau status pesanan mereka dengan mudah.

Di bagian paling atas, terdapat judul "Receipt". Di sebelah kiri, terdapat bagian "Status Pengiriman" yang berisi status pengiriman seperti: "Pesanan Dikirim", "Pesanan Dikemas", "Pesanan Selesai". Di bawahnya, terdapat bagian "Informasi Pengiriman" yang memuat informasi pengiriman seperti metode pengiriman yang digunakan, dan waktu pengiriman (tanggal dan jam pengiriman berlangsung). Di bawahnya lagi, terdapat bagian "Alamat Pengiriman" yang memuat nama penerima paket, nomor telepon, dan alamat penerima paket secara lengkap.

Di sebelah kanan, terdapat nama toko kami "GLAM HEAVEN" dengan tombol "Kunjungi Toko >" di sampingnya yang dapat di-klik untuk mengunjungi toko kami. Di bawahnya, terdapat informasi item yang dibeli oleh pengguna, termasuk foto produk, nama produk, jumlah (quantity), dan harga produk tersebut. Di bawah informasi produk, ada total harga dari semua item yang telah dibeli oleh pengguna.

Di bagian bawahnya, terdapat informasi mengenai metode pembayaran yang digunakan oleh pengguna untuk membayar pembelian tersebut. Contoh: Transfer BCA, E-Wallet Gopay, dll. Di bagian bawahnya lagi, terdapat informasi nomor pesanan, waktu pemesanan, waktu pembayaran, waktu pengiriman, dan waktu pesanan selesai.

Pada bagian paling bawah, terdapat dua tombol yaitu "SAVE" yang jika di-klik akan otomatis menyimpan receipt ke device masing-masing pengguna, dan tombol "PRINT" yang jika di-klik akan mencetak receipt sesuai dengan pilihan cetak yang akan pengguna pilih nantinya.

Struk hasil digunakan untuk memberikan konfirmasi dan rincian lengkap mengenai pembelian yang telah dilakukan oleh pengguna. Struk ini mencakup informasi status pesanan, metode pengiriman, alamat pengiriman, item yang dibeli, total harga, metode pembayaran, serta waktu dan nomor pesanan. Dengan struk ini, pengguna dapat memantau dan memverifikasi detail transaksi mereka dengan mudah.
