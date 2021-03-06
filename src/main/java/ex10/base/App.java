package ex10.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 NURIDEAN MUBARAK
 */

import java.math.BigDecimal;
import java.util.Scanner;

/*
Working with multiple inputs and currency can introduce some tricky precision issues.

Create a simple self-checkout system. Prompt for the prices and quantities of three items. Calculate the subtotal of the items. Then calculate the tax using a tax rate of 5.5%. Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.
Example Output

Enter the price of item 1: 25
Enter the quantity of item 1: 2
Enter the price of item 2: 10
Enter the quantity of item 2: 1
Enter the price of item 3: 4
Enter the quantity of item 3: 1
Subtotal: $64.00
Tax: $3.52
Total: $67.52

Constraints

Keep the input, processing, and output parts of your program separate. Collect the input, then do the math operations and string building, and then print out the output.
Be sure you explicitly convert input to numerical data before doing any calculations.

Challenges

Revise the program to ensure that prices and quantities are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Alter the program so that an indeterminate number of items can be entered. The tax and total are computed when there are no more items to be entered.
 */
public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        String itemInputOne = in.nextLine();
            System.out.print("Enter the quantity of item 1: ");
            String quantityInputOne = in.nextLine();

        System.out.print("Enter the price of item 2: ");
        String itemInputTwo = in.nextLine();
            System.out.print("Enter the quantity of item 2: ");
            String quantityInputTwo = in.nextLine();

        System.out.print("Enter the price of item 3: ");
        String itemInputThree = in.nextLine();
            System.out.print("Enter the quantity of item 3: ");
            String quantityInputThree = in.nextLine();

        Double itemOne = Double.parseDouble(itemInputOne);
        Double itemTwo = Double.parseDouble(itemInputTwo);
        Double itemThree = Double.parseDouble(itemInputThree);

        Double qOne = Double.parseDouble(quantityInputOne);
        Double qTwo = Double.parseDouble(quantityInputTwo);
        Double qThree = Double.parseDouble(quantityInputThree);

        Double priceOne = itemOne * qOne;
        Double priceTwo = itemTwo * qTwo;
        Double priceThree = itemThree * qThree;

        double subtotal = (priceOne + priceTwo + priceThree);
        double tax = subtotal * 0.055;
        double total = tax + subtotal;

        String output = "Subtotal: $" + subtotal + "\nTax: $" + tax + "\nTotal: $" + total;

        System.out.print(output);



    }
}
