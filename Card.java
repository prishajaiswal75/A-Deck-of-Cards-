class Card {
    private String rank;
    private String suit;

    // Constructor
    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Getters
    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    // String representation of a Card
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

