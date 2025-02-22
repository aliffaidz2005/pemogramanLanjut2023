package reservasi;

import javax.print.DocFlavor;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

/*
Tulis program Java untuk membuat kelas yang disebut "Reservation"
dengan atribut untuk ID reservasi, nama pelanggan, dan tanggal.
Buat subkelas "ResortReservation" dan "RailwayReservation" yang
menambahkan atribut tertentu seperti nomor kamar untuk hotel
dan nomor kursi untuk penerbangan. Terapkan metode untuk
memeriksa status reservasi dan mengubah detail reservasi.
 */
class Reservation {
    protected String IDResevasi;
    protected String namaPelanggan;
    protected String tanggal;
    public Reservation(String IDResevasi, String namaPelanggan, String tanggal) {
        this.IDResevasi = IDResevasi;
        this.namaPelanggan = namaPelanggan;
        this.tanggal = tanggal;
    }
}

class ResortReservation extends Reservation{
    private Integer Nomorkamar;
    public ArrayList<String> layanan;
    public String status;

    public ResortReservation(String idReservasi, String inputNama, String inputTanggal,Integer IdKammr,String inputLayanan,String inputStatus){
        super(idReservasi,inputNama,inputTanggal);
        this.Nomorkamar = IdKammr;
        layanan = new ArrayList<>();
        layanan.add(inputLayanan);
        this.status = inputStatus;
    }
    public void cekStatusReservasi(){
        Random random = new Random();
        Integer kondisi = random.nextInt(2);
        if(kondisi.equals(1)){
            System.out.println("ID Reservasi  : " + this.IDResevasi);
            System.out.println("Nama Pelangan : " + this.namaPelanggan);
            System.out.println("Tanggal       : " + this.tanggal);
            System.out.println("Nomor Kamar   : " + this.Nomorkamar);
            System.out.println("Daftar Layanan ==================");
            for (int i = 0; i < layanan.size(); i++) {
                System.out.println(layanan.get(i));
            }
            this.status = "Tidak Tersedia";
            System.out.println("Status        :" + this.status + "\n");
        }else {
            System.out.println("ID Reservasi  : " + this.IDResevasi);
            System.out.println("Nama Pelangan : " + this.namaPelanggan);
            System.out.println("Tanggal       : " + this.tanggal);
            System.out.println("Nomor Kamar   : " + this.Nomorkamar);
            System.out.println("Daftar Layanan ==================");
            for (int i = 0; i < layanan.size(); i++) {
                System.out.println(layanan.get(i));
            }
            System.out.println("Status        :" + this.status + "\n");
        }
    }
    public void setDetailReservasi(String inputID, String inputNama, String inputTanggal,Integer inputNomorKamar, String TambahLayanan){
        this.IDResevasi = inputID;
        this.namaPelanggan = inputNama;
        this.tanggal = inputTanggal;
        this.Nomorkamar = inputNomorKamar;
        layanan.add(TambahLayanan);
    }
}

class RailwayReservation extends Reservation {
    private String kursi;
    private String Gerbong;
    private String status;
    public RailwayReservation(String inputIDr, String inputNama, String inputTanggal, String inputKursi,String inputGerbong){
        super(inputIDr,inputNama,inputTanggal);
        this.kursi = inputKursi;
        this.Gerbong = inputGerbong;
    }

    public void cekStatusReservasi(){
        Random random = new Random();
        Integer kondisi = random.nextInt(2);
        if(kondisi.equals(1)){
            System.out.println("ID Reservasi  : " + this.IDResevasi);
            System.out.println("Nama Pelangan : " + this.namaPelanggan);
            System.out.println("Tanggal       : " + this.tanggal);
            System.out.println("Kursi         : " + this.kursi);
            System.out.println("Gebong        : " + this.Gerbong);
            this.status = "Tidak Tersedia";
            System.out.println("Status        : " + this.status + "\n");
        }else {
            System.out.println("ID Reservasi  : " + this.IDResevasi);
            System.out.println("Nama Pelangan : " + this.namaPelanggan);
            System.out.println("Tanggal       : " + this.tanggal);
            System.out.println("Kursi         : " + this.kursi);
            System.out.println("Gebong        : " + this.Gerbong);
            System.out.println("Status        : " + this.status + "\n");
        }
    }

    public void setDetailReservasi(String inputID, String inputNama, String inputTanggal,String inputKursi, String inputGerbong){
        this.IDResevasi = inputID;
        this.namaPelanggan = inputNama;
        this.tanggal = inputTanggal;
        this.kursi = inputKursi;
        this.Gerbong = inputGerbong;

    }
}

public class Main {
    public static void main(String[] args) {
        ResortReservation Adit = new ResortReservation("P0001","Adit Prima Anwar","12 senin 2023",10,"Kolam renang","Tersedia");
        Adit.cekStatusReservasi();

        Adit.setDetailReservasi("P0002","Jmes","13 november kamis",13,"Spa");
        Adit.cekStatusReservasi();

        RailwayReservation Fathir = new RailwayReservation("P002","Fathir","12 senin 2024","12B","Bisnis");
        Fathir.cekStatusReservasi();

        Fathir.setDetailReservasi("P003","Al ghifary","12 november","14B","Ekonomi");
        Fathir.cekStatusReservasi();

    }
}
