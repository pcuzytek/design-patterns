package observer;

import observer.observer.FreeUser;
import observer.observer.Observer;
import observer.observer.PremiumUser;
import observer.publisher.YTChannel;

public class App {
    public static void main(String[] args) {
        var channel = new YTChannel("Monika koduje");

        Observer freeUser = new FreeUser("Damian");
        channel.register(freeUser);

        Observer premiumUser = new PremiumUser("Michał");
        channel.register(premiumUser);

        Observer secondPremiumUser = new PremiumUser("Grzesiek");
        channel.register(secondPremiumUser);


        channel.releaseVideo("śmieszny kotek haha");

        channel.unregister(secondPremiumUser);

        channel.releaseVideo("oblej wodą mamę challenge");
    }
}
