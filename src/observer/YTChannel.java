package observer;

import java.util.ArrayList;
import java.util.List;

public class YTChannel implements Publisher{

    private String name;
    private List<Observer> subscribers = new ArrayList<>();

    YTChannel(String name) {
        this.name = name;
    }

    @Override
    public void register(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
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
