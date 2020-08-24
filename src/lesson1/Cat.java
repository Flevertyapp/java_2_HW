package lesson1;

public class Cat implements SuperJumpaRannable {

    private String name;
    private int maxRunDistance;

    public Cat(String name) {
        this.name = name;
        maxRunDistance = 200;
    }

    @Override
    public void run() {
        if (Treadmill.runDistance() > maxRunDistance){  //4* - не проверяет условие!
            System.out.println("Cats can run a maximum 200 meters!!!" + Treadmill.runDistance());
            //return;
        } else {
            System.out.println("Cat " + name + " run " + Treadmill.runDistance() + " meters");
        }
    }

    @Override
    public void jump() {
        System.out.println("Cat " + name + " jump " + " meters");
    }

    @Override
    public void superJumpRun() {
        System.out.println("Cat " + name + " run " + Treadmill.runDistance() + " meters");
        System.out.println("Cat " + name + " jump " + Wall.jumpHeight() + " meters");
    }
}
