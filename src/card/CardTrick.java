/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @modifier Navraj Singh Garcha
 * Student Number : 991700368
 */
public class CardTrick 
{
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
              c.setValue((int) (Math.random() * 13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of your card: ");
        int userValue = scanner.nextInt();
        System.out.print("Enter the suit of your card (0-3): ");
        int userSuit = scanner.nextInt();
        */
        
        //Creating user's card
        /*
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);// suits are already pre-defined in "SUITS" array
        */
        
       //Hard coding luckyCard in the git repository
        Card luckyCard = new Card();
        luckyCard.setValue(7); //7 of Diamonds
        luckyCard.setSuit(Card.SUITS[1]);
        
        // and search magicHand here
        
        boolean foundMatch=false;
        for (int i = 0; i < magicHand.length; i++)
        {
            if (magicHand[i].equals(luckyCard))
            {
            foundMatch = true;
            break;
            }
        }
        
        //Then report the result here
        
        if(foundMatch)
            System.out.println("Your card is in the magic hand!");
        else
            System.out.println("Your card is not in the magic hand");
    }
    
}
