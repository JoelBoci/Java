package Practical_20;

import java.util.Arrays;

public class SierpinskiCarpet {

    // Declaring the size of the carpet

//    static int size = 3;
    static int size = 9;
//    static int size = 27;
//    static int size = 81;
//    static int size = 243;

    static char[][] board = new char[size][size]; // Create a 2D board

    // Fills the whole carpet with the character '*'
    public static void fillCarpet(char[][] board) {
        for(char[] c : board) {
            Arrays.fill(c, '*');
        }
    }

    // Loops through the carpet to find the centerpiece and set the character at the position to a blank character
    public static void removeCenter(char[][] board, int x, int y, int n) {
        for(int i = 0; i < n; i++) { // Loop through the rows
            for(int j = 0; j < n; j++) { // Loop through the columns for each row
                board[x + i][y + j] = ' '; // Set the centerpiece to a blank character
            }
        }
    }

    public static void sierpinskiCarpet(char[][] board, int x, int y, int n) {
        // Base case, just remove the centerpiece only
        if(n == 3) {
            board[x + 1][y + 1] = ' ';
            return;
        }

        // Stores current size of the carpet in a variable
        int num = n;

        // Divide the carpet into sub squares
        n /= 3;

        // Loops through each sub square
        for(int i = 0; i < 3; i++) { // Loop through rows
            for(int j = 0; j < 3; j++) { // Loop through the columns
                // If it's the centerpiece
                if(i == 1 && j == 1){
                    // Remove the middle (put a blank character)
                    removeCenter(board, x + n, y + n, n);
                } else {
                    // Recursive call
                    sierpinskiCarpet(board, x + n * i, y + n * j, num / 3);
                }
            }
        }
    }

    public static void printCarpet(char[][] board) {
        // Loop through the 2d array and prints out the character in the carpet
        for (char[] chars : board) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        fillCarpet(board);

        sierpinskiCarpet(board,0, 0, size);

        printCarpet(board);
    }
}
