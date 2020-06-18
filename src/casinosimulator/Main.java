
package casinosimulator;

import java.util.Scanner;

/**
 *
 * @author SamJay
 */
public class Main {
    
    private static Scanner scan = new Scanner(System.in);
    
    //display player info
    public static void displayPlayerInfo(Player player){
        System.out.println("\n*********PLAYER DETAILS***********"
                + "\n\tPlayers Name: "+player.getName()
                + "\n\tDeposit: "+ player.getDeposit());
    }
    
    public static void main(String[] args) {
        System.out.print("******** WELCOME TO THE GAMERS CASINO******"
                + "\nPlease Enter your name: ");
        //create player
        Player player = new Player();
        player.setName(scan.nextLine());
        // display personalized message to the player
        System.out.print("Hi "+ player.getName()+" welcome to play with us"
                + "\nEnter amount you wish to deposit *NOTE: minimum $20 maximum $1000 :");
       double deposit= scan.nextDouble();
        while (!(deposit >=20 && deposit <=1000)){
            System.out.print("Amount should be between $20 and $1000: Try again: ");
            deposit = scan.nextDouble();
        }
            player.setDeposit(deposit);
        
        
        displayPlayerInfo(player);
        
        
        
       
        
    }
    
}
