import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import static java.util.Collections.sort;

public class zadd1 {
    public static void main(String[] args) {


        ArrayList<Integer> lista = new ArrayList<Integer>();
        int l;
        do {
            System.out.print("Podaj liczbe jesli chcesz zakonczyc wpisz 0: ");
            l = getAns();
            if (l % 2 == 0 && l % 3 == 0 && l % 5 == 0) {
                if (l!= 0){
                    lista.add(l);}

            }

        } while (l != 0);
        System.out.println("Wielkosc listy: "+lista.size());
        sort(lista);
        int i = 0;
        System.out.println("Najmniejsza licza: "+ lista.get(i));
        System.out.println("Najwieksza licza: "+ lista.get(lista.size()-1));



    }
    public static int getAns(){
        return new Scanner(System.in).nextInt();
    };
}
