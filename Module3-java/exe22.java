import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class exe22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter text:");
            String text = sc.nextLine();

            FileWriter fw = new FileWriter("output.txt");
            fw.write(text);
            fw.close();

            System.out.println("Data written successfully");
        } catch(IOException e) {
            System.out.println("Error occurred");
        }
         sc.close();
    }
}
