package entities;

public class Player {

    private String name;

    private Double lifePoints = 10.00;

    private Integer attack = 7;


    public String getName() {
        return name;
    }

    public Double getLifePoints() {
        return lifePoints;
    }

    public Integer getAttack() {
        return attack;
    }

    public Player(String name) {
        this.name = name;
    }
}
