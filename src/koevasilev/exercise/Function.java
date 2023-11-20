package koevasilev.exercise;

public class Function {
    //Составить программу для вычисления значений функции F(x)=tg(2x)-3 на отрезке [a,b] с шагом h.
    // Результат представить в виде таблицы, первой столбец которой - значения аргумента, второй - соответствующие значения функции.

    public void doFunc(double a, double b, double h) {

        if (h < 1)
            System.out.println("Шаг должен быть больше 0");

        System.out.println("| Аргумент | x |");
        while (a <= b) {
            double x = Math.tan(a * 2) - 3;
            System.out.println("| " + a + " | " + x + " |");
            a += h;
        }
    }
}
