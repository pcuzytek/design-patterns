package observer.observer;

public class PremiumUser implements Observer {
    private final String name;
    private int unwatchedVideosCounter = 0;

    public PremiumUser(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void update() {
        unwatchedVideosCounter++;
        System.out.printf("Hi %s you have %d new videos to watch.%n", name, unwatchedVideosCounter);
    }
}
