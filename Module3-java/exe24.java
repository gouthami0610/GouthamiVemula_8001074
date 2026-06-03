


import java.util.*;
public class exe24 {
//public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            names.add(sc.nextLine());
        }

        System.out.println("Student names:");
        for(String name : names) {
            System.out.println(name);
        }
         sc.close();
    }
}