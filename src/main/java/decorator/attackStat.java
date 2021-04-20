// Concrete decorator class extending CodeamonDecorator

package decorator;

public class attackStat extends CodeamonDecorator {

    protected int attackValue;

    public attackStat(Codeamon codeamon, int attackValue) {

        super(codeamon);
        this.attackValue = attackValue;


    }

    @Override
    public void create() {

        codeamon.create();
        System.out.println("Attack Value: " + attackValue);

    }

    @Override
    public void evolve() {

        codeamon.evolve();
        attackValue = attackValue + 10;
        System.out.println("New Attack Value: " + attackValue);

    }

}
