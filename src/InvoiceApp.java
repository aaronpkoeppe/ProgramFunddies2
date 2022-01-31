/* Aaron Koeppe
January 26th, 2022
https://github.com/aaronpkoeppe/ProgramFunddies2.git

First Time Setup for Git:
  1. Initialize the repo: `git init`
  2. Add your remote url: `git remote add origin $url`

To Update Existing Repo:
  1. Make sure you're in the project folder: `pwd`
  2. See if you have any changes: `git status` or `git diff .`
  3. Add your changes to a commit: `git add .`
  4. Commit the files: `git commit -m "$message"`
  5. Update remote github repo: `git push`
*/

import java.util.Arrays;
import java.util.Scanner;

public class InvoiceApp {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        double discountPercent = 0.0;


        // welcome the user to the program
        System.out.println("Welcome to the Invoice Total Calculator\n");

        // create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // perform invoice calculations until choice isn't equal to "y" or "Y"
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {

            // create subtotal based on number of lines and user entries
            System.out.println("enter number of line items: ");
            int lines = Integer.parseInt(sc.nextLine());

            // creates for loop taking in number of items and item amounts
            double[] itemAmounts = new double[lines];
            for (int i = 0; i < lines; i++) {
                System.out.println("Enter number #" + (i + 1) + " line items: ");
                itemAmounts[i] = Double.parseDouble(sc.nextLine());
            }

            double total = Arrays.stream(itemAmounts).sum();
            System.out.printf("%20s: %, 10.2f\n", "subtotal", total);

                    // calculate the discount amount and total

            if (total >= 200) {
                discountPercent = .2;
            } else if (total >= 100) {
                discountPercent = .1;
            } else {
                discountPercent = 0.0;
            }
            double discountAmount = total * discountPercent;
            double finalTotal = total - discountAmount;

            // display the discount amount and total
            System.out.printf("%20s: %, 10.2f\n", "discount percent", discountPercent);
            System.out.printf("%20s: %, 10.2f\n", "discount amount", discountAmount);
            System.out.printf("%20s: %, 10.2f\n", "Invoice total ", finalTotal);

            // see if the user wants to continue
            System.out.print("\nContinue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
    }
}
//ending message if choice is not "y"
//  System.out.println("\ngoodbye, come back soon!");