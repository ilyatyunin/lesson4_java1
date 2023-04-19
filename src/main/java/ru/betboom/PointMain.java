package ru.betboom;

public class PointMain {
    public static void main(String[] args) {
        Point moscow = new Point(12.3454, 65.7864, "Moscow");

//        moscow.pointX = 0;

        moscow.printSelf();
        Point inverseMoscow = moscow.inverse();
        moscow.printSelf();


        int initArg = 42; // объявили переменную
        moscow.setArg100(42); // создали ее копию и установили значение 100
        System.out.println(initArg); // значение 42 осталось, тк передача по значению а не по ссылке

        Point london = new Point(43.3424, 87.2357, "London");
        moscow.setCoordinates(london); // после передачи london в метод setCoordinates jн стал 0, 0
        london.printSelf();
        moscow.printSelf();

    }




}
