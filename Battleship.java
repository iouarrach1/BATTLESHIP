//Ibrahim Ouarrach
// this is the BattleShip class which extand the ship class but with getters and setters methods and the size is of the ship is 4.
// also here where wwe store the cordination of the ship, which we used if its a sink or not.

public class Battleship extends Ship{
    private int[] cordinationRowsForVertical = new int[4];
    private int[] cordinationColsForHorizontal = new int[4];
    private int colsForVertical;
    private int rowsForHorizontal;
    private boolean horizontal ;
    public Battleship()
    {
        super("Battleship", 4);
    }








    public boolean getHorizontal()
    {
        return horizontal;
    }
    public int getColsForVertical() {
        return colsForVertical;
    }
    public int[] getCordinationColsForHorizontal() {
        return cordinationColsForHorizontal;
    }
    public int[] getCordinationRowsForVertical() {
        return cordinationRowsForVertical;
    }
    public int getRowsForHorizontal() {
        return rowsForHorizontal;
    }
    @Override
    public String getShipType() {
        // TODO Auto-generated method stub
        return super.getShipType();
    }
    @Override
    public int getSize() {
        // TODO Auto-generated method stub
        return super.getSize();
    }








    
    public void setColsForVertical(int col) {
        this.colsForVertical = col;
    }
    public void setRowsForHorizontal(int row) {
        this.rowsForHorizontal = row;
    }
    public void setCordinationColsForHorizontalForRandom(int col) {
        for(int i =0; i<cordinationColsForHorizontal.length; i++)
        {
            cordinationColsForHorizontal[i] = col;
            col--;
        }
    }
    public void setCordinationRowsForVerticalForRandom(int row) {
        for(int i =0; i<cordinationRowsForVertical.length; i++)
        {
            cordinationRowsForVertical[i] = row;
            row--;
        }
    }
    public void setCordinationColsForHorizontalForUser(int col) {
        for(int i =0; i<cordinationColsForHorizontal.length; i++)
        {
            cordinationColsForHorizontal[i] = col;
            col++;
        }
    }
    public void setCordinationRowsForVerticalForUser(int row) {
        for(int i =0; i<cordinationRowsForVertical.length; i++)
        {
            cordinationRowsForVertical[i] = row;
            row++;
        }
    }
    public void setHorizontal(boolean horizontal) {
        this.horizontal = horizontal;
    }
    @Override
    public void setShipType(String shipType) {
        // TODO Auto-generated method stub
        super.setShipType(shipType);
    }
    @Override
    public void setSize(int size) {
        // TODO Auto-generated method stub
        super.setSize(size);
    }

}
