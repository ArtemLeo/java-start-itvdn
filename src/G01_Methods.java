public class G01_Methods {
    
    // Методы.

    // Сздаем метод с именем procedure, который ничего не принимает и ничего не возвращает.
    // В теле метода, выводим на экран строку - Hello!

    static void procedure() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {

        // В теле метода Main, вызываем метод procedure.
        procedure();
    }
}
