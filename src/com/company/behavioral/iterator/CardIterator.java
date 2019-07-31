package com.company.behavioral.iterator;

/**
 * Created by albertopalomarrobledo on 31/7/19.
 */
public class CardIterator implements Iterator {

    private Card[] cards;
    private int position;

    public CardIterator(Card[] cards){
        this.cards = cards;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        if(position >= cards.length){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return cards[position++];
    }

    @Override
    public Object currentItem() {
        return cards[position];
    }
}
