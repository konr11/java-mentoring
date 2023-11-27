package koevasilev.notebook;

/**
 * Класс Блокнот
 *
 * @author Константин Васильев
 * @version 1.0
 */
public class Notepad {

    /**
     * Переменная для генерации Id
     */
    private int IdCount = 1;
    /**
     * Массив с объектами заметок
     */
    private Note[] NoteArr = new Note[0];

    /**
     * Функция создания заметки
     *
     * @param text текст заметки
     */
    public void addNote(String text) {
        Note[] NewArr = new Note[IdCount];
        if (NoteArr.length > 0) {
            for (int i = 0; i < NoteArr.length; i++) {
                NewArr[i] = NoteArr[i];
            }
        }
        NewArr[IdCount - 1] = new Note(text, IdCount);
        NoteArr = NewArr;
        IdCount++;
    }

    /**
     * Функция редактирования заметки
     *
     * @param note измененный текст заметки
     * @param id   Id редактируемой заметки
     */
    public void editNote(int id, String note) {
        for (Note row : NoteArr) {
            if (row.getId() == id)
                row.setNote(note);
        }
    }

    /**
     * Функция выводит в консоль все заметки и их Id
     */
    public void showNotes() {
        for (Note row : NoteArr) {
            System.out.println(row);
        }
    }
}
