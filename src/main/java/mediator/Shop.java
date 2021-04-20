package mediator;

public class Shop implements Runnable {

    private Mediator mediator;

    public Shop(Mediator mediator) {

        this.mediator = mediator;

    }

    @Override
    public void run() {

        while(!Thread.currentThread().isInterrupted()) {

            mediator.shop(Data.Hannah, Data.Brandon);

        }

    }

}
