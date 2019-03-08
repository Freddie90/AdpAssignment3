package ac.za.cput;

public class Fail {

    void method(int x) throws IllegalArgumentException {

        if (x < 0) {
            throw new IllegalArgumentException();
        }
    }
}
