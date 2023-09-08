# (12) Pengenalan RESTful API
Tiga poin yang dapat dipelajari dari materi terkait Pengenalan RESTful API yang diberikan:
## 1. Pengertian API dan Fungsinya: 
API (Application Programming Interface) adalah model komunikasi yang memungkinkan pertukaran data antara client dan server. API berfungsi sebagai jembatan yang memungkinkan komunikasi antara perangkat lunak atau sistem yang berbeda.

## 2. REST API dan Prinsipnya: 
REST (Representational State Transfer) API adalah standar yang umumnya digunakan dalam pengembangan web. 
REST API menggunakan HTTP methods, seperti :
- GET untuk mendapatkan data, 
- POST untuk mengirim data, 
- PUT untuk melakukan pembaruan, 
- DELETE untuk menghapus data atau sumber daya.

## 3. Komponen REST API: 
Komponen-komponen REST API :
- HTTP method yang ditentukan, 
- URL (terdiri dari Base URL dan Path), 
- Request Header (misalnya, untuk autentikasi), 
- Request Body (jika diperlukan, biasanya dalam format JSON). 

JSON (JavaScript Object Notation) adalah format data yang sering digunakan dalam REST API untuk mengirim dan menerima data. kode respons HTTP yang digunakan untuk mengindikasikan hasil dari permintaan. Response yang berawalan 4 itu adalah error di sisi client, sedangkan yang berawalan 5 itu terjadi error di sisi server.

Macam-macam response:
- 200 OK		: artinya requestnya berhasil 
- 201 Created		: artinya resource berhasil dibuat
- 400 Bad Request	: artinya server yang tidak bisa memahami permintaan karena perminataan yang tidak valid.
- 404 Not Found	: artinya server web tidak dapat menemukan halaman yang diminta oleh pengguna
- 401 Unauthorized	: terjadi ketika mengirim request tetapi belum ada autentikasinya. Dimana permintaan yang diajukan oleh klie (biasanya dalam bentuk permintaan HTTP) tidak akan diizinkan karena masalah autentikasi.
- 405 Method Not Allowed : HTTP method yang digunakan dalam permintaan HTTP tidak diizinkan untuk sumber daya yang diminta
- 500 Internal Server error : Terjadi kesalahan di pihak server yang mengakibatkan server tidak dapat memproses permintaan yang diberikan tanpa memberikan informasi lebih spesifik tentang jenis kesalahan yang terjadi.
