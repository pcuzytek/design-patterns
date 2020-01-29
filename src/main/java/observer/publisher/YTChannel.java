package observer.publisher;

import observer.observer.FreeUser;
import observer.observer.Observer;
import observer.observer.PremiumUser;

import java.util.ArrayList;
import java.util.List;

public class YTChannel implements Publisher {

    private String name;
    private List<Observer> subscribers = new ArrayList<>();

    public YTChannel(String name) {
        this.name = name;
    }

    @Override
    public void register(Observer observer) {
        if(observer instanceof FreeUser) {
            System.out.println(((FreeUser) observer).getName() + " subscribed your channel!");
        } else if (observer instanceof PremiumUser) {
            System.out.println(((PremiumUser) observer).getName() + " subscribed your channel!");
        }
        subscribers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        if(observer instanceof FreeUser) {
            System.out.println(((FreeUser) observer).getName() + " removed the free subscription!");
        } else if (observer instanceof PremiumUser) {
            System.out.println(((PremiumUser) observer).getName() + " removed the premium subscription!");
        }
        subscribers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        subscribers.forEach(Observer::update);
    }

    public void releaseVideo(String videoTitle) {
        System.out.println(String.format("Channel %s has added a new video: %s", name, videoTitle));
        notifyAllObservers();
    }
}
