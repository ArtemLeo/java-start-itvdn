public class H04_MethodsMainOverload {
    public static void main(String[] args) {
        
        if(args.length > 0)               // если через консоль были введены аргументы
            System.out.println(args[0]);  // то вывести на консоль первый элемент из массива
        else {                            // иначе - использовать обычный метод с названием main()
            main();
        }
    }

    public static void main() {          
        System.out.println("it's usual main method without String[] args!");
    }
}
