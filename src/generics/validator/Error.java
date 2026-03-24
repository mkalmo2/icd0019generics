package generics.validator;

public final class Error extends Issue {
    public Error(String msg) {
        super("[ERROR] " + msg);
    }
}