import java.util.Scanner;
public class TugasNoTiga03D {
public static void main(String[] args) {
Scanner andyNugraha03D = new Scanner(System.in);
float suhu03D,celcius03D,reamur03D,fahrenheit03D,kelvin03D;

System.out.println("Masukkan suhu");
suhu03D = andyNugraha03D.nextFloat();
celcius03D = suhu03D;
reamur03D = 4 * celcius03D / 5;
fahrenheit03D = (9/5 * celcius03D) + 32;
kelvin03D = celcius03D + 273;

System.out.println("suhu celcius " + celcius03D);
System.out.println("suhu reamur " + reamur03D);
System.out.println("suhu fahrenheit " + fahrenheit03D);
System.out.println("suhu kelvin " + kelvin03D);
 
    
    
}
}