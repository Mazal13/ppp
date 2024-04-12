import java.util.ArrayList;
import java.util.Scanner;

public class powt2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Podaj imie: ");
        String imie = scr.nextLine();
        System.out.print("Podaj nazwisko: ");
        String nazwisko = scr.nextLine();
        String a = imie+nazwisko;



        int count = 0;
        for(int i = 0;i<a.length();i++){

        if(a.charAt(i) == 'a' || a.charAt(i) == 'A') {
            count++;
        }
        }
        System.out.println(count);





    }

};

