package hw2;

public class MyArrayDataException extends IllegalArgumentException {
    public MyArrayDataException(int firstIndex, int secondIndex) {
        super("Невозможно преобразовать ячейку с индексом " + firstIndex + " " + secondIndex);
    }
}
