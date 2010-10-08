interface Duck {
    void quack();
    void fly();
}

class MigratoryDuck implements Duck {
    public void quack() {
        System.out.println("Quack!");
    }
    public void fly() {
        System.out.println("I'm flying to the south!");
    }
}

interface Chicken {
    void cocorico();
    void fly();
}

class CaipiraChicken implements Chicken {
    public void cocorico() {
        System.out.println("Cocoricó!");
    }
    public void fly() {
        System.out.println("My flying is shitty...");
    }
}

class ChickenAdapter implements Duck {
    private Chicken chicken;

    public ChickenAdapter(Chicken chicken) {
        this.chicken = chicken;
    }

    public void quack() {
        chicken.cocorico();
    }

    public void fly() {
        for (int i = 0; i < 10; i++)
            chicken.fly();
    }
}

public class JavaAdapter {
    public static void main(String[] args) {

    }
}

