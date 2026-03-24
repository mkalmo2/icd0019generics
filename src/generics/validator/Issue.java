package generics.validator;

public sealed class Issue permits Warning, Error {

    public String message;

    public Issue(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
