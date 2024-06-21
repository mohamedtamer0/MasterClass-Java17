package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

        Card[] cardArray = new Card[13];
        Card aceOfHearts = Card.getFaceCard(Card.Suit.HEART, 'A');
        Arrays.fill(cardArray, aceOfHearts);
        Card.printDeck(Arrays.asList(cardArray), "Ace Of Hearts", 1);

        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards, aceOfHearts);
        System.out.println(cards);
        System.out.println("cards.size() = " + cards.size());

        List<Card> acesOfHearts = Collections.nCopies(13, aceOfHearts);
        Card.printDeck(acesOfHearts, "Aces Of Hearts", 1);

        Card kingClubs = Card.getFaceCard(Card.Suit.CLUB, 'K');
        List<Card> kingOfClubs = Collections.nCopies(13, kingClubs);
        Card.printDeck(kingOfClubs, "Kings Of Clubs", 1);

        Collections.addAll(cards, cardArray);
        Collections.addAll(cards, cardArray);
        Card.printDeck(cards, "Card Collection With Aces added", 2);

        Collections.copy(cards, kingOfClubs);
        Card.printDeck(cards, "Card Collection With Kings copied", 2);

        cards = List.copyOf(kingOfClubs);
        Card.printDeck(cards, "List Copy Of Kings", 1);

    }

}