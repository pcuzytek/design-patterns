package command;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {

        var piotrke = new Piotrke();

        var weekDay = new Day();
        weekDay.recordAction(() -> piotrke.drink("still water"));
        weekDay.recordAction(() -> piotrke.eat("fish"));
        weekDay.recordAction(piotrke::work);
        weekDay.recordAction(piotrke::rest);
        weekDay.recordAction(piotrke::spendFreeTime);
        weekDay.recordAction(() -> piotrke.sleep(LocalDateTime.now(), LocalDateTime.now().plusHours(7)));

        weekDay.run();
    }
}
