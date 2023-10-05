# (23) Testing in CI CD Pipeline
Poin yang dapat dipelajari dari materi terkait materi ini adalah sebagai berikut :

### 1. Konsep CI/CD dan Perbedaannya:
- Continuous Integration (CI) adalah praktik mengintegrasikan kode ke dalam repositori bersama dan secara otomatis membangun/menguji setiap perubahan.
- Continuous Delivery (CD) adalah kemampuan untuk merilis perangkat lunak ke produksi kapan saja dengan mengirimkan perubahan ke sistem staging secara otomatis.
- Continuous Deployment (CD) adalah ekstensi dari Continuous Delivery yang mendorong perubahan ke produksi secara otomatis tanpa persetujuan eksplisit dari pengembang.

### 2. Kriteria untuk CI dan CD yang Baik:
- CI yang baik harus memiliki langkah-langkah yang terpisah dengan fokus tugas tunggal, otomatis, dan dapat diulang dengan konsistensi.
- CD yang baik mencakup desain dengan mempertimbangkan seluruh sistem, penggunaan pipeline untuk meningkatkan keyakinan menuju produksi, dan memiliki versi yang unik secara global untuk melacak perubahan.

### 3. Tools CI/CD yang Populer:
Terdapat berbagai alat CI/CD yang dapat digunakan, seperti Jenkins, GitLab CI, Atlassian Bamboo, Circle CI, AWS CodeBuild, Azure DevOps, Travis CI, dan GitHub Actions.
GitHub Actions adalah platform CI/CD yang menyediakan alat untuk mengotomatisasi alur kerja, pekerjaan, dan tindakan berdasarkan peristiwa di repositori. Ini terdiri dari komponen seperti workflows, jobs, actions, events, dan runners untuk memfasilitasi proses CI/CD.