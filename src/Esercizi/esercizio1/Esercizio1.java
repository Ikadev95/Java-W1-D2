package Esercizi.esercizio1;

import java.util.Scanner;

public class Esercizio1 {

    public static boolean stringaPariDispari (String stringa){
        int caratteri = stringa.length();
        return caratteri % 2 == 0;
    }

    public static boolean annoBisestile(int anno){
        if(anno % 4 == 0 ){
            if(anno % 100 == 0 ){
                return anno % 400 == 0;
            }
            else return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci una stringa");
        String s = scanner.nextLine();
        if(stringaPariDispari(s)){
            System.out.println("il numero di caratteri della stringa è pari");
        }
        else System.out.println("il numero di caratteri della stringa è dispari");

        System.out.println("inserisci un anno espresso in numeri");
        int x = scanner.nextInt();
        if(annoBisestile(x)) {
            System.out.println("l'anno inserito è bisestile");
        }
        else System.out.println("l'anno inserito non è bisestile");
        scanner.close();
    }
}
