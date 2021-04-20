package factory;

import factory.Codeamon;

public class GrassCodeamon implements Codeamon {

    int attack;
    int defense;
    int health;
    String attackType;
    int attackDamage;

    public void create() {

        System.out.println("\nA grass Codeamon is being created with the stats: ");

        attack = 40;
        defense = 60;
        health = 110;
        attackType = "Rootquake";
        attackDamage = 25;

        System.out.println("Attack: " + attack + "\nDefense: " + defense + "\nHealth: " + health);
        System.out.println("Specialty: " + attackType + " (" + attackDamage + " dmg)\n");

    }

}