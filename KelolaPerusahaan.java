package Modul_6;

// Kelas KelolaPerusahaan digunakan untuk mengelola data perusahaan dan pegawainya dalam sistem.
public class KelolaPerusahaan {
    // Metode main adalah titik awal eksekusi program.
    public static void main(String[] args) {

        // Membuat objek perusahaan baru dengan nama, alamat, pemilik, NPWP, dan jumlah
        // pegawai yang diberikan.
        Perusahaan perusahaan = new Perusahaan("PT. MBAH SINGO", "Jl. Bali No. 12", "Eugenius Kriswinar Adi Cahya",
                "1234567890", 5);

        // Menambahkan pegawai ke dalam perusahaan dengan posisi yang ditentukan.
        perusahaan.tambahPegawai(new Pegawai("Ari", 5000000, "Manager"), 0);
        perusahaan.tambahPegawai(new Pegawai("Eman", 3000000, "Staff"), 1);
        perusahaan.tambahPegawai(new Pegawai("Sisko", 4000000, "Staff"), 2);
        perusahaan.tambahPegawai(new Pegawai("Coki", 6000000, "Staff"), 3);
        perusahaan.tambahPegawai(new Pegawai("Galih", 2000000, "Staff"), 4);

        // Menampilkan informasi perusahaan.
        System.out.println("Informasi Perusahaan:");
        System.out.println("Nama Perusahaan: " + perusahaan.getnamaPerusahaan());
        System.out.println("Alamat: " + perusahaan.getalamat());
        System.out.println("Pemilik: " + perusahaan.getpemilik());
        System.out.println("NPWP: " + perusahaan.getNPWP());

        // Mencari pegawai dengan gaji pokok terbesar dan menampilkan informasinya.
        Pegawai pegawaiTerbesar = perusahaan.cariPegawaiGajiTerbesar();
        if (pegawaiTerbesar != null) {
            System.out.println("Pegawai dengan gaji pokok terbesar: " + pegawaiTerbesar.getNama() + ", Gaji Pokok: "
                    + pegawaiTerbesar.getGajiPokok());
        } else {
            System.out.println("Tidak ada pegawai.");
        }

        // Melakukan analisis gaji pegawai dalam perusahaan.
        perusahaan.analisisGaji();

    }
}