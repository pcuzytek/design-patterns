package observer.observer;

public record FreeUser(String name) implements Observer {

    public String getName() {
        return this.name;
    }

    @Override
    public void update() {
        System.out.printf("Hi %s you have new videos to watch!%n", name);
    }
}
