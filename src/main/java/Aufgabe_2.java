import java.util.Scanner;
public class Aufgabe_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Bruttobetrag eingeben:");
        double bruttobetrag = Double.parseDouble(scanner.nextLine());
        System.out.println("Bitte Steuersatz eingeben:");
        double steuersatz = Double.parseDouble(scanner.nextLine());
        double nettobetrag = bruttobetrag / (1+steuersatz);
        System.out.println("Nettobetrag: " + nettobetrag);
        System.out.println("Steueranteil: " + (bruttobetrag - nettobetrag));
    }
}
