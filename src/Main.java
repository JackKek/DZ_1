//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        methods Func = new methods();

        Func.printThreeWords();
        Func.checkSumSign();
        Func.printColor();
        Func.compareNumbers();
        boolean result = Func.checkSum(5, 6);
        Func.printNumberSign(10);
        boolean result_1 = Func.isNegative(-10);
        Func.printStringMultiple("biboran", 5);
        System.out.println(Func.isLeapYear(2000));
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        Func.swapEl(arr);
        int[] myArray = Func.fillArray();
        int[][] myArray_1 = Func.fillDiagonal(5);
        int[] myArray_2 = Func.createArray(5, 42);
    }

}
