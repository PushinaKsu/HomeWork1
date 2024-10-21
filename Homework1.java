package ru.inno.course.lesson1;

public class Homework1 {
    public static void main(String[] args) {
        //Пример
        String city = "Москва";
        int result = city.length(); // Количество символов
        System.out.println(result);

        // другие методы ниже

        String vacuum = "";
        boolean result1 = vacuum.isEmpty();
        System.out.println(result1);
        // проверяем, пустая стока или нет, есть пробел значит не пусто

        String whitespase = " ";
        boolean result2 = whitespase.isBlank();
        System.out.println(result2);
        // проверка пробелов, пустоты, есть пробел=пусто

        String diapason = "something unnecessary Hello, World! and something else";
        String result3 = diapason.substring(22,35);
        System.out.println(result3);
        // выводит значения из строки в заданном диапазоне
        //or
        String diapasonOr = "something unnecessary Hello, World! and something else";
        String result4 = diapasonOr.substring(22);
        System.out.println(result4);
        // выводит значения из строки от (в примере) 22 знака в строке
        // ПОЧЕМУ В ЗАДАНИИ ТИП ПАРАМЕТРА УКАЗАН INT? у меня IDEA исправляет на String

        String appears = "There is something important somewhere in this line, but it is not exactly very important";
        int result5 = appears.indexOf("important");
        System.out.println(result5);
        // показывает индекс где впервые в строке появилось значение указанное в методе

        String lastAppears = "There is something important somewhere in this line, but it is not exactly very important";
        int result6 = lastAppears.lastIndexOf("important");
        System.out.println(result6);
        // показывает индекс где в последний раз в строке появилось значение указанное в методе

        String lower = "LOW";
        String result7 = lower.toLowerCase();
        System.out.println(result7);
        // делает все символы в нижнем регистре

        String upper = "up";
        String result8 = upper.toUpperCase();
        System.out.println(result8);
        // делает все симводы в верхнем регистре

        String change = "Hello, world!";
        String result9 = change.replace("Hello", "Hi");
        System.out.println(result9);
        // заменяет старое значение на новое

        String checkStart = "Hi, my dear friend!";
        boolean result10 = checkStart.startsWith("Hello");
        System.out.println(result10);
        // проверка начала строки с заданного значения

        String checkEnd = "Hi, my dear friend!";
        boolean result11 = checkEnd.endsWith("!");
        System.out.println(result11);
        // проверка конца строки с заданным значением

        String repeat = "Hi!";
        String result12 = repeat.repeat(3);
        System.out.println(result12);
        // повторяет строку указанное количество раз

        String contain = "Hi, my dear friend!";
        boolean result13 = contain.contains("dear");
        System.out.println(result13);
        // проверяет, содержит ли данная строка указанную подстроку

        String connect = "Hi, my dear";
        String result14 = connect.concat(" friend!");
        System.out.println(result14);
        // соединяет текущую строку с указанной подстрокой

        String delWhitespase = "   Hi, my dear friend!      ";
        String result15 = delWhitespase.trim();
        System.out.println(result15);
        // удаляет пробелы в начале и в конце

        String compare1 = "Hi, my dear friend!";
        String compare2 = "Hello, my dear friend!";
        boolean result16 = compare1.equals(compare2);
        System.out.println(result16);



    }
}
