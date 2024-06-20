import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input_terminal = new Scanner(System.in);
        // inputan
        System.out.print("masukan panjang baris/kolom : ");
        int panjangMatriks = input_terminal.nextInt();

        // deklarasi matriks
        int matriks1[][] = new int[panjangMatriks][panjangMatriks];


        // inputan nilai matriks dan loopingnya
        for (int i = 0; i < panjangMatriks; i++) {
            for (int j = 0; j < panjangMatriks; j++) {
                System.out.print("baris ke " + (i + 1) + " kolom ke " + (j + 1) + " : ");
                matriks1[i][j] = input_terminal.nextInt();
            }
        }
        System.out.println("\n");

        // tampilan matriks
        System.out.println("Hasil inputan Matriks");
        for (int l = 0; l < matriks1.length; l++) {
            System.out.print("[");
            for (int k = 0; k < matriks1[l].length; k++) {
                System.out.print(" " + matriks1[l][k] + " ");
            }
            System.out.print("]\n");
        }
        System.out.println("\n");
        int[][] matriksTranspose = new int[panjangMatriks][panjangMatriks];
        // Membuat matriks transpose
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                matriksTranspose[a][b] = matriks1[b][a];
            }
        }

        // tampilkan matriks transpose
        System.out.println("Matriks transpose");
        for (int l = 0; l < matriks1.length; l++) {
            System.out.print("[");
            for (int k = 0; k < matriks1[l].length; k++) {
                System.out.print(" " + matriksTranspose[l][k] + " ");
            }
            System.out.print("]\n");
        }
        System.out.println("\n");

        // menjumblahkan kedua matriks
        for (int i = 0; i < matriks1.length; i++) {
            for (int j = 0; j < matriks1.length; j++) {
                matriksTranspose[i][j] = matriks1[i][j] + matriksTranspose[i][j];
            }
        }
        System.out.println("\n");
        System.out.println("Hasil jumblah matriks1 dan matriksTranspose");
        for (int l = 0; l < matriks1.length; l++) {
            System.out.print("[");
            for (int k = 0; k < matriks1[l].length; k++) {
                System.out.print(" " + matriksTranspose[l][k] + " ");
            }
            System.out.print("]\n");
        }

        System.out.println("Ubah ke ArrayList");
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();

        for (int i = 0; i < matriksTranspose.length; i++) {
            ArrayList<Integer> arrayList1 = new ArrayList<>();
            for (int j = 0; j < matriksTranspose[i].length; j++) {
                arrayList1.add(matriksTranspose[i][j]);
            }
            arrayList.add(arrayList1);
        }
        System.out.println("\n");

        for (ArrayList<Integer> hasil : arrayList) {
            for (Integer hasil2 : hasil) {
                System.out.print(hasil2 + " ");
            }
            System.out.println();
        }
    }
}
