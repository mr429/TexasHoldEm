/**
 * Created by jonat on 4/3/2017.
 */
import java.util.ArrayList;
public class deal {
    private ArrayList<cards> hand;
    public deal(){
        hand = new ArrayList<>();
    }
    public void addCard(cardHandler deck){
        hand.add(0,deck.getLast());
        deck.removeLast();
    }
    public void removeCard(int elem){
        hand.remove(elem);
    }
    public cards getCard(int elem){
        return hand.get(elem);
    }
    public int getSize(){
        return hand.size();
    }

}