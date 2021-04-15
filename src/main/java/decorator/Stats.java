// Concrete class implementing Codeamon interface

package decorator;

public class Stats implements Codeamon {

    @Override
    public void create() {

        System.out.println("\nCreating a new Codeamon...");

    }

    @Override
    public void evolve() {

        System.out.println("Your Codeamon is evolving!");

    }

}
