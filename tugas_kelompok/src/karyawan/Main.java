package karyawan;


/*
Tulis program Java untuk membuat kelas yang disebut "Karyawan" dengan atribut nama,
jabatan, dan gaji, serta metode untuk menghitung dan memperbarui gaji.
 */
class Karyawan{
    public String nama;
    public String jabatan;
    public Integer gaji;

    public Karyawan(String nama, String jabatan, Integer gaji) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    // method untuk memperbarui gaji
    public void MemperbaruiGaji(Integer setGaji){
        this.gaji = setGaji;
    }


    /*
    membuat method menghitung gaji dengan argumen boolean dan integer dimana argumen ke 1 akan
    menentukan gaji ditambah atau tidk dan argumen ke 2 berp jumblah gaji nya
     */
    public void menghitungGaji(Boolean tambahGaji, Integer Gaji){
        if(tambahGaji){
            System.out.println("Nama   : " + this.nama);
            System.out.println("Jabtan : " + this.jabatan);
            Integer tambah = this.gaji + Gaji;
            System.out.println("Gaji   : " + tambah);
        }else {
            System.out.println("Nama   : " + this.nama);
            System.out.println("Jabtan : " + this.jabatan);
            Integer kurang = this.gaji - Gaji;
            System.out.println("Gaji   : " + kurang);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // membuat object karyawan
        Karyawan adit = new Karyawan("Adit","Gulung kabel",10000);


        adit.menghitungGaji(false,5000);
        adit.MemperbaruiGaji(12000);
        System.out.println(adit.gaji);
    }
}
