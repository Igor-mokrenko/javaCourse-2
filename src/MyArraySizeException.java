public class MyArraySizeException extends IllegalArgumentException {
    public MyArraySizeException(String validSize) {
        super("Массив недопустимого размера. Допустимый размер: " + validSize);
    }
}
