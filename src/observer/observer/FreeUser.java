package observer.observer;

public class FreeUser implements Observer {
    private String name;

    public FreeUser(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void update() {
        System.out.println(String.format("Hi %s you have new videos to watch!", name));
    }
}
