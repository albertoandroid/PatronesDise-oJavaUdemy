package com.company.behavioral.iterator;

/**
 * Created by albertopalomarrobledo on 31/7/19.
 */
public class CardList implements List {

    private Card[] cards;

    public CardList(Card[] cards){
        this.cards = cards;
    }

    @Override
    public Iterator iterator() {
        return new CardIterator(cards);
    }
}
