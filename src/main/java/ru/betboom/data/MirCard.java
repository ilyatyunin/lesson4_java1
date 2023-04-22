package ru.betboom.data;

public class MirCard extends Card {

    public MirCard() { // Если у класса верхнего уровня есть конструктор то добавляем конструктор и в классы нижнего уровня (mir,visa и тд)
        super(PaymentSystem.MIR);
    }

    protected boolean isCountryValidForTheseCard(Country country) {
        if (country == Country.RU)
            return true;
        else
            return false;
    }
}
