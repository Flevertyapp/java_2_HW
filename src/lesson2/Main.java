
package lesson2;

public class Main {
    static int SIZE = 4;
    public static void main(String[] args) {

        String [][] arr = {
                {"1", "15", "9", "5"},
                {"4", "8", "1", "23"},
                {"3", "0", "9", "1"},
                {"2", "7", "8", "11"}
        };
        try {
            System.out.println(checkArray(arr));
        } catch (MyArraySizeException e){
            e.printStackTrace();
            System.out.println("Неверный размер массива");
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println("Этот элемент не является числом " + e.getCol() + " " + e.getRow());
        }
        System.out.println("End");

    }



    static int checkArray(String[][] arr) throws MyArraySizeException, MyArrayDataException{

       int result = 0;
        if (arr.length != SIZE){ //проверка количества строк
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != SIZE){ //проверка длины строки
                throw new MyArraySizeException();
            } else {
                for (int j = 0; j < arr.length; j++) {
                    try {
                        result += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("Неверные данные в ячейке " + i + " " + j, i, j);
                    }
                }
            }
        }
        System.out.println(result + " Final result");
        return result;}
    }


