package Java;

import java.util.Scanner;

public class StringInputDemo {

    public static void main(String[] args) {

        // Create a scanner for reading input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user - color
        System.out.print("What is your favorite color? ");

        // Read the input from the user - color
        String color = scanner.nextLine();

        // Prompt the user - hobby
        System.out.print("What is your hobby? ");

        // Read the input from the user - hobby
        String hobby = scanner.nextLine();

//        String color = "blue";
//        String hobby = "coding";

        System.out.println("My favorite color is " + color);
        System.out.println("My hobby is " + hobby);
    }
}
