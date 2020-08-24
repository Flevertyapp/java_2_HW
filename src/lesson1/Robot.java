package lesson1;

public class Robot implements SuperJumpaRannable{

    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Robot " + name + " run");
    }

    @Override
    public void jump() {

    }

    @Override
    public void superJumpRun() {
        System.out.println("Robot " + name + " run " + Treadmill.runDistance() + " meters");
        System.out.println("Robot " + name + " jump " + Wall.jumpHeight() + " meters");
    }
}
