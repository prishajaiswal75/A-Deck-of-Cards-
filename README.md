Card Deck Java Program

Description

This Java program simulates a standard deck of 52 playing cards. It provides various operations such as shuffling, dealing cards, searching for specific cards, and distributing cards to players through a menu-driven interface.

Features

Create a deck of 52 cards

Print all cards in the deck

Shuffle the deck

Pick 2 random cards

Deal 5 random cards

Search for a specific card

Display all cards of a given suit or rank

Distribute cards to 3 players

Menu-driven interface for user-friendly interaction

Files

1. Card.java

Defines the Card class, which represents a playing card.

Attributes: rank, suit

Methods:

Card(String rank, String suit): Constructor to initialize card attributes

getRank(): Returns the rank of the card

getSuit(): Returns the suit of the card

toString(): Returns a formatted string representation of the card

2. Deck.java

Defines the Deck class, which manages the deck of cards.

Attributes: ArrayList<Card> deck

Methods:

Deck(): Constructor initializes the deck with 52 cards

createDeck(): Generates a standard deck of 52 playing cards

printDeck(): Prints all cards in the deck

shuffleDeck(): Shuffles the deck

dealCard(): Deals 5 random cards

findCard(String rank, String suit): Checks if a specific card is in the deck

sameCard(String suit): Displays all cards of a specific suit

compareCard(String rank): Displays all cards of a specific rank

randomCards(): Picks and prints 2 random cards from the deck

cardPlayers(): Distributes 5 cards to 3 players

3. Main.java

Provides a menu-driven interface to interact with the deck.

Uses a Scanner to take user input

Calls appropriate methods based on user choice

Displays results accordingly

How to Run the Program

Compile the Java files:

javac Card.java Deck.java Main.java

Run the program:

java Main

Follow the on-screen menu prompts to perform different operations.

