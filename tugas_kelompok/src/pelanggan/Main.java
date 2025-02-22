
package pelanggan;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.StringTokenizer;

/*
Tulis program Java untuk membuat kelas yang disebut "Pelanggan" dengan atribut untuk nama,
email, dan riwayat pembelian. Terapkan metode untuk menambahkan pembelian ke riwayat
dan menghitung total pengeluaran. Buat subkelas "LoyalCustomer" yang menambahkan atribut
suku bunga diskon dan metode untuk menerapkan diskon.
 */
class Pelanggan {
    private   String nama;
    private String email;
    protected ArrayList<String> Riwayatpembelian;

    public Pelanggan(String inputNama, String inputEmail){
        this.nama = inputNama;
        this.email = inputEmail;
        this.Riwayatpembelian = new ArrayList<>();
    }

    public void MenambahPembelian(String product, Integer harga){
        if(product != null && harga >= 0){
            String parse = product + "," + String.valueOf(harga);
            Riwayatpembelian.add(parse);
        }else {
            System.out.println("gagal melakukan pembelian");
        }
    }

    public void TotalPengeluaran(){
        System.out.println("======================================");
        for (int i = 0; i < Riwayatpembelian.size(); i++) {
            StringTokenizer tokenizer = new StringTokenizer(Riwayatpembelian.get(i),",");
            String product = tokenizer.nextToken();
            String harga = tokenizer.nextToken();
            Integer HargaReal = Integer.valueOf(harga);
            System.out.printf("%-7s :%4d",product,HargaReal);
            System.out.println();
        }
        Integer total = 0;
        for (int i = 0; i < Riwayatpembelian.size(); i++) {
            StringTokenizer tokenizer = new StringTokenizer(Riwayatpembelian.get(i),",");
            String Nama = tokenizer.nextToken();
            String Harga = tokenizer.nextToken();
            Integer parsing = Integer.valueOf(Harga);
            total += parsing;
        }
        System.out.println("Total Keseluruhan Pengeluaran  : " + total);
        System.out.println("======================================");
    }
}

class LoyalCustomer extends Pelanggan{
    private Integer diskon;

    public LoyalCustomer(String inputNama, String inputEmail, Integer ds){
        super(inputNama,inputEmail);
        this.Riwayatpembelian = new ArrayList<>();
        this.diskon = ds;
    }

    public void setDiskon(){
        Integer total = 0;
        for (int i = 0; i < Riwayatpembelian.size(); i++) {
            StringTokenizer tokenizer = new StringTokenizer(Riwayatpembelian.get(i),",");
            String Nama = tokenizer.nextToken();
            String Harga = tokenizer.nextToken();
            Integer parsing = Integer.valueOf(Harga);
            total += parsing;
        }
        if(total  > 100){
            Integer afterDiscon = total - this.diskon;
            System.out.println("Pembelian melebihi 100 akan di beri discon");
            System.out.println("discon : " + afterDiscon);
        }else {
            System.out.println("Total pembelanjaan : " + total);
        }

    }
}



public class Main {
    public static void main(String[] args) {
        Pelanggan Adit = new Pelanggan("Adit Prima Anwar","Jems@jembusts");
        Adit.MenambahPembelian("Aerox",120);
        Adit.MenambahPembelian("sepatu",220);
        Adit.MenambahPembelian("sendal",420);
        Adit.TotalPengeluaran();


        LoyalCustomer faidz = new LoyalCustomer("Faidz","alf$dd",100);
        faidz.MenambahPembelian("bensi", 90);
        faidz.TotalPengeluaran();
        faidz.setDiskon();



    }
}