package entities;

public class Player extends Character{

    private String name;

    public Player(String name) {
        super(10.00, 7);
        this.name = name;
    }

    public String getName() {
        return name;
    }



}
