import java.util.Scanner;
public class Aufgabe_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperatur: ");
        double temperatur = Double.parseDouble(scanner.nextLine());
        double fahrenheitTemperatur = (9.0/5.0 * temperatur) + 32;
        System.out.println(temperatur + " Grad Celsius entsprechen " + fahrenheitTemperatur + " Grad Fahrenheit");
    }
}
