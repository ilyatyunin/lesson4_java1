package ru.betboom;

import java.util.*;

import static java.util.Arrays.asList;

public class HumanMain {


    public static void main(String[] args) {
        String[] hobbies = new String[3];
        hobbies[0] = "Футбол";
        hobbies[1] = "Java";
        hobbies[2] = "Гражданская Оборона";
        String[] hobbiesAnother = new String[] { // cоздание массива без фикс длины
                "Футбол", "Java", "Гражданская Оборона"
        };


        int length = hobbiesAnother.length;
        asList(hobbiesAnother).contains("Java"); // для проверки элемента в массиве нужно массив переделать в список
        int[][] intArray = new int[][] { // массив массивов
                new int[] {1,2,3},
                new int[] {10,20,30},
        }

//        Список
        List<String> hobbiesList = new ArrayList<>(); // ArrayList используем в большинстве случаев, работает через массивы, оч быстро добавляет в массив новый элемент, лишает всех недостатков массива, неограниченная длина, можно сортировать, добавлять искать объекты и тд
        hobbiesList.add("Футбол");
        hobbiesList.add("Java");
        hobbiesList.add("Гражданская Оборона");

        List<String> hobbiesListAnother = List.of(
                "Футбол", "Java", "Гражданская Оборона"
        );
//        Множество // Set -- множество уникальных объектов, в set нельзя добавлять два "футбол". Используем когда важно контроллировать отсутсвие дупликатов
        Set<String> hobbiesSet = new HashSet<>();
        hobbiesSet.add("Футбол");
        hobbiesSet.add("Java");
        hobbiesSet.add("Гражданская Оборона");

        Set<String> hobbiesSetAnother = Set.of(
                "Футбол", "Java", "Гражданская Оборона"
        );



        Human dima = new Human("Дима", "33", hobbies);
        Human dima1 = new Human("Дима", "33", hobbies);
        boolean equals dima.equals(dima1); // метод equals есть у любого объекта (сравнивает значения в примитивах и место в памяти у объектных типов)

        Map<String, Human> humans = new HashMap<>(); // позволяет оч быстро работать с данными если знаем ключ (userID сохранили в мапу и достаем по userID pначения)
        humans.put("12345678", dima);
        humans.put("12345622", dima1);

        for (int i = 0; i < hobbies.length; i++) { // точка входа; точка выхода; изменение индекса
            System.out.println(hobbies[i]);
        }
        for (String hobby : hobbies) { // справа источник данных, слева вид данных, полученных от источника
            System.out.println(hobby);
        }
        boolean arrayCantainJava = false;
        int index = 0;
        while (!arrayCantainJava && index < hobbies.length) {
            if (hobbies[index].equals("Java")) {
                arrayCantainJava = true;
            }
            index++;
        }

        do {
            if (hobbies[index].equals("Java")) {
            arrayCantainJava = true;
            }
            index++;
        } while (!arrayCantainJava && index < hobbies.length)



    }

}

