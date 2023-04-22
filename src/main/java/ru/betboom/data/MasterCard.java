package ru.betboom.data;

import java.io.Serializable;

public class MasterCard extends Card implements ICard, Serializable {


    public MasterCard() {
        super(PaymentSystem.MASTERCARD);
    }

    protected boolean isCountryValidForTheseCard(Country country) {
        return true;
    }
}
