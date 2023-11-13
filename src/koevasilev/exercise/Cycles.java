package koevasilev.exercise;

// Создайте массив целых чисел. Заполните его только четными числами,
// а затем каждый второй элемент умножьте на предыдущий. Используйте все варианты циклов.

public class Cycles {

    private int[] mass = {2,4,6,8,10,12,14,16};
    private int count = 1;
    // for
    public void Forcycle(){
        System.out.println("For cycle");
        for (int i = 0; i < mass.length; i++) {

            if (count == 2){
                System.out.println(mass[i-1]*mass[i]);
                count = 1;
                return;
            } else {
                count++;
            }
        }
    }

    //while
    public void whilecycle(){
        System.out.println("while cycle");
        count =1;
        int j = 0;
        while (j < mass.length){
            if (count == 2){
                System.out.println(mass[j-1]*mass[j]);
                count = 1;
            } else {
                count++;
            }
            j++;
        }
    }

    //do..while
    public void dowhile()
    {
        System.out.println("do..while cycle");
        count =1;
        int k = 0;
        do {
            if (count == 2){
                System.out.println(mass[k-1]*mass[k]);
                count = 1;
            } else {
                count++;
            }
            k++;
        } while (k < mass.length);
    }

    //for each
    public void foreach()
    {
        System.out.println("for each cycle");
        count =1;
        int j = 0;
        for (int var: mass){
            switch (count){
                case (1):
                    j = var;
                    count++;
                    break;
                case (2):
                    System.out.println(j*var);
                    count=1;
                    break;
            }

        }
    }

}
