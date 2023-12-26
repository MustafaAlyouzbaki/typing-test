/* Type Test
 * Mustafa Al-Youzbaki
 * v0.01
*/
import java.util.Scanner;

public class TypeTest {

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println("Type the following sentence: ");
        System.out.println(sentence);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Press Enter to start typing...");
        scanner.nextLine(); // Wait for the user to press Enter before starting the timer

        long startTime = System.currentTimeMillis(); // Record the start time

        System.out.print("Your typing: ");
        String userTypedSentence = scanner.nextLine();

        long endTime = System.currentTimeMillis(); // Record the end time

        long totalTime = endTime - startTime;
        System.out.println("Time taken: " + totalTime + " milliseconds");

        if (sentence.equals(userTypedSentence)) {
            System.out.println("You typed it correctly!");
        } else {
            System.out.println("Oops! There were mistakes in your typing.");
        }

        scanner.close();
    }


}
