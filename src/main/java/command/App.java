package command;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {

        Piotrke piotrke = new Piotrke();

        Day weekDay = new Day();
        weekDay.record(() -> piotrke.drink("still water"));
        weekDay.record(() -> piotrke.eat("fish"));
        weekDay.record(piotrke::work);
        weekDay.record(piotrke::rest);
        weekDay.record(piotrke::spendFreeTime);
        weekDay.record(() -> piotrke.sleep(LocalDateTime.now(), LocalDateTime.now().plusHours(7)));

        weekDay.run();
    }
}
