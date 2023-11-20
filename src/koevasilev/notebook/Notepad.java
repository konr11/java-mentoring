package koevasilev.notebook;

public class Notepad {
    //Спроектировать и разработать классы Запись в блокноте и Блокнот (записи блокнота хранятся в массиве).
    // Реализовать методы: Добавить запись, Редактировать запись, Посмотреть все записи. Написать для данного кода javadoc-документацию
    /**
     * Класс Блокнот
     * @autor Константин Васильев
     * @version 1.0
     */
    public Notepad() {
    }
    /** Переменная для генерации Id*/
    private int IdCount = 1;
    /** Массив с объектами заметок */
    private Note[] NoteArr = new Note[0];

    /**
     * Функция создания заметки
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
