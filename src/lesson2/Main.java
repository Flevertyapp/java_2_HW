package lesson2;

import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) {

        String [][] arr = {
                {"1", "15", "7", "5"},
                {"4", "8", "1", "23"},
                {"3", "0", "9", "1"},
                {"2", "0", "8", "11"}
        };
        try {
            checkArray(arr);
        } catch (MyArraySizeException e){
            System.out.println("Неверный размер массива");
        };
        System.out.println("End");

    }



    private static int checkArray(String[][] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                result += Integer.parseInt(arr[i][j]);
            }
        }
        System.out.println(result + " Final result");
        return result;
    }
}
