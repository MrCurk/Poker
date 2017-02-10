package curk.mitja;

/**
 * Created by Mr.Curk@gmail.com on 10.2.2017.
 */
class Logic {

    static Boolean doPlay(int playPosition, Card card1, Card card2) {

        int sum = card1.getValue() + card2.getValue();

        //equal Suit
        if (card1.isSuitEqual(card2)) {
            //A-K, A-Q, A-J, A-10, K-Q, K-J
            if (sum >= 24)
                return true;
                //K-10, Q-J, Q-10, J-10
            else if (playPosition >= 1 && ((card1.getValue() >= 11 && card2.getValue() >= 10) || (card2.getValue() >= 11 && card1.getValue() >= 10)))
                return true;
                //A-9,A-8, A-7
            else if (playPosition >= 2 && ((card1.getRank() == Rank.ACE && card2.getValue() >= 7) || (card2.getRank() == Rank.ACE && card1.getValue() >= 7)))
                return true;
                //K-9,Q-9
            else if (playPosition >= 2 && ((card1.getValue() >= 12 && card2.getValue() == 9) || (card2.getValue() >= 12 && card1.getValue() == 9)))
                return true;
                //J-9, J-8
            else if (playPosition >= 2 && ((card1.getRank() == Rank.JACK && card2.getValue() >= 8) || (card2.getRank() == Rank.JACK && card1.getValue() >= 8)))
                return true;
                //10-9, 10-8
            else if (playPosition >= 2 && ((card1.getRank() == Rank.TEN && card2.getValue() >= 8) || (card2.getRank() == Rank.TEN && card1.getValue() >= 8)))
                return true;
                //9-8, 9-7
            else if (playPosition >= 2 && ((card1.getRank() == Rank.NINE && card2.getValue() >= 7) || (card2.getRank() == Rank.NINE && card1.getValue() >= 7)))
                return true;
                //8-7
            else if (playPosition >= 2 && ((card1.getRank() == Rank.EIGHT && card2.getRank() == Rank.SEVEN) || (card2.getRank() == Rank.EIGHT && card1.getRank() == Rank.SEVEN)))
                return true;
            else
                return false;
        }

        return true;
    }
}
