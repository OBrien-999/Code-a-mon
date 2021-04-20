package mediator;

public class Mediator {

    private volatile boolean slotFull = false;

    public synchronized void battle(Data attacker, Data defender) {

        while(slotFull == true) {

            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }

        slotFull = true;
        notify();

        String mon1type = attacker.codeamon.type;
        String mon2type = defender.codeamon.type;
        double mon1attack = attacker.codeamon.attack;
        double mon2attack = defender.codeamon.attack;
        double mon1defense = attacker.codeamon.defense;
        double mon2defense = defender.codeamon.defense;
        double mon1health = attacker.codeamon.health;
        double mon2health = defender.codeamon.health;
        double damage = 0;

        System.out.println("\nA NEW CHALLENGER HAS APPROACHED!");
        System.out.println("--------------------------------------------------------\n");

        System.out.println("The weather today is RAINY.\n");

        mon1defense = mon1defense * .25;
        mon2attack = mon2attack * 1.25;

        while(true) {

            damage =  (mon2attack / 6) - (mon1defense / 10);
            mon1health = mon1health - damage;

            System.out.println(defender.name + "'s Codeamon dealt " + damage + " damage against " + attacker.name + "'s Codeamon!");
            System.out.println(attacker.name + "'s Codeamons health: " + mon1health);

            if(mon1health <= 0) {

                System.out.println(attacker.name + "'s Codeamon won!");
                attacker.XP += 20;
                attacker.money += 100;
                break;

            }

            damage = (mon1attack / 6) - (mon2defense / 10);
            mon2health = mon2health - damage;

            System.out.println(attacker.name + "'s Codeamon dealt " + damage + " damage against " + defender.name + "'s Codeamon!");
            System.out.println(defender.name + "'s Codeamons health: " + mon2health);

            if(mon2health <= 0) {

                System.out.println(defender.name + "'s Codeamon won!");
                defender.XP += 20;
                defender.money += 100;
                break;

            }

        }

        System.out.println("\n--------------------------------------------------------");

    }

    public synchronized void shop(Data trainer1, Data trainer2) {

        while(slotFull == false) {

            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }

        slotFull = false;
        notify();


            System.out.println("\nTHE SHOP IS OPEN!");
            System.out.println("--------------------------------------------------------\n");

            if (trainer1.money >= 50) {

                System.out
                    .println(trainer1.name + " purchased a health upgrade for their Codeamon!");
                trainer1.codeamon.health = trainer1.codeamon.health + 10;
                trainer1.money = trainer1.money - 50;
                System.out.println("New Codeamon health: " + trainer1.codeamon.health);

            } else {

                System.out.println(trainer1.name +
                    " did not have enough money to purchase a health upgrade for their Codeamon.");

            }

            if (trainer2.money >= 50) {

                System.out
                    .println(trainer2.name + " purchased a health upgrade for their Codeamon!");
                trainer2.codeamon.health = trainer2.codeamon.health + 10;
                trainer2.money = trainer2.money - 50;
                System.out.println("New Codeamon health: " + trainer2.codeamon.health);

            } else {

                System.out.println(trainer2.name +
                    " did not have enough money to purchase a health upgrade for their Codeamon.");

            }

            System.out.println("--------------------------------------------------------\n");

    }

}