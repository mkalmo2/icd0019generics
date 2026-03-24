package generics.wildcards;

public class Main {

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();

        intBox.put(10);

        Box<? extends Number> mysteryBox = intBox;
        // box of number but which numbers is not know

        Number number = mysteryBox.get();
        // we can take out numbers

        // mysteryBox.put(11); // Does not compile!
        // Required type: capture of ? extends Number
        // Provided: int
        // public void put(T item) { ...
        // public void put(? extends Number item) { ...

    }
}
