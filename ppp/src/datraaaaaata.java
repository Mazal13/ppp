import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class datraaaaaata {
    public static void main(String[] args) {
    Ile();

    }


    public static void Ile() {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.parse("2006-08-24");

        long daysBetween = ChronoUnit.DAYS.between(date2, date1);
        System.out.println("Od narodzin mineło: "+daysBetween*24+" godzin");
    }

}
