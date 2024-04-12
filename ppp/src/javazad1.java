import java.util.Scanner;

public class javazad1 {



    public static void javaZad1() {
        Scanner scr = new Scanner(System.in);
        System.out.print("Podaj imie:");
        String imie = scr.nextLine();
        System.out.print("Podaj nazwisko:");
        String nazwisko = scr.nextLine();
        System.out.println(imie.charAt(0)+"."+nazwisko.toUpperCase());
        System.out.println("Nazwisko składa sie z: "+nazwisko.length()+" liter");



    }

    public static void main(String[] args) {
        javaZad1();
    }


}