/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task4;

/**
 *
 * @author Lenny Manset
 */
public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int side1;
        int side2;
//Pattern (a) 
        for( side1 = 1; side1 <= 10 ; side1++){
            for( side2 = 1; side2 <= side1 ; side2++){
                System.out.print('*');
            }
            System.out.println();
        }  
         System.out.println("");
//pattern (b)
        for( side1 = 10; side1 >= 1 ; side1--){
            for( side2 = 1; side2 <= side1 ; side2++){
                System.out.print('*');
            }
            System.out.println();
     }     
          System.out.println("");
//Pattern (c)
            for (side1 = 10; side1 >= 1; side1--) {
            for (side2 = 1; side2 <= 10 - side1; side2++) {
                System.out.print(" ");
            }
            for (side2 = 1; side2 <= side1; side2++) {
               System.out.print("*");
            }
           System.out.println();
           } 
          System.out.println("");
//Pattern (d)
            for (side1 = 1; side1 <= 10; side1++) {
            for (side2 = 1; side2 <= 10 - side1; side2++) {
                System.out.print(" ");
            }
            for (side2 = 1; side2 <= side1; side2++) {
                System.out.print("*");
            }
            System.out.println();

          } 
      
            
      }          
    }
