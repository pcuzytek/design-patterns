package observer;

public class FreeUser implements Observer {
    private String name;

    FreeUser(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(String.format("Hi %s you have new videos to watch!", name));
    }
}
