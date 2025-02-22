package sekolah;

import java.util.ArrayList;

class Sekolah {
    private ArrayList<String> siswa;
    private ArrayList<String> guru;
    private ArrayList<String> kelas;

    // Konstruktor untuk menginisialisasi daftar siswa, guru, dan kelas
    public Sekolah() {
        siswa = new ArrayList<>();
        guru = new ArrayList<>();
        kelas = new ArrayList<>();
    }

    // Metode untuk menambah siswa
    public void tambahSiswa(String namaSiswa) {
        siswa.add(namaSiswa);
        System.out.println("Siswa " + namaSiswa + " berhasil ditambahkan.");
    }

    // Metode untuk menghapus siswa
    public void hapusSiswa(String namaSiswa) {
        if (siswa.remove(namaSiswa)) {
            System.out.println("Siswa " + namaSiswa + " berhasil dihapus.");
        } else {
            System.out.println("Siswa " + namaSiswa + " tidak ditemukan.");
        }
    }

    // Metode untuk menambah guru
    public void tambahGuru(String namaGuru) {
        guru.add(namaGuru);
        System.out.println("Guru " + namaGuru + " berhasil ditambahkan.");
    }

    // Metode untuk menghapus guru
    public void hapusGuru(String namaGuru) {
        if (guru.remove(namaGuru)) {
            System.out.println("Guru " + namaGuru + " berhasil dihapus.");
        } else {
            System.out.println("Guru " + namaGuru + " tidak ditemukan.");
        }
    }

    // Metode untuk membuat kelas baru
    public void buatKelas(String namaKelas) {
        if (!kelas.contains(namaKelas)) {
            kelas.add(namaKelas);
            System.out.println("Kelas " + namaKelas + " berhasil dibuat.");
        } else {
            System.out.println("Kelas " + namaKelas + " sudah ada.");
        }
    }

    // Metode untuk menampilkan daftar siswa
    public void tampilkanSiswa() {
        System.out.println("Daftar Siswa:");
        for (String s : siswa) {
            System.out.println("- " + s);
        }
    }

    // Metode untuk menampilkan daftar guru
    public void tampilkanGuru() {
        System.out.println("Daftar Guru:");
        for (String g : guru) {
            System.out.println("- " + g);
        }
    }

    // Metode untuk menampilkan daftar kelas
    public void tampilkanKelas() {
        System.out.println("Daftar Kelas:");
        for (String k : kelas) {
            System.out.println("- " + k);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek Sekolah
        Sekolah sekolah = new Sekolah();

        // Menambahkan siswa
        sekolah.tambahSiswa("Andi");
        sekolah.tambahSiswa("Budi");

        // Menambahkan guru
        sekolah.tambahGuru("Pak Joko");
        sekolah.tambahGuru("Bu Siti");

        // Membuat kelas
        sekolah.buatKelas("Matematika");
        sekolah.buatKelas("Fisika");

        // Menampilkan daftar siswa, guru, dan kelas
        System.out.println();
        sekolah.tampilkanSiswa();
        sekolah.tampilkanGuru();
        sekolah.tampilkanKelas();

        // Menghapus siswa dan guru
        System.out.println();
        sekolah.hapusSiswa("Budi");
        sekolah.hapusGuru("Bu Siti");

        // Menampilkan daftar siswa dan guru setelah penghapusan
        System.out.println();
        sekolah.tampilkanSiswa();
        sekolah.tampilkanGuru();
    }
}
