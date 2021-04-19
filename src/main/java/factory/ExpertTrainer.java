package factory;
import java.util.Random;

public class ExpertTrainer implements Trainer {

    Codeamon[] codeamons;
    int money;
    int XP;


    public void create() {

        codeamons = new Codeamon[6];
        Random random = new Random();
        CharacterFactory factory = new CharacterFactory();
        String[] types = {"Fire", "Grass", "Water"};
        String type = "";
        money = 0;
        XP = 0;

        System.out.println("An expert Trainer is being created with 4 Codeamons:\n");

        System.out.println("-------------------------------");

        for(int i = 0; i < 4; i++) {

            type = types[random.nextInt(types.length)];

            codeamons[i] = factory.createCodeamon(type);
            codeamons[i].create();

        }

        System.out.println("-------------------------------\n");

    }

    public void capture() {

        Random random = new Random();
        String[] status = {"Successful", "Unsuccessful"};
        String attempt = status[random.nextInt(status.length)];
        int nullSpot = 0;

        for(int i = 0; i < codeamons.length; i++) {

            if(codeamons[i] == null) {

                nullSpot = i;

            }

        }

        if(nullSpot == 0) {

            System.out.println("This trainer has reached the maximum Codeamon limit of 6!");
            return;

        }

        System.out.println("*Is that... a Codeamon?!*\nAttempting to capture...\n");

        if("Successful".equals(attempt)) {

            XP += 10;
            CharacterFactory factory = new CharacterFactory();
            String[] types = {"Fire", "Grass", "Water"};
            String type = types[random.nextInt(types.length)];

            System.out.println("You successfully captured a new Codeamon!\n");

            System.out.println("-------------------------------");

            codeamons[nullSpot] = factory.createCodeamon(type);
            codeamons[nullSpot].create();

            System.out.println("-------------------------------\n");

        }else {

            System.out.println("Your capture attempt was unsuccessful! Better luck next time!\n");

        }

    }

}