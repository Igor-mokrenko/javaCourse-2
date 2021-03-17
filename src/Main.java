
public class Main {

    public static void main(String[] args) {
        String[][] array = {
                {"22", "17", "10", "2"},
                {"31", "6", "55", "80"},
                {"99", "5", "3", "9"},
                {"68", "76", "34", "81"},
        };

        String[][] invalidSizeArray = {
                {"22", "17", "10", "2"},
                {"31", "6", "55", "80"},
                {"99", "5", "3", "9"},
                {"68", "76"},
        };

        String[][] invalidDataArray = {
                {"22", "17", "10", "2"},
                {"31", "6", "55", "80"},
                {"99", "5", "3asdf", "9"},
                {"68", "76", "34", "81"},
        };

        start(array);
        start(invalidSizeArray);
        start(invalidDataArray);
    }

    static void start(String[][] array) {
        try {
            Utils.isValidArrLength(array, 4);
            System.out.println("Сумма: " + Utils.getSum(array));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}
