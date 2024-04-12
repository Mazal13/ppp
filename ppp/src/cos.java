import java.util.ArrayList;
import java.util.Scanner;

public class cos {
    public static void main(String[] args) {
        ArrayList<String> swieta = new ArrayList<>();

        Scanner scr = new Scanner(System.in);
        String dziecko = "";

        while (!dziecko.equals("k")) {
            System.out.print("Podawaj imiona dzieci jesli chcesz zakonczyc wpisz 'k': ");
            dziecko = scr.nextLine();
            if(!dziecko.equals("k")){
                swieta.add(dziecko+":");}
            String prezent = "";
            while (!prezent.equals("k")){
                System.out.print("Podawaj prezenty dziecka jesli chcesz zakonczyc wpisz 'k': ");
                prezent = scr.nextLine();
                if(!prezent.equals("k")){
                    swieta.add(prezent);}

            }



        };
        System.out.println(swieta);



    }
}
