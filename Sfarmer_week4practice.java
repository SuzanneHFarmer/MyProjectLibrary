package sfarmer_week4practice;

/** 
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: SHF
 * @Assignment Name: sfarmer_week4practice
 * @Date: Feb 7, 2018
 * @Description: 
 */
//Imports

import java.util.Scanner;

//Begin Class Sfarmer_week4practice
public class Sfarmer_week4practice {
    
    //Begin Main Method
    public static void main(String[] args) {

        int age = 0;
        String fName;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your first name: ");
        fName = sc.next();
        System.out.print("Please enter your age: ");
        age = sc.nextInt();
        System.out.printf("Hello %s,\nYou don't look like you're %d years old!\n",
                fName, age);
        
    } //End Main Method

} //End Class Sfarmer_week4practice
