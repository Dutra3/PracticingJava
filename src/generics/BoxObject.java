package generics;

public class BoxObject {

    private Object something;

    public void save(Object something) {
        this.something = something;
    }

    public Object open() {
        return this.something;
    }
}
