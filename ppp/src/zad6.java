import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Podawaj liczby az wypiszesz 0:");
        int l;
        int suma = 0;
        int iloscliczb = 0;
        do{
         l = Integer.parseInt(scr.nextLine());
         if(l!=0){
             suma += l;
             iloscliczb++;
         }
        }   while (l!=0);
        if(iloscliczb>0){
            double srednia = suma/iloscliczb;
            System.out.println("Średnia artmetyczna podanych liczb: "+srednia);

        }else {
            System.out.println("Nie podano liczb");
        };


    }
}
