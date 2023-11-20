package koevasilev.exercise;

// Создайте массив целых чисел. Заполните его только четными числами,
// а затем каждый второй элемент умножьте на предыдущий. Используйте все варианты циклов.

public class Cycles {

    private final int[] mass = {2, 4, 6, 8, 10, 12, 14, 16};

    // for
    public void forCycle() {
        System.out.println("For cycle");
        for (int i = 0; i < mass.length; i++) {

            if (i % 2 != 0) {
                System.out.println(mass[i - 1] * mass[i]);
            }
        }
    }

    //while
    public void whileCycle() {
        System.out.println("while cycle");
        int j = 0;
        while (j < mass.length) {
            if (j % 2 != 0) {
                System.out.println(mass[j - 1] * mass[j]);
            }
            j++;
        }
    }

    //do..while
    public void doWhile() {
        System.out.println("do..while cycle");
        int k = 0;
        do {
            if (k % 2 != 0) {
                System.out.println(mass[k - 1] * mass[k]);
            }
            k++;
        } while (k < mass.length);
    }

    //for each
    public void foreach() {
        System.out.println("for each cycle");
        int count = 1;
        int j = 0;
        for (int var : mass) {
            switch (count) {
                case (1):
                    j = var;
                    count++;
                    break;
                case (2):
                    System.out.println(j * var);
                    count = 1;
                    break;
            }

        }
    }

}
