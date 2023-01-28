public class Room {
    private int num; // номер комнаты
    private int place; // спальные места
    private boolean reserved; // свободно или занято
    private int price;
    private boolean conditioner;
    private boolean bar;

    public Room(int num, int place, int price, boolean conditioner, boolean bar) {
        this.num = num;
        this.place = place;
        this.reserved = false;
        this.price = price;
        this.conditioner = conditioner;
        this.bar = bar;
    }

    public int getNum() {
        return num;
    }

    public int getPlace() {
        return place;
    }

    public int getPrice() {
        return price;
    }

    public boolean isConditioner() {
        return conditioner;
    }

    public boolean isBar() {
        return bar;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
}
