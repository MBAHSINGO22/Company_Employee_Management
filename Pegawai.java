package Modul_6;

// Kelas Pegawai digunakan untuk merepresentasikan data pegawai dalam sistem.
public class Pegawai {
    // Atribut nama digunakan untuk menyimpan nama pegawai.
    private String nama;
    // Atribut gajiPokok digunakan untuk menyimpan gaji pokok pegawai.
    private double gajiPokok;
    // Atribut jabatan digunakan untuk menyimpan jabatan pegawai.
    private String jabatan;

    // Konstruktor Pegawai digunakan untuk membuat objek Pegawai baru dengan nama,
    // gaji pokok, dan jabatan yang diberikan.
    public Pegawai(String nama, double gajiPokok, String jabatan) {
        // Menginisialisasi atribut nama dengan nilai yang diberikan.
        this.nama = nama;
        // Menginisialisasi atribut gajiPokok dengan nilai yang diberikan.
        this.gajiPokok = gajiPokok;
        // Menginisialisasi atribut jabatan dengan nilai yang diberikan.
        this.jabatan = jabatan;
    }

    // Metode getNama digunakan untuk mengembalikan nilai dari atribut nama.
    public String getNama() {
        return nama;
    }

    // Metode getGajiPokok digunakan untuk mengembalikan nilai dari atribut
    // gajiPokok.
    public double getGajiPokok() {
        return gajiPokok;
    }

    // Metode getJabatan digunakan untuk mengembalikan nilai dari atribut jabatan.
    public String getJabatan() {
        return jabatan;
    }
}
