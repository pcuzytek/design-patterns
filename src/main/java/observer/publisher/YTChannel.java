package observer.publisher;

import observer.observer.FreeUser;
import observer.observer.Observer;
import observer.observer.PremiumUser;

import java.util.ArrayList;
import java.util.List;

public class YTChannel implements Publisher {

    private final String name;
    private final List<Observer> subscribers = new ArrayList<>();

    public YTChannel(String name) {
        this.name = name;
    }

    @Override
    public void register(Observer observer) {
        if (observer instanceof FreeUser freeUser) {
            System.out.println(freeUser.getName() + " has subscribed your channel!");
        } else if (observer instanceof PremiumUser premiumUser) {
            System.out.println(premiumUser.getName() + "has subscribed your channel!");
        }
        subscribers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        if (observer instanceof FreeUser freeUser) {
            System.out.println(freeUser.getName() + " removed the free subscription!");
        } else if (observer instanceof PremiumUser premiumUser) {
            System.out.println(premiumUser.getName() + " removed the premium subscription!");
        }
        subscribers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        subscribers.forEach(Observer::update);
    }

    public void releaseVideo(String videoTitle) {
        System.out.printf("Channel %s has added a new video: %s%n", name, videoTitle);
        notifyAllObservers();
    }
}
