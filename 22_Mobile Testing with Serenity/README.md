# (22) Mobile Testing with Serenity
Poin yang dapat dipelajari dari materi terkait materi ini adalah sebagai berikut :

### 1. Appium sebagai Framework Otomatisasi Mobile 
Appium adalah framework yang digunakan untuk melakukan otomatisasi pengujian pada perangkat mobile. Framework ini mendukung berbagai bahasa pemrograman seperti Java, Python, JavaScript, Ruby, dan lainnya. Appium dibangun di atas library Selenium, sehingga dapat memanfaatkan fitur-fitur yang ada dalam Selenium.

### 2. Komponen Utama Appium
Ada dua komponen utama dalam Appium yang digunakan dalam proses otomatisasi mobile, yaitu :
- Appium Server dan Appium Client. 
Appium Server berfungsi sebagai jembatan untuk mengendalikan perangkat yang akan diuji. Appium server ini dibagi menjadi 3 yaitu XCUITest, UIAutomatori2/Espreso, serta WinAppDriver.
- Appium Client adalah library yang tersedia dalam berbagai bahasa pemrograman untuk membuat skrip pengujian dan mengirimkan perintah ke Appium Server.

### 3. Penggunaan Appium Inspector: 
Appium Inspector merupakan alat yang berguna untuk mencari lokator elemen (seperti teks, tombol, dan kolom teks) dalam aplikasi mobile yang akan diuji. Sesinya berakhir ketika proses pengujian dimulai. Selain itu, materi juga menyebutkan tentang Desired Capabilities yang diperlukan untuk memulai sesi Inspector, yang mencakup informasi seperti platform, perangkat, aplikasi, dan lainnya.

Untuk mengatur Appium di device computer, maka diperlukan penginstalan beberapa tool/library yang diperlukan, yakni Java Jdk 8/11,perlunya untuk mengatur JAVA_HOME environment variable, menginstal android Sdk platform-tools & command-line tools, Appium desktop, node JS, serta Appium-doctor.
