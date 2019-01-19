package observer;

public class PremiumUser implements Observer {

    private String name;

    PremiumUser(String name) {
        this.name = name;
    }

    private int moviesCounter = 0;

    @Override
    public void update() {
        moviesCounter++;
        System.out.println(String.format("Hi %s you have %d new videos to watch.", name, moviesCounter));
    }
}
