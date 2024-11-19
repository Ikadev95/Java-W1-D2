package Esercizi.esercizio4;

import java.util.Scanner;

public class Esercizio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int x = scanner.nextInt();

        for (int i = x; i >= 0; i--) {
            System.out.println(i);
        }

    }
}
