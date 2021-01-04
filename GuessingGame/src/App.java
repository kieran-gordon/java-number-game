import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int randomNumber = random.nextInt(101);
        int guessedNumber;

        System.out.println("Enter a number between 0 and 100.");
        guessedNumber = scan.nextInt();

        do {
            if(guessedNumber > randomNumber) {
                System.out.println("Try a lower number.");
                guessedNumber = scan.nextInt();   
            }
            else if(guessedNumber < randomNumber) {
                System.out.println("Try a higher number.");
                guessedNumber = scan.nextInt();   
            }
            else {
                break; 
            }
        } while ((guessedNumber > randomNumber) || (guessedNumber < randomNumber));
        
        System.out.println("Correct! The random number was " + randomNumber + ".");

        scan.close();
    }
}
