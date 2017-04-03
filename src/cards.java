/**
 * Created by jonat on 4/3/2017.
 */
public class cards {
    private int cardNumber;
    private char cardSuit;
        public cards(int cNumber, char cSuit) {
            cardNumber = cNumber;
            cardSuit = cSuit;
        }
        public int getCardNumber(){
            return cardNumber;
        }
        public char getCardSuit(){
            return cardSuit;
        }
        public static char getCardSuit(cards cards){
            return cards.getCardSuit();
        }
        public static int getCardNumber(cards cards){
            return cards.getCardNumber();
        }
        public String toString(){
            String cSuit = null;
            String cNumber = null;
            if(cardSuit == 'd'){
                cSuit = "Diamonds";
            }else if(cardSuit == 'h'){
                cSuit = "Hearts";
            }else if(cardSuit == 's'){
                cSuit = "Spades";
            }else if(cardSuit == 'c'){
                cSuit = "Clubs";
            }
            if(cardNumber <= 10){
                cNumber = Integer.toString(cardNumber);
            }else if(cardNumber == 11){
                cNumber = "Jack";
            }else if (cardNumber == 12){
                cNumber = "Queen";
            }else if(cardNumber == 13){
                cNumber = "King";
            }else if(cardNumber == 14){
                cNumber = "Ace";
            }
            return (cNumber + " of " + cSuit);
        }
}
