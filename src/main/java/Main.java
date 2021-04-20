import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
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
        World.initiateWorld(mon1, mon2);

        System.out.println("\n== BEGIN FACTORY PATTERN TESTING ==\n");

        // Creating a new factory builder
        CharacterFactory factory = new CharacterFactory();

        // Creating a beginner trainer
        factory.Trainer beginner = factory.createTrainer("Beginner");
        beginner.create();

        // Creating an expert trainer
        factory.Trainer expert = factory.createTrainer("Expert");
        expert.create();

        // Beginner trainer attempting to capture new Codeamons
        beginner.capture();
        beginner.capture();
        beginner.capture();

        // Expert trainer attempting to capture new Codeamons
        expert.capture();
        expert.capture();
        expert.capture();

        System.out.println("\n== BEGIN MEDIATOR PATTERN TESTING ==\n");

        // Printing trainer stats
        Data.print(Data.Hannah);
        Data.print(Data.Brandon);

        // Creating thread task list and initializing the world
        List<Thread> taskList = new ArrayList<>();
        Mediator mediator = new Mediator();
        taskList.add(new Thread(new Battle(mediator)));
        taskList.add(new Thread(new Shop(mediator)));
        taskList.add(new Thread(new Battle(mediator)));
        taskList.add(new Thread(new Shop(mediator)));

        for(Thread t : taskList) {

            t.start();

        }

        AtomicInteger counter = new AtomicInteger(0);
        boolean stop = false;

        while(!stop) {

            if(counter.get() == 150) {

                stop = true;
                for (Thread t : taskList) {

                    t.interrupt();

                }

            }

            counter.getAndIncrement();

        }

    }

}