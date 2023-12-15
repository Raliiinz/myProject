package Class91;

public class InputTooSmallException extends Exception {
    public InputTooSmallException() {
        super("Input is smaller than the minimum value in the array");
    }
}
