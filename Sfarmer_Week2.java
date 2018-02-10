package sfarmer_week2;

/** 
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: SHF
 * @Assignment Name: sfarmer_week2
 * @Date: Jan 28, 2018
 * @Description: Java data and operator practice w/Pythagorean Theorem
 */
//Imports

import java.util.Scanner;
import static java.lang.Math.*;
    
//Begin Class Sfarmer_Week2
public class Sfarmer_Week2 {
    
    //Begin Main Method
    public static void main(String[] args) {
        
        //Declarations
        final double FEET_IN_ACRE = 43560.0;
        int sideA;
        int sideB;
        double sideC;
        double cSquared;
        double area;
        double result;
        
        //New scanner object
        Scanner sc = new Scanner(System.in);
    
        //User input
        System.out.print("Please enter side A in feet: ");
        sideA = sc.nextInt();
        System.out.print("Please enter side B in feet: ");
        sideB = sc.nextInt();
        
        //Formulas
        area = (sideA * sideB)/2;
        cSquared = Math.pow(sideA, 2) + Math.pow(sideB, 2);
        sideC = Math.sqrt(cSquared);
        result = area / FEET_IN_ACRE;
        
        //Outputs
        System.out.println("Side C is equal to " + sideC + " feet.");
        System.out.println("The total acreage is: " + result + " acres.");
        
    } //End Main Method

} //End Class Sfarmer_Week2
