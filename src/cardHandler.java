/**
 * Created by jonat on 4/3/2017.
 */
import java.util.ArrayList;
import java.util.Collections;
public class cardHandler {
    public ArrayList<cards> cards;
    public ArrayList<cards> drawPile;
    public cardHandler(){
        cards = new ArrayList<>();
        cards.add(new cards(2,'s'));
        cards.add(new cards(3,'s'));
        cards.add(new cards(4, 's'));
        cards.add(new cards(5,'s'));
        cards.add(new cards(6,'s'));
        cards.add(new cards(7,'s'));
        cards.add(new cards(8,'s'));
        cards.add(new cards(9,'s'));
        cards.add(new cards(10,'s'));
        cards.add(new cards(11,'s'));
        cards.add(new cards(12,'s'));
        cards.add(new cards(13,'s'));
        cards.add(new cards(14,'s'));
        cards.add(new cards(2,'h'));
        cards.add(new cards(3,'h'));
        cards.add(new cards(4, 'h'));
        cards.add(new cards(5,'h'));
        cards.add(new cards(6,'h'));
        cards.add(new cards(7,'h'));
        cards.add(new cards(8,'h'));
        cards.add(new cards(9,'h'));
        cards.add(new cards(10,'h'));
        cards.add(new cards(11,'h'));
        cards.add(new cards(12,'h'));
        cards.add(new cards(13,'h'));
        cards.add(new cards(14,'h'));
        cards.add(new cards(2,'c'));
        cards.add(new cards(3,'c'));
        cards.add(new cards(4, 'c'));
        cards.add(new cards(5,'c'));
        cards.add(new cards(6,'c'));
        cards.add(new cards(7,'c'));
        cards.add(new cards(8,'c'));
        cards.add(new cards(9,'c'));
        cards.add(new cards(10,'c'));
        cards.add(new cards(11,'c'));
        cards.add(new cards(12,'c'));
        cards.add(new cards(13,'c'));
        cards.add(new cards(14,'c'));
        cards.add(new cards(2,'d'));
        cards.add(new cards(3,'d'));
        cards.add(new cards(4, 'd'));
        cards.add(new cards(5,'d'));
        cards.add(new cards(6,'d'));
        cards.add(new cards(7,'d'));
        cards.add(new cards(8,'d'));
        cards.add(new cards(9,'d'));
        cards.add(new cards(10,'d'));
        cards.add(new cards(11,'d'));
        cards.add(new cards(12,'d'));
        cards.add(new cards(13,'d'));
        cards.add(new cards(14,'d'));
    }
    public void shuffleDeck(){
        Collections.shuffle(cards);
        Collections.shuffle(cards);
    }
    public void printDeck(){
        for(int i = 0; i < cards.size(); i++){
            cards sd = new cards(cards.get(i).getCardNumber(),cards.get(i).getCardSuit());
            System.out.println(sd.toString());
        }
    }
}
