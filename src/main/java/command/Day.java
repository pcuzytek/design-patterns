package command;

import java.util.ArrayList;
import java.util.List;

public class Day {

    private final List<Action> actions;

    public Day() {
        actions = new ArrayList<>();
    }

    public void record(Action action) {
        actions.add(action);
    }

    public void run() {
        actions.forEach(Action::perform);
    }
}
