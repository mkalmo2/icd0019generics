package generics.list;

public class Wildcards {

    public static void main(String[] args) {

        Box<Number> box = new Box<>();

        // box = new Box<Integer>();
        // box = new Box<Double>();

        box.contents = 1;

        System.out.println(box.contents);
    }

    static class Box<T> {
        T contents;
    }

}
