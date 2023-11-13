import koevasilev.exercise.Cycles;
import koevasilev.exercise.Function;
import koevasilev.exercise.MathClass;
import koevasilev.exercise.TwoDimensionalArr;
import koevasilev.notebook.Notepad;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        Cycles cyc = new Cycles();
        cyc.Forcycle();
        cyc.whilecycle();
        cyc.dowhile();
        cyc.foreach();
        Function equ = new Function();
        equ.DoFunc(2,20,2.2);

        TwoDimensionalArr twoDimensionalArr = new TwoDimensionalArr();
        twoDimensionalArr.Do();

 //       MathClass math = new MathClass();
   //     math.SolveEquation();
        System.out.println("Notepad start!");
        Notepad notepad = new Notepad();
        notepad.AddNote("Hello note");
        notepad.ShowNotes();
        notepad.AddNote("note 1");
        notepad.AddNote("note 2");
        notepad.AddNote("note 3");
        notepad.AddNote("note 4");
        notepad.EditNote(2,"Edited");
        notepad.ShowNotes();


    }
}