package koevasilev.notebook;

/**
 * Класс Заметки
 *
 * @author Константин Васильев
 * @version 1.0
 */
public class Note {
    /**
     * Конструктор - создание нового объекта Заметка
     *
     * @param id   Id заметки
     * @param text текст заметки
     */
    public Note(String text, int id) {
        this.note = text;
        this.Id = id;
    }

    /**
     * Поле заметка
     */
    private String note;
    /**
     * Поле Id заметки
     */
    private int Id = 0;

    /**
     * Функция преобразования объекта Note в String
     *
     * @return возвращает String: текст и Id заметки
     */
    @Override
    public String toString() {
        return "Note: " + note + " Id: " + Id;
    }

    /**
     * Запись в поле заметка
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * Получение значения поля Id
     *
     * @return возвращает Id заметки
     */
    public int getId() {
        return Id;
    }

}
