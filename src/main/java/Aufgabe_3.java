import java.util.Scanner;
public class Aufgabe_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte Sekunden angeben: ");
        final int Sekunden = scanner.nextInt();
        final int Tage = (Sekunden / 86400);
        int tageRest = Sekunden % 86400;
        final int Stunden = tageRest / 3600;
        int stundenRest = tageRest % 3600;
        final int Minuten = stundenRest / 60;
        final int restSekunden = stundenRest % 60;
        System.out.println(Tage+ " Tage " + Stunden + " Stunden " + Minuten+ " Minuten und " + restSekunden + " Sekunden");
    }
}