package pl.edu.ur.oopl5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //TODO zad 3, 5, 6
        int w;
        Scanner s = new Scanner(System.in);
        System.out.println("1.Zad3 2.Zad5 3.Zad6 4.Koniec programu");
        System.out.print("Wybierz Zadanie: ");
        w = s.nextInt();
        switch(w)
        {
            case 1:
                System.out.print("Podaj rozmiar stosu: ");
                int size = s.nextInt();
                Stack stack = new Stack(size);
                stack.menu();
                break;
            case 2:
                Firma worker = new Firma();
                worker.menu();
                break;
            case 3:
                Liczba2 liczba = new Liczba2();
                liczba.menu();
                break;
            case 4:

                break;
            case 5:

                break;
            default:

                break;
        }
    }
    
}
