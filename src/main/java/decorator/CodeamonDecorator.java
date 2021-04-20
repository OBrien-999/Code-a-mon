// Abstract decorator class implementing Codeamon interface

package decorator;

public abstract class CodeamonDecorator implements Codeamon {

    protected Codeamon codeamon;

    public CodeamonDecorator(Codeamon codeamon) {

        super();
        this.codeamon = codeamon;

    }

    public void create() {

        codeamon.create();

    }

    public void evolve() {

        codeamon.evolve();

    }

}