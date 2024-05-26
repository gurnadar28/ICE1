/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * modifier gurnadar kaur
 * student number 991722459
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        Random random = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(random.nextInt(13)+ 1);

            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            
            magicHand[i] = c;
            
            System.out.println(c.getSuit() + " " + c.getValue());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a card value (1-13): ");
        int inputValue = scanner.nextInt();
        
        System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int suitIndex = scanner.nextInt();
        String suitType = Card.SUITS[suitIndex];
        
        Card c1 = new Card();
        c1.setValue(inputValue);
        c1.setSuit(suitType);

        // and search magicHand here
        boolean isFound = false;
        for (Card card : magicHand) {
            
            if (card.getValue() == c1.getValue() && card.getSuit().equals(c1.getSuit())) {
                isFound = true;
                break;
            }
        }

        //Then report the result here
        if (isFound) {
            System.out.println("Your card is in the magic hand.");
        }
        
        else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }

        // add one luckcard hard code 2,clubs
    }
    
}
