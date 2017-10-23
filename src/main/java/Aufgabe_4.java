import java.util.Scanner;
public class Aufgabe_4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Bitte Radius eingeben:");
    double radius = Double.parseDouble(scanner.nextLine());
    double umfang = 2 * Math.PI * radius;
    double flaeche = Math.PI * Math.pow(radius, 2);
    System.out.println("Der Umfang beträgt: " + umfang);
    System.out.println("Die Fläche beträgt " + flaeche);
    }
}