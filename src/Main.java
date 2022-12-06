
import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        out.print("Please write number between 1 and 10:");
        int inputNumber = keyboard.nextInt();
        int randomNumber = new Random().nextInt(10) + 1;

        if(inputNumber == randomNumber) {
            out.println("***********");
            out.println("You won!!!! :)");
            out.println("***********");
        } else {
            out.println("You lost!");
            out.println("The random number was: ");
            out.println(randomNumber + ".");
        }
        System.out.println("Thanks for playing.");
        keyboard.close();
    }
}