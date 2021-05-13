package observer.publisher;

import observer.observer.Observer;

public interface Publisher {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyAllObservers();
}
