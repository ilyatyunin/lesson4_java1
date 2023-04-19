package ru.betboom;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Примитивные типы данных
        // 1. Целочисленные
        byte varByte = 10; // = присваивание //-128...127
        System.out.println(varByte);
        short varShort = 10; // - 32768 ... 32767
        int varInt = 10;
        long varLong = 10;
        String s = "stroka";
        List<String> aList = new ArrayList<>(); // список строк
        List<Integer> bList = new ArrayList<>(); // список чисел
        List сList = new ArrayList<>(); // список

        // Wrapper types -- обертки для примитивов -- ссылочный тип данных хранящий внутри примитив (использовать примитивы там где их нельзя использовать в Java, пример Списки!)
        Integer aIntegerWrapper; // int
        Double aDoubleWrapper; // Double
        Character aCharWrapper; // Char
        // boxing unboxing или wrapper unwripper -- тип int (число) автоматом завернется в объект Integer (Integer arg = 42;)
        // а при передаче объекта типа Integer в метод он автоматически развернется обратно в примитив
        // В тестировании нужны вместо примитивов классы обертки! Из-за значений по умолчанию, если null -- тест упадет и причина будет ясна (null!), а если 0 -- то тест может пройти (задолженность банку в апишке должна быть 0 у клиента и в тесте вернулось 0, хотя случился баг и апи перестала возвращать задолженность)
        // в тестировании значения по умолчанию это беда -- путь чтоб пропустить ошибку, поэтому лучше использовать класс обертки а не примитивы, особенно в апи
        switch (s) {
            case "dima": {
                System.out.println("Thats Dima");
                break; // нужно добавлять до java 16-17.
            }
            case "vasya": {
                System.out.println("Thats Vasya");
            }
            default: {
                System.out.println("Default name");
            }
        }
        // Заменим switch-case на if-else:
        if (s.equals("dima")) {
            System.out.println("Thats Dima");
        } else if (s.equals("vasya")) {
            System.out.println("Thats Vasya");
        } else {
            System.out.println("Default name");
        }
//    Структура и классы
//    struct Point { // идея структуры объединить данные в набор с именем
//            double pointX = 45.8754;
//            double pointY = 10.2347;
//        }




    }

    public static int calculate(int first, int second) {
        return first + second;
    }

}