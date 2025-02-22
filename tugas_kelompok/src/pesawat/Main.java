package pesawat;

import java.util.Random;

/*
 Tulis program Java untuk membuat kelas yang disebut "Pesawat" dengan atribut nomor penerbangan,
 tujuan, dan waktu keberangkatan, serta metode untuk memeriksa status dan penundaan penerbangan.

 */
class Pesawat{
    public String nomorpenerbangan;
    public String tujuan;
    public Integer waktukeberangkatan;

    public Pesawat(String nomorpenerbangan, String tujuan, Integer waktukeberangkatan) {
        this.nomorpenerbangan = nomorpenerbangan;
        this.tujuan = tujuan;
        this.waktukeberangkatan = waktukeberangkatan;
    }

    public void cekStatus(){
        System.out.println("====================");
        System.out.println("Nomor               : " + this.nomorpenerbangan);
        System.out.println("Tujuan              : " + this.tujuan);
        System.out.println("Waktu Keberangkatan : " + this.waktukeberangkatan + ":00 AM");
        System.out.println("====================\n");
    }

    public void cekPenundaanPenerbagan(Boolean b){
        if(b){
            Random random = new Random();
            System.out.println("====================");
            System.out.println("DELAY!!!!");
            System.out.println("Nomor               : " + this.nomorpenerbangan);
            System.out.println("Tujuan              : " + this.tujuan);
            System.out.println("Durasi Penundaan    : " + random.nextInt(1,3) + " Jam");
            System.out.println("Status              : Di tunda" );
            System.out.println("====================\n");
        }else {
            System.out.println("====================");
            System.out.println("Nomor               : " + this.nomorpenerbangan);
            System.out.println("Tujuan              : " + this.tujuan);
            System.out.println("Waktu Keberangkatan : " + this.waktukeberangkatan+ ":00 AM");
            System.out.println("====================\n");
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Pesawat kendari = new Pesawat("MH 037","Jakarta",6);

        kendari.cekStatus();
        kendari.cekPenundaanPenerbagan(true);
    }
}
