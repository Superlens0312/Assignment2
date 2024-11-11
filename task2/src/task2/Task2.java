/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2;

/**
 *
 * @author Lenny Manset
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.printf("%-5s%10s%13s%n", "Side 1","Side 2", "Hypotenuse" );
        int side1;
        int side2;
        int hypotenuse;
            for( side1 = 1; side1 <= 500 ; side1++){
            for( side2= 1; side2 <= 500; side2++){
            for( hypotenuse= 1; hypotenuse <= 500; hypotenuse++){
                 if (side1*side1 + side2*side2 == hypotenuse*hypotenuse){
             System.out.printf("%-5s%9s%10s%n",side1, side2, hypotenuse);
                     }
                }
             }
        }
    }
    
}
