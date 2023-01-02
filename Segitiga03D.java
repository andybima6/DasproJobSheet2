import java.util.Scanner;
public class Segitiga03D {
    public static void main(String[] args) {
    Scanner andyNugraha = new Scanner(System.in);
    int alas;
    int tinggi;
    float luas;

    System.out.print("Masukkan alas: ");
    alas = andyNugraha.nextInt();

    System.out.print("Masukkan tinggi: ");
    tinggi = andyNugraha.nextInt();
    luas = alas * tinggi/ 2;
    System.out.println("Luas segitga: " + luas);
    }
}
