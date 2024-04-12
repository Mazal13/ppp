import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class powt3 {
    public static void main(String[] args) {
        int a = 5;
        int h = 4;
        float odp = (a*h)/2;
        System.out.println(odp);


        Set<Integer> unikalne = new HashSet<>();
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner scr = new Scanner(System.in);
        System.out.print("Podaj ilosc uczniow: ");
        int liczbaucz = Integer.parseInt(scr.nextLine());

        Random random = new Random();

        for(int b = 3;b>0;b--) {
            int i;
            do{
                 i = random.nextInt(liczbaucz) + 1;
            } while (!unikalne.add(i));
            lista.add(i);

        }
        System.out.println(lista);

        System.out.print("Podaj liczbe: ");
        int liczba = Integer.parseInt(scr.nextLine());
        System.out.println("Potegi liczby 2 mniejsze od podanej wartosci:");
        for(int o = 1; o<liczba;o++){
            int potega = (int) Math.pow(2,o);
            if(potega<liczba){
                System.out.println(potega);
            }

        }

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", new Locale("pl","PL"));
        String formatowana = formatter.format(currentDate);
        System.out.println(formatowana);













    }


}


