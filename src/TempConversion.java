import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Variables
        double userTemp = 0;
        double fahrenheit;
        boolean valid = false;
        boolean rematch = false;
        String userRematch;

        while (!rematch) {
            //inputs
            System.out.println("Please in put a valid temperature in celsius");
            do {
                if (scan.hasNextDouble()) {
                    userTemp = scan.nextDouble();
                    valid = true;

                }
                else {
                    System.out.println("You have given an invalid temperature. Please try again");
                    scan.nextLine();
                }
            } while (!valid);

            fahrenheit = ((double) 9 /5) * userTemp + 32;

            //output
            System.out.printf("%5s %10.2f %5s %10.2f", "Degrees C: ", userTemp, "\nDegrees F: ", fahrenheit);

            System.out.println("\nDo you want to input another temperature? [Y/N]");
            scan.nextLine();
            userRematch = scan.nextLine();
            if (userRematch.equalsIgnoreCase("Y")) {
                rematch = false;
            }
            else if (userRematch.equalsIgnoreCase("N")) {
                rematch = true;
            }
            else {
                System.out.println("You inputted an incorrect answer, defaulting to N");
                rematch = true;
            }


        }
    }
}