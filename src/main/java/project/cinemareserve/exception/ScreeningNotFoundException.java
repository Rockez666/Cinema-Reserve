package project.cinemareserve.exception;

public class ScreeningNotFoundException extends RuntimeException {
    public ScreeningNotFoundException(String message) {
        super(message);
    }
}
