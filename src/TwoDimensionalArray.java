/*
  Создайте класс TwoDimensionalArray и в нём напишите программу в которой:
  - создайте двумерный массив;
  - заполните двумерный массив случайными числами;
  - посчитайте сумму всех чисел в двумерном массиве.
 */
import java.util.Arrays;

class TwoDimensionalArray {
    public static void main(String[] args) {
        int n = (int) (Math.random()*(10-1+1)+1);
        int m = (int) (Math.random()*(10-1+1)+1);
        int [][] myArray = new int[n][m];

        TwoDimensionalArrayFill.fillArray(myArray);
        System.out.println(Arrays.deepToString(myArray));
        System.out.println(TwoDimensionalArrayFill.sumArray(myArray));

    }
}
