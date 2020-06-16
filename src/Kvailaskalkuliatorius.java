import java.util.*;

public class Kvailaskalkuliatorius {

    public static void main(String[] args) {

        System.out.println("Kvailas kalkuliatorius!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Iveskite pirma skaiciu: ");
        int pirmas = scanner.nextInt();

        System.out.print("Iveskite antra skaiciu: ");
        int antras = scanner.nextInt();

        System.out.print("Iveskite operacija (+ - * / %): ");
        String operacija = scanner.next();

        int rezultatas = skaiciavimas(operacija, pirmas, antras);

        System.out.println(pirmas + " " + operacija + " " + antras + " = " + rezultatas);
    }

    // cia as galiu kurti kitus savo metodus (funkcijas)
    static int skaiciavimas(String op, int p1, int p2) {
        int rezultatas = 0;

        if (Objects.equals(op, "+")) {
            rezultatas = p1 + p2;
        } else  if (Objects.equals(op, "-")) {
            rezultatas = p1 - p2;
        } else if (Objects.equals(op, "/")) {
            rezultatas = p1 / p2;
        } else if (Objects.equals(op, "*")) {
            rezultatas = p1 * p2;
        } else if (Objects.equals(op, "%")) {
            rezultatas = p1 % p2;
        }

        return rezultatas;
    }

}
