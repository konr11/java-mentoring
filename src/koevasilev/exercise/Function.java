package koevasilev.exercise;

import java.util.ArrayList;

public class Function {
    //Составить программу для вычисления значений функции F(x)=tg(2x)-3 на отрезке [a,b] с шагом h.
    // Результат представить в виде таблицы, первой столбец которой - значения аргумента, второй - соответствующие значения функции.

    public void DoFunc(double a,double b,double h)
    {
        ArrayList<String> rez = new ArrayList<String>();
        ArrayList<Double> inp = new ArrayList<Double>();

        while (a <= b){
            inp.add(a);
            a += h;
        }
        for (Double val : inp){
            double x = Math.tan(val*2) - 3;
            rez.add("| "+ val +" | " + x + " |");
        }
        System.out.println("| Аргумент | x |");
        for (String val : rez){
            System.out.println(val);
        }


    }
}
