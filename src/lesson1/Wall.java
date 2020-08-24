package lesson1;

public class Wall {

    public Wall() {
    }

    public static int jumpHeight (){        //создаем рандомную высоту стены
        return  (int)(Math.random() *10);
    }
}
