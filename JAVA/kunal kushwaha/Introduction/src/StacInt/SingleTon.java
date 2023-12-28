package StacInt;

public class SingleTon {
    private SingleTon() {

    }

    private static SingleTon instance;

    private static SingleTon getinstance() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }
}
