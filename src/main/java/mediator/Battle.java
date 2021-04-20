package mediator;

public class Battle implements Runnable {

    private Mediator mediator;

    public Battle(Mediator mediator) {

        this.mediator = mediator;

    }

    @Override
    public void run() {

        while(!Thread.currentThread().isInterrupted()) {

            mediator.battle(Data.Hannah, Data.Brandon);

        }

    }

}
