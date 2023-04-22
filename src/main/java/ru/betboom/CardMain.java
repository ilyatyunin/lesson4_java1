package ru.betboom;

import ru.betboom.data.Card;
import ru.betboom.data.Country;
import ru.betboom.data.VisaCard;

import static ru.betboom.data.Country.RU;

public class CardMain {
    public static void main(String[] args) {
        Card visaCard = new VisaCard();
        visaCard.setBalance(100); // В ООП непринятой работать с данными напрямую
        visaCard.payInCountry(RU, 50);
        System.out.println(visaCard.getBalance());
    }
}
