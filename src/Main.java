import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("How old are you?");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt())
        {
            int age = in.nextInt();
            if (age >= 21)
            {
                System.out.println("Here's your wristband! Drink responsibly.");
            }
            else {
                System.out.println("No wristband for you! You're under 21!");
            }
        }
        else {
            String trash = in.nextLine();
            System.out.println(trash + " is not a valid input! Restart the program!");
        }
    }
}