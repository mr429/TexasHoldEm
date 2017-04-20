/**
 * Created by jonat on 4/3/2017.
 */
import java.util.ArrayList;
public class backEnd {
    private ArrayList<cards> hand;
    private boolean isFolded = false;

    public backEnd(){
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
    public int getSize(){return hand.size();}
    public void setFolded(boolean foldedis){
        isFolded = foldedis;
    }
    public boolean checkFold(){
        return isFolded;
    }
}
