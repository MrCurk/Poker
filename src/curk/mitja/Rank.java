package curk.mitja;

/**
 * Created by Mr.Curk@gmail.com on 10.2.2017.
 */
enum Rank {
    ACE(14, "A"), JACK(11, "J"), QUEEN(12, "Q"), KING(13, "K"), TWO(2, "2"), THREE(3, "3"), FOUR(4, "4"), FIVE(5, "5"),
    SIX(6, "6"), SEVEN(7, "7"), EIGHT(8, "8"), NINE(9, "9"), TEN(10, "10");

    private int value;
    private String shortName;

    //Constructor
    private Rank(int value, String short_name) {
        this.value = value;
        this.shortName = short_name;
    }

    //Getters
    int getValue() {
        return value;
    }

    String getAbrevation() {
        return shortName;
    }

    static Rank getRank(int i) {
        for (Rank r : Rank.values()
                ) {
            if (r.value == i)
                return r;
        }
        return null;

    }


}
