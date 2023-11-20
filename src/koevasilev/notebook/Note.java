package koevasilev.notebook;

/**
 * Класс Заметки
 * @autor Константин Васильев
 * @version 1.0
 */
public class Note {
    /**
     * Конструктор - создание нового объекта Заметка
     */
    public Note(String text, int id) {
        this.note = text;
        this.Id = id;
    }
    /** Поле заметка */
    private String note;
    /** Поле Id заметки */
    private int Id = 0;

    @Override
    public String toString() {
        return "Note: " + note + " Id: " + Id;
    }

    /** Запись в поле заметка */
    public void setNote(String note) {
        this.note = note;
    }
    /** Получение значения поля Id */
    public int getId() {
        return Id;
    }

}
