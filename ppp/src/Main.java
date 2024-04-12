import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Scanner scr1 = new Scanner(System.in);
        System.out.print("Podaj liczbe od 1-10: ");
        int l = Integer.parseInt(scr.nextLine());
        int i = 0;
        if((l>=1) && (l<=10)){
            while (i<1){
                System.out.print("zgadnij liczbe: ");
                int l2 = Integer.parseInt(scr.nextLine());
                if(l==l2){
                    i = 2;
                }else {
                    System.out.println("nie zagadłes");
                }
            }
            }else{
            System.out.println("Liczba nie jest w przedziale od 1 do 10");
        }
        if(i==2){
            System.out.println("Zagadłes");}
        }


    }
