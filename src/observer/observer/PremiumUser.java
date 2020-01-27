package observer.observer;

public class PremiumUser implements Observer {

    private String name;
    private int moviesCounter = 0;

    public PremiumUser(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void update() {
        moviesCounter++;
        System.out.println(String.format("Hi %s you have %d new videos to watch.", name, moviesCounter));
    }
}
