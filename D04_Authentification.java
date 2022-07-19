import java.util.Scanner;

public class D04_Authentification {
    public static void main(String[] args) {
        String login = "Artem";
        String password = "Password";
        // На 10 строке создаём объект класса Scanner для обработки ввода с клавиатуры
        Scanner sc = new Scanner(System.in);

        System.out.print("Input login: ");

        // На 17 строке создаем строкову локальную переменную с именем usersLogin
        // и принимаем в нее ввод от пользователя

        String usersLogin = sc.next();

        if (login.equals(usersLogin)) {
            System.out.print("Input password: ");
            String usersPassword = sc.next();

            if (password.equals(usersPassword)) {
                System.out.println("Hello " + usersLogin + ", and welcome!");
            } else {
                System.out.println("Password is false!");
            }
        } else {
            System.out.println("No user name!");
        }
    }
}
