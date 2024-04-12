import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.print("Podaj liczbe:");
        int l = Integer.parseInt(scr.nextLine());
        for(int i = l;-1<i; i--){
            System.out.println(i);

        }

    }
}