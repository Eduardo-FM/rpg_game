package entities;

public class Monster {

    private Double lifePoints = 10.00;

    private Integer attack = 5;

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
