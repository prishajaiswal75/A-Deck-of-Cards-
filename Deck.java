import java.util.*;

class Deck {
    private ArrayList<Card> deck;

    // Constructor initializes the deck
    public Deck() {
        deck = new ArrayList<>();
        createDeck();
    }

    // Creates a deck of 52 cards
    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        for (String rank : ranks) {
            for (String suit : suits) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    // Prints all cards in the deck
    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }


