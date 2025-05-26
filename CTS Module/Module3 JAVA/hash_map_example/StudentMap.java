package hash_map_example;

import java.util.HashMap;
import java.util.Scanner;

public class StudentMap {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student IDs and names (type 'exit' as name to stop):");
        while (true) {
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit"))
                break;
            studentMap.put(id, name);
        }

        System.out.print("Enter an ID to fetch the student name: ");
        int searchId = scanner.nextInt();
        System.out.println("Student Name: " + studentMap.getOrDefault(searchId, "Not Found"));

        scanner.close();
    }
}
