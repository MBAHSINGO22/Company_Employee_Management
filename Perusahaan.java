package Modul_6;

// Kelas Perusahaan digunakan untuk merepresentasikan data perusahaan dalam sistem.
public class Perusahaan {
    // Atribut namaPerusahaan digunakan untuk menyimpan nama perusahaan.
    private String namaPerusahaan;
    // Atribut alamat digunakan untuk menyimpan alamat perusahaan.
    private String alamat;
    // Atribut pemilik digunakan untuk menyimpan nama pemilik perusahaan.
    private String pemilik;
    // Atribut NPWP digunakan untuk menyimpan Nomor Pokok Wajib Pajak perusahaan.
    private String NPWP;
    // Atribut daftarPegawai digunakan untuk menyimpan array dari objek Pegawai.
    private Pegawai[] daftarPegawai;

    // Konstruktor Perusahaan digunakan untuk membuat objek Perusahaan baru dengan
    // nama perusahaan, alamat, pemilik, NPWP, dan jumlah pegawai yang diberikan.
    public Perusahaan(String namaPerusahaan, String alamat, String pemilik, String NPWP, int jumlahPegawai) {
        this.namaPerusahaan = namaPerusahaan;
        this.alamat = alamat;
        this.pemilik = pemilik;
        this.NPWP = NPWP;
        // Membuat array daftarPegawai dengan ukuran sesuai jumlah pegawai yang
        // diberikan.
        this.daftarPegawai = new Pegawai[jumlahPegawai];
    }

    // Metode getnamaPerusahaan digunakan untuk mengembalikan nilai dari atribut
    // namaPerusahaan.
    public String getnamaPerusahaan() {
        return namaPerusahaan;
    }

    // Metode getpemilik digunakan untuk mengembalikan nilai dari atribut pemilik.
    public String getpemilik() {
        return pemilik;
    }

    // Metode getalamat digunakan untuk mengembalikan nilai dari atribut alamat.
    public String getalamat() {
        return alamat;
    }

    // Metode getNPWP digunakan untuk mengembalikan nilai dari atribut NPWP.
    public String getNPWP() {
        return NPWP;
    }

    // Metode tambahPegawai digunakan untuk menambahkan objek Pegawai ke dalam array
    // daftarPegawai pada posisi yang ditentukan.
    public void tambahPegawai(Pegawai pegawai, int index) {
        if (index >= 0 && index < daftarPegawai.length) {
            daftarPegawai[index] = pegawai;
        } else {
            System.out.println("Index tidak valid.");
        }
    }

    // Metode tampilkanPegawai digunakan untuk menampilkan informasi pegawai yang
    // ada dalam array daftarPegawai.
    public void tampilkanPegawai() {
        for (Pegawai pegawai : daftarPegawai) {
            if (pegawai != null) {
                System.out.println(pegawai.getNama() + ", " + pegawai.getJabatan() + ", " + pegawai.getGajiPokok());
            }
        }
    }

    // Metode analisisGaji digunakan untuk menganalisis gaji pokok pegawai dalam
    // perusahaan, termasuk mencari gaji pokok terbesar, terkecil, dan rata-rata.
    public void analisisGaji() {
        double totalGaji = 0;
        double maxGaji = 0;
        double minGaji = Double.MAX_VALUE;
        int jumlahPegawai = 0;

        for (Pegawai pegawai : daftarPegawai) {
            if (pegawai != null) {
                double gaji = pegawai.getGajiPokok();
                totalGaji += gaji;
                jumlahPegawai++;
                if (gaji > maxGaji) {
                    maxGaji = gaji;
                }
                if (gaji < minGaji) {
                    minGaji = gaji;
                }
            }
        }

        if (jumlahPegawai > 0) {
            double rataRataGaji = totalGaji / jumlahPegawai;
            System.out.println("Gaji Pokok Terbesar: " + maxGaji);
            System.out.println("Gaji Pokok Terkecil: " + minGaji);
            System.out.println("Rata-rata Gaji Pokok: " + rataRataGaji);
        } else {
            System.out.println("Tidak ada pegawai.");
        }
    }

    // Metode cariPegawaiGajiTerbesar digunakan untuk mencari pegawai dengan gaji
    // pokok terbesar dalam array daftarPegawai.
    public Pegawai cariPegawaiGajiTerbesar() {
        Pegawai pegawaiTerbesar = null;
        double maxGaji = 0;

        for (Pegawai pegawai : daftarPegawai) {
            if (pegawai != null && pegawai.getGajiPokok() > maxGaji) {
                maxGaji = pegawai.getGajiPokok();
                pegawaiTerbesar = pegawai;
            }
        }

        return pegawaiTerbesar;
    }
}
