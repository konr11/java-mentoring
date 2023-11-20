import koevasilev.exercise.Cycles;
import koevasilev.exercise.Function;
import koevasilev.exercise.MathClass;
import koevasilev.exercise.TwoDimensionalArr;
import koevasilev.notebook.Notepad;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        Cycles cyc = new Cycles();
        cyc.forCycle();
        cyc.whileCycle();
        cyc.doWhile();
        cyc.foreach();
        Function equ = new Function();
        equ.doFunc(2, 20, 2);

        TwoDimensionalArr twoDimensionalArr = new TwoDimensionalArr();
        twoDimensionalArr.Do();

        MathClass math = new MathClass();
        math.SolveEquation();
        System.out.println("Notepad start!");
        Notepad notepad = new Notepad();
        notepad.addNote("Hello note");
        notepad.addNote("note 1");
        notepad.addNote("note 2");
        notepad.addNote("note 3");
        notepad.addNote("note 4");
        notepad.showNotes();
        System.out.println("Notepad with Edit:");
        notepad.editNote(2, "Edited");
        notepad.showNotes();


    }
}