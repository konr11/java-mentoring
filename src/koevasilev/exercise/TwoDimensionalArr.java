package koevasilev.exercise;

//Создать двумерный массив 5х8.
// Найти максимальное и минимальное значения в каждой "строке" и записать эти значения в двумерный массив 5х2.
// Вывести на экран оба массива.
public class TwoDimensionalArr {
    private int[][] inputs = {
                                {5, 3, 5, 1, 19, 15, 13, 2},
                                {1, 4, 7, 17, 91, 11, 6, 33},
                                {6, 3, 2, 7, 2, 11, 54, 14},
                                {23, 1, 5, 71, 31, 11, 12, 2},
                                {1, 13, 15, 4, 41, 2, 13, 15}
                             };
    private int[][] rez = new int[2][5];
    public void Do()
    {
        int big = 0;
        int small = 0;
        int ii = 0;
        int jj = 0;
        for (int i = 0; i < 5;i++)
        {
            for (int j = 0;j < 8; j++)
            {
                if (j == 0){
                    small = inputs[i][j];
                    big = inputs[i][j];
                }
                if (inputs[i][j] < small)
                    small = inputs[i][j];
                if (inputs[i][j] > big)
                    big = inputs[i][j];
            }
            rez[ii][jj] =  big;
            ii++;
            rez[ii][jj] = small;
            ii = 0;
            jj++;
        }
        System.out.println("Input arr");
        for (int i =0;i < 5;i++){
            for (int j = 0;j < 8;j++){
                System.out.print(inputs[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Rez arr");
        for (int x =0;x < 2;x++){
            for (int y = 0;y < 5;y++){
                System.out.print(rez[x][y] + " ");
            }
            System.out.println();
        }
    }

}
