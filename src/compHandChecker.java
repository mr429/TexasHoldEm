/**
 * Created by jonat on 4/20/2017. //OH FUCKING SHIT ITS 420
 */
public class compHandChecker {
    cards card1;
    cards card2;
    cards riverCard1;
    cards riverCard2;
    cards riverCard3;
    cards riverCard4;
    cards riverCard5;
    int card1number = 0;
    int card1suit = 0;
    int card2number = 0;
    int card2suit = 0;
    int riverSize = 0;
    public compHandChecker(backEnd compHand, backEnd river){
        card1 = compHand.getCard(0); //WOW THAT WAS WAY FUCKING EASIER
        card2 = compHand.getCard(1);
        card1number = card1.getCardNumber();
        card1suit = card1.getCardSuit();
        card2number = card2.getCardNumber();
        card2suit = card2.getCardSuit();
        if(river.getSize() == 0){

        }else if(river.getSize() == 3){
            riverCard1 = river.getCard(0);
            riverCard2 = river.getCard(1);
            riverCard3 = river.getCard(2);
            riverSize = 3;
        }else if(river.getSize() == 4){
            riverCard1 = river.getCard(0);
            riverCard2 = river.getCard(1);
            riverCard3 = river.getCard(2);
            riverCard4 = river.getCard(3);
            riverSize = 4;
        }else if(river.getSize() == 5){
            riverCard1 = river.getCard(0);
            riverCard2 = river.getCard(1);
            riverCard3 = river.getCard(2);
            riverCard4 = river.getCard(3);
            riverCard5 = river.getCard(4);
            riverSize = 5;
        }
    }
    public static int getHandQuality(){
        int hq = 0;

        return hq;
    }

}
