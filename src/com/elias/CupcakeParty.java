package com.elias;

import java.util.Scanner;

/**
 * This program calculates the number of cupcakes that can be made from a given number of boxes
 * date: 06/10/2024
 * @author Elias Khatoun
 */

public class CupcakeParty {

    /**
     * Accepts the user input and calls the calculateCupcakes and cupcakesLeftover methods
     * @param args Command Line Arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Accept 2 inputs, one for regular boxes and one for small boxes
        System.out.println("Enter the number of regular boxes: ");
        int regularBoxes = input.nextInt();

        System.out.println("Enter the number of small boxes: ");
        int smallBoxes = input.nextInt();

        // Calculate the number of cupcakes that are available
        int totalCupcakes = calculateCupcakes(regularBoxes, smallBoxes);

        // Calculate the number of cupcakes that will be leftover
        int cupcakesLeft = cupcakesLeftover(totalCupcakes);

        // Printing the Results
        System.out.println("Total Cupcakes: " + totalCupcakes);
        System.out.println("Cupcakes Leftover: " + cupcakesLeft);
    }


    /**
     * Calculates the total number of cupcakes that are available from the total number of boxes
     * @param regularBoxes Number of regular boxes of cupcakes that the user inputted from the main method
     * @param smallBoxes Number of small boxes of cupcakes that the user inputted from the main method
     * @return Total number of cupcakes that are available from the total number of boxes
     */
    public static int calculateCupcakes(int regularBoxes, int smallBoxes) {
        // Calculate the number of cupcakes that can be made from the total number of cupcakes
        return (regularBoxes * 8) + (smallBoxes * 3);
    }


    /**
     * Calculates the number of cupcakes that will be leftover
     * @param totalCupcakes Total number of cupcakes that are available from the total number of boxes
     * @return Number of cupcakes that will be leftover
     */
    public static int cupcakesLeftover(int totalCupcakes) {
        // returns the number of cupcakes that will be leftover
        return totalCupcakes % 28;
    }
}
