package ru;

public class Main {
    public static void main(String[] args) {

        /*Задание 10*/
        guessGame();

        /*Задание 9
        rightTriangle(10);*/

        /*Задание 8
        leftTriangle(10);*/

        /*Задание 7
        square(6);*/

        /*Задание 6
        System.out.println(equalNum(1111));
        System.out.println(equalNum(1211));*/

        /*Задание 5
        System.out.println(numLen(12567)); //в условии задачи
        System.out.println(numLen(0));
        System.out.println(numLen(10));
        System.out.println(numLen(789));
        System.out.println(numLen(1000));*/

        /*Задание 4
        System.out.println(pow(2,5));*/

        /*Задание 3
        String res=chet(10);
        System.out.println(res);*/

        /*Задание 2
        String res=reverseListNums(10);
        System.out.println(res);*/

        /*Задание 1
        String res=listNums(10);
        System.out.println(res);*/
    }

    /*Задание 10
    Угадайка. Дан следующий метод:
    public static void guessGame() {
        int randomNum = 3;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("What number am I thinking (0 to 9)? :");
        int x = sc.nextInt();
        if (x != randomNum) {
            System.out.println("No, try again");
        } else {
            System.out.println("Yes, it`s " + randomNum);
        }
    }
    Данный метод считывает с консоли введенное пользователем число и выводит, угадал ли пользователь то, что было загадано, или нет. Перепишите этот метод таким образом, чтобы он запускался до тех пор, пока пользователь не угадает число. После этого выведите на экран количество попыток, которое потребовалось пользователю, чтобы угадать число.
    Ответом на задание является измененный метод.
     */
    public static void guessGame() {
        int randomNum = 3;
        int attempts = 0; // счетчик попыток

        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            while (true) {
                System.out.println("What number am I thinking (0 to 9)? :");
                int x = sc.nextInt();
                attempts++;

                if (x == randomNum) {
                    System.out.println("Yes, it's " + randomNum);
                    System.out.println("Number of attempts: " + attempts);
                    break;
                } else {
                    System.out.println("No, try again");
                }
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        }
    }


    /*Задание 9
    Правый треугольник. Дана следующая сигнатура метода:
    public static void rightTriangle(int x);
    Необходимо реализовать метод таким образом, чтобы он выводил на экран треугольник из символов ‘*’ у которого х символов в высоту, а количество символов в ряду совпадает с номером строки, при этом треугольник выровнен по правому краю. Подсказка: перед символами ‘*’ следует выводить необходимое количество пробелов.
        */
    public static void rightTriangle(int x){
        for (int i = 1; i <= x; i++) { //внешний / с 1 (чтобы небыло пустой строки)
            for (int j = 0; j <x - i; j++) { //j <x - i
                System.out.print(' '); // пробелы
            }
            for (int j = 0; j < i; j++) { //j < i
                System.out.print('*'); // рисуем
            }
            System.out.println();
        }
    }

    /*Задание 8
    Левый треугольник. Дана следующая сигнатура метода:
    public static void leftTriangle(int x);
    Необходимо реализовать метод таким образом, чтобы он выводил на экран треугольник из символов ‘*’ у которого х символов в высоту, а количество символов в ряду совпадает с номером строки.
     */
    public static void leftTriangle(int x){
        for (int i = 1; i <= x; i++) { //внешний / с 1 (чтобы небыло пустой строки)
            for (int j = 0; j < i; j++) { // внутренний / рисуем со счетчиком
                System.out.print('*');
            }
            System.out.println();
        }
    }

    /*Задание 7
    Квадрат. Дана следующая сигнатура метода:
    public static void square(int x);
    Необходимо реализовать метод таким образом, чтобы он выводил на экран квадрат из символов ‘*’ размером х, у которого х символов в ряд и х символов в высоту. Подсказка: метод System.out.print выводит без перехода на следующую строку, в то время как System.out.println выводит с переходом.
     */
    public static void square(int x){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    /*Задание 6
    Одинаковость. Дана следующая сигнатура метода:
    public static boolean equalNum(int x);
    Необходимо реализовать метод таким образом, чтобы он возвращал true, если все знаки числа одинаковы, и false в ином случае.
    Подсказки:
    int x=123%10; // х будет иметь значение 3
    int у=123/10; // у будет иметь значение 12*/
    public static boolean equalNum(int x){
        int digit = x % 10;  // запоминаем последнию цифру
        while (x > 0) {
            if (x % 10 != digit) return false; //сравниваем текущую цифру с последней
            x /= 10; //убираем последнию цифру
        }
        return true;
    }

    /*Задание 5
    Длина числа. Дана следующая сигнатура метода:
    public static int numLen(long x);
    Необходимо реализовать метод таким образом, чтобы он возвращал количество знаков в числе x. x может принимать значения от 0 и выше.
    */
    public static int numLen(long x){
        int count = 0;
        //если число равно 0, возвращаем 1 (поэтому цикл do while) - особый случай))
        do {
            //пока больше 0, делим на 10
            x = x / 10;
            //увеличиваем счетчик
            count++;
        } while (x > 0); //пока есть на что делить 10 считаем количество итераций
        return count;
    }

    /*Задание 4
    Степень числа. Дана следующая сигнатура метода:
    public static int pow(int x, int y);
    Необходимо реализовать метод таким образом, чтобы он возвращал результат возведения x в степень y.
    Подсказка: для получения степени необходимо умножить единицу на число x, и сделать это y раз, т.е. два в третьей степени это 1*2*2*2
     */
    public static int pow(int x, int y){
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    /*Задание 3
    Четные числа. Дана следующая сигнатура метода:
    public static String chet(int x);
    Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой будут записаны все четные числа от 0 до x (включительно). Подсказа для обеспечения качества кода: инструкцию if использовать не следует.
    */
    public static String chet(int x){
        String res="";
        for (int i=0 ; i<=x; i+=2){
           res+=i+" ";
        }
        return res;
    }

    /*Задание 2
    Числа наоборот. Дана следующая сигнатура метода:
    public static String reverseListNums(int x);
    Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой будут записаны все числа от x до 0 (включительно). x может принимать значения от 0 и выше.
    */
    public static String reverseListNums(int x){
        String res="";
        for (int i=x ; i>=0; i--){
            res+=i+" ";
        }
        return res;
    }

    /*Задание 1
    Числа подряд. Дана следующая сигнатура метода:
    public static String listNums(int x);
    Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой будут записаны все числа от 0 до x (включительно). x может принимать значения от 0 и выше.
    */
    public static String listNums(int x){
        String res="";
        for (int i=0; i<=x; i++){
            res+=i+" ";
        }
        return res;
    }
}