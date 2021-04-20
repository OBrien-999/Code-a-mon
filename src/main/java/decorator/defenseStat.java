// Concrete decorator class extending CodeamonDecorator

package decorator;

public class defenseStat extends CodeamonDecorator {

    protected int defenseValue;

    public defenseStat(Codeamon codeamon, int defenseValue) {

        super(codeamon);
        this.defenseValue = defenseValue;

    }

    @Override
    public void create() {

        codeamon.create();
        System.out.println("Defense Value: " + defenseValue);

    }

    @Override
    public void evolve() {

        codeamon.evolve();
        defenseValue = defenseValue + 10;
        System.out.println("New Defense Value: " + defenseValue);

    }

}
