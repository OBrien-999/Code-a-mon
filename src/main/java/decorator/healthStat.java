// Concrete decorator class extending CodeamonDecorator

package decorator;

public class healthStat extends CodeamonDecorator {

    protected int healthValue;

    public healthStat(Codeamon codeamon, int healthValue) {

        super(codeamon);
        this.healthValue = healthValue;

    }

    @Override
    public void create() {

        codeamon.create();
        System.out.println("Health Value: " + healthValue);

    }

    @Override
    public void evolve() {

        codeamon.evolve();
        healthValue = healthValue + 10;
        System.out.println("New Health Value: " + healthValue);

    }

}
