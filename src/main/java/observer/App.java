package observer;

import observer.observer.FreeUser;
import observer.observer.Observer;
import observer.observer.PremiumUser;
import observer.publisher.YTChannel;

public class App {
    public static void main(String[] args) {
        YTChannel channel = new YTChannel("Monika koduje");

        Observer freeUser = new FreeUser("Damian");
        Observer premiumUser = new PremiumUser("Michał");
        Observer secondPremiumUser = new PremiumUser("Grzesiek");

        channel.register(freeUser);
        channel.register(premiumUser);
        channel.register(secondPremiumUser);

        channel.releaseVideo("śmieszny kotek haha");

        channel.unregister(secondPremiumUser);

        channel.releaseVideo("oblej wodą mamę challenge");
    }
}
