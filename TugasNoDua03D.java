import java.util.Scanner;
public class TugasNoDua03D {
    public static void main(String[] args) {
        Scanner andyNugraha03D = new Scanner(System.in);
        int itemMerah03D,itemBiru03D;

        System.out.println("Harga item merah: ");
        itemMerah03D = andyNugraha03D.nextInt();
        System.out.println("Harga item biru: ");
        itemBiru03D = andyNugraha03D.nextInt();

        int itemMerahDiskon03D = 70*itemMerah03D/100;
        int itemBiruDiskon03D = 50*itemBiru03D/100;

        System.out.println("Item Merah Setelah Diskon " + itemMerahDiskon03D);
        System.out.println("Item Biru Setelah Diskon " + itemBiruDiskon03D);

        int total03D = itemMerahDiskon03D + itemBiruDiskon03D;
        System.out.println("Total yang dibayar " + total03D); 


      
    }
}
