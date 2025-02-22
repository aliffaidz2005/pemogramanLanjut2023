package event;
/*
Tulis program Java untuk membuat kelas yang disebut "Event" dengan atribut
untuk nama acara, tanggal, dan lokasi. Buat subkelas "Seminar" dan "MusicalPerformance"
yang menambahkan atribut tertentu seperti jumlah pembicara untuk seminar dan daftar penampil
untuk konser. Terapkan metode untuk menampilkan detail acara dan memeriksa konflik dalam jadwal acara.
 */

import java.util.ArrayList;

class Event{
    protected String acara;
    protected String tanggal;
    protected String lokasi;

    public Event(String inputAcara, String inputTanggal, String inputLokasi){
        this.acara = inputAcara;
        this.lokasi = inputLokasi;
        this.tanggal = inputTanggal;
    }

    public Event(){

    }
}
class Seminar extends Event{
    private Integer jumblahPembicara;
    public Seminar(String inputAcara, String inputTanggal, String inputLokasi, Integer inputPembicara){
        super(inputAcara,inputTanggal,inputLokasi);
        this.jumblahPembicara = inputPembicara;
    }
    public void DetailAcara(){
        System.out.println("Acara            : " + this.acara);
        System.out.println("Tanggal          : " + this.tanggal);
        System.out.println("lokasi           : " + this.lokasi);
        System.out.println("Jumbla Pembicara : " + this.jumblahPembicara);
    }
}
class MusicalPerformance extends Event{
    private ArrayList<String>  daftarTampilkonser;

    public MusicalPerformance(String inputAcara, String inputTanggal, String inputLokasi){
        super(inputAcara,inputTanggal,inputLokasi);
        daftarTampilkonser = new ArrayList<>();
    }
    public void addDaftarTampilkonser(String tampil){
        daftarTampilkonser.add(tampil);
    }
    public void Display(){
        System.out.println("Acara   : " + this.acara);
        System.out.println("Tanggal : " + this.tanggal);
        System.out.println("lokasi  : " + this.lokasi);
        System.out.println("Daftar orng konser");
        for (int i = 0; i < daftarTampilkonser.size(); i++) {
            System.out.println(daftarTampilkonser.get(i));
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Seminar Ai = new Seminar("Artificial Intelligence","12 november","Aula e",1);
        Ai.DetailAcara();

        MusicalPerformance adit = new MusicalPerformance("Konser deklarasi","20 juni","benu benua");
        adit.addDaftarTampilkonser("ahmad dani");
        adit.addDaftarTampilkonser("jokowi");
        adit.Display();


    }
}
