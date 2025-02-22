package electronicsproduct;
/*
Tulis program Java untuk membuat kelas yang disebut "ElectronicsProduct" dengan atribut
untuk ID produk, nama, dan harga. Terapkan metode untuk menerapkan diskon dan menghitung
harga akhir. Buat subkelas "WashingMachine" yang menambahkan atribut masa garansi dan
metode untuk memperpanjang garansi.
 */


class ElectronicsProduct {
       private String idProduct;
       private String nama;
       private Integer harga;

    public ElectronicsProduct(String idProduct, String nama, Integer harga) {
        this.idProduct = idProduct;
        this.nama = nama;
        this.harga = harga;
    }
    public void setDiscon(Integer discon) {
        if (discon != null && discon >= 0 && discon <= 100) {
            System.out.println("=====================================");
            System.out.println("ID Product           : " + this.idProduct);
            System.out.println("Nama Product         : " + this.nama);
            System.out.println("Harga sebelum diskon : " + this.harga);
            Integer hargaDiskon = this.harga - (this.harga * discon / 100);
            System.out.println("Harga setelah diskon : " + hargaDiskon);
            this.harga = hargaDiskon;
            System.out.println("====================================");
        } else {
            System.out.println("Diskon tidak valid");
        }
    }

    public void Display(){
        System.out.println("ID Product           : " + this.idProduct);
        System.out.println("Nama Product         : " + this.nama);
        System.out.println("Harga                : " + this.harga);
    }
}

class WashingMachine extends ElectronicsProduct{
    private String masaGaransi;
    public WashingMachine(String Inputid, String Inputnama, Integer Inputharga, String InputGaransi){
        super(Inputid,Inputnama,Inputharga);
        this.masaGaransi = InputGaransi;
    }

    public void Memperpananjang(String garansi){
        this.masaGaransi = garansi;
    }

    @Override
    public void Display(){
        Display();
        System.out.println("Harga                : " + this.masaGaransi);
    }
}


public class MAIN {
    public static void main(String[] args){
        ElectronicsProduct kipas = new ElectronicsProduct("222","Kipas",20000);
        kipas.setDiscon(20);

        WashingMachine sepeda = new WashingMachine("222","Sepeda CRF",200000,"2 tahun");
        sepeda.setDiscon(20);
        sepeda.Display();
    }
}
