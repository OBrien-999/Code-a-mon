import mediator.*;
import decorator.*;
import factory.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n== BEGIN DECORATOR PATTERN TESTING ==\n");

        // Initiate first decorated mon stats
        Stats first = new Stats();
        attackStat x = new attackStat(first, 60);
        defenseStat y = new defenseStat(x, 40);
        healthStat z = new healthStat(y, 85);

        // Initiate second decorated mon stats
        Stats second = new Stats();
        attackStat a = new attackStat(second, 50);
        defenseStat b = new defenseStat(a, 40);
        healthStat c = new healthStat(b, 100);

        // Create first mon
        decorator.Codeamon mon1 = z;
        mon1.create();

        // Create second mon
        decorator.Codeamon mon2 = c;
        mon2.create();

        // Initiate world
        decorator.World.initiateWorld(mon1, mon2);

        System.out.println("\n== BEGIN FACTORY PATTERN TESTING ==\n");



        System.out.println("\n== BEGIN MEDIATOR PATTERN TESTING ==\n");




    }

}