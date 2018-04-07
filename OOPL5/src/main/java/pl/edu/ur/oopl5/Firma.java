package pl.edu.ur.oopl5;

import java.util.Scanner;

public class Firma {
    private Pracownik[] list = new Pracownik[100];
    private int counter;
    private int index;
    private Scanner s = new Scanner(System.in);

    private void createList()
    {
        for(int i=0;i<list.length;i++)
        {
            list[i] = new Pracownik("","",0,"");
        }
        counter = 0;
    }

    private void add()
    {
        System.out.println("Podaj numer indeksu(0-99): ");
        index = s.nextInt();
    if(!list[index].isExist())
    {
        System.out.println("Podaj imię: ");
        list[index].setName(s.next());
        System.out.println("Podaj nazwisko: ");
        list[index].setSurrname(s.next());
        System.out.println("Podaj wiek: ");
        list[index].setAge(s.nextInt());
        System.out.println("Podaj stanowisko");
        list[index].setPosition(s.next());
        list[index].setExist(true);
    }
    else
    {
        System.err.println("Błąd! Do podanego indexu przypiasno juz pracownika");
    }

    }
    private void show()
    {
        for(int i=0;i<list.length;i++)
        {
            if(list[i].isExist())
            {
                System.out.println("Id: "+i+" "+list[i].toString());
            }
        }

    }

    public void menu()
    {
        createList();
        int k=0;
        do {
            System.out.println("---------------\n1.Dodaj pracownika\n2.Wyświetl listę\n3.Wróć do menu głównego");
            System.out.print("Wybierz opcję: ");
            int w = s.nextInt();
            System.out.println("---------------");
            switch (w) {
                case 1:
                    add();
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    k = 1;
                    Main.main(new String[0]);
                default:
                    System.err.println("Wybrano nieprawidłową operację!");
                    break;
            }
        }while(k!=1);

    }
}
