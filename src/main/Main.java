package main;

import java.util.Scanner;

/**
 * @author abhi
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your input String ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine().trim();
        System.out.println("welcome," + userName + "!");
        scanner.close();

    }
}
