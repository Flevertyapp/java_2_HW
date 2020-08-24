package lesson1;

public class Human implements SuperJumpaRannable {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Human " + name + " run");
    }

    @Override
    public void jump() {

    }

    @Override
    public void superJumpRun() {
        System.out.println("Human " + name + " run " + Treadmill.runDistance() + " meters");
        System.out.println("Human " + name + " jump " + Wall.jumpHeight() + " meters");
    }
}
