package pl.edu.ur.oopl5;

import java.util.Scanner;

public class Liczba {
    private Integer[] l;
    private Scanner s = new Scanner(System.in);

    public Liczba(String value)
    {
        l = new Integer[value.length()];
        Character[] zn = new Character[value.length()];

        for (int i=0; i<zn.length; i++)
        {
            zn[i] = value.charAt(i);
        }
        for (int i=0; i<zn.length; i++)
        {
            l[i] = Character.getNumericValue(zn[i]);
        }
    }
    public void show()
    {
        System.out.print("Liczba: ");
        for (int i=0; i<l.length; i++){
            System.out.print(l[i]);
        }
        System.out.println();
    }

    public void multi()
    {
        int sk;
        String value = "";
        System.out.print("Podaj składnik: ");
        sk = s.nextInt();

        for(int i=0;i<l.length;i++)
        {
            value = value + Integer.toString(l[i]);
        }
        int valueInt = Integer.valueOf(value);
        int wynik = valueInt * sk;
        value = Integer.toString(wynik);
        Character[] zn = new Character[value.length()];

        for(int i=0;i<zn.length;i++)
        {
            zn[i] = value.charAt(i);
        }
        Integer[] wyniktab = new Integer[zn.length];

        for(int i=0;i<zn.length;i++)
        {
            wyniktab[i] = Character.getNumericValue(zn[i]);
        }
        System.out.println("Wynik: ");
        for(int i=0;i<wyniktab.length;i++)
        {
            System.out.print(wyniktab[i]);
        }
        System.out.println("");
    }

}
