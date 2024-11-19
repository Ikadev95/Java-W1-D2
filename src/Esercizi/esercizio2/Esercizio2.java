package Esercizi.esercizio2;

import java.util.Scanner;

public class Esercizio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int x = scanner.nextInt();
        String result = switch (x) {
            case 0 -> "zero";
            case 1 -> "uno";
            case 2 -> "due";
            case 3 -> "tre";
            default -> "Errore, inserisci un numero tra 0 e 3";
        };

/*        switch (x){
            case 0 : result = "zero"; break;
            case 1 : result = "uno"; break;
            case 2: result = "due"; break;
            case 3 : result = "tre"; break;
            default: result = "Errore, inserisci un numero tra 0 e 3";
        }*/

        System.out.println(result);
    }
}
