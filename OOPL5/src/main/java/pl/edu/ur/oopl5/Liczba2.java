package pl.edu.ur.oopl5;

import java.util.Scanner;

public class Liczba2 {
    Liczba liczba;
    private Scanner s = new Scanner(System.in);

    public void setValue(String wartosc)
    {
        liczba = new Liczba(wartosc);
    }

    public void factorial(String wartosc)
    {
        int fact = 1;
        int wartoscInt = Integer.parseInt(wartosc);
        for(int i=1;i<=wartoscInt;i++)
        {
            fact *= i;
        }
        System.out.println("Wynik: "+fact);
    }

    public void menu()
    {
        System.out.println("Podaj wartość:");
        String wartosc = s.nextLine();
        setValue(wartosc);
        int k=0;
        do {
            System.out.println("---------------\n1.Wyswietl liczbe\n2.Mnożenie\n3.Silnia\n4.Powrót do menu głównego");
            System.out.print("Wybierz opcję: ");
            int w = s.nextInt();
            System.out.println("---------------");
            switch (w) {
                case 1:
                    liczba.show();
                    break;
                case 2:
                    liczba.multi();
                    break;
                case 3:
                    factorial(wartosc);
                    break;
                case 4:
                    k = 1;
                    Main.main(new String[0]);
                    break;
                default:
                    System.err.println("Wybrano nieprawidłową operację!");
                    break;
            }
        }while(k!=1);

    }

}
