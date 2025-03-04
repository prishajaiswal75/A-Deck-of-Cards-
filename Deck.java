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

    // Searches for a specific card in the deck
    public boolean findCard(String rank, String suit) {
        for (Card card : deck) {
            if (card.getRank().equalsIgnoreCase(rank) && card.getSuit().equalsIgnoreCase(suit)) {
                return true;
            }
        }
        return false;
    }

    // Deals 5 random cards
    public void dealCard() {
        shuffleDeck();
        System.out.println("Dealing 5 random cards:");
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.remove(0));
        }
    }

    // Prints 2 random cards from the deck
    public void randomCards() {
        shuffleDeck();
        System.out.println("Random Card 1: " + deck.get(0));
        System.out.println("Random Card 2: " + deck.get(1));
    }

    // Distributes 5 cards to 3 players
    public void cardPlayers() {
        if (deck.size() < 15) {
            System.out.println("Not enough cards to deal to players.");
            return;
        }
        for (int i = 1; i <= 3; i++) {
            System.out.println("Player " + i + "'s cards:");
            for (int j = 0; j < 5; j++) {
                System.out.println(deck.remove(0));
            }
            System.out.println();
        }
    }
}
