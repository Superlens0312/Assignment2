/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task1;
import java.util.Scanner;   
/**
 *
 * @author Lenny Manset
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             
        Scanner input = new Scanner(System.in);

         System.out.println("Welcome to the world population calculator!"); 
         System.out.println("Enter world population:");
            long population = input.nextLong();
         System.out.println("Enter the current growth rate: (e.g, 1.14 would be 0.0114%): ");
            double growthRate = input.nextDouble();
             System.out.printf("%-9s%20s%28s%n", "Year","Estimated population", "Change from prior year" ); 
          
        for (int year=1; year <= 75; year++){
           double increase = population*growthRate;
           long newPopulation = (long)increase + population;
           long change = newPopulation - population;
            System.out.printf("%-7s%17s%25s%n", year, newPopulation , change );
            population = newPopulation;
        }

    }
}

