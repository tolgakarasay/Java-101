import java.util.Scanner;

public class Minesweeper {
    int row;
    int col;
    int n;
    int[][] map;

    public Minesweeper(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void run() {
        generateMap();
        play();
    }

    public void generateMap() {

        this.map = new int[this.row][this.col];
        this.n = this.row * this.col;
        int[] addressesOfMines = new int[this.n / 4];

        for (int i = 0; i < this.n / 4; i++) {
            boolean isDifferent = false;

            while (!isDifferent) {
                // Generating the random numbers representing the addresses of the mines on 1d array.
                addressesOfMines[i] = (int) (Math.random() * n);
                isDifferent = true;

                int j = i - 1;
                while (j >= 0) {
                    // For being sure that the current random number is different from previous ones.
                    if (addressesOfMines[i] == addressesOfMines[j]) {
                        isDifferent = false;
                    }
                    j--;
                }
            }

            // Translating the addresses of mines from 1d array to 2d array.
            int x = addressesOfMines[i] / this.col;
            int y = addressesOfMines[i] % this.col;

            // Planting numbers around mines
            for (int j = -1; j <= 1; j++) {
                for (int k = -1; k <= 1; k++) {
                    if (x + j >= 0 && x + j < this.row && y + k >= 0 && y + k < this.col) {
                        this.map[x + j][y + k]++;
                    }
                }
            }
        }

        // Planting the mines
        for (int i = 0; i < this.n / 4; i++) {
            this.map[addressesOfMines[i] / this.col][addressesOfMines[i] % this.col] = -1;
        }
    }

    public void play() {

        System.out.println("======================");
        System.out.println("Welcome to the Minesweeper!");

        int[][] gameBoard = new int[this.row][this.col];

        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                gameBoard[i][j] = -2;
            }
        }

        displayArray(gameBoard);

        int count = 0;
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            System.out.print("Please enter row index : ");
            int rowIndex = scanner.nextInt();
            System.out.print("Please enter column index : ");
            int colIndex = scanner.nextInt();
            if (rowIndex < 0 || rowIndex >= this.row || colIndex < 0 || colIndex >= this.col) {
                System.out.println();
                System.out.println("-------------Invalid entry!------------");
                System.out.println("Row index has to be between 0 and " + (this.row - 1) + ".");
                System.out.println("Column index has to be between 0 and " + (this.col - 1) + ".");
                System.out.println("---------------------------------------");
                System.out.println();
            } else if (gameBoard[rowIndex][colIndex] != -2) {
                System.out.println();
                System.out.println("---------------------------------------");
                System.out.println("This index number combination has already been entered. Please try another.");
                System.out.println("---------------------------------------");
                System.out.println();
            } else {
                gameBoard[rowIndex][colIndex] = this.map[rowIndex][colIndex];
                count++;
                System.out.println("======================");

                if (gameBoard[rowIndex][colIndex] == -1) {
                    displayArray(this.map);
                    System.out.println();
                    System.out.println("YOU LOSE! :(");
                    gameOver = true;
                } else if (count == this.n - this.n / 4) {
                    displayArray(gameBoard);
                    System.out.println();
                    System.out.println("YOU WIN! :)");
                    gameOver = true;
                } else {
                    displayArray(gameBoard);
                }
            }
        }
        scanner.close();
    }

    public void displayArray(int[][] arr) {
        for (int[] row : arr) {
            for (int value : row) {
                if (value == -1) {
                    System.out.print("* ");
                } else if (value == -2) {
                    System.out.print("- ");
                } else {
                    System.out.print(value + " ");
                }
            }
            System.out.println();
        }
    }
}