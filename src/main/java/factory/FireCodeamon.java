package factory;

import factory.Codeamon;

public class FireCodeamon implements Codeamon {

    int attack;
    int defense;
    int health;
    String attackType;
    int attackDamage;

    public void create() {

        System.out.println("\nA fire Codeamon is being created with the stats:");

        attack = 60;
        defense = 40;
        health = 90;
        attackType = "Fireball";
        attackDamage = 30;

        System.out.println("Attack: " + attack + "\nDefense: " + defense + "\nHealth: " + health);
        System.out.println("Specialty: " + attackType + " (" + attackDamage + " dmg)\n");

    }

}