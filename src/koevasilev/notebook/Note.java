package koevasilev.notebook;

public class Note {
    public Note() {
    }
    private static String notes[] = new String[0];
    public void AddNote(String text){
        int i = notes.length;
        String NewNote[] = new String[i + 1];
        for (int k=0 ;k < i;k++){
            NewNote[k] = notes[k];
        }
        NewNote[i] = text;
        notes = NewNote;
    }
    public void EditNote(int id, String note){
        String NewNote[] = notes;
        NewNote[id] = note;
        notes = NewNote;
    }
    public void ShowNotes(){
        System.out.println("Note list:");
        for (String val : notes){
            System.out.println(val);
        }
    }
}
