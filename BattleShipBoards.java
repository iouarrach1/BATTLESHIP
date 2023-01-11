// Ibrahim Ouarrach
// This is the BattleBoard class which responsible on the rules and the creation of the boards.
// when you see !!!!!!!!! in a comment, please read it because it will say that the lines (form and to) will be the same thing just for diffrent type of ships.

import java.util.Random;

public class BattleShipBoards {
    private char nonShipslot = '-';
    private char ship = 'C';
    // Here we crate two array of char which will have the board with the ships seen and the board with out the ships.
    private char[][] battleshipShipBoardWithShipsSeen = new char[10][10];
    private char[][] battleshipShipBoardWithShipsNotSeen = new char[10][10];
    // here we crreated objects of each type of ships.
    private Carrier carrier1 = new Carrier();
    private Battleship battleship1 = new Battleship();
    private Destroyer destroyer1 = new Destroyer();
    private Submarine submarine1 = new Submarine();
    private PatrolBoat patrolBoat1 = new PatrolBoat();
    private int row, col;
    // here theis variale is used to see if the ship will be placed horizontally or vertically
    private boolean horizontal = false;
    Random randy = new Random();
    

    public char[][] getBattleshipShipBoardWithShipsNotSeen() {
        return battleshipShipBoardWithShipsNotSeen;
    }
    public char[][] getBattleshipShipBoardWithShipsSeen() {
        return battleshipShipBoardWithShipsSeen;
    }
    
    public void setBattleshipShipBoardWithShipsNotSeen(char[][] battleshipShipBoardWithShipsNotSeen) {
        this.battleshipShipBoardWithShipsNotSeen = battleshipShipBoardWithShipsNotSeen;
    }
    public void setBattleshipShipBoardWithShipsSeen(char[][] battleshipShipBoardWithShipsSeen) {
        this.battleshipShipBoardWithShipsSeen = battleshipShipBoardWithShipsSeen;
    }

    // here we fill both the arrays with water "-"
    public void boardCreation()
    {
        for (int row = 0; row<10; row++)
        {
            for(int col = 0; col<10; col++)
            {
                battleshipShipBoardWithShipsSeen[row][col] = nonShipslot;
                battleshipShipBoardWithShipsNotSeen[row][col] = nonShipslot;
            }
        }
    }


    //#################################################################################################################################################################################################################################################################################################################################################################################
    
    // This method is used for the random placement of the carrier, this one we dont check if the placement is already taken cause this will be always the first.
    public void RandomShipPlacementCarrier()
    {
        if(randy.nextInt(2) == 0)
        {
            horizontal = false;
            row = randy.nextInt(6);
            col = randy.nextInt(10);
        }
        else
        {
            horizontal = true;
            row = randy.nextInt(10);
            col = randy.nextInt(6);
        }
        
        if(horizontal == false)
        {
            carrier1.setColsForVertical(col);
            carrier1.setCordinationRowsForVertical(row);
            carrier1.setHorizontal(horizontal);
            int[] r =carrier1.getCordinationRowsForVertical();
            int c = carrier1.getColsForVertical();
            for (int i =0; i<5;i++)
            {
                battleshipShipBoardWithShipsSeen[r[i]][c] = ship;
            }
        }
        else if(horizontal == true)
        {
            carrier1.setCordinationColsForHorizontal(col);
            carrier1.setRowsForHorizontal(row);
            carrier1.setHorizontal(horizontal);
            int r =carrier1.getRowsForHorizontal();
            int[] c = carrier1.getCordinationColsForHorizontal();

            for (int i =0; i<5;i++)
            {
                battleshipShipBoardWithShipsSeen[r][c[i]] = ship;
            }
        }
    }
    // This method is used for the random placement of the BattleShip,and this one we check if the spot is already tacken or not using th following method.
    // CheckForPositionAlreadyTaken();
    // !!!!!!!!!!!!!!!!!!!!!!!! from line 99 to line 220 is the same thing as this methos, is just they are for other type of ships with diffent sizes.
    public void RandomShipPlacementBattleShip()
    {
        CheckForPositionAlreadyTaken(4);
        if(horizontal == false)
        {
            battleship1.setColsForVertical(col);
            battleship1.setCordinationRowsForVerticalForRandom(row);
            battleship1.setHorizontal(horizontal);
            int[] r =battleship1.getCordinationRowsForVertical();
            int c = battleship1.getColsForVertical();
            for (int i =0; i<4;i++)
            {
                battleshipShipBoardWithShipsSeen[r[i]][c] = ship;
            }
        }
        else if(horizontal == true)
        {
            battleship1.setCordinationColsForHorizontalForRandom(col);
            battleship1.setRowsForHorizontal(row);
            battleship1.setHorizontal(horizontal);
            int r =battleship1.getRowsForHorizontal();
            int[] c = battleship1.getCordinationColsForHorizontal();
            for (int i =0; i<4;i++)
            {
                battleshipShipBoardWithShipsSeen[r][c[i]] = ship;
            }
        }
    }



    public void RandomShipPlacementSubMarine()
    {
        CheckForPositionAlreadyTaken(3);
        
        if(horizontal == false)
        {
            submarine1.setColsForVertical(col);
            submarine1.setCordinationRowsForVerticalForRandom(row);
            submarine1.setHorizontal(horizontal);
            int[] r =submarine1.getCordinationRowsForVertical();
            int c = submarine1.getColsForVertical();
            for (int i =0; i<3;i++)
            {
                battleshipShipBoardWithShipsSeen[r[i]][c] = ship;
            }
        }
        else if(horizontal == true)
        {
            submarine1.setCordinationColsForHorizontalForRandom(col);
            submarine1.setRowsForHorizontal(row);
            submarine1.setHorizontal(horizontal);
            int r =submarine1.getRowsForHorizontal();
            int[] c = submarine1.getCordinationColsForHorizontal();
            for (int i =0; i<3;i++)
            {
                battleshipShipBoardWithShipsSeen[r][c[i]] = ship;
            }
        }
    }


    public void RandomShipPlacementDestoryer()
    {
        CheckForPositionAlreadyTaken(3);
        
        if(horizontal == false)
        {
            destroyer1.setColsForVertical(col);
            destroyer1.setCordinationRowsForVerticalForRandom(row);
            destroyer1.setHorizontal(horizontal);
            int[] r =destroyer1.getCordinationRowsForVertical();
            int c = destroyer1.getColsForVertical();
            for (int i =0; i<3;i++)
            {
                battleshipShipBoardWithShipsSeen[r[i]][c] = ship;
            }
        }
        else if(horizontal == true)
        {
            destroyer1.setCordinationColsForHorizontalForRandom(col);
            destroyer1.setRowsForHorizontal(row);
            destroyer1.setHorizontal(horizontal);
            int r =destroyer1.getRowsForHorizontal();
            int[] c = destroyer1.getCordinationColsForHorizontal();
            for (int i =0; i<3;i++)
            {
                battleshipShipBoardWithShipsSeen[r][c[i]] = ship;
            }
        }
    }

    
    public void RandomShipPlacementPetrolBoat()
    {
        CheckForPositionAlreadyTaken(2);
        
        if(horizontal == false)
        {
            patrolBoat1.setColsForVertical(col);
            patrolBoat1.setCordinationRowsForVerticalForRandom(row);
            patrolBoat1.setHorizontal(horizontal);
            int[] r =patrolBoat1.getCordinationRowsForVertical();
            int c = patrolBoat1.getColsForVertical();
            for (int i =0; i<2;i++)
            {
                battleshipShipBoardWithShipsSeen[r[i]][c] = ship;
            }
        }
        else if(horizontal == true)
        {
            patrolBoat1.setCordinationColsForHorizontalForRandom(col);
            patrolBoat1.setRowsForHorizontal(row);
            patrolBoat1.setHorizontal(horizontal);
            int r =patrolBoat1.getRowsForHorizontal();
            int[] c = patrolBoat1.getCordinationColsForHorizontal();
            for (int i =0; i<2;i++)
            {
                battleshipShipBoardWithShipsSeen[r][c[i]] = ship;
            }
        }
    }
//#################################################################################################################################################################################################################################################################################################################################################################################
    
    // This method is used for cheking that the ships will not have the same spot in the borad.
    public void CheckForPositionAlreadyTaken(int number)
    {
        if(randy.nextInt(2) == 0)
        {
            int counter;
            horizontal = false;
            do{
                counter =0;
                row = randy.nextInt(6);
                col = randy.nextInt(10);
                for(int i =0 ; i<number; i++)
                {
                    if(battleshipShipBoardWithShipsSeen[row][col] == ship)
                    {
                        counter = counter +1;
                    }
                    row++;
                }
            }while(counter !=0);
            row--;
        }
        else
        {
            int counter;
            horizontal = true;
            do{
                counter =0;
                row = randy.nextInt(10);
                col = randy.nextInt(6);
                for(int i =0 ; i<number; i++)
                {
                    if(battleshipShipBoardWithShipsSeen[row][col] == ship)
                    {
                        counter = counter +1;
                    }
                    col++;
                }
            }while(counter !=0);
            col--;
        }
    }
//******************************************************************************************************************************************************************** */
    // This method is used for letting the user choose where to put the ships in the board for carrier
    // !!!!!!!!!!!!!!!!!!!!!!!!! From line 268 to line 405 is the same methods but for diffrent types of ships
    public void UserPlacementForCarrier(int row, int col, boolean horizontal)
    {
        if(horizontal == false)
        {
            carrier1.setColsForVertical(col);
            carrier1.setCordinationRowsForVertical(row);
            carrier1.setHorizontal(horizontal);
            int[] r =carrier1.getCordinationRowsForVertical();
            int c = carrier1.getColsForVertical();
            for (int i =0; i<5;i++)
            {
                battleshipShipBoardWithShipsSeen[r[i]][c] = ship;
            }
        }
        else if(horizontal == true)
        {
            carrier1.setCordinationColsForHorizontal(col);
            carrier1.setRowsForHorizontal(row);
            carrier1.setHorizontal(horizontal);
            int r =carrier1.getRowsForHorizontal();
            int[] c = carrier1.getCordinationColsForHorizontal();
            for (int i =0; i<5;i++)
            {
                battleshipShipBoardWithShipsSeen[r][c[i]] = ship;
            }
        }
    }
    public void UserPlacementForBattleShip(int row, int col, boolean horizontal)
    {
        if(horizontal == false)
        {
            battleship1.setColsForVertical(col);
            battleship1.setCordinationRowsForVerticalForUser(row);
            battleship1.setHorizontal(horizontal);
            int[] r =battleship1.getCordinationRowsForVertical();
            int c = battleship1.getColsForVertical();
            for (int i =0; i<4;i++)
            {
                battleshipShipBoardWithShipsSeen[r[i]][c] = ship;
            }
        }
        else if(horizontal == true)
        {
            battleship1.setCordinationColsForHorizontalForUser(col);
            battleship1.setRowsForHorizontal(row);
            battleship1.setHorizontal(horizontal);
            int r =battleship1.getRowsForHorizontal();
            int[] c = battleship1.getCordinationColsForHorizontal();
            for (int i =0; i<4;i++)
            {
                battleshipShipBoardWithShipsSeen[r][c[i]] = ship;
            }
        }
    }

    public void UserPlacementForSubMarine(int row, int col, boolean horizontal)
    {
        if(horizontal == false)
        {
            submarine1.setColsForVertical(col);
            submarine1.setCordinationRowsForVerticalForUser(row);
            submarine1.setHorizontal(horizontal);
            int[] r =submarine1.getCordinationRowsForVertical();
            int c = submarine1.getColsForVertical();
            for (int i =0; i<3;i++)
            {
                battleshipShipBoardWithShipsSeen[r[i]][c] = ship;
            }
        }
        else if(horizontal == true)
        {
            submarine1.setCordinationColsForHorizontalForUser(col);
            submarine1.setRowsForHorizontal(row);
            submarine1.setHorizontal(horizontal);
            int r =submarine1.getRowsForHorizontal();
            int[] c = submarine1.getCordinationColsForHorizontal();
            for (int i =0; i<3;i++)
            {
                battleshipShipBoardWithShipsSeen[r][c[i]] = ship;
            }
        }
    }

    public void UserPlacementForDestroyer(int row1, int col1, boolean horizontal)
    {
        if(horizontal == false)
        {
            destroyer1.setColsForVertical(col1);
            destroyer1.setCordinationRowsForVerticalForUser(row1);
            destroyer1.setHorizontal(horizontal);
            int[] r =destroyer1.getCordinationRowsForVertical();
            int c = destroyer1.getColsForVertical();
            for (int i =0; i<3;i++)
            {
                battleshipShipBoardWithShipsSeen[r[i]][c] = ship;
            }
        }
        else if(horizontal == true)
        {
            destroyer1.setCordinationColsForHorizontalForUser(col1);
            destroyer1.setRowsForHorizontal(row1);
            destroyer1.setHorizontal(horizontal);
            int r =destroyer1.getRowsForHorizontal();
            int[] c = destroyer1.getCordinationColsForHorizontal();
            for (int i =0; i<3;i++)
            {
                battleshipShipBoardWithShipsSeen[r][c[i]] = ship;
            }
        }
    }
    public void UserPlacementForPatrolBoat(int row1, int col1, boolean horizontal)
    {
        if(horizontal == false)
        {
            patrolBoat1.setColsForVertical(col1);
            patrolBoat1.setCordinationRowsForVerticalForUser(row1);
            patrolBoat1.setHorizontal(horizontal);
            int[] r =patrolBoat1.getCordinationRowsForVertical();
            int c = patrolBoat1.getColsForVertical();
            for (int i =0; i<2;i++)
            {
                battleshipShipBoardWithShipsSeen[r[i]][c] = ship;
            }
        }
        else if(horizontal == true)
        {
            patrolBoat1.setCordinationColsForHorizontalForUser(col1);
            patrolBoat1.setRowsForHorizontal(row1);
            patrolBoat1.setHorizontal(horizontal);
            int r =patrolBoat1.getRowsForHorizontal();
            int[] c = patrolBoat1.getCordinationColsForHorizontal();
            for (int i =0; i<2;i++)
            {
                battleshipShipBoardWithShipsSeen[r][c[i]] = ship;
            }
        }
    }
//********************************************************************************************************************************************************* */
    
    // here i created this method to check if its a hit or miss when we get the row and cols for the spot, this one for user.
    // i dont expect the user to be so dumb to choose the same spot twice, so there is no checking
    public void missHitSink(int row, int col)
    {
        if(battleshipShipBoardWithShipsSeen[row][col] == 'C')
        {
            battleshipShipBoardWithShipsNotSeen[row][col] = 'H';
            battleshipShipBoardWithShipsSeen[row][col] = 'H';
        }
        else if(battleshipShipBoardWithShipsSeen[row][col] == '-')
        {
            battleshipShipBoardWithShipsNotSeen[row][col] = 'M';
            battleshipShipBoardWithShipsSeen[row][col] = 'M';
        }
    }
    // here i created this method to check if its a hit or miss when we get the row and cols for the spot, this one for bot.
    // here i made sure that the bot will not choose the same spot twice, thats why i used while.
    public void missHitSinkForBot(int row, int col)
    {
        while(battleshipShipBoardWithShipsSeen[row][col] == 'M' || battleshipShipBoardWithShipsSeen[row][col] == 'H' || battleshipShipBoardWithShipsSeen[row][col] == 'S')
        {
            row =randy.nextInt(10);
            col = randy.nextInt(10);
        }
        if(battleshipShipBoardWithShipsSeen[row][col] == 'C')
        {
            battleshipShipBoardWithShipsNotSeen[row][col] = 'H';
            battleshipShipBoardWithShipsSeen[row][col] = 'H';
        }
        else if(battleshipShipBoardWithShipsSeen[row][col] == '-')
        {
            battleshipShipBoardWithShipsNotSeen[row][col] = 'M';
            battleshipShipBoardWithShipsSeen[row][col] = 'M';
        }

    }
    


    //####################################################################################################################################################################################################################################################
    // here Im cheking if there is a sink or not for the carrier in this method.
    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!! from line 448 to the last line in this class the methods are the same thing is just for diffrent types.
    public void chekingIfSinkCarrier(int row, int col)
    {
        if(carrier1.getHorizontal())
        {
            int[] tempCol = carrier1.getCordinationColsForHorizontal();
            int tempRow = carrier1.getRowsForHorizontal();
            int counter1 =0;
            for(int i = 0; i<5; i++)
            {
                if(battleshipShipBoardWithShipsSeen[tempRow][tempCol[i]] == 72)
                {
                    counter1= counter1 +1;

                }
            }
            if(counter1 == 5)
            {
                battleshipShipBoardWithShipsSeen[row][col] = 'S';
                battleshipShipBoardWithShipsNotSeen[row][col] = 'S';
            }
            counter1 =0;
                
        }
        else  if (carrier1.getHorizontal() == false)
        {
            int[] tempRow = carrier1.getCordinationRowsForVertical();
            int tempcal = carrier1.getColsForVertical();
            int counter1 =0;
            for(int i = 0; i<5; i++)
            {
                if(battleshipShipBoardWithShipsSeen[tempRow[i]][tempcal] == 72)
                {
                    counter1= counter1 +1;
                }
            }
            if(counter1 == 5)
            {
                battleshipShipBoardWithShipsSeen[row][col] = 'S';
                battleshipShipBoardWithShipsNotSeen[row][col] = 'S';

            }
            counter1 =0;
        }
    }
    public void chekingIfSinkDestroyer(int row, int col)
    {
        if(destroyer1.getHorizontal())
        {
            int[] tempCol = destroyer1.getCordinationColsForHorizontal();
            int tempRow = destroyer1.getRowsForHorizontal();
            int counter1 =0;
            for(int i = 0; i<tempCol.length; i++)
            {
                if(battleshipShipBoardWithShipsSeen[tempRow][tempCol[i]] == 72)
                {
                    counter1= counter1 +1;
                }
            }
            if(counter1 == 3)
            {
                battleshipShipBoardWithShipsSeen[row][col] = 'S';
                battleshipShipBoardWithShipsNotSeen[row][col] = 'S';
            }
            counter1 =0;
                
        }
        else  if (destroyer1.getHorizontal() == false)
        {
            int[] tempRow = destroyer1.getCordinationRowsForVertical();
            int tempcal = destroyer1.getColsForVertical();
            int counter1 =0;
            for(int i = 0; i<tempRow.length; i++)
            {
                if(battleshipShipBoardWithShipsSeen[tempRow[i]][tempcal] == 72)
                {
                    counter1= counter1 +1;
                }
            }
            if(counter1 == 3)
            {
                battleshipShipBoardWithShipsSeen[row][col] = 'S';
                battleshipShipBoardWithShipsNotSeen[row][col] = 'S';

            }
            counter1 =0;
        }
    }
    public void chekingIfSinkBattleShip(int row, int col)
    {
        if(battleship1.getHorizontal())
        {
            int[] tempCol = battleship1.getCordinationColsForHorizontal();
            int tempRow = battleship1.getRowsForHorizontal();
            int counter1 =0;
            for(int i = 0; i<tempCol.length; i++)
            {
                if(battleshipShipBoardWithShipsSeen[tempRow][tempCol[i]] == 72)
                {
                    counter1= counter1 +1;
                }
            }
            if(counter1 == 4)
            {
                battleshipShipBoardWithShipsSeen[row][col] = 'S';
                battleshipShipBoardWithShipsNotSeen[row][col] = 'S';
            }
            counter1 =0;
                
        }
        else  if (battleship1.getHorizontal() == false)
        {
            int[] tempRow = battleship1.getCordinationRowsForVertical();
            int tempcal = battleship1.getColsForVertical();
            int counter1 =0;
            for(int i = 0; i<tempRow.length; i++)
            {
                if(battleshipShipBoardWithShipsSeen[tempRow[i]][tempcal] == 72)
                {
                    counter1= counter1 +1;
                }
            }
            if(counter1 == 4)
            {
                battleshipShipBoardWithShipsSeen[row][col] = 'S';
                battleshipShipBoardWithShipsNotSeen[row][col] = 'S';

            }
            counter1 =0;
        }
    }

    public void chekingIfSinkSubMarin(int row, int col)
    {
        if(submarine1.getHorizontal())
        {
            int[] tempCol = submarine1.getCordinationColsForHorizontal();
            int tempRow = submarine1.getRowsForHorizontal();
            int counter1 =0;
            for(int i = 0; i<tempCol.length; i++)
            {
                if(battleshipShipBoardWithShipsSeen[tempRow][tempCol[i]] == 72)
                {
                    counter1= counter1 +1;
                }
            }
            if(counter1 == 3)
            {
                battleshipShipBoardWithShipsSeen[row][col] = 'S';
                battleshipShipBoardWithShipsNotSeen[row][col] = 'S';
            }
            counter1 =0;
                
        }
        else  if (submarine1.getHorizontal() == false)
        {
            int[] tempRow = submarine1.getCordinationRowsForVertical();
            int tempcal = submarine1.getColsForVertical();
            int counter1 =0;
            for(int i = 0; i<tempRow.length; i++)
            {
                if(battleshipShipBoardWithShipsSeen[tempRow[i]][tempcal] == 72)
                {
                    counter1= counter1 +1;
                }
            }
            if(counter1 == 3)
            {
                battleshipShipBoardWithShipsSeen[row][col] = 'S';
                battleshipShipBoardWithShipsNotSeen[row][col] = 'S';

            }
            counter1 =0;
        }
    }

    public void chekingIfSinkPatrolBoat(int row, int col)
    {
        if(patrolBoat1.getHorizontal())
        {
            int[] tempCol = patrolBoat1.getCordinationColsForHorizontal();
            int tempRow = patrolBoat1.getRowsForHorizontal();
            int counter1 =0;
            for(int i = 0; i<tempCol.length; i++)
            {
                if(battleshipShipBoardWithShipsSeen[tempRow][tempCol[i]] == 72)
                {
                    counter1= counter1 +1;
                }
            }
            if(counter1 == 2)
            {
                battleshipShipBoardWithShipsSeen[row][col] = 'S';
                battleshipShipBoardWithShipsNotSeen[row][col] = 'S';
            }
            counter1 =0;
                
        }
        else  if (patrolBoat1.getHorizontal() == false)
        {
            int[] tempRow = patrolBoat1.getCordinationRowsForVertical();
            int tempcal = patrolBoat1.getColsForVertical();
            int counter1 =0;
            for(int i = 0; i<tempRow.length; i++)
            {
                if(battleshipShipBoardWithShipsSeen[tempRow[i]][tempcal] == 72)
                {
                    counter1= counter1 +1;
                }
            }
            if(counter1 == 2)
            {
                battleshipShipBoardWithShipsSeen[row][col] = 'S';
                battleshipShipBoardWithShipsNotSeen[row][col] = 'S';

            }
            counter1 =0;
        }
    }
    //####################################################################################################################################################################################################################################################
}

