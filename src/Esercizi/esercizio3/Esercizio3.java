package Esercizi.esercizio3;

import java.util.Objects;
import java.util.Scanner;

public class Esercizio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa (per chiudere scrivi :q):");

        String s = scanner.nextLine();

        while (!Objects.equals(s, ":q")) {
            String newS = "";
            for (int i = 0; i < s.length(); i++) {
                if (i == s.length() - 1) {
                    newS = newS.concat(String.valueOf(s.charAt(i)));
                } else {
                    newS = newS.concat(s.charAt(i) + ",");
                }
            }
            System.out.println("Stringa separata: " + newS);
            System.out.println("Inserisci un'altra stringa (per chiudere scrivi :q):");
            s = scanner.nextLine();
        }


        scanner.close();
    }
}
