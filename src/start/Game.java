package start;

import entities.Monster;
import entities.Monsters;
import entities.Player;

import java.util.Scanner;

public abstract class Game {

    public static void start(){
        Player player = Player.createPlayer();
        Monster monster = Monster.createMonster();
        Monsters monsters = new Monsters();
        monsters.createMonsters();

        while (monster.getLifePoints() > 0){
            playerOptions();
            Scanner scanner = new Scanner(System.in);
            Integer action = scanner.nextInt();

            switch (action){
                case (0):
                    //todo
                    break;
                case (1):
                    battle(player, monster);
                    break;

            }
        }

        System.out.println("You have beet your enemy and survive");
    }

    private static void playerOptions() {
        System.out.println("""
                    Choose your action:
                    0 - run
                    1 - attack
                    """);
    }

    private static void battle(Player player, Monster monster){
        if (monster.getLifePoints() != 0) {
            monster.lifeDemage(player.getAttack());
            System.out.println("Monster life points " + monster.getLifePoints());
            player.lifeDemage(monster.getAttack());
            System.out.println("Player life points " + player.getLifePoints());
        } else {
            System.out.println("The monster was destroy");
        }
    }
}
