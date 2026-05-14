import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class JavaDateAndTime {

    static class Result {

        public static String findDay(int month, int day, int year) {

            var ret = LocalDate.of(year, month, day);
            return ret.getDayOfWeek().toString();

        }

    }

    public static void main(String[] args) throws IOException {

        try (Scanner in = new Scanner(System.in)) {

            String[] firstMultipleInput = in.nextLine().replaceAll("\\s+$", "").split(" ");

            int month = Integer.parseInt(firstMultipleInput[0]);

            int day = Integer.parseInt(firstMultipleInput[1]);

            int year = Integer.parseInt(firstMultipleInput[2]);

            String res = Result.findDay(month, day, year);

            System.out.println(res.toString());
        }
    }
}
