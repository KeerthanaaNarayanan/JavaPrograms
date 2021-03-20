import java.util.Scanner;

public class ReadUserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth");
        int year = scanner.nextInt();
        scanner.nextLine();  // handle next line character (enter key)
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        int age = 2021 - year;
        System.out.println(" name " + name + " age " + age);
        scanner.close();
    }
}
