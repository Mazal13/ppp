import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Scanner scr1 = new Scanner(System.in);
        System.out.print("Podaj liczbe zaczynajaca przedział: ");
        int l = Integer.parseInt(scr.nextLine());
        System.out.print("Podaj liczbe konczaca przedzial: ");
        int l1 = Integer.parseInt(scr1.nextLine());

        while (l1>=l){
            if(l1%2 != 0){
                System.out.println(l1);

            }
            l1--;


        }





}
}
