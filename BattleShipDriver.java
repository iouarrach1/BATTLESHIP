// Ibrahim Ouarrach
// This is the driver class wich has the main method plus some other methods too

import java.util.Scanner;
import java.util.Random;
public class BattleShipDriver {
    public static void main(String[] args) {
        // i created to objects one for bot and one for user and one for bot, and i created boards for each.
        BattleShipBoards t = new BattleShipBoards();    // This one for user
        BattleShipBoards tBot = new BattleShipBoards();     // this one for bot
        t.boardCreation();
        tBot.boardCreation();   
        // here i placed the ship in random places in the board for bot.
        tBot.RandomShipPlacementCarrier();
        tBot.RandomShipPlacementBattleShip();
        tBot.RandomShipPlacementSubMarine();
        tBot.RandomShipPlacementDestoryer();
        tBot.RandomShipPlacementPetrolBoat();

        Scanner keyboard = new Scanner(System.in);
        // here i copied the board for each in the right array which will use to print later. 
        char[][] botBoardWithShips = tBot.getBattleshipShipBoardWithShipsSeen();
        char[][] botBoardWithOutShips = t.getBattleshipShipBoardWithShipsNotSeen();
        char[][] userBoardWithShips = t.getBattleshipShipBoardWithShipsSeen();
        char[][] userBoardWithOutShips = tBot.getBattleshipShipBoardWithShipsNotSeen();

        Random randy = new Random();
        // I used number and letter to print the colums from A to J
        int number = 65;
        char letters = (char)number;
        System.out.println("Enter 1 if you want the placement of the ships to be random");
        System.out.println("Enter 2 for entering the placement of the ships");
        int input = keyboard.nextInt();
        // here i used this if and else if for the user to choose between random place3ment of the ships or he wiil choose where to put them 
        if(input == 1)
        {
            // Random
            t.RandomShipPlacementCarrier();
            t.RandomShipPlacementBattleShip();
            t.RandomShipPlacementSubMarine();
            t.RandomShipPlacementDestoryer();
            t.RandomShipPlacementPetrolBoat();
        }
        //***************************************************************************************************************************************************************************************************************************************************************************************************************** */
        else if(input == 2)
        {
            // the user choose where to put the ships.
            // !!!!!!!!!!!!!!!!!!!!!! from line 49 to line 210 is the same this, just some if else statment for each type of ship
            for(int i =1; i<6; i++)
            {
                System.out.println("Please Enter number corresponding of the "+ i +"ship that you want, you can only shoose 1 wach time");
                System.out.println("1-Carrier, 2- Battle Ship, 3- Destroyer, 4- Submarine, 5- PatrolBoat");
                int num = keyboard.nextInt();
                if(num == 1)
                {
                    System.out.println("Do you want to put it horizontally or vertically, Enter 1 for horizontally or 2 for vertically");
                    int num2 = keyboard.nextInt();
                    if(num2 == 1)
                    {
                        System.out.println("here is the board for you with your ships, please make sure you inpute the first slot of the ship, meaning because you chose to put the ship horizontally and the ship is carrier the maximum collum will be F, but it does not matter what to choose for rows");
                        printTheBoardWithShipsSeenOrNot(number, letters, userBoardWithShips);
                        System.out.println("row: ");
                        keyboard.nextLine();
                        int r=keyboard.nextInt();
                        System.out.println("col: ");
                        keyboard.nextLine();
                        String c=keyboard.nextLine();
                        r = r-1;
                        int col3 = ConvertingAStringToInt(c,r,t);
                        t.UserPlacementForCarrier(r,col3, true);
                    }
                    else if(num2 ==2)
                    {
                        System.out.println("here is the board for you with your ships, please make sure you inpute the first slot of the ship, meaning because you chose to put the ship vertically and the ship is carrier the maximum rows will be 6, but it does not matter what to choose for colums");
                        printTheBoardWithShipsSeenOrNot(number, letters, userBoardWithShips);
                        System.out.println("row: ");
                        int r=keyboard.nextInt();
                        System.out.println("col: ");
                        keyboard.nextLine();
                        String c=keyboard.nextLine();
                        r = r-1;
                        int col3 = ConvertingAStringToInt(c,r,t);
                        t.UserPlacementForCarrier(r,col3, false);
                    }
                }
                else if(num ==2)
                {
                    System.out.println("Do you want to put it horizontally or vertically, Enter 1 for horizontally or 2 for vertically");
                    int num2 = keyboard.nextInt();
                    if(num2 == 1)
                    {
                        System.out.println("here is the board for you with your ships, please make sure you inpute the first slot of the ship, meaning because you chose to put the ship horizontally and the ship is BattleShip the maximum collum will be G, but it does not matter what to choose for rows");
                        printTheBoardWithShipsSeenOrNot(number, letters, userBoardWithShips);
                        System.out.println("row: ");
                        int r=keyboard.nextInt();
                        System.out.println("col: ");
                        keyboard.nextLine();
                        String c=keyboard.nextLine();
                        r = r-1;
                        int col3 = ConvertingAStringToInt(c,r,t);
                        t.UserPlacementForBattleShip(r, col3, true);
                    }
                    else if(num2 ==2)
                    {
                        System.out.println("here is the board for you with your ships, please make sure you inpute the first slot of the ship, meaning because you chose to put the ship vertically and the ship is carrier the maximum rows will be 7, but it does not matter what to choose for colums");
                        printTheBoardWithShipsSeenOrNot(number, letters, userBoardWithShips);
                        System.out.println("row: ");
                        int r=keyboard.nextInt();
                        System.out.println("col: ");
                        keyboard.nextLine();
                        String c=keyboard.nextLine();
                        r = r-1;
                        int col3 = ConvertingAStringToInt(c,r,t);
                        t.UserPlacementForBattleShip(r, col3, false);
                    }
                }
                else if(num ==3)
                {
                    System.out.println("Do you want to put it horizontally or vertically, Enter 1 for horizontally or 2 for vertically");
                    int num2 = keyboard.nextInt();
                    if(num2 == 1)
                    {
                        System.out.println("here is the board for you with your ships, please make sure you inpute the first slot of the ship, meaning because you chose to put the ship horizontally and the ship is Destroyer the maximum collum will be H, but it does not matter what to choose for rows");
                        printTheBoardWithShipsSeenOrNot(number, letters, userBoardWithShips);
                        System.out.println("row: ");
                        int r=keyboard.nextInt();
                        System.out.println("col: ");
                        keyboard.nextLine();
                        String c=keyboard.nextLine();
                        r = r-1;
                        int col3 = ConvertingAStringToInt(c,r,t);
                        t.UserPlacementForDestroyer(r, col3, true);
                    }
                    else if(num2 ==2)
                    {
                        System.out.println("here is the board for you with your ships, please make sure you inpute the first slot of the ship, meaning because you chose to put the ship vertically and the ship is Destroyer the maximum rows will be 8, but it does not matter what to choose for colums");
                        printTheBoardWithShipsSeenOrNot(number, letters, userBoardWithShips);
                        System.out.println("row: ");
                        int r=keyboard.nextInt();
                        System.out.println("col: ");
                        keyboard.nextLine();
                        String c=keyboard.nextLine();
                        r = r-1;
                        int col3 = ConvertingAStringToInt(c,r,t);
                        t.UserPlacementForDestroyer(r, col3, false);
                    }
                }
                else if(num ==4)
                {
                    System.out.println("Do you want to put it horizontally or vertically, Enter 1 for horizontally or 2 for vertically");
                    int num2 = keyboard.nextInt();
                    if(num2 == 1)
                    {
                        System.out.println("here is the board for you with your ships, please make sure you inpute the first slot of the ship, meaning because you chose to put the ship horizontally and the ship is Submarine the maximum collum will be H, but it does not matter what to choose for rows");
                        printTheBoardWithShipsSeenOrNot(number, letters, userBoardWithShips);
                        System.out.println("row: ");
                        int r=keyboard.nextInt();
                        System.out.println("col: ");
                        keyboard.nextLine();
                        String c=keyboard.nextLine();
                        r = r-1;
                        int col3 = ConvertingAStringToInt(c,r,t);
                        t.UserPlacementForSubMarine(r, col3, true);
                    }
                    else if(num2 ==2)
                    {
                        System.out.println("here is the board for you with your ships, please make sure you inpute the first slot of the ship, meaning because you chose to put the ship vertically and the ship is Submarine the maximum rows will be 8, but it does not matter what to choose for colums");
                        printTheBoardWithShipsSeenOrNot(number, letters, userBoardWithShips);
                        System.out.println("row: ");
                        int r=keyboard.nextInt();
                        System.out.println("col: ");
                        keyboard.nextLine();
                        String c=keyboard.nextLine();
                        r = r-1;
                        int col3 = ConvertingAStringToInt(c,r,t);
                        t.UserPlacementForSubMarine(r, col3, false);
                    }
                }
                else if(num ==5)
                {
                    System.out.println("Do you want to put it horizontally or vertically, Enter 1 for horizontally or 2 for vertically");
                    int num2 = keyboard.nextInt();
                    if(num2 == 1)
                    {
                        System.out.println("here is the board for you with your ships, please make sure you inpute the first slot of the ship, meaning because you chose to put the ship horizontally and the ship is PatrolBoat the maximum collum will be I, but it does not matter what to choose for rows");
                        printTheBoardWithShipsSeenOrNot(number, letters, userBoardWithShips);
                        System.out.println("row: ");
                        int r=keyboard.nextInt();
                        System.out.println("col: ");
                        keyboard.nextLine();
                        String c=keyboard.nextLine();
                        r = r-1;
                        int col3 = ConvertingAStringToInt(c,r,t);
                        t.UserPlacementForPatrolBoat(r, col3, true);
                    }
                    else if(num2 ==2)
                    {
                        System.out.println("here is the board for you with your ships, please make sure you inpute the first slot of the ship, meaning because you chose to put the ship vertically and the ship is PatrolBoat the maximum rows will be 9, but it does not matter what to choose for colums");
                        printTheBoardWithShipsSeenOrNot(number, letters, userBoardWithShips);
                        System.out.println("row: ");
                        int r=keyboard.nextInt();
                        System.out.println("col: ");
                        keyboard.nextLine();
                        String c=keyboard.nextLine();
                        r = r-1;
                        int col3 = ConvertingAStringToInt(c,r,t);
                        t.UserPlacementForPatrolBoat(r, col3, false);
                    }
                }
            }
        }
//***************************************************************************************************************************************************************************************************************************************************************************************************************** */
        // here just printing the boards   
        System.out.println("lets the Game begin:");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("User game boards: \n");
        printTheBoardWithShipsSeenOrNot(number, letters, userBoardWithShips);
        printTheBoardWithShipsSeenOrNot(number, letters, userBoardWithOutShips);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("bot game boards: \n");
        printTheBoardWithShipsSeenOrNot(number, letters, botBoardWithShips);
        printTheBoardWithShipsSeenOrNot(number, letters, botBoardWithOutShips);
        // here we are using a while loop for cheking if the there is 5 sinks in each both boards to see if the game is done or not.
        // After 3 inputs of the cordinations each rround we print the boards.
        while(gameFinishedUser(userBoardWithShips)==true && gameFinishedBot(botBoardWithShips) == true)
        {
            for(int i=0; i<3; i++)
            {
                System.out.println("Enter the number of row of the cordination:");
                int row =keyboard.nextInt();
                System.out.println("Enter the charchter with upperCase of the colom of the cordination:");
                keyboard.nextLine();
                String colom =keyboard.nextLine();
                PrintingIfItsAHitUser(colom, row, tBot);
            }
            for(int i=0; i<3; i++)
            {
                int row = randy.nextInt(10) +1;
                int colom =randy.nextInt(10);
                PrintingIfItsAHitBot(colom, row, t);
            }

            System.out.println("User game boards: \n");
            printTheBoardWithShipsSeenOrNot(number, letters, userBoardWithShips);
            System.out.println("------------------------------------------------------");
            printTheBoardWithShipsSeenOrNot(number, letters, userBoardWithOutShips);
            System.out.println("Bot game boards: \n");
            printTheBoardWithShipsSeenOrNot(number, letters, botBoardWithShips);
            System.out.println("------------------------------------------------------");
            printTheBoardWithShipsSeenOrNot(number, letters, botBoardWithOutShips);
        }

        // here we just print who is the winner
        if(gameFinishedUser(userBoardWithShips)==false)
        {
            System.out.println(" The winner is the Computer, the user is defeated");
        }
        else if(gameFinishedBot(botBoardWithShips) == false)
        {
            System.out.println(" The winner is the user, the computer is defeated");
        }        
    }



    // this method is used for printing the boards.
    public static void printTheBoardWithShipsSeenOrNot(int number, char letters, char[][] array )
    {
        System.out.print("  ");
        for(int i=0;i<10;i++)
        {
            System.out.print(" " +letters);
            number = number +1;
            letters = (char)number;
        }
        System.out.println();
        for (int row = 0; row<9; row++)
        {
            System.out.print(row + 1+"  ");
            for(int col = 0; col<10; col++)
            {
                System.out.print(array[row][col]+" ");
            }
            System.out.println();
        }

        for (int row = 9; row<10; row++)
        {
            System.out.print(row + 1+" ");
            for(int col = 0; col<10; col++)
            {
                System.out.print(array[row][col]+" ");
            }
            System.out.println();
        }
    }
    // this method i used for coverting string to char to int. Because the user input A or B.
    public static int ConvertingAStringToInt(String colom, int row, BattleShipBoards t)
    {
        char q = colom.charAt(0);
        int l = (int)q -65;
        return l;
    }
    // here i use this method for changing the board after the user put the cordination to see if it a hit or a miss or a sink, this one for user because we use colum as string.
    public static void PrintingIfItsAHitUser(String colom, int row, BattleShipBoards t)
    {
        char q = colom.charAt(0);
        int l = (int)q -65;
        int r = row-1;
        t.missHitSink(r, l);
        t.chekingIfSinkCarrier(r, l);
        t.chekingIfSinkSubMarin(r, l);
        t.chekingIfSinkDestroyer(r, l);
        t.chekingIfSinkPatrolBoat(r, l);
        t.chekingIfSinkBattleShip(r, l);
    }    
    // here i use this method for changing the board after the user put the cordination to see if it a hit or a miss or a sink, this one for bot because we use colum as int
    public static void PrintingIfItsAHitBot(int colom, int row, BattleShipBoards t)
    {
        int l = colom;
        int r = row-1;
        t.missHitSinkForBot(r, l);
        t.chekingIfSinkCarrier(r, l);
        t.chekingIfSinkSubMarin(r, l);
        t.chekingIfSinkDestroyer(r, l);
        t.chekingIfSinkPatrolBoat(r, l);
        t.chekingIfSinkBattleShip(r, l);
    }
    // this method checks if the game is finished by sheking if there is 5 sink in the user board
    public static boolean gameFinishedUser(char[][] arrayUser)
    {
        int counter =0;
        for(int row=0 ; row<arrayUser.length; row++)
        {
            for(int col = 0; col<arrayUser[row].length; col++)
            {
                if(arrayUser[row][col]=='S')
                {
                    counter++;
                }
            }
        }
        if(counter == 5)
        {
            return false;
        }
        return true;
    }
    // this method checks if the game is finished by sheking if there is 5 sink in the bot board
    public static boolean gameFinishedBot(char[][] arraybot)
    {
        int counter =0;
        for(int row=0 ; row<arraybot.length; row++)
        {
            for(int col = 0; col<arraybot[row].length; col++)
            {
                if(arraybot[row][col]=='S')
                {
                    counter++;
                }
            }
        }
        if(counter == 5)
        {
            return false;
        }
        return true;
    }
}
