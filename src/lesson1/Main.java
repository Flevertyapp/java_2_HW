package lesson1;

public class Main {
    public static void main(String[] args) {

        SuperJumpaRannable [] team = {  //массив участников
                new Cat("Boris"),
                new Cat("Vasya"),
                new Human("Polikarp"),
                new Robot("Bender")
        };

        int [] course = {   //массив препятствий
          Wall.jumpHeight(),
          Treadmill.runDistance(),
          Wall.jumpHeight(),
          Treadmill.runDistance(),
        };

        for (int value : course) {  //вывод препятствий для себя
            System.out.println(value);
        }

        for (SuperJumpaRannable superJumpaRannable : team) {
            superJumpaRannable.superJumpRun();
        }


/*        for (SuperJumpaRannable s: team
             ) {
            s.superJumpRun();
        }*/

    }
}
