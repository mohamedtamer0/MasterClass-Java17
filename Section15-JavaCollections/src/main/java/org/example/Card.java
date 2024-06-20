package org.example;

public record Card(Suit suit, String face, int rank) {

    public enum Suit {
        CLUB, DIAMOND, HEART, SPADE;
    }

}
