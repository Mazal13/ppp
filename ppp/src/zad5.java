import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Podaj liczbe dodatnia: ");
        int l = Integer.parseInt(scr.nextLine());
        while (l<=0){
            System.out.print("Podaj liczbe dodatnia: ");
            int i = Integer.parseInt(scr.nextLine());
            if(i>0){
                break;
            }

        }




    }
}
