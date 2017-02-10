package curk.mitja;

class Card {
    private Suit suit;
    private Rank rank;

    //Constructor
    Card(int suit, int rank) {
        this(Suit.getSuit(suit),Rank.getRank(rank));
    }

    Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    int getValue(){
        return rank.getValue();
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString(){
        return suit.getAbrevation() + " " + rank.getAbrevation();
    }

    Boolean isSuitEqual(Card card){
        if (this.getSuit()==card.getSuit())
            return true;
        else
            return false;
    }

    Boolean isRankEqual(Card card){
        if (this.getValue()==card.getValue())
            return true;
        else
            return false;
    }
}
