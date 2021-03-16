import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
  /*      LocalDate localDate = LocalDate.of(2006, 10, 02);
        System.out.println("0-" + localDate + " " + localDate.getDayOfWeek());
        localDate = localDate.plusYears(1);
        System.out.println("1-" + localDate + " " + localDate.getDayOfWeek());
        localDate = localDate.plusYears(1);
        System.out.println("2-" + localDate + " " + localDate.getDayOfWeek());
        localDate = localDate.plusYears(1);
        System.out.println("3-" + localDate + " " + localDate.getDayOfWeek());
        localDate = localDate.plusYears(1);
        System.out.println("4-" + localDate + " " + localDate.getDayOfWeek());
        localDate = localDate.plusYears(1);
        System.out.println("5-" + localDate + " " + localDate.getDayOfWeek());
        localDate = localDate.plusYears(1);
        System.out.println("6-" + localDate + " " + localDate.getDayOfWeek());
        localDate = localDate.plusYears(1);
        System.out.println("7-" + localDate + " " + localDate.getDayOfWeek());
        localDate = localDate.plusYears(1);
        System.out.println("8-" + localDate + " " + localDate.getDayOfWeek());
        localDate = localDate.plusYears(1);
        System.out.println("9-" + localDate + " " + localDate.getDayOfWeek());
        localDate = localDate.plusYears(1);
        System.out.println("10-" + localDate + " " + localDate.getDayOfWeek());
        localDate = localDate.plusYears(1);
        System.out.println("11-" + localDate + " " + localDate.getDayOfWeek());
        localDate = localDate.plusYears(1);
        System.out.println("12-" + localDate + " " + localDate.getDayOfWeek());
        localDate = localDate.plusYears(1);
        System.out.println("13-" + localDate + " " + localDate.getDayOfWeek());
        localDate = localDate.plusYears(1);
        System.out.println("14-" + localDate + " " + localDate.getDayOfWeek());*/
        System.out.println(collectBirthdays(2006, 10, 02));
    }
    public static String collectBirthdays (int year, int month, int day) {
        LocalDate localDate = LocalDate.of(year, month, day);
        String birthdaysString = "";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - E");
        while (localDate.isBefore(LocalDate.now())) {
            birthdaysString = birthdaysString + localDate.format(dateTimeFormatter).toString() + "\n";
            localDate = localDate.plusYears(1);
        }
        return birthdaysString;
    }

}
