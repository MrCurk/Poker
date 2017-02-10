package curk.mitja;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


class Deck {
    private ArrayList<Card> deck;

    //Constructo
    public Deck() {
        deck = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            for (int j = 2; j < 15; j++) {
                deck.add(new Card(i, j));
            }
        }
    }

    Card getRandomCard() {
        int random = ThreadLocalRandom.current().nextInt(deck.size());
        Card card = deck.get(random);
        deck.remove(random);
        return card;
    }
}
