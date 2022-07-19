import java.util.Scanner;

public class D15_Scanner {
    public static void main(String[] args) {
        System.out.println("Just input something:");

        Scanner input = new Scanner(System.in);
        String buffer = input.next();

        System.out.println(buffer);
    }
}
