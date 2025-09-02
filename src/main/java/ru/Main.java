package ru;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Задание 12*/
        int[] arr = {1, 2, 3, 4, 5};
        int[] ins = {7, 8, 9};
        System.out.println("До :" + Arrays.toString(arr));
        System.out.println("Добавление массива в массив :" + Arrays.toString(add(arr, ins, 15)));

        /*Задание 11
        int[] arr = {2, 1, 2, 3, 8, 2, 2, 9};
        System.out.println("До :" + Arrays.toString(arr));
        System.out.println("Добавление в массив :" + Arrays.toString(add(arr, 9, 3)));*/

        /*Задание 10
        int[] arr = {1, 2, -3, 4, -2, 2, -5};
        System.out.println("До :" + Arrays.toString(arr));
        System.out.println("Удалить негатив: " + Arrays.toString(deleteNegative(arr)));*/

        /*Задание 9
        int[] arr = {2, 1, 2, 3, 8, 2, 2, 9};
        System.out.println(Arrays.toString(findAll(arr, 2)));*/

        /*Задание 8
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {7, 8, 9};
        System.out.println(Arrays.toString(concat(arr1,arr2)));*/

        /*Задание 7
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("До : " + Arrays.toString(arr));
        System.out.println("После : " + Arrays.toString(reverseBack(arr)));*/

        /*Задание 6
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("До : " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("После : " + Arrays.toString(arr));*/

        /*Задание 5
        int[] arr = {1, -2, -7, 4, 2, 2, 5};
        int[] arr2 = {1, -2, -7, 4, -7, -2, 1};
        System.out.println(Arrays.toString(arr));
        System.out.println(palindrom(arr));
        System.out.println("------------");
        System.out.println(Arrays.toString(arr2));
        System.out.println(palindrom(arr2));*/

        /*Задание 4
        int[] arr = {1, -2, -7, 4, 2, 2, 5};
        System.out.println(Arrays.toString(arr));
        System.out.println(countPositive(arr));*/

        /*Задание 3
        int[] arr = {1, -2, -7, 4, 2, 2, 5};
        System.out.println(Arrays.toString(arr));
        System.out.println(maxAbs(arr));*/

        /*Задание 2
        int[] arr = {1, 2, 3, 4, 2, 2, 5};
        System.out.println(Arrays.toString(arr));
        System.out.println(findLast(arr, 2));
        System.out.println(findLast(arr, 7));*/

        /*Задание 1
        int[] arr = {1, 2, 3, 4, 2, 2, 5};
        System.out.println(Arrays.toString(arr));
        System.out.println(findFirst(arr, 2));
        System.out.println(findFirst(arr, 6));*/

        // Циклы

        /*Задача "Курсовой проект. Задание по теме "Циклы""
        //гибрид совместо разработанного с InnoKodAi(Иннотех) анализ данных, учтены все критерии задачи
        Scanner scanner = new Scanner(System.in);
        int fileCount = 0; //счетчик (успешно найденный файл)

        while (true) { //бесконечный цикл
            System.out.print("Введите путь к файлу: ");
            String path = scanner.nextLine();

            File file = new File(path);
            boolean fileExists = file.exists(); //файл (условие)
            boolean isDirectory = file.isDirectory(); //каталог (условие)

            if (!fileExists || isDirectory) {
                if (!fileExists) {
                    System.out.println("файл не существует или это папка");
                } else {
                    System.out.println("это папка а не файл");
                }
                continue; //использование оператора continue
            }

            System.out.println("Путь указан верно");
            fileCount++;
            System.out.println("Это файл номер " + fileCount);
        }
        */

        /*Задание 10
        guessGame();*/

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

    /*Задание 12
    Добавление массива в массив. Дана следующая сигнатура метода:
    public static int[] add(int[] arr, int[] ins, int pos);
    Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, который будет содержать все элементы массива arr, однако в позицию pos будут вставлены значения массива ins.
     */
    public static int[] add(int[] arr, int[] ins, int pos){

        // вводимо число позиции pos // обработка ошибки (IllegalArgumentException)
        if (pos < 0 || pos > arr.length) {
            throw new IllegalArgumentException("Позиция должна быть в пределах массива от 0 до " + arr.length);
        }

        int[] res = new int[arr.length + ins.length]; //конечный массив - его и покажем)

        for (int i = 0; i < pos; i++) { //копируем часть массива
            res[i] = arr[i];
        }

        for (int i = 0; i < ins.length; i++) { //втсавим из массива ins
            res[pos + i] = ins[i];
        }

        for (int i = pos; i < arr.length; i++) { //копируем остатки
            res[ins.length + i] = arr[i];
        }
        return res; //гугл как много я стал тебя серчить))
    }

    /*Задание 11
    Добавление в массив. Дана следующая сигнатура метода:
    public static int[] add(int[] arr, int x, int pos);
    Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, который будет содержать все элементы массива arr, однако в позицию pos будет вставлено значение x.*/
    public static int[] add(int[] arr, int x, int pos) {
        int[] newArr = new int[arr.length + 1]; //массив +1 индекс = новый массив

        for (int i = 0; i < pos; i++) { // вставили значения текущего массива в новый массив
            newArr[i] = arr[i];
        }

        newArr[pos] = x; //новое значение в массив

        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i]; //копируем после позиции вставки
        }
        return newArr;
    }

    /*Задание 10
    Удалить негатив. Дана следующая сигнатура метода:
    public static int[] deleteNegative(int[] arr);
    Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, в котором записаны все элементы массива arr кроме отрицательных.
     */
    public static int[] deleteNegative(int[] arr){
        int count = 0; //вхождения

        for (int num : arr) {
            if (num >= 0) count++; //положительные циферки
        }

        int[] res = new int[count]; //создаем массив под результат и заполняем индексами искомого числа
        int index = 0; //индекс

        for (int num : arr) { //ходим по циклу, собираем монеты)
            if (num >= 0) {
                res[index] = num;
                index++;
            }
        }
        return res;
    }

    /*Задание 9
    Все вхождения. Дана следующая сигнатура метода:
    public static int[] findAll(int[] arr, int x);
    Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, в котором записаны индексы всех вхождений числа x в массив arr.
     */
    public static int[] findAll(int[] arr, int x){
        int count = 0; //вхождения

        for (int num : arr) {
            if (num == x) count++;
        }

        int[] res = new int[count]; //создаем массив под резельтат и заполняем индексами искомого числа
        int index = 0; //индекс

        for (int i = 0 ; i < arr.length; i++) { //ходим по циклу, собираем монеты)
            if (arr[i] == x) {
                res[index] = i;
                index++;
            }
        }
        return res;
    }

    /*Задание 8
    Объединение. Дана следующая сигнатура метода:
    public static int[] concat(int[] arr1, int[] arr2);
    Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, в котором сначала идут элементы первого массива (arr1), а затем второго (arr2).
     */
    public static int[] concat(int[] arr1, int[] arr2){
        int[] res = new int [arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) { //заполнили первый массив arr1
            res[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) { //заполнили второй массив arr2
            res[arr1.length + i] = arr2[i];
        }
        return res;
    }

    /*Задание 7
    Возвратный реверс. Дана следующая сигнатура метода:
    public static int[] reverseBack(int[] arr);
    Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, в котором значения массива arr записаны задом наперед.
     */
    public static int[] reverseBack(int[] arr) {
        int[] res = Arrays.copyOf(arr, arr.length); //копия
        int left = 0; //левая сторонв
        int right = res.length - 1; //правая сторона

        while (left < right) {
            //прежняя логика из предыдущего задания))
            int temp = res[left];
            res[left] = res[right];
            res[right] = temp;
            left++;
            right--;
        }
        return res;
    }

    /*Задание 6
    Реверс. Дана следующая сигнатура метода:
    public static void reverse(int[] arr);
    Необходимо реализовать метод таким образом, чтобы он изменял массив arr. После проведенных изменений массив должен быть записан задом-наперед
     */
    public static void reverse(int[] arr){
        int left = 0; //левая сторонв
        int right = arr.length - 1; //правая сторона

        while (left < right) {
            //ух логика)) гугл рулит
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    /*Задание 5
    Палиндром. Дана следующая сигнатура метода:
    public static boolean palindrom(int[] arr);
    Необходимо реализовать метод таким образом, чтобы он возвращал true, если массив arr является палиндромом, то есть справа-налево и наоборот читается одинаково
     */
    public static boolean palindrom(int[] arr){
        int left = 0; //левая сторонв
        int right = arr.length - 1; //правая сторона

        while (left < right) {
            if (arr[left] != arr[right]) { //сравним обе стороны
                return false;
            }
            left++;
            right--;
        }
        return true; //читается одинаково
    }

    /*Задание 4
    Подсчет позитива. Дана следующая сигнатура метода:
    public static int countPositive(int[] arr);
    Необходимо реализовать метод таким образом, чтобы он возвращал количество положительных элементов массива arr.
     */
    public static int countPositive(int[] arr){
        int count = 0; //счетчик
        for (int num : arr) { //проходим по массиву
            if (num > 0) { //если положительное то в копилку
                count++; //счетчик в плюс
            }
        }
        return count; //вернем искомое число положительных чисел
    }

    /*Задание 3
    Поиск максимального. Дана следующая сигнатура метода:
    public static int maxAbs(int[] arr);
    Необходимо реализовать метод таким образом, чтобы он возвращал наибольшее по модулю (то есть без учета знака) значение массива arr.
     */
    public static int maxAbs(int[] arr){
        int max = 0; //переменная с максимальным моделем
        for (int num : arr) { //читаем массив
            if (Math.abs(num) > Math.abs(max)) { //поиск большего модуля
                max = num; //обновили максимальный модкль
            }
        }
        return max; //вернем искомый модуль
    }

    /*Задание 2
    Поиск последнего значения. Дана следующая сигнатура метода:
    public static int findLast(int[] arr, int x);
    Необходимо реализовать метод таким образом, чтобы он возвращал индекс последнего вхождения числа x в массив arr. Если число не входит в массив – возвращается -1.
     */
    public static int findLast(int[] arr, int x){
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i; // c конца возвращаем вхождение
            }
        }
        return -1; // если число не найдено -1
    }

    /*Задание 1
    Поиск первого значения. Дана следующая сигнатура метода:
    public static int findFirst(int[] arr, int x);
    Необходимо реализовать метод таким образом, чтобы он возвращал индекс первого вхождения числа x в массив arr. Если число не входит в массив – возвращается -1.
     */
    public static int findFirst(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i; // возвращаем первое вхождение
            }
        }
        return -1; // если число не найдено -1
    }


    // Циклы

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
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int attempts = 0; //попытки

        while (true) { //+ цикл
            System.out.println("Какой число задумано от (0 to 9)? :");
            int x = sc.nextInt();
            attempts++; //попытки

            if (x == randomNum) {
                System.out.println("Да, это оно " + randomNum); //успешно
                System.out.println("Количество попыток: " + attempts); //количество попыток
                break; //выйти
            } else {
                System.out.println("Нет, пробуй еще раз");
            }
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