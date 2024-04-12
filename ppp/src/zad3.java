import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int l = Integer.parseInt(scr.nextLine());
        String parzysta = "nie";
        String podzielna3 = "nie";
        String podzielna5 = "nie";
        if((l%2)==0){
            parzysta = "tak";
        }
        if((l%3)==0){
            podzielna3 = "tak";
        }
        if((l%5)==0){
            podzielna5 = "tak";
        }
        System.out.println(l+": Parzysta: "+parzysta+". Podzielna przez 3: "+podzielna3+". Podzielna przez 5: "+podzielna5);






    }
}
