import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose your character name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name);
        System.out.printf("You have entered the dungeon.");

    }
}