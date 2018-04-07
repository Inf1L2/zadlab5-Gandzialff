package pl.edu.ur.oopl5;

import java.util.Scanner;

public class Stack {
    private int[] Stack;
    private int indc;
    private Scanner s = new Scanner(System.in);

    Stack(int size)
    {
            Stack = new int[size];
            indc = -1;
    }

    private void push()
    {
        if(indc < Stack.length-1)
        {
            System.out.print("Podaj wartość:");
            int value = s.nextInt();
            indc++;
            Stack[indc] = value;
            System.out.println("Dodano element stosu");
        }
        else System.err.println("Stos pełny!");
    }
    private void pop()
    {
     if(indc >= 0)
     {
         Stack[indc] = 0;
         indc--;
         System.out.println("Usunięto element ze stosu");
     }
     else
     {
         System.err.println("Stos pusty!");
     }
    }
    private void showStack()
    {
        if(indc > -1)
        {
            for(int i=Stack.length-1;i>=0;i--)
            {
                System.out.println(Stack[i]);
            }
        }
        else
        {
            System.err.println("Stos pusty! Nie można wyświetlić zawartości");
        }
    }
    public void menu()
    {
        int k=0;
        do {
            System.out.println("---------------\n1.Dodaj element do stosu\n2.Usun element ze stosu\n3.Pokaż zawartość stosu\n4.Wróć do menu głównego\n---------------");
            System.out.print("Wybierz opcję: ");
            int w = s.nextInt();
            switch (w) {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    showStack();
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
