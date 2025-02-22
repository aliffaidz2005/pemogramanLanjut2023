package siswa;

import java.util.ArrayList;

/*
Tulis program Java untuk membuat kelas bernama "Siswa" dengan atribut nama, nilai,
dan mata kuliah, serta metode untuk menambah dan menghapus mata kuliah.

 */
class Siswa{
    public String nama;
    public Integer nilai;
    public ArrayList<String> matakuliah;

    public Siswa(String nama, Integer nilai, String mk) {
        this.nama = nama;
        this.nilai = nilai;
        matakuliah = new ArrayList<>();
        matakuliah.add(mk);
    }

    public void TambahMatkull(String matkull){
        this.matakuliah.add(matkull);
    }
    public void MenghapusMk(String matkull){
        for (int i = 0; i < matakuliah.size(); i++) {
            String data = matakuliah.get(i);
            if(data.equals(matkull)){
                matakuliah.remove(matkull);
            }else {
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Siswa adit = new Siswa("Adit",0,"AIK");
        System.out.println("Nama        : " + adit.nama);
        System.out.println("Nilai       : " + adit.nilai);
        adit.TambahMatkull("Sistem Operasi");
        adit.TambahMatkull("PBO");
        adit.MenghapusMk("PBO");

        for (int i = 0; i < adit.matakuliah.size(); i++) {
            System.out.println("Matakul     : " +  adit.matakuliah.get(i));
        }
    }
}
