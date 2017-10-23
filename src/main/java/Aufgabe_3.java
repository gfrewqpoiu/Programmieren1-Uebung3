import java.util.Scanner;
public class Aufgabe_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte Sekunden angeben: ");
        final int Sekunden = scanner.nextInt();
        final int tage = (Sekunden / 86400);
        int tagerest = Sekunden % 86400;
        final int stunden = tagerest / 3600;
        int stundenrest = tagerest % 3600;
        final int minuten = stundenrest / 60;
        final int restSekunden = stundenrest % 60;
        System.out.println(tage+ " Tage " + stunden + " Stunden " + minuten+ " Minuten und " + restSekunden + " Sekunden");
    }
}