/**
 * Created by jonat on 4/3/2017.
 */
import java.io.File;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.InputMismatchException;
import java.util.Scanner;

public class texasHoldEm{
    private static deal play1 = new deal();
    private static deal comp1 = new deal();
    private static deal comp2 = new deal();
    private static deal comp3 = new deal();
    private static deal comp4 = new deal();
    private static deal comp5 = new deal();
    private static deal comp6 = new deal();
    private static deal comp7 = new deal();
    private static deal comp8 = new deal();
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
    private static String comp1name = null;
    private static String comp2name = null;
    private static String comp3name = null;
    private static String comp4name = null;
    private static String comp5name = null;
    private static String comp6name = null;
    private static String comp7name = null;
    private static String comp8name = null;
    private static String uName = null;
    //private static Users user = new Users(uName);
    public static void main(String args[]) throws InterruptedException, IOException{
        play();
    }
    public static void play() throws InterruptedException, IOException{
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
        System.out.println();
        System.out.println("Play1");
        System.out.println();
        printHand(play1);
        System.out.println();
        System.out.println("Comp1");
        printHand(comp1);
        System.out.println();
        System.out.println("Comp2");
        printHand(comp2);
        System.out.println();
        System.out.println("Comp3");
        printHand(comp3);
        System.out.println();
        System.out.println("Comp4");
        printHand(comp4);
        System.out.println();
        System.out.println("Comp5");
        printHand(comp5);
        System.out.println();
        System.out.println("Comp6");
        printHand(comp6);
        System.out.println();
        System.out.println("Comp7");
        printHand(comp7);
        System.out.println();
        System.out.println("Comp8");
        printHand(comp8);
    }
    private static void printHand(deal play1){
        int display = 0;
        for(int x = 0; x < play1.getSize(); x++){
            display = x+1;
            System.out.println(display + ". " + play1.getCard(x));
        }
    }
}
