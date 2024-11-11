/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//This is task 3 I jst named it something random and couldn't change it
package fortnite;
import java.util.Scanner;    
/**
 *
 * @author Lenny Manset
 */
public class Fortnite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner input = new Scanner(System.in);
        boolean repeat = true;
        double total = 0;
        while(repeat){
            System.out.println("Enter product number (1-5 or 0 to stop): ");
            int product = input.nextInt();
            if(product == 0){
                 repeat = false;
                 break;
                     }
            System.out.println("Enter the quantity of product sold: ");
            int sold = input.nextInt();
            // pro is a shortened version of the word product
            double pro1 = 2.98;
            double pro2 = 4.50;
            double pro3 = 9.98;
            double pro4 = 4.49;
            double pro5 = 6.87;
            
            switch (product){
            case 1: 
                 total = total + (pro1*sold);
                 break;
             case 2:
                 total = total +(pro2*sold);
                 break;
             case 3:
                 total = total +(pro3*sold);
                 break;
             case 4:
                 total = total +(pro4*sold);
                 break;
             case 5:
                 total = total +(pro5*sold);
                 break;

            }
             
        }
        System.out.println("total retail value of products sold: " + total);
    }
    
}
