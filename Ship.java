//ibrahim Ouarrach
// this is the abstarct class that we used with the other ship classes.

public abstract class Ship {
    private int size;
    private String shipType;

    public Ship(String shipType, int size)
    {
       setShipType(shipType);
       setSize(size);
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getShipType() {
        return shipType;
    }
    public int getSize() {
        return size;
    }
}
