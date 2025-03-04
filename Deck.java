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

    // Prints a single card
    public void printCard(Card card) {
        System.out.println(card);
    }

    // Shuffle the deck
    public void shuffleDeck() {
        Collections.shuffle(deck);
        System.out.println("Deck has been shuffled.");
    }

    // Prints all cards of a specific suit
    public void sameCard(String suit) {
        System.out.println("Cards of suit " + suit + ":");
        for (Card card : deck) {
            if (card.getSuit().equalsIgnoreCase(suit)) {
                System.out.println(card);
            }
        }
    }

    // Prints all cards of a specific rank
    public void compareCard(String rank) {
        System.out.println("Cards with rank " + rank + ":");
        for (Card card : deck) {
            if (card.getRank().equalsIgnoreCase(rank)) {
                System.out.println(card);
            }
        }
    }
