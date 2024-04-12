import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Collections.sort;

public class zadd2 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<Integer>();

            System.out.print("Podaj początek przedzialu: ");
            int pocz = Integer.parseInt(scr.nextLine());
            System.out.print("Podaj koniec przedzialu: ");
            int kon = Integer.parseInt(sca.nextLine());
            if(pocz<kon){
            for(int i = pocz; i<=kon;i++){
                if(getModulo(i)){
                lista.add(i);
                }

            }
            }else {
                for(int i = kon; i<=pocz;i++){
                    if(getModulo(i)){
                        lista.add(i);
                    }

            }
            }
            for(int j: lista){
                System.out.println(j);
            }
        System.out.println("Pierwszy element: "+ lista.get(0));
        System.out.println("Ostatni element: "+ lista.get(lista.size()-1));
}
    public static boolean getModulo(int liczba){
        return liczba%2 != 0;

    };

};

