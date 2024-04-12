import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class lotto {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(lotto1()));

    }



    public static int[] lotto1(){
        Random rand = new Random();
        int[] tablica = new int[6];
        Set<Integer> unikalne = new HashSet<>();
        for(int i = 0; i<6;i++){
            int losowe;
            do{
                losowe = rand.nextInt(49) + 1;
            } while (!unikalne.add(losowe));
            tablica[i] = losowe;

        }
        return tablica;
    }
}
