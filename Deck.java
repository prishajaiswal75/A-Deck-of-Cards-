import java.util.*;

class Deck {
    private ArrayList<Card> deck;

    // Constructor initializes the deck
    public Deck() {
        deck = new ArrayList<>();
        createDeck();
    }
