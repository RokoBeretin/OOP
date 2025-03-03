package fst;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TestApp {

    private static int MINI = 0;
    private static int MAXI = 150;

    private static Scanner scanner;

    public static void main(String[] args) {
        int[][] prvi = generateArray(5, 3);
        printByRowsArray(prvi);
//        int userInput = userDefinedInput();
//        System.out.println(userInput);
//        boolean inArray = inputIn2DArray(prvi, userInput);
//        System.out.println(inArray);
        inputUntilGuess(prvi);
    }

    private static int userDefinedInput(){
        scanner = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 150: \n");
        int value = scanner.nextInt();
        System.out.println("Closing the scanner");
        return value;

    }

    private static boolean inputIn2DArray(int[][] array, int input){
        for(int k = 0; k<array.length; k++){
            for(int q = 0; q<array[0].length; q++){
                if(array[k][q] == input){
                    System.out.println("Found user input in 2D array!");
                    return true;
                }
            }
        }


        return false;
    }

    private static int[][] generateArray(int numRows, int numColums) {
        int[][] array = new int[numRows][numColums];
        for (int k = 0; k < numRows; k++) {
            for (int q = 0; q < numColums; q++) {
                array[k][q] = (int) (MINI + (Math.random() * MAXI - MINI));


            }
        }
        return array;

    }

    private static void print2dArray(int[][] array) {
        for (int k = 0; k < array.length; k++) {
            System.out.println("\n");
            for (int q = 0; q < array[k].length; q++) {
                System.out.print(array[k][q] + "\t");

            }
        }
    }

    private static void inputUntilGuess(int[][] array){
        int userInput = userDefinedInput();
        while(!inputIn2DArray(array, userInput)){
            userInput = userDefinedInput();

        }
        System.out.println("Terminated looping - user successfully guessed a number in the array!");

    }

    private static void printByRowsArray(int[][] array){
        for(int[] row : array){
            System.out.println(Arrays.toString(row));
        }
    }
}