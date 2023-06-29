import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * The SleepCalculator class calculates the amount of time spent sleeping
 * since a user's birth date.
 */
public class SleepCalculator {
    public static void main(String[] args) {
        // Replace with the user's actual birth date
        LocalDate birthDate = LocalDate.of(1990, 1, 1);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the number of years, months, and days since the birth date
        long years = ChronoUnit.YEARS.between(birthDate, currentDate);
        long months = ChronoUnit.MONTHS.between(birthDate.withDayOfMonth(1), 
            currentDate.withDayOfMonth(1));
        long days = ChronoUnit.DAYS.between(birthDate, currentDate);

        // Calculate the number of hours spent sleeping since the birth date
        long hours = days * 8;

        // Output the results to the console
        System.out.printf("You have spent %d years, %d months, %d days, and %d hours sleeping since you were born.",
                years, months, days, hours);
    }
}