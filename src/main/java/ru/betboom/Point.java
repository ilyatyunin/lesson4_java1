package ru.betboom;

public class Point {
    private double pointX; // делаем private чтоб не меняли координаты
    private double pointY; // final -- делает поле константой, мб проинициализирован только 1 раз
    private final String pointName;

    public Point(double pointX, double pointY, String pointName) { // конструктор
        this.pointX = pointX;   // в этом объекте в поле pointX положи значение pointX
                                // this используем при конфликте имен. Под this имеется в виду что нужно взять из класса pointX и положить значение pointX из конструктора
                                // this -- ссылка на объект для которого вызывается метод/конструктор
        this.pointY = pointY;
        this.pointName = pointName;
    }

//    public Point() {} // конструктор по умолчанию -- создается всегда. Можно делать несколько конструкторов
//    public void inverse() { // не можем инверсировать тк запретили изменения значений переменным
//        double tmp = pointX;
//        pointX = pointY;
//        pointY = tmp;
//    }
    public Point inverse() { // вариант инверсии чз создание нового объекта
        return new Point(pointY, pointX, "inverse");
    }
    public void printSelf() {
        System.out.println("pointX: " + pointX + " pointY: " + pointY);
    }

    public void setArg100(int arg) {
        arg = 100;
    }
    public void setCoordinates(Point arg) {
        arg.pointX = 0; // cмогли обратиться к приватным полям тк написали метод в классе
        arg.pointY = 0; // убрал final для повторной инициализации
    }

}
