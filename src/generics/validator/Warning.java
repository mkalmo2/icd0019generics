package generics.validator;

public final class Warning extends Issue {
    public Warning(String msg) { super("[WARNING] " + msg); }
}