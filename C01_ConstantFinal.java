 class C01_ConstantFinal {
    public static void main(String[] args) {
        // На 7-й строке, создаем константу с именем A, типа double и присваиваем ей значение 3.1415

        final double A = 3.1415;

        // На 11-й строке, выводим значение константы - A, на экран.

        System.out.println("Pi = " + A + " always");

        // Попытка присвоения константе нового значения, приводит к ошибке уровня компиляции!

        // A = 2.71828183;
    }
}

