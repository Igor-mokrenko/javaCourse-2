package hw2;

public class Utils {

    public static boolean isValidArrLength(String[][] array, int validLength) throws MyArraySizeException {
        String validSize = validLength + "x" + validLength;
        if (array.length != validLength) {
            throwMyArraySizeException(validSize);
            return false;
        }

        for (String[] strings : array) {
            if (strings.length != validLength) {
                throwMyArraySizeException(validSize);
                return false;
            }
        }

        return true;
    }

    private static void throwMyArraySizeException(String validSize) throws MyArraySizeException {
        throw new MyArraySizeException(validSize);
    }

    public static int getSum(String[][] array) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
