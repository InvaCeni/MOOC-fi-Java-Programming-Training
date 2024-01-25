

import java.util.Scanner;
class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message: ");


        String userMessage = scanner.nextLine();


        System.out.println(userMessage);
        System.out.println(userMessage);
        System.out.println(userMessage);

    }
}