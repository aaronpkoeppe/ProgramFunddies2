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
        // welcome the user to the program
        System.out.println("Welcome to the Invoice Total Calculator");
        System.out.println();  // print a blank line

        // create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // perform invoice calculations until choice isn't equal to "y" or "Y"
        String choice = "n";
        while (choice.equalsIgnoreCase("y")) {

            // create subtotal based on number of lines and user entries
            System.out.println("enter number of line items: ");
            int lines = sc.nextInt();

            double[] itemAmounts = new double[lines];
            for (int i = 0; i < lines; i++) {
                System.out.println("Enter number #" + (i + 1) + " line items: ");
                itemAmounts[i] = sc.nextDouble();
            }

            double total = Arrays.stream(itemAmounts).sum();
            System.out.println(Arrays.toString(itemAmounts));
            System.out.println(total);
        }



            /*
            System.out.print("Enter subtotal: ");
            String input = sc.nextLine();
            double subtotal = Double.parseDouble(input);
            */

        // calculate the discount amount and total
            /*
            if (itemTotal >= 200) {
                discountPercent = .2;
            } else if (itemTotal >= 100) {
                discountPercent = .1;
            } else {
                discountPercent = 0.0;
            }
            double discountAmount = itemTotal * discountPercent;
            double total = itemTotal - discountAmount;

            // display the discount amount and total
            String message = "Discount percent: " + discountPercent + "\n"
                    + "Discount amount: " + discountAmount + "\n"
                    + "Invoice total: " + total + "\n";
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();

             */
    }
}
