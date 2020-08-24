package lesson1;

import java.util.Random;

public class Treadmill {
    public Treadmill() {
    }

    public static int runDistance(){ // создаем рандомную дистанцию для бега
        return (int)(Math.random()*500);
    }
}
