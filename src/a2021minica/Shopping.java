/*
 * Client
 * 
 * 
 */
package a2021minica;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author awa
 */
public class Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create myBag to put shopping items in it
        ShoppingBag myBag = new ShoppingBag();
        
        // Creat Scanner to input
        Scanner myKB = new Scanner(System.in);
         
        // Create ArrayList to add items
        Items1 i1 = new Items1();
        
        Items2 i2 = new Items2();
        
        Items3 i3 = new Items3();
        
        
        int choice = 0; 
        
        int quanT =0;
        
        double total = 0;
        
           
                
        do{
            System.out.println("========== Items Selection ==========");
            
            System.out.println("1) " + i1.getItemName() + " " + "€" + i1.getPrice());
            
            System.out.println("2) " + i2.getItemName() + " " + "€" + i2.getPrice());
            
            System.out.println("3) " + i3.getItemName() + " " + "€" + i3.getPrice());
            
            System.out.println("4) Leave Shop \n");
            
            System.out.println("Please select an item from the shop:");
           
                
            choice = myKB.nextInt();
            
            // Choice value between 1 and 4
            if(choice < 1 || choice > 4) {
                
                System.out.println("You must enter a value between 1 and 4 \n");
            }
                
            else {
            
                switch(choice) {
                
                    case 1:
                        // Item1
                        System.out.println("How many \"" + i1.getItemName() + "\" would you like to buy?");
                        
                        quanT = myKB.nextInt();
                        
                        total = total + (i1.getPrice()*quanT);
                        
                        System.out.println("You hava add \"" + quanT + " " + i1.getItemName() + "\" to your Bag.\n\n");
                        
                        for (int i = 0; i <= quanT; i++){
                            
                            i1 = new Items1();
                            
                            myBag.buyItem(i1.toString() + "\n\n");
                        }
                        
                        break;
                      
                        
                    case 2:
                        // Item2
                        System.out.println("How many \"" + i2.getItemName() + "\" would you like to buy?");
                        
                        quanT = myKB.nextInt();
                        
                        total = total + (i1.getPrice()*quanT);
                        
                        System.out.println("You hava add \"" + quanT + " " + i2.getItemName() + "\" to your Bag.\n\n");
                        
                        for (int i = 0; i <= quanT; i++){
                            
                            i2 = new Items2();
                            
                            myBag.buyItem(i2.toString() + "\n\n");
                        }
                        
                        break;
                           
                        
                    case 3:
                        // Items
                        System.out.println("How many \"" + i3.getItemName() + "\" would you like to buy?");
                        
                        quanT = myKB.nextInt();
                        
                        total = total + (i1.getPrice()*quanT);
                        
                        System.out.println("You hava add \"" + quanT + " " + i3.getItemName() + "\" to your Bag.\n\n");
                        
                        for (int i = 0; i <= quanT; i++){
                            
                            i3 = new Items3();
                            
                            myBag.buyItem(i3.toString() + "\n\n");
                        }
                        
                        break;
                           
                        
                    case 4:
                        // Leave
                        System.out.println("\nThank you for shopping with us.");
                        
                        //if (choice >= 1 || choice <=3) {
                        System.out.println("Your shop today cost: €" + total);
                        
                        System.out.println("And your purchased the following items: \n");
                        
                        System.out.println(myBag.emptyBag());  
                        //}
                            
                        break;
                           
                        
                    default:
                        System.out.println("Invalid Input!");
                        
                        break;
                }
            }
        }
        
        while(choice != 4);
              
    }  
    
}
