# (21) Post Processor & Understanding JMeter Results
Poin yang dapat dipelajari dari materi terkait materi ini adalah sebagai berikut :

### 1. Post Processor:
- Post Processor adalah komponen dalam JMeter yang digunakan untuk melakukan tindakan setelah permintaan web selesai dieksekusi. Ini termasuk ekstraksi nilai dari respon, seperti data JSON, menggunakan alat seperti JSON Extractor dan JSON Path.
- JSON Extractor memungkinkan pengguna untuk mengambil nilai-nilai tertentu dari respon JSON dengan menggunakan JSON path.
- JSON Path adalah ekspresi yang digunakan dalam JSON Extractor untuk mengakses elemen dalam respon JSON dengan cara yang fleksibel, termasuk penggunaan $, ., [ ], .., *, dan [start:end].

### 2. Pemahaman Hasil JMeter (Understanding JMeter Results):
- Untuk melaporkan hasil pengujian kinerja dengan baik, penting untuk mencakup informasi tentang sistem yang diuji, kondisi awal sistem, dan target yang ingin dicapai.
- Data hasil pengujian kinerja, seperti metrik metrik waktu respons, throughput, dan kesalahan yang terjadi, juga harus dimasukkan dalam laporan.
- Hasil pengujian harus diinterpretasikan dengan mencocokkan metrik kinerja dengan kriteria baik atau buruk.
- Saran harus diberikan berdasarkan hasil pengujian, baik untuk perbaikan jika kinerja buruk, maupun untuk menjaga kinerja jika sudah baik.