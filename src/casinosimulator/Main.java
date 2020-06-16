
package casinosimulator;

import java.util.Scanner;

/**
 *
 * @author SamJay
 */
public class Main {
    
    private static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("%%%%%% WELCOME TO THE GAMERS CASINO%%%%%%%"
                + "\n Please Enter your name: ");
        //create player
        Player player = new Player();
        player.setName(scan.nextLine());
       
        
    }
    
}
