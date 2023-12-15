package Class91;

public class Main {
    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 8, 12, 17, 26, 32};
        double userInput = 15; // Значение, введенное пользователем

        try {
            findClosestSmallerNumber(sortedArray, userInput);
        } catch (InvalidInputException | EmptyArrayException | InputTooSmallException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void findClosestSmallerNumber(int[] array, double userInput) throws InvalidInputException, EmptyArrayException, InputTooSmallException{
        if (userInput < 0) {
            throw new InvalidInputException();
        }
        if (array.length == 0) {
            throw new EmptyArrayException();
        }
        if (userInput < array[0]) {
            throw new InputTooSmallException();
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] < userInput) {
                System.out.println("Closest smaller number in the array: " + array[i]);
                break;
            }
        }
    }
}