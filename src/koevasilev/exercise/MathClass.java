package koevasilev.exercise;

import java.util.Scanner;

//Написать программу для решения квадратного уравнения ax^2+bx+c=0. Константы a,b,c вводятся пользователем с клавиатуры.
public class MathClass {
    Scanner in = new Scanner(System.in);

    public void SolveEquation() {
        double a, b, c;
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println(" Уравнение имеет 1 корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет действительных кореней!");
        }
    }

}
