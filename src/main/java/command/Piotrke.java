package command;

import java.time.LocalDateTime;

public class Piotrke implements Human {

    @Override
    public void eat(String food) {
        System.out.println("I'm eating " + food);
    }

    @Override
    public void drink(String drink) {
        System.out.println("I'm drinking " + drink);
    }

    @Override
    public void sleep(LocalDateTime start, LocalDateTime end) {
        System.out.println("I'm sleeping till " + end);
    }

    @Override
    public void work() {
        System.out.println("I'm working");
    }

    @Override
    public void spendFreeTime() {
        System.out.println("Free time :)");
    }

    @Override
    public void rest() {
        System.out.println("Time for some rest :)");
    }
}
