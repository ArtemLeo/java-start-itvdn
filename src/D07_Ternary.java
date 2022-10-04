import java.util.Scanner;

public class D07_Ternary {
    // Тернарная условная операция.

    public static void main(String[] args) {
        String string = "Hello ";

        System.out.println("Введите свой логин:");
        Scanner in = new Scanner(System.in);
        
        // Создаем переменную с именем login типа String и принимаем в нее ввод от пользователя
        
        String login = in.next();

        // Переменной string присваиваем возвращаемое значение тернарного оператора

        string += login.equals("Admin") ? "Administrator" : "User";
        System.out.println(string);
    }
}
