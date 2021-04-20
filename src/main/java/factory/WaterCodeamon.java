package factory;

import factory.Codeamon;

public class WaterCodeamon implements Codeamon {

    int attack;
    int defense;
    int health;
    String attackType;
    int attackDamage;

    public void create() {

        System.out.println("\nA water Codeamon is being created with the stats: ");

        attack = 50;
        defense = 50;
        health = 100;
        attackType = "Tidal wave";
        attackDamage = 20;

        System.out.println("Attack: " + attack + "\nDefense: " + defense + "\nHealth: " + health);
        System.out.println("Specialty: " + attackType + " (" + attackDamage + " dmg)\n");

    }

}