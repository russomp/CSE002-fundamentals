/*
Michael Russo
CSE002 - Homework 10

Mine Sweeper Java Program:
  set-up a mine sweeper board based on user inputs for 
  board size and number of mines to be placed

Instructions:
  Compile Program:
    javac MineSweeper.java
  Run Program:
    java MineSweeper
  Input board size
  Input number of mines
*/

// import scanner from java library
import java.util.Scanner;

// start MineSweeper class
public class MineSweeper
{
	// start method to setup board
	public static String[][] setUpBoard(String[][] board, int boardSize)
	{
		// initialize board with "0" values
		for (int i = 0; i < boardSize; i++){
			for (int j = 0; j < boardSize; j++){
				board[i][j] = "0";
			}
		}
		return board;
	}

	// start method to place mines on board
	public static String[][] layMine(String[][] board, int numMines)
	{
		// randomly generate mine location and place mine
		for(int mines = 0; mines < numMines; mines++)
		{
			// set random index for mine
			int i = (int) (Math.random() * board.length);
			int j = (int) (Math.random() * board[0].length);

			// check if a mine has already been placed or not 
			if (board[i][j] == "M")
			{
				mines--;
			} 
			else
			{
				board[i][j] = "M";
				// call countMine method to increment board surrounding mine
				countMines(board, i, j);
			}
		}
		return board;
	}

	// start method to count neighboring mines for each space
	public static String[][] countMines(String[][] board, int i, int j)
	{
		// initialize arrays to check surrounding spaces of current mine
		int[] a = {-1,0,1};
		int[] b = {-1,0,1};
		
		// go through each space surrounding current mine and icrement mine count
		for (int x : a)
		{
			for (int y : b)
			{
				// check for exterior cases where index will be out of bounds
				try
				{
					String currentVal = board[i-x][j-y];
					if (!currentVal.equals("M"))
					{
						int currentMines = Integer.parseInt(board[i-x][j-y]);
						currentMines++;
						board[i-x][j-y] = Integer.toString(currentMines);
					}
				}
				catch (IndexOutOfBoundsException e)
				{
					// do nothing if index is out of bounds
				}
			}
		}
		return board;
	}

	// start method to print out current board
	public static void printBoard(String[][] board)
	{
		// print board element by element
		for(int i = 0, n = board.length; i < n; i ++)
		{
			for(int j = 0, m = board[0].length; j < m; j ++)
			{
				System.out.print(board[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

	// start main method
	public static void main(String[] args)
	{
		// declare scanner object to take user inputs
		Scanner input = new Scanner(System.in);
		// print welcome message
		System.out.println("*** Welcome to Mine Sweeper ***");
		// prompt user to input board size
		System.out.print("Enter board size [2,30]: ");
		int boardSize = input.nextInt();
		// prompt user to enter the numbeer of mines
		System.out.print("Enter number of mines [1,N^2]: ");
		int numMines = input.nextInt();
		// initialize mine sweeper board with zeros
		String[][] board = new String[boardSize][boardSize];
		// fill in board with corresponding values based on user inputs
		setUpBoard(board, boardSize);
		layMine(board, numMines);
		// print final board
		printBoard(board);
	}
}