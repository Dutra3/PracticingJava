package generics;

public class Box<T> {

    private T something;

    public void save(T something) {
        this.something = something;
    }

    public T open() {
        return this.something;
    }
}
