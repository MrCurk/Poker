package curk.mitja;

enum Suit {
    SPADE(0, "S"), HEART(1, "H"), DIAMOND(2, "D"), CLUB(3, "C");

    private int value;
    private String shortName;

    //Constructor
    private Suit(int value, String short_name) {
        this.value = value;
        this.shortName = short_name;
    }

    int getValue() {
        return value;
    }

    String getAbrevation() {
        return shortName;
    }

    static Suit getSuit(int i) {
        for (Suit s : Suit.values()
                ) {
            if (s.value == i)
                return s;
        }
        return null;
    }
};
