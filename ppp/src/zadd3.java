import java.util.Scanner;

public class zadd3 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.print("Podaj do ktorej liczby chcesz wyswietlic ciag fib: ");
        int n = Integer.parseInt(scr.nextLine());
        fibo(n);







    }

    private static void fibo(int n) {

        int i = 0;
        int j = 1;
        int fib = 0;
        if(n == 0){
            System.out.println(fib);
        } else if (n<=2) {
            fib = 1;
            System.out.println(fib);
        }else{
            System.out.println(i);
            System.out.println(j);
            for(int o = 2; o <= n; o++) {
                fib = i + j;
                i = j;
                j = fib;
                System.out.println(fib);

            }
        }
    }

}