# (08) Basic Linux Command

Tiga poin yang dapat dipelajari dari materi terkait Basic Linux Command yang diberikan:

## 1. Keunggulan Penggunaan CLI dan Linux
Command Line Interface (CLI) adalah perintah yang ditulis dalam bentuk teks dan memiliki beberapa keunggulan:
- Lebih cepat daripada Graphical User Interface (GUI).
- Menggunakan sumber daya yang lebih sedikit, menjadikannya lebih efisien.
- Cocok untuk tugas berulang dan repetitive.
- Menawarkan kekuatan dan fleksibilitas yang tinggi dalam pengelolaan sistem.

## 2. Pengenalan Command Linux Dasar

- date: Menampilkan tanggal dan waktu.
- clear: Membersihkan terminal.
- touch: Membuat file baru.
- mkdir: Membuat direktori baru.
- pwd: Menampilkan direktori saat ini.
- ls: Menampilkan daftar file/folder dalam lokasi saat ini.
- cp: Mengkopikan file dari satu lokasi ke lokasi lain.
- cd: Berpindah ke direktori lain.
- mv: Memindahkan/merename file atau direktori.
- nano: Mengedit isi file menggunakan teks editor.
- cat: Menampilkan isi file.
- rm: Menghapus file atau direktori.
- top: Memantau proses yang berjalan dalam sistem.
- history: Melihat riwayat perintah yang dieksekusi sebelumnya.
- sudo: Menjalankan perintah sebagai administrator (root).
- which: Menunjukkan lokasi dari sebuah command.
- find: Mencari file atau direktori dalam sistem.

## 3. Manipulasi Hak Akses File Menggunakan Command Line dan Pengenalan Shell Scripting

Hak akses file ditandai dengan kombinasi rwx (read, write, execute) untuk owner, group, dan others.
Hak akses diwakili dalam bilangan biner, misalnya 744.
Contoh hak akses:
```python
r	w	x	decimal
0   0   0   0
0	0	1	1
0	1	0	2
0	1	1	3
1	0	0	4
1	0	1	5
1	1	0	6
1	1	1	7
```

0: tidak memiliki hak akses.
1: execute.
2: write.
3: write dan execute.
4: read.
5: read dan execute.
6: read dan write.
7: read, write, dan execute.
Perintah chmod digunakan untuk mengubah hak akses.

### Shell Scripting
- Shell adalah program yang menghubungkan user dengan kernel sistem operasi.
- Shell Scripting adalah bahasa pemrograman yang berbasis perintah command line.
- Dengan Shell Scripting, dapat dibuat program-program sederhana namun kuat.
- Shell Script dapat dibuat menggunakan text editor seperti nano atau vscode.
- Script perlu diberikan hak akses eksekusi untuk dijalankan.