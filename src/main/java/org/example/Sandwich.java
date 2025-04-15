package org.example;

import java.util.Scanner;

public class Sandwich {

   static Scanner input = new Scanner(System.in);

    public double regularPrice = 5.45;
    public double largePrice = 8.95;
    public double loadedExtraRegular = 1.00;
    public double  loadedExtraLarge = 1.75;
    public int size;
    public boolean isLoaded;
    public int age;
    public double price;
    public double finalPrice;
    public double discount;
    public double discountAmount;


    // choice of sandwich

    public void sandwichChoice(){

        System.out.println("welcome to best sandwich shop.");
        System.out.println("what size you want? Enter 1 for regular or 2 for large ");

         size = input.nextInt();
         // newline
         input.nextLine();

         // loaded
        System.out.print("Would you like it loaded? (yes/no): ");
        String loadedInput = input.nextLine();
        isLoaded = loadedInput.equalsIgnoreCase("yes");


        System.out.println("Enter your age: ");
         age = input.nextInt();
    }
    // calculate price
    public void calculateCandwichPrice(){
        if ( size == 1) {
           price = regularPrice;
           if (isLoaded) {
               price += loadedExtraRegular;
           }
        } else if (size == 2) {
            price = largePrice;
            if (isLoaded) {
                price += loadedExtraLarge;
            }
        } else {
            System.out.println("Invalid size selected.");

        }
    }
    // calculate discount
    public void determineDiscount(){
        if (age<=17){
          discount = 0.10;     // for student
        } else if (age>=65) {  // for seniors
            discount = 0.20;
        } else {
            discount = 0;
        }
        discountAmount = price * discount;
        finalPrice = price - discountAmount;
    }
    public void displayFinalPrice() {
        System.out.printf("Your final sandwich price is: $%.2f\n", finalPrice);
    }



}
