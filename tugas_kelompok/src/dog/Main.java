package dog;
/*
Tulis program Java untuk membuat kelas bernama "Dog" dengan atribut nama dan ras.
Buat dua contoh kelas "Dog", tetapkan atributnya menggunakan konstruktor dan ubah
atributnya menggunakan metode setter dan cetak nilai yang diperbarui.

 */
class Dog{
    // Membuat 2 atribut
    public String nama;
    public String ras;

    public Dog(String nama, String ras) {
        this.nama = nama;
        this.ras = ras;
    }

    // membuat method set
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }

}

public class Main {
    public static void main(String[] args) {
        // membaut 2 contoh object dog
        Dog Adit = new Dog("Adit","Buldog");
        Dog Baim = new Dog("Baim","Doll");
        System.out.println("Nama : " + Adit.nama);
        System.out.println("Ras  : " + Adit.ras + "\n");
        // mengubah atribut menggunakan method setter
        Adit.setNama("leo");
        Adit.setRas("chihuahua");
        System.out.println("------------------------");
        System.out.println("Nama dan ras setelah di ubah");
        System.out.println("Nama : " + Adit.nama);
        System.out.println("Ras  : " + Adit.ras);
    }
}
