package koevasilev.notebook;

public class Notepad {
    public Notepad() {
    }
    Note notes = new Note();
    public void AddNote(String text){
        notes.AddNote(text);
    }
    public void EditNote(int id, String note){
        notes.EditNote(id,note);
    }
    public void ShowNotes(){
        notes.ShowNotes();
    }
}
