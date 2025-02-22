package traffictLight;
/*
Tulis program Java untuk membuat kelas yang disebut "TrafficLight" dengan atribut
untuk warna dan durasi, serta metode untuk mengubah warna dan memeriksa warna merah
atau hijau.

 */
class TrafficLight{
    public Integer durasi;
    private String warna;

    public TrafficLight(Integer Durasi, String Warna) {
        this.durasi = Durasi;
        this.warna = Warna;
    }

    public void setWarna(Boolean aturWarna){
        if(aturWarna) {
            this.warna = "Hijau";
        }else {
            this.warna = "Merah";
        }
    }

    public String getWarna(){
        return this.warna;
    }

}


public class Main {
    public static void main(String[] args) {
        TrafficLight mandonga = new TrafficLight(60,"Merah");
        System.out.println("Warna  : " + mandonga.getWarna());
        System.out.println("Durasi : " + mandonga.durasi);

        System.out.println("Mengubah warna");
        mandonga.setWarna(true);
        System.out.println("After : " + mandonga.getWarna());
    }
}
