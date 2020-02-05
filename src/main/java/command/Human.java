package command;

import java.time.LocalDateTime;

public interface Human {
    void eat(String food);
    void drink(String drink);
    void sleep(LocalDateTime start, LocalDateTime end);
    void work();
    void spendFreeTime();
    void rest();
}
