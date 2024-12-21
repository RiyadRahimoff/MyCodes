package bankaccounttask.exceptionforbanksys;

public class InsufficientAmount extends RuntimeException {
    public InsufficientAmount(String message) {
        super(message);
    }
}
