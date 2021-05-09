package Classes;

import java.util.Scanner;

public class Input {
    public static String[] input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение");
        String input = scanner.nextLine();
        String[] data = input.split(" ");
        return data;
    }
}
