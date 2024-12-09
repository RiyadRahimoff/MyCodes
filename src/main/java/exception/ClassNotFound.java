package exception;

public class ClassNotFound extends RuntimeException{
    public ClassNotFound(String message){
        super(message);
    }
}
