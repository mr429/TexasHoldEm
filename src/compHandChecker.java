/**
 * Created by jonat on 4/20/2017. //OH FUCKING SHIT ITS 420
 */
public class compHandChecker {
    cards card1;
    cards card2;
    int card1number = 0;
    int card1suit = 0;
    int card2number = 0;
    int card2suit = 0;
    public compHandChecker(backEnd compHand){
        card1 = compHand.getCard(0); //WOW THAT WAS WAY FUCKING EASIER
        card2 = compHand.getCard(1);
        card1number = card1.getCardNumber();
        card1suit = card1.getCardSuit();
        card2number = card2.getCardNumber();
        card2suit = card2.getCardSuit();
    }

}
