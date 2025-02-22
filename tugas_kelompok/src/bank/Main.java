package bank;

/*
Tulis program Java untuk membuat kelas bernama "BankAccount" dengan atribut untuk
nomor akun, nama pemegang akun, dan saldo. Sertakan metode untuk menyetor dan menarik
uang, serta memeriksa saldo. Buat subkelas yang disebut "SavingsAccount" yang
menambahkan atribut suku bunga dan metode untuk menerapkan bunga.
 */
class BankAccuont{
    private String nomorAkun;
    private String pemengangAkun;
    private Double saldo;

    public BankAccuont(String nomorAkun, String pemengangAkun, Double saldo) {
        this.nomorAkun = nomorAkun;
        this.pemengangAkun = pemengangAkun;
        this.saldo = saldo;
    }

    public void Menyetor(Double uang){
        if(uang > 0 ){
            this.saldo += uang;
        }else{
            System.out.println("Saldo harus lebih dari 0");
        }
    }
    public void Menarik(Double uang){
        if(uang > 0 && this.saldo >= uang){
            this.saldo -= uang;
        }else if (uang > this.saldo){
            System.out.println("penarikan harus lebih dari 0");
        }else {
            System.out.println("gagal menarik uang");
        }
    }
    public Double getSaldo(){
        return this.saldo;
    }
}

class SavingsAccount extends BankAccuont {
    private Double bunga;
    public SavingsAccount(String inputNomor, String inputUser, Double inputSaldo, Double inputBunga){
        super(inputNomor,inputUser,inputSaldo);
        this.bunga = inputBunga;
    }
    public void addBunga(){
        Double SukuBunga = (this.getSaldo() * this.bunga) / 100;
        Menyetor(SukuBunga);
    }
}


public class Main {
    public static void main(String[] args) {
        BankAccuont alif = new BankAccuont("123212", "Alif", 12.000);
        alif.Menyetor(3.000);
        System.out.println(alif.getSaldo());
        alif.Menarik(7.000);
        System.out.println(alif.getSaldo());


        SavingsAccount faidz = new SavingsAccount("3333","Faidz",12.000,3.0);
        faidz.Menyetor(3.000);
        System.out.println(faidz.getSaldo());
        faidz.addBunga();
        System.out.println(faidz.getSaldo());

    }
}
