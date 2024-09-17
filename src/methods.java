public class methods
{
    public void printThreeWords()   //1
    {

        System.out.println ("Orange");
        System.out.println ("Banana");
        System.out.println ("Apple");
    }


    public void checkSumSign()   //2
    {
        int a = 10;
        int b = -8;
        if (a + b >= 0)
        {
            System.out.println("Сумма положительная");
        }
        else
        {
            System.out.println("Сумма отрицательная");
        }
    }

    public void printColor(){     //3

        int value = 50;
        if (value <= 0)
        {
            System.out.println("Красный");
        }
        else if ((value > 0) && (value <= 100))
        {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }


    public void compareNumbers() //4
    {
        int a = 5;
        int b = 20;

        if (a >= b)
        {
            System.out.println("а >= b");
        }
        else
        {
            System.out.println("а < b");
        }
    }


    public boolean checkSum(int a, int b)   //5
    {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }


    public void printNumberSign(int number)  //6
    {
        if (number >= 0)
        {
            System.out.println("Число положительное");
        }
        else
        {
            System.out.println("Число отрицательное");
        }
    }

    public boolean isNegative(int number)   //7
    {
        return number < 0;
    }


    public void printStringMultiple(String str, int count)   //8
    {
        for (int i = 0; i < count; i++)
        {
            System.out.println(str);
        }
    }


    public boolean isLeapYear(int year)  //9
    {
        if (year % 400 == 0)
        {
            return true;
        }

        else if (year % 100 == 0)
        {
            return false;
        }
        else
        {
            return year % 4 == 0;
        }
    }


    public void swapEl(int[] arr)   //10
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 0)
            {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }


    public int[] fillArray() //11
    {
        int[] arr = new int[100];
        int a = 1;
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = a;
            a++;
        }
        return arr;
    }


    public int[] multiplyByTwo(int[] arr)   //12
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < 6)
            {
                arr[i] *= 2;
            }
        }
        return arr;
    }

    public int[][] fillDiagonal(int size)    //13
    {
        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++)
        {
            arr[i][i] = 1;
        }

        return arr;
    }

    public int[] createArray(int len, int initialValue)  //14
    {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++)
        {
            arr[i] = initialValue;
        }
        return arr;
    }
}
