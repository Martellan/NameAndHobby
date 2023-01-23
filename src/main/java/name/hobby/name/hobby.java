package name.hobby.name;

import java.util.Scanner;

public class hobby {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("hi, " + name);
        System.out.println("Enter your hobby");
            String hobby=scanner.nextLine();
            System.out.println(name + " have hobby- " + hobby);


    }
}
