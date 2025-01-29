package entities;

public class Character {

    private Double lifePoints;

    private Integer attack;

    public Character(Double lifePoints, Integer attack) {
        this.lifePoints = lifePoints;
        this.attack = attack;
    }

    public Double getLifePoints() {
        return lifePoints;
    }

    public Integer getAttack() {
        return attack;
    }

    public void lifeDemage(Integer enemyAttackPoints) {
        this.lifePoints -= enemyAttackPoints;
    }
}
