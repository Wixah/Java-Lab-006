/**
 * @author Trevor Hartman
 * @author Rachelle Iloff
 * created 03/02/2023
 * @since Version 1.0
 */

import java.util.Scanner;
public class Lab006 { //Create a new **class** called **Lab006**
    int n;  //Create two **int**eger instance variables for class Lab006 called **n**
    int m; //and **m**.
    public Lab006(int a, int b){ //Create a **constructor** for class **Lab006** that takes two **int**egers,
       n = a;
       m = b;                   //**n** and **m** and assigns them to Lab006 **instance variables**.
    }
    public boolean isDivisible(){ //Write a **public**/instance method named, **isDivisible**,
        return n % m == 0;       //that references, instance variables **n** and **m**, and **returns
                                // true** if **n** is evenly divisible by **m**, and **false** otherwise.
    }
    public static void main(String[] args) { //In a **static main** method,
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Let's do division! Please enter the number you'd like to divide here:"); //**prompt the user for two integers
        int numerator = Integer.parseInt(newScanner.nextLine()); //and store those values into local variables**.
        System.out.println("Sweet! Now enter the number you'd like to divide by here:"); //**prompt the user for two integers
        int denominator = Integer.parseInt(newScanner.nextLine()); //and store those values into local variables**.
        int answer = numerator / denominator;
        int remainder = numerator % denominator;
        Lab006 newObject = new Lab006(numerator, denominator);    //Use the local variables as the **arguments** to
                                                                 // the Lab006 **constructor** when creating a **new Lab006** *object*.
        if (newObject.isDivisible()){ //Call **isDivisible using a Lab006 object**, and be sure to have code that "handles" the returned value from **isDivisible**.
            System.out.printf("%d divided by %d is %d.", numerator, denominator, answer); //Use a print command to display an appropriate label and the result of isDivisible.
        }else {
            System.out.printf("%d divided by %d is %d and has a remainder of %d.", numerator, denominator,answer,remainder); //Use a print command to display an appropriate label and the result of isDivisible.
        }


    }

}
