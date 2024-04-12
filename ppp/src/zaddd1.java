import java.util.Locale;
import java.util.Scanner;


public class zaddd1 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Scanner scr1 = new Scanner(System.in);
        Scanner scr2 = new Scanner(System.in);
        System.out.print("Podaj email:");
        String email = scr.nextLine();
        System.out.print("Podaj haslo:");
        String haslo = scr1.nextLine();
        System.out.print("Podaj wzrost (np. 1.8):");
        double wzrost = Double.parseDouble(scr2.nextLine());
        email = usuwaniePustych(email);
        haslo = usuwaniePustych(haslo);
        haslo = pierwszaOstatnia(haslo);
        email = malpa(email);
        System.out.println(email);
        email = duze(email);
        System.out.println(email);
        System.out.println(haslo);
        zaokraglanie(wzrost);


    }
    public static String usuwaniePustych(String a){
        return a.replace(" ","");

    };
    public static String pierwszaOstatnia(String b){
        int dlug = b.length();
        String pierwsza = String.valueOf(b.charAt(0));
        String ostatnia = String.valueOf(b.charAt(dlug - 1));

        String pozsot = "";
        for(int i = 0;i<(dlug-2); i++) {
            pozsot = pozsot + "*";
        }
        return pierwsza+pozsot+ostatnia;
    };
    public static String malpa(String c){
        return c.replace("@","(at)");

    };
    public static void zaokraglanie(double wzrost){
        System.out.println("Wzrost "+wzrost+" zaokrąglony „w dół” wynosi "+Math.floor(wzrost)+", natomiast w góre wynosi "+Math.ceil(wzrost)+".");

    };
    public static String duze(String e){
        return e.toUpperCase(Locale.ROOT);

    };

}
