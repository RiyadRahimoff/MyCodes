package exception;

public class NotCorrectCount extends RuntimeException {
    public NotCorrectCount(String message) {
        super((message));
    }
}
