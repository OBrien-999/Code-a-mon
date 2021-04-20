package mediator;

public enum Data {

    Hannah(Codeamons.c1, 0, 0, "Hannah"),
    Brandon(Codeamons.c2, 0, 0, "Brandon");

    public Codeamon codeamon;
    public int XP;
    public int money;
    public String name;

    Data(Codeamon codeamon, int XP, int money, String name) {

        this.codeamon = codeamon;
        this.XP = XP;
        this.money = money;
        this.name = name;

    }

    public static class Codeamons {

        public static mediator.Codeamon c1 = new mediator.Codeamon("Fire", 60, 40, 90);
        public static mediator.Codeamon c2 = new mediator.Codeamon("Water", 50, 40, 100);

    }

    public static void print(Data trainer) {

        System.out.println("\n-------------------------------------------------------------");
        System.out.println("Trainer's Name: " + trainer.name + "\n" + trainer.name + "'s Stats: " + trainer.XP + " XP, " + trainer.money + " coins");
        System.out.println(trainer.name + "'s Codeamon Type: " + trainer.codeamon.type);
        System.out.println(trainer.name + "'s Codeamon Stats: " + trainer.codeamon.attack + " attack, " + trainer.codeamon.defense + " defense, "
            + trainer.codeamon.health + " health.");
        System.out.println("-------------------------------------------------------------");

    }

}
