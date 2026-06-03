import java.util.*;
public class exe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> students = new HashMap<>();

        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            System.out.println("Enter ID:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter name:");
            String name = sc.nextLine();

            students.put(id, name);
        }

        System.out.println("Enter ID to search:");
        int searchId = sc.nextInt();

        if(students.containsKey(searchId)) {
            System.out.println("Name: " + students.get(searchId));
        } else {
            System.out.println("Student not found");
        }
         sc.close();
    }
}





