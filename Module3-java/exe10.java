import java.util.*;
public class exe10 {
    //class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;
        int guess;

        do {
            guess = sc.nextInt();

            if(guess > number)
                System.out.println("Too high");
            else if(guess < number)
                System.out.println("Too low");
            else
                System.out.println("Correct");
        } while(guess != number);
         sc.close();
    }
}
