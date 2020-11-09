import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        while (true) {


            System.out.print("Tag: ");
            int tag = Integer.valueOf(scanner.nextLine());

            System.out.print("Monat: ");
            int monat = Integer.valueOf(scanner.nextLine());

            System.out.print("Jahr: ");
            int jahr = Integer.valueOf(scanner.nextLine());

            LocalDate input = LocalDate.of(jahr, monat, tag);

            System.out.println("Ihre letzte Blutspende war am " + input.format(formatter));
            System.out.println("Sie dürfen am " + input.plusDays(56).format(formatter) + " das nächste mal spenden gehen.");
            System.out.println("");
            System.out.println("Enter drücken um das Programm zu beenden");
            String enter = scanner.nextLine();

            if (enter.isEmpty()) {
                break;
            }

        }
    }
}
