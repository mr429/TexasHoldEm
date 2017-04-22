/**
 * Created by jonat on 4/3/2017.
 */
import java.io.IOException;
import static java.lang.Thread.sleep;

import java.util.Scanner;

public class texasHoldEm{
    private static backEnd play1 = new backEnd();
    private static backEnd comp1 = new backEnd(); //im leaving it. fuck it.
    private static backEnd comp2 = new backEnd();
    private static backEnd comp3 = new backEnd();
    private static backEnd comp4 = new backEnd();
    private static backEnd comp5 = new backEnd();
    private static backEnd comp6 = new backEnd();
    private static backEnd comp7 = new backEnd();
    private static backEnd comp8 = new backEnd();
    private static backEnd river = new backEnd();
    private static cardHandler deck = new cardHandler();
    private static Scanner s = new Scanner(System.in);
    private static Scanner si = new Scanner(System.in);
    private static int currentPlayer = 0;
    private static int play1chips = 0;
    private static int comp1chips = 0;
    private static int comp2chips = 0;
    private static int comp3chips = 0;
    private static int comp4chips = 0;
    private static int comp5chips = 0;
    private static int comp6chips = 0;
    private static int comp7chips = 0;
    private static int comp8chips = 0;
    private static boolean play1Folded = false;
    private static boolean comp1Folded = false;
    private static boolean comp2Folded = false;
    private static boolean comp3Folded = false;
    private static boolean comp4Folded = false;
    private static boolean comp5Folded = false;
    private static boolean comp6Folded = false;
    private static boolean comp7Folded = false;
    private static boolean comp8Folded = false;
    private static boolean preFlop = true;
    private static int currentCallAmnt = 0;
    private static String comp1name = null;
    private static String comp2name = null;
    private static String comp3name = null;
    private static String comp4name = null;
    private static String comp5name = null;
    private static String comp6name = null;
    private static String comp7name = null;
    private static String comp8name = null;
    private static String uName = null;
    private static int pot = 0;
    //private static Users user = new Users(uName);
    public static void main(String args[]) throws InterruptedException, IOException{
        deal();
    }
    public static void deal() throws InterruptedException, IOException{
        //new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        deck.shuffleDeck();
        currentPlayer = 1;
        for(int i = 0; i < 2; i++){
            play1.addCard(deck);
            comp1.addCard(deck);
            comp2.addCard(deck);
            comp3.addCard(deck);
            comp4.addCard(deck);
            comp5.addCard(deck);
            comp6.addCard(deck);
            comp7.addCard(deck);
            comp8.addCard(deck);
        }
        play1chips = 1000;
        comp1chips = 1000;
        comp2chips = 1000;
        comp3chips = 1000;
        comp4chips = 1000;
        comp5chips = 1000;
        comp6chips = 1000;
        comp7chips = 1000;
        comp8chips = 1000;//all of these amounts are liable to change. this is for testing purposes.
        play();

    }
    public static void play() throws IOException, InterruptedException{
        //this is the part i keep gettting stuck at. thats why i procrastinate on mastodon.
        //im gonna leave that comment too.
        currentPlayer = 1; //I'm always gonna do this at the start of a new hand. for now anyway. eventually il add the whole dealer/big blind thing
        while(currentPlayer == 1){
            printHand(play1);
            System.out.println();
            boolean isFolded = play1.checkFold();
            if(isFolded){
                getNextPlayer();
            }else if(preFlop){
                currentCallAmnt = 50;//im going to change this amount later. see i did change that amount later. starting blinds 50/100
                System.out.print("1. Call ($" + currentCallAmnt + ")");
                System.out.print("        2. Raise"); //to do: add raise method
                System.out.println("        3. Fold"); //to do: add fold method.
                int choice = si.nextInt();
                if(choice == 1){
                    System.out.println("Player 1 calls");
                    pot = pot + 50;
                    play1chips = play1chips - 50;
                }else if(choice == 2){
                    int raiseamnt = raise();
                    pot = pot + raiseamnt;
                    play1chips = play1chips - raiseamnt;
                    if(play1chips == 0){
                        System.out.println("Player 1 goes all-in");
                    }else{
                        System.out.println("Player 1 raises to $" + raiseamnt);
                    }
                    currentCallAmnt = raiseamnt;
                }else if(choice == 3){
                    play1.setFolded(true);
                    System.out.println("Player 1 folds");
                }
                getNextPlayer();
            }else if(!preFlop){
                //TODO add code here to do shit postflop.
            }
        }
        while(currentPlayer == 2){
            compPlay(comp1, comp1chips, comp1name);
        }
        while(currentPlayer == 3){
            compPlay(comp2, comp2chips, comp2name);
        }
        while(currentPlayer == 4){
            compPlay(comp3, comp3chips, comp3name);
        }
        while(currentPlayer == 5){
            compPlay(comp4, comp4chips, comp4name);
        }
        while(currentPlayer == 6){
            compPlay(comp5, comp5chips, comp5name);
        }
        while(currentPlayer == 7){
            compPlay(comp6, comp6chips, comp6name);
        }
        while(currentPlayer == 8){
            compPlay(comp7, comp7chips, comp7name);
        }while(currentPlayer == 9){
            compPlay(comp8, comp8chips, comp8name);
        }
    }
    public static void compPlay(backEnd compHand, int compChips, String compName){ //as of right now this method is gonna have shit tons of ifs.
        compHandChecker checkie = new compHandChecker(compHand, river); //yea i named my checker "checkie" wanna fight about it?
        //oh i have to write out my quality checker before i can go any further.

        //well...im too lazy to do that rn.

        //uh...

        //bye.
    }
    private static int raise(){
        System.out.println("Current Pot: $" + pot + "         Current Chips in Hand: $" + play1chips);
        System.out.println("Amount to raise: ");
        int raiseamnt = si.nextInt();
        if(raiseamnt > play1chips){
            System.out.println("Please enter in an amount less than or equal to " + play1chips);
            raise();
        }else {
            System.out.println("Confirm raise to $" + raiseamnt + "(y/n)");
            String choice = s.nextLine();
            if ("y".equals(choice)) {
                return raiseamnt;
            } else if ("n".equals(choice)) {
                raise();
            }
        }
        return raiseamnt;
    }
    private static void printHand(backEnd play1){
        int display = 0;
        System.out.println("Hand: ");
        for(int x = 0; x < play1.getSize(); x++){ //oh thats why i needed get size.
            display = x+1;
            System.out.println(display + ". " + play1.getCard(x));
        }
    }
    private static void getNextPlayer(){
        int temp;
        temp = currentPlayer + 1;
        if(temp == 10){
            currentPlayer = 1;
        }else{
            currentPlayer = temp;
        }
    }
}
